import java.util.Scanner;

public class ConvertToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
        System.out.print("Que horas sao? \n");

        String entrada = ler.next();
        String[] horaSeparada;
        String hora;
        String min;
        int h = 0;
        int m = 0;
        String numeros[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sisteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one",
            "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"};

        horaSeparada = entrada.split(":");
        hora = horaSeparada[0];
        min = horaSeparada[1];

        try {
            h = Integer.parseInt(hora);
            m = Integer.parseInt(min);
            if (h > 23 || h < 0 || m < 0 || m > 59) {
                System.out.println("Hora digitada é invalida!");

            } else if (m == 0) {
                System.out.println(numeros[h] + " o' clock ");
            } else if (m == 1) {
                System.out.println("one minute past " + numeros[h]);
            } else if (m == 59) {
                System.out.println("one minute to " + numeros[(h % 12) + 1]);
            } else if (m == 15) {
                System.out.println("quarter past " + numeros[h]);
            } else if (m == 30) {
                System.out.println("half past " + numeros[h]);
            } else if (m == 45) {
                System.out.println("quarter to " + numeros[(h % 12) + 1]);
            } else if (m <= 30) {
                System.out.println(numeros[m] + " minutes past " + numeros[h]);
            } else if (m > 30) {
                System.out.println(numeros[60 - m] + " minutes to " + numeros[(h % 12) + 1]);
            } 
        } catch (Exception e) {
            System.out.println("Falha ao converter a hora digitada!");
        }
	}

}
