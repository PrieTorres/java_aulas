import java.util.Scanner;

public class quest04 {

	public static void main(String[] args) {
		
		System.out.println(
"1 - Pagamento � vista - 15% de desconto sobre o valor total da compra \n"
+ "2 - Pagamento com cheque pr�-datado para 30 dias - 10% de desconto sobre o valor total da compra\n"
+ "3 - Pagamento parcelado em 6 vezes - n�o tem desconto\n"
+ "4 - Pagamento parcelado em 12 vezes - 8% de acr�scimo sobre o valor da compra");
		
		Scanner sc = new Scanner (System.in);
		double valor_compra;
		int opc;
		
		System.out.print("valor da compra: ");
		valor_compra = sc.nextDouble();
		
		System.out.print("opcao: ");
		opc = sc.nextInt();
		
		
		
		
		
		sc.close();
		

	}

}
