import java.util.Scanner;

public class MyInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter your name: ");
        String name = input.nextLine();

        System.out.print("enter your age: ");
        int age = input.nextInt();

        System.out.println("Your name is: " + name + " and Your age is: " + age);

        input.close();


    }
}
