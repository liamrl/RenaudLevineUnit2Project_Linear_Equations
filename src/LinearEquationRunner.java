import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {

        // Welcoming and getting coordinates
        Scanner s = new Scanner(System.in);
        System.out.println("Hello!\nEnter coordinate one in (x, y) format");
        String coord1 = s.nextLine();
        System.out.println("Enter coordinate two in (x, y) format");
        String coord2 = s.nextLine();
        LinearEquation p = new LinearEquation(coord1, coord2);


    }
}