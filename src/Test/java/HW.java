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
        if (age < 65){
            System.out.println("Идите работать, " + name + ", до пенсии еще далеко");
        }

    }
}
