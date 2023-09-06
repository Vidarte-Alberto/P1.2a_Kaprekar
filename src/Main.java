import java.util.Scanner;

//Kaprekar Programm
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String num = new String();
        System.out.println("Put your number: ");
        num = sc.nextLine();
        num = Kaprekar.validationNumber(num, 4);
        int ResultKaprekar = Integer.parseInt(Kaprekar.putZeros(num));
        Kaprekar.KaprekarConstant(ResultKaprekar);
    }
}