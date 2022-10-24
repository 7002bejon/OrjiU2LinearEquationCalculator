import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        System.out.println("Welcome user, please input two coordinates");
        Scanner newScan = new Scanner(System.in);

        System.out.println("Enter coordinate 1");
        String coordinate1 = newScan.nextLine();
        System.out.println("Enter coordinate 2");
        String coordinate2 = newScan.nextLine();

        int commaLoc = coordinate1.indexOf(",");
        int x1 = Integer.parseInt(coordinate1.substring(0, commaLoc));
        int y1 = Integer.parseInt(coordinate1.substring(commaLoc + 2));
        int commaLoc2 = coordinate2.indexOf(",");
        int x2 = Integer.parseInt(coordinate2.substring(0,commaLoc));
        int y2 = Integer.parseInt(coordinate2.substring(commaLoc + 2));


        String coordinate1f = "( " + x1 + ", " + y1 + " )";
        String coordinate2f = "( " + x2 + ", " + y2 + " )";


        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);

        System.out.println(x1);
        System.out.println(y1);
        System.out.println(x2);
        System.out.println(y2);
        System.out.println("Equation: " + equation.equation());

        System.out.println("Slope: " + equation.slope());
        System.out.println("y-intercept: " + equation.yIntercept());
        System.out.println("Distance: " + equation.distance());
        System.out.println();
        System.out.println("----- Line info -----");
        System.out.println(equation.lineInfo());
        System.out.println();

        double testX = 4;
        System.out.println("Coordinate for x: " + equation.coordinateForX(testX));

    }
}
