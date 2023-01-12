import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        int basvalue;
        int sum=0;
        System.out.print("Sayıyı giriniz : ");
        number = input.nextInt();

        while (number != 0){
            basvalue = number % 10;
            sum += basvalue;
            number /= 10;
        }
        System.out.println(sum);
    }

    }

