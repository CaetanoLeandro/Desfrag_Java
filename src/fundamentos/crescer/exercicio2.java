package fundamentos.crescer;

import java.math.BigDecimal;
import java.util.Scanner;

public class exercicio2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigDecimal numero;

        String KB;

        System.out.println("Digite um número: ");
        numero = sc.nextBigDecimal();

        numero.toString().getBytes();


        KB = String.valueOf(numero);

        BigDecimal MB = new BigDecimal(String.valueOf(numero));
        MB = MB.divide(BigDecimal.valueOf(1.0 * 1024));

        BigDecimal GB = new BigDecimal(String.valueOf(MB));
        GB = GB.divide(BigDecimal.valueOf(1.0 * 1024));

        BigDecimal TB = new BigDecimal(String.valueOf(GB));
        TB = TB.divide(BigDecimal.valueOf(1024));

        BigDecimal PB = new BigDecimal(String.valueOf(TB));
        PB = PB.divide(BigDecimal.valueOf(1024));

        BigDecimal EB = new BigDecimal(String.valueOf(PB));
        EB = EB.divide(BigDecimal.valueOf(1024));

        BigDecimal ZB = new BigDecimal(String.valueOf(EB));
        ZB = ZB.divide(BigDecimal.valueOf(1024));

        BigDecimal YB = new BigDecimal(String.valueOf(ZB));
        YB = YB.divide(BigDecimal.valueOf(1024));

        System.out.println("Kylobyte = " + KB);
        System.out.println("Megabyte = " + MB);
        System.out.println("Gigabyte = " + GB);
        System.out.println("Terabyte = " + TB);
        System.out.println("Petabyte = " + PB);
        System.out.println("Exabyte = " + EB);
        System.out.println("Zettabyte = " + ZB);
        System.out.println("Yottabyte = " + YB);

    }
}
