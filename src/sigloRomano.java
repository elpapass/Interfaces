import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class sigloRomano {
    public static Map map = new LinkedHashMap<String, Integer>();
    private static final int siglo = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce el año: ");
        int ano = sc.nextInt();

        //CUENTAS:
        if (ano % siglo != 0 || ano % siglo == 0){
            int resultadoTotalSiglo = ano / siglo + 1;
            System.out.printf("el siglo es : %d", resultadoTotalSiglo);

            //DENOMINACION A NUMERO ROMANO
            System.out.println("\n");
            populateMap();
            System.out.println("Este seria siglo en numeros romanos: "+romanize(resultadoTotalSiglo));
        }




    }
    public static String romanize(int value){
        String result = "";
        int number = value;
        while(number > 0){
            Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry<String, Integer> entry = it.next();
                if(number >= entry.getValue()){
                    number -= entry.getValue();
                    result += entry.getKey();
                    break;
                }
            }
        }
        return result;
    }

    public static void populateMap(){
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);
    }
}
