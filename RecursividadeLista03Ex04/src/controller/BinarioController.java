package controller;

public class BinarioController {
	public BinarioController() {
		super();
	}
	
	public String binario(int n) {
		//Se o n for 1, retorna-se 1 em String e para a chamada da recursiva.
		
		if(n == 1) {
			return "1";
		}else {
			//Soma-se a String do resto da divisão de n por 2 com a recursiva (enviando n dividido por 2).
			
			int resto = n % 2;
			return String.valueOf(resto) + binario((int) n / 2);
		}
	}
}
