package co.edu.udea.app.empresariales;

public class Main {
	public static void main (String [ ] args) {
		
	}
	
	public int romanoToDecimal(String romano){
		int decimal = 0;
		for(int i = 0; i < romano.length();i++){
			char actual = romano.charAt(i);
			if(actual == 'I'){
				decimal = decimal+1;
			}else if(actual == 'V'){
				if(decimal < 5){
					decimal = 5-decimal;
				}else{
					decimal = decimal+5;
				}
				
			}
		}
		return decimal;
	}
}
