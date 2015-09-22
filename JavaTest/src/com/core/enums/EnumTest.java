package com.core.enums;
import java.io.ObjectInputStream.GetField;


public class EnumTest {
	
	public enum GuaranteesCode {
        DENTAL("Dentaire"), HOSPITAL("Hospitalisation"), ALTERNATIVE("Médecine douce/Prévention"), OPTICAL("Optique"), HEALTHCARE(
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
        return code;
     }
	
	public static void main(String[] args) {
		
		System.out.println(new EnumTest().getCode());
		
	}
}
