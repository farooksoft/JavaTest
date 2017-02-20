package com.core.enums;

/**
 * class to explain ENUM and enumaration concepts
 * 
 * @author srayabar
 *
 */
public class EnumTest {
	
	public enum GuaranteesCode {
        DENTAL("Dentaire"), HOSPITAL("Hospitalisation"), ALTERNATIVE("M�decine douce/Pr�vention"), OPTICAL("Optique"), HEALTHCARE(
              "Soins courants/Pharmacie");
        private String translation;

        private GuaranteesCode(String translation) {
           this.translation=translation;
        }
        
        @Override
        public String toString() {
           return translation;
        }
        
     }

	private GuaranteesCode code = GuaranteesCode.DENTAL;

	
	public EnumTest(GuaranteesCode code) {
        this.code = code;
     }

     public EnumTest() {
		// TODO Auto-generated constructor stub
	}

	public GuaranteesCode getCode() {
        return GuaranteesCode.valueOf("HOSPITAL");
     }
	
	public static void main(String[] args) {
		
		System.out.println(new EnumTest().getCode());
		
	}
}
