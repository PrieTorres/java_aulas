import java.util.Scanner;

public class quest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cod;
		double salario;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("qual o c�digo de sua fun��o? ");
		cod = sc.nextInt();
		
		System.out.print("qual o seu sal�rio atual? ");
		salario = sc.nextDouble();
		
		switch(cod){
			case 1: 
				salario = salario*1.5;
				System.out.println("o seu cargo � Escritur�rio");
				System.out.print("o aumento foi de 50%");
				System.out.println("o seu novo sal�rio �: "+salario);
				break;
				
			case 2: 
				salario = (salario*135)/100;
				System.out.println("o seu cargo � Secret�rio");
				System.out.print("o aumento foi de 35%");
				System.out.println("o seu novo sal�rio �: "+salario);
				break;
				
			case 3: 
				salario = (salario*12)/10;
				System.out.println("o seu cargo � Caixa");
				System.out.print("o aumento foi de 20%");
				System.out.println("o seu novo sal�rio �: "+salario);
				break;
				
			case 4: 
				salario = salario*1.1;
				System.out.println("o seu cargo � Gerente");
				System.out.print("o aumento foi de 10%");
				System.out.println("o seu novo sal�rio �: "+salario);
				break;
			
			case 5: 
				System.out.println("o seu cargo � Diretor");
				System.out.print("o aumento foi de 0%");
				System.out.println("o seu novo sal�rio �: "+salario);
				break;
				
				
		}
		
		sc.close();
		

	}

}
