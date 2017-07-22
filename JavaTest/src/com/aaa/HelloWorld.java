package com.aaa;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class HelloWorld {
	public static void main(String[] args){
		
		//'date':'dd/MM/yyyy','time':'h:mm a'
		
		/*Calendar instance = GregorianCalendar.getInstance();
		instance.setTimeInMillis(1482175804 * 1000L);
		
		System.out.println(instance.getTime().toString());
	
		String date = new java.text.SimpleDateFormat("dd/MM/yyyy h:mm a").format(new java.util.Date (1482175804 * 1000L));
		
		System.out.println(date);
		
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar calendarEndTime = Calendar.getInstance();
		calendarEndTime.setTimeInMillis(1482175804 * 1000L);
		String format = dateFormat.format(calendarEndTime.getTime());
		System.out.println(format);
		
		
		
		SimpleDateFormat  formatter = new SimpleDateFormat("dd/MM/yyyy h:mm a",Locale.getDefault());
		//set TimeZone to format dates according to current configured TimeZone
		//formatter.setTimeZone();
		Date d = new Date(1482175804 * 1000L);
		String formattedDate = formatter.format(d);
		
		System.out.println(formattedDate);
		
		long unixSeconds = 1482175804;
		Date date1 = new Date(unixSeconds*1000L); // *1000 is to convert seconds to milliseconds
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy h:mm a"); // the format of your date
		sdf.setTimeZone(TimeZone.getTimeZone("America/Indiana/Indianapolis")); // give a timezone reference for formating (see comment at the bottom
		formattedDate = sdf.format(date1);
		System.out.println(formattedDate);
		
		printMe("abc", "def");
		
		printMe("abc");
		
		
		System.out.println(null instanceof String);
		
		
		Optional<String> ofNullable = Optional.ofNullable(null);
		
		System.out.println("ofNullable.isPresent : " + ofNullable.isPresent());
		
		
		Test da = new Test("jkl");
		Test a = new Test("abc");
		Test b = new Test("def");
		Test e = new Test("xyz");
		Test c = new Test("ghi");
		
		List<Test> testList = new ArrayList<>();
		testList.add(e);
		testList.add(da);
		testList.add(a);
		testList.add(b);
		testList.add(c);
		
		List<Test> collect = testList.parallelStream().sorted(new Comparator<Test>() {
			@Override
			public int compare(Test o1, Test o2) {
				// TODO Auto-generated method stub
				return o1.getA().compareTo(o2.getA());
			}
		}).collect(Collectors.toList());
		
		
		for(Test abc : collect){
			System.out.println(abc.getA());
		}*/
		
		//Map<String, String> linkMap = new LinkedHashMap<String, String>();
		/*
		Map<String, String> linkMap = new HashMap<String, String>();
		linkMap.put("1", "a");
		linkMap.put("2", "a");
		linkMap.put("3", "a");
		linkMap.put("4", "a");
		linkMap.put("5", "a");
		linkMap.put("6", "a");
		linkMap.put("7", "a");
		
		for(String abc : linkMap.keySet()){
			System.out.println(abc);
		}
		
		System.out.println(HelloWorld.class.getName());
		System.out.println(HelloWorld.class.getSimpleName());
		System.out.println(HelloWorld.class.getCanonicalName());
		
		
		String abc = null;
		if(abc == null || abc.length() == 0){
			System.out.println("abc is null");
		}
		
		StringBuffer sbuffer = new StringBuffer();
		sbuffer.append("abcdef");
		sbuffer.append("汉语/漢語");
		System.out.println(sbuffer.toString());		
		
		try {
			System.out.println(new String(sbuffer.toString().getBytes("UTF-8")));
		} catch (UnsupportedEncodingException e) {
			System.out.println(new String(sbuffer.toString().getBytes()));
		}
		
		
		StringBuilder stringBuilder = new StringBuilder();
		System.out.println(stringBuilder.toString().length());
			
		Map<String, String> map = new HashMap<>();
		map.put("abc", "abc");
		map.put("abc1", "abc1");
		map.put("abc2", "abc2");
		
		System.out.println(map.values());
		
		String abc = "1_2_3 ";
		String[] split = null;//abc.split("_");
		for(String str : split){
			System.out.println(str);
		}
		
		*/
		
		File file = new File("Properties.properties");
		System.out.println(file.getAbsolutePath());
		
		new HelloWorld().printMe("");
		
		Map<String, Long> map = new HashMap<>();		
		long abc = map.get("a");
		System.out.println(abc);
		
		
		
    } //main ends
	
	static void printMe(String... string){
		for(String s : string){
			System.out.println(s);
		}
	}
	
	void inc(int i){
		i++;
	}
	
	private HelloWorld() {
		System.out.println("frm private");
	}
	
	
	
}

class Test{
	String a;
	public Test(String b) {
		this.a = b;
	}

	/**
	 * @return the a
	 */
	public String getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(String a) {
		this.a = a;
	}
	
}
