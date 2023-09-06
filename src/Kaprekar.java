import java.util.Arrays;
public class Kaprekar {

    public static String validationNumber(String n, int maxLength) {
        int num = Integer.parseInt(n);
        if(num % 1111 == 0) {
            throw new IllegalArgumentException("Número no válido: Numeros repetidos");
        }
        /*
        Set<Character> number = new HashSet<>();

        for (char c : n.toCharArray()) {
            if (!number.add(c)) {
                throw new IllegalArgumentException("Número no válido: Números repetidos de manera consecutiva");
            }
        }*/
        if (n.length() > maxLength) {
            throw new IllegalArgumentException("Número no válido: Longitud incorrecta");
        }
        return n;
    }
    public static void KaprekarConstant(int num) {
        if (num < 1000 || num >= 10000) {
            throw new IllegalArgumentException("El número debe ser un entero de 4 dígitos.");
        }

        int numVeces = 0;
        while (num != 6174) {
            int[] numArr = new int[4];

            // Convertir el número en un arreglo de dígitos
            for (int i = 0; i < 4; i++) {
                numArr[i] = num % 10;
                num /= 10;
            }

            // Ordenar el arreglo de mayor a menor y de menor a mayor
            Arrays.sort(numArr);
            int menor = numArr[0] * 1000 + numArr[1] * 100 + numArr[2] * 10 + numArr[3];
            int mayor = numArr[3] * 1000 + numArr[2] * 100 + numArr[1] * 10 + numArr[0];

            num = mayor - menor;
            numVeces++;
            System.out.println("Resta: " + mayor + " - " + menor + " = " + num);
        }

        System.out.println("El resultado es: " + num);
        System.out.println("Se restó " + numVeces + " veces.");
    }

    public static String putZeros(String n) {
        if (n.length() > 4) {
            throw new IllegalArgumentException("Número no válido: Es mayor de 4 dígitos");
        } else {
            String formattedNumber = String.format("%d", Integer.parseInt(n));
            int numberOfZerosToAdd = 4 - formattedNumber.length();
            return formattedNumber + "0".repeat(Math.max(0, numberOfZerosToAdd));
        }
    }


}
