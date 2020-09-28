package aplicacoes;

import java.util.Scanner;

public class ExplodirStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor até onde será testado: ");
		int valor = sc.nextInt();
		
		for(int i=0;i<=valor;i++) {
			if(primo(i) && i!= 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
	
	public static boolean primo(int dividendo) {
		boolean primo = primo(dividendo, 2, 1);
		return primo;
	}
	
	private static boolean primo(int dividendo, int divisor, double resultado) {
		if(resultado == 0) {
			return false;
		} else if(divisor >= dividendo) {
			return true;
		}
		return primo(dividendo, (divisor+1), (dividendo % divisor));
	}
}

