import java.util.Scanner;

public class sigloRomano {
    private static final int siglo = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce el año: ");
        int ano = sc.nextInt();

        //CUENTAS:
        if (ano % siglo != 0 || ano % siglo == 0){
            int resultadoTotalSiglo = ano / siglo + 1;
            System.out.printf("el siglo es : %d", resultadoTotalSiglo);

        }

    }
}
