import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("selecione a op��o desejada: ");
		System.out.println("1 - somar dois n�meros \n2 - raiz quadrada");
		int opc, n1, n2;
		double result;
		System.out.print("Opc��o desejada: ");
		opc = sc.nextInt();
		
		System.out.print("valor numero: ");
		n1 = sc.nextInt();
		
		if(opc == 1) {
			System.out.print("valor do outro n�mero: ");
			n2 = sc.nextInt();
			result = (n1+n2);
			System.out.println("Resultado: "+result);
		}else if(opc == 2) {
			result = n1 * n1;
			System.out.println("Resultado: "+result);
		}
		
		
		
		sc.close();
	}

}
