import java.util.Scanner;
public class questaoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero 1: ");
		int num1 = sc.nextInt();
		System.out.print("Numero 2: ");
		int num2 = sc.nextInt();
		
		System.out.print("Resultado: "+(num1 * num2));
		sc.close();
	}

}
