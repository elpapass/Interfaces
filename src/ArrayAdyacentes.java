import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayAdyacentes {
    public static void main(String[] args) {
        int resultadoAdyacente = 0;
        int valorMax = 0;
        int[] arrayEntero = {4, 1, 2, 3, 1, 5};


        for (int i = 0; i < arrayEntero.length -1; i++) {
            resultadoAdyacente = arrayEntero[i] * arrayEntero[i + 1];
            if (resultadoAdyacente > valorMax) {
                valorMax = resultadoAdyacente;
            }
        }
        System.out.println(valorMax);
    }

}
