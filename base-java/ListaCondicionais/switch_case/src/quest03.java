import java.util.Scanner;

public class quest03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int quant_livros;
		double calc1, calc2;
		
		System.out.print("quantos livros? ");
		quant_livros = sc.nextInt();
		
		calc1 = (quant_livros/4)+7.5;
		calc2 = (quant_livros/2)+2.5;
		
		if(calc1 < calc2) {
			System.out.println("A op��o 'A' � melhor");
		}else if(calc2 < calc1) {
			System.out.println("A op��o 'B' � melhor");
		}else {
			System.out.println("N� faz diferen�a ;-)");
		}
		
		System.out.println("total A: "+calc1);
		System.out.println("total B: "+calc2);
		
		sc.close();
		

	}

}
