import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int dia, ano, mes, hora, min;
		String mesExtend;
		System.out.print("Que horas s�o: ");
		hora = sc.nextInt();
		System.out.print("Que minutos s�o: ");
		min = sc.nextInt();
		System.out.print("Que dia � hoje: ");
		dia = sc.nextInt();
		System.out.print("Em que m�s estamos: ");
		mes = sc.nextInt();
		System.out.print("Em que ano estamos: ");
		ano = sc.nextInt();
		System.out.print("Que horas s�o: ");

		if(hora > 24) {
			System.out.println("hora inv�lida");
			System.out.print("Que horas s�o: ");
			hora = sc.nextInt();
		}
		if(dia > 31) {
			System.out.println("dia inv�lido");
			System.out.print("Que dia � hoje: ");
			dia = sc.nextInt();
		}
		if(ano > 2023) {
			System.out.println("voc� n�o t� no futuro");
			System.out.print("Que ano � esse: ");
			ano = sc.nextInt();
		}
		if(min > 59) {
			System.out.println("minuto inv�lido");
			System.out.print("Que minutos s�o: ");
			min = sc.nextInt();
		}
		if(mes > 12) {
			System.out.println("mes inv�lido");
			System.out.print("Em que m�s estamos: ");
			mes = sc.nextInt();
		}
		
		if(mes == 1) {
			mesExtend = "Janeiro";
		} else if(mes == 2) {
			mesExtend = "Feverei";
		}else if(mes == 3) {
			mesExtend = "Janeiro";
		}else if(mes == 4) {
			mesExtend = "Janeiro";
		}else if(mes == 5) {
			mesExtend = "Janeiro";
		}else if(mes == 6) {
			mesExtend = "Janeiro";
		}else if(mes == 7) {
			mesExtend = "Janeiro";
		}else if(mes == 8) {
			mesExtend = "Janeiro";
		}else if(mes == 9) {
			mesExtend = "Janeiro";
		}else if(mes == 10) {
			mesExtend = "Janeiro";
		}else if(mes == 11) {
			mesExtend = "Janeiro";
		}else if(mes == 12) {
			mesExtend = "Janeiro";
		}
		
		System.out.println(dia+" / "+mesExtend+" / "+ano+"     "+hora+":"+min);

	}

}
