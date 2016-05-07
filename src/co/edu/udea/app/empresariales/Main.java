package co.edu.udea.app.empresariales;

public class Main {
	public static void main (String [ ] args) {
		
	}
	
	public int romanoToDecimal(String romano){
		int decimal = 0;
		int numeroSuma = 0;
		for(int i = 0; i < romano.length();i++){
			char actual = romano.charAt(i);		
			if(actual == 'I'){
				numeroSuma = 1;
			}else if(actual == 'V'){
				if(numeroSuma < 5){
					numeroSuma = 5-numeroSuma*2;
				}else{
					numeroSuma = 5;
				}				
			}else if(actual == 'X'){
				if(numeroSuma < 10){
					numeroSuma = 10-numeroSuma*2;
				}else{
					numeroSuma = 10;
				}
			}else if(actual == 'L'){
				if(numeroSuma < 50){
					numeroSuma = 50-numeroSuma*2;
				}else{
					numeroSuma = 50;
				}
			}else if(actual == 'C'){
				if(numeroSuma < 100){
					numeroSuma = 100-numeroSuma*2;
				}else{
					numeroSuma = 100;
				}
			}else if(actual == 'D'){
				if(numeroSuma < 500){
					numeroSuma = 500-numeroSuma*2;
				}else{
					numeroSuma = 500;
				}
			}else if(actual == 'M'){
				if(numeroSuma < 1000){
					numeroSuma = 1000-numeroSuma*2;
				}else{
					numeroSuma = 1000;
				}
			}
			decimal = decimal+numeroSuma;
		}
		return decimal;
	}
}
