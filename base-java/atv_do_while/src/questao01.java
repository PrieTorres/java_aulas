import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int i = 2;
		int primo = 0;
		
		do {
		System.out.print("N�mero maior que 1:");
		num = sc.nextInt();
		} while(num <= 1);
		
		do {
			if(num%i==0) {
				primo = 0;//false, � divisivel
				System.out.println(i);
			}
			
			i++;
		}while(i<num);
		
		if(primo == 0) {
			System.out.println(num+" n�o � um n�mero primo");
			
		}else {
			System.out.println(num+" � um n�mero primo");
		}
		
		
		sc.close();
	}

}
