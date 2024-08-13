package view;

import controller.BinarioController;

public class Principal {
	public static void main(String[] args) {
		BinarioController bc = new BinarioController();
		
		int n = 8;
		String binarioInvertido = bc.binario(n), binario = "";
		
		for(int i = binarioInvertido.length()-1; i >= 0; i--) {
			binario += binarioInvertido.charAt(i);
		}
		
		System.out.println(n + " em binário é " +binario);
	}
}
