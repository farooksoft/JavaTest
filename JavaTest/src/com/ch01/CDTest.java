package com.ch01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Vector;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class CDTest extends JFrame implements ListDataListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JList list;
	CDList listModel;
	JTextField artistField;
	JTextField titleField;
	JTextField costField;
	JTextField IDField;
	JLabel IDLabel;
	int selectedListIndex;
	SessionFactory sessionFactory;

	public CDTest() {
		try {
			Configuration cfg = new Configuration().addClass(CD.class);
			sessionFactory = cfg.buildSessionFactory();
		} catch (Exception e) {
			System.out.println("Unable to get the Session Factory");
			e.printStackTrace();
		}
		buildGUI();
	}

	private void buildGUI() {
		Container container = getContentPane();
		listModel = new CDList();
		// listModel.addCD("Grace Under Pressure", "Rush", new Date(), 9.99);

		list = new JList();
		list.setModel(listModel);
		list.setCellRenderer(new CDRenderer());
		container.add(list, BorderLayout.NORTH);
		
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent ae) {
				JList list = (JList) ae.getSource();
				CDList model = (CDList) list.getModel();
				selectedListIndex = ((JList) ae.getSource()).getSelectedIndex();
				CD cd = (CD) model.getElementAt(selectedListIndex);
				IDLabel.setText("" + cd.getId());
				titleField.setText(cd.getTitle());
				artistField.setText(cd.getArtist());
				costField.setText("" + cd.getCost());
			}
		});
		
		JPanel panel = new JPanel(new GridLayout(7, 2));
		artistField = new JTextField(25);
		titleField = new JTextField(25);
		costField = new JTextField(25);
		IDLabel = new JLabel();
		panel.add(new JLabel("ID"));
		panel.add(IDLabel);
		panel.add(new JLabel("Title"));
		panel.add(titleField);
		panel.add(new JLabel("Artist"));
		panel.add(artistField);
		panel.add(new JLabel("Cost"));
		panel.add(costField);
		JButton button = new JButton("Update");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				CD cd = (CD) listModel.getElementAt(selectedListIndex);
				cd.setTitle(titleField.getText());
				cd.setArtist(artistField.getText());
				cd.setCost((double) Double.parseDouble(costField.getText()));
				try {
					Session session = sessionFactory.openSession();
					session.update(cd);
					session.flush();
					session.close();
				} catch (Exception e) {
				}
				IDLabel.setText("");
				titleField.setText("");

				artistField.setText("");
				costField.setText("");
			}
		});
		
		panel.add(button);
		button = new JButton("Add");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				CD cd = new CD(artistField.getText(), titleField.getText(),
						new Date(), Double.parseDouble(costField.getText()));
				listModel.addCD(cd);
				try {
					Session session = sessionFactory.openSession();
					session.save(cd);
					session.flush();
					session.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				IDLabel.setText("");
				titleField.setText("");
				artistField.setText("");
				costField.setText("");
			}
		});
		panel.add(button);
		button = new JButton("Delete");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				CD cd = (CD) listModel.getElementAt(selectedListIndex);
				try {
					Session session = sessionFactory.openSession();
					session.delete(cd);
					session.flush();
					session.close();
				} catch (Exception e) {
				}
				listModel.removeElement(selectedListIndex);
			}
		});
		
		panel.add(button);
		button = new JButton("Pull All");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					Session session = sessionFactory.openSession();

					java.util.List cds = session.find("from CD");
					session.close();
					listModel.addCDs(cds);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No CD",
							"problem pulling cds", 0);
				}
			}
		});
		
		panel.add(button);
		IDField = new JTextField(25);
		panel.add(IDField);
		button = new JButton("Pull Single");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int index = Integer.parseInt(IDField.getText());
				try {
					Session session = sessionFactory.openSession();
					CD cd = new CD();
					session.load(cd, new Integer(index));
					session.close();
					listModel.addCD(cd);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "No CD",
							"No CD with that ID", 0);
				}
			}
		});
		
		panel.add(button);
		container.add(panel, BorderLayout.SOUTH);
		setSize(300, 250);
		setVisible(true);
	}

	public void intervalAdded(ListDataEvent e) {
		list.invalidate();
	}

	public void contentsChanged(ListDataEvent e) {
		list.invalidate();
	}

	public void intervalRemoved(ListDataEvent e) {
		list.invalidate();
	}

	public static void main(String[] args) {
		CDTest t = new CDTest();
	}

	private class CDList extends AbstractListModel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		Vector v = new Vector();

		public void addCD(String title, String artist, Date pdate, double cost) {
			CD cd = new CD(title, artist, pdate, cost);
			v.add(cd);
			fireContentsChanged(this, 0, 0);
		}

		public void addCD(CD cd) {
			v.add(cd);
			fireContentsChanged(this, 0, 0);
		}

		public void addCDs(java.util.List cds) {
			v.addAll(cds);
			fireContentsChanged(this, 0, 0);
		}

		public int getSize() {
			return v.size();
		}

		public void removeElement(int index) {
			v.removeElementAt(index);
			fireContentsChanged(this, 0, 0);
		}

		public Object getElementAt(int index) {
			return v.elementAt(index);
		}
	}

	private class CDRenderer extends JLabel implements ListCellRenderer {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private Color HIGHLIGHT = new Color(0, 0, 128);

		public CDRenderer() {
			setOpaque(true);
		}

		public Component getListCellRendererComponent(JList list, Object value,
				int index, boolean isSelected, boolean cellHasFocus) {
			CD cd = (CD) value;
			setText(cd.getTitle());
			if (isSelected) {
				setBackground(HIGHLIGHT);
				setForeground(Color.white);
			} else {

				setBackground(Color.white);
				setForeground(Color.black);
			}
			return this;
		}
	}

}
