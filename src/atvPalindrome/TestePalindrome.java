package atvPalindrome;

import java.util.Scanner;

public class TestePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Informe uma palavra para saber se é palindrome: ");
		    String texto = sc.nextLine();
		    String aux = "";
		   
		    System.out.print("A Palavra: " +texto);
		    aux = new StringBuffer(texto).reverse().toString();
		    
		    if (texto.equals(aux)) {
		    System.out.println(" é palindrome");
		    } else {
		    System.out.println(" Não é Palindrome");
		    }
		 sc.close();
		 
	}
}
