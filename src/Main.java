import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your age ? ");
        int input = in.nextInt();

        if (input >= 21)
        {
            System.out.println("You get a wrist band ");

        }

    }
}