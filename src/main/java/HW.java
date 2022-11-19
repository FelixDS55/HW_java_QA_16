import java.util.Arrays;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        byte number1 = 125;
        byte number2 = 120;
        byte sum = (byte) (number1 + number2);
        System.out.println(sum);

        int a = 50;
        float b = (float) 10.2;
        System.out.println(a * b);

        int age = 35;
        String name = "Михаил";
        if (age < 65) {
            System.out.println("Идите работать, " + name + ", до пенсии еще далеко");
        } else System.out.println("Ты уже старый");
        System.out.println("***********************");

        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("*********************");

        int first = 25;
        int second = 2;
        int result = first / second;
        System.out.println(result);
        System.out.println("*******************");

        int k = 1;
        while (k <= 5){
            System.out.print(k + " ");
            k++;
        }
        System.out.println("************");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int g = scanner.nextInt();
        if (g >= 0){
            System.out.println("Вы ввели положительное число");
        } else System.out.println("Вы ввели отрицательное число");
        System.out.println("*************************");

        int d = 26;
        int q = 5;
        System.out.println(d % q);
        System.out.println("**************************");

    }
}