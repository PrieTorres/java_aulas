import java.util.Scanner;

public class quest04 {

	public static void main(String[] args) {
		
		System.out.println(
"1 - Pagamento � vista - 15% de desconto sobre o valor total da compra \n"
+ "2 - Pagamento com cheque pr�-datado para 30 dias - 10% de desconto sobre o valor total da compra\n"
+ "3 - Pagamento parcelado em 6 vezes - n�o tem desconto\n"
+ "4 - Pagamento parcelado em 12 vezes - 8% de acr�scimo sobre o valor da compra");
		
		Scanner sc = new Scanner (System.in);
		double valor_compra, new_valor;
		int opc;
		
		System.out.print("valor da compra: ");
		valor_compra = sc.nextDouble();
		
		System.out.print("opcao: ");
		opc = sc.nextInt();
		
		switch(opc) {
		  case 1:
			  new_valor = valor_compra * 0.85;
			  System.out.println("valor total da compra: "+ new_valor);
			  System.out.println("desconto: "+ (valor_compra - new_valor));
			  break;
		
		  case 2:
			  new_valor = valor_compra * 0.9;
			  System.out.println("valor total da compra: "+ new_valor);
			  System.out.println("desconto: "+ (valor_compra - new_valor));
			  break;
			  
		  case 3:
			  new_valor = valor_compra/6;
			  System.out.println("valor total das parcelas: "+ new_valor);
			  System.out.println("n�o h� desconto");
			  break;
		  
		  case 4:
			  new_valor = valor_compra*1.08;
			  System.out.println("valor total da compra: "+ new_valor);
			  System.out.println("valor total das parcelas: "+ (new_valor/12));
			  System.out.println("juros: "+ (new_valor - valor_compra));
			  break;
		
		}
		
		
		
		
		
		sc.close();
		

	}

}
