package co.edu.udea.app.empresariales;

public class Main {
	public static void main (String [ ] args) {
		
	}
	
	public int romanoToDecimal(String romano){
		int decimal = 0;
		for(int i = 0; i < romano.length();i++){
			if(romano.charAt(i) == 'I'){
				decimal = decimal+1;
			}
		}
		return decimal;
	}
}
