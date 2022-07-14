import java.util.Scanner;

public class questao03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		/*
		 *  trabalhadores que fazem at� 30 pe�as por m�s - classe 1;
			trabalhadores que fazem de 31 a 50 pe�as por m�s - classe 2;
			trabalhadores que fazem mais de 50 pe�as por m�s - classe 3;
			A classe 1 recebe sal�rio m�nimo. A classe 2 recebe sal�rio m�nimo mais 3% desse sal�rio por pe�a, acima das 30 pe�as iniciais. A classe 3 recebe sal�rio m�nimo mais 5% desse sal�rio por pe�a, acima das 30 pe�as iniciais.
			Fa�a um programa que receba o n�mero do oper�rio, o n�mero de pe�as fabricadas no m�s, o sexo do oper�rio, e que tamb�m calcule e mostre:
			o n�mero do oper�rio e seu sal�rio;
			o total da folha de pagamento da f�brica;
			o n�mero total de pe�as fabricadas no m�s;
			a m�dia de pe�as fabricadas pelos homens;
			a m�dia de pe�as fabricadas pelas mulheres;
			o n�mero de oper�rio ou oper�ria de maior sal�rio.
			A f�brica possui 15 oper�rios.
		 * 
		 * */
		
		double salario, salarioOper=0, maxSal=0, allSal=0;
		int pecasMes, numOper=0, homP=0, mulP=0, allP=0, numH=0, numM=0,sexo;
		System.out.print("salario minimo: ");
		salario = sc.nextDouble();
		
		
		for(int i=1;i<=15;i++) {
			System.out.print("quantidade de pe�as fabricadas por mes: ");
			pecasMes = sc.nextInt();
			System.out.print("sexo do funcion�rio (1 � Homem, 2 Mulher): ");
			sexo = sc.nextInt();
			
			allP+=pecasMes;
			
			if(sexo==1) {
				homP+=pecasMes;
				numH++;
			}
			if(sexo==2) {
				mulP+=pecasMes;
				numM++;
			}
			
			if(pecasMes <= 30) {
				salarioOper = salario;
				
			}else if(pecasMes <= 50) {
				salarioOper = salario;
				salarioOper+=(salarioOper*0.03*pecasMes);
				
			}else if(pecasMes > 50) {
				salarioOper = salario;
				salarioOper+=(salarioOper*0.03*pecasMes);
			}
			
			if(maxSal < salarioOper) {
				maxSal = salarioOper;
				numOper = i;
			}
			
			allSal+=salarioOper;
			
			System.out.println("n�mero do operario: "+i);
			System.out.println("salario: "+salarioOper);
		}
		
		System.out.println("total dos salarios: "+ allSal);
		System.out.println("numero total de pe�as: "+allP);
		System.out.println("media pe�as produzidas por homens: "+(homP/numH));
		System.out.println("media pe�as produzidas por mulheres: "+(mulP/numM));
		System.out.println("maior salario: "+maxSal);
		System.out.println("n�mero do oper�rio de maior sal�rio: "+numOper);
		
		sc.close();

	}

}
