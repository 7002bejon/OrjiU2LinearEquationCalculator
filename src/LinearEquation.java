
public class LinearEquation {
    /* Instance Variables */
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    /* Creates a LinearEquation object */
/* PRECONDITION: x1 and x2 are NOT equal (client programs are responsible for ensuring
   this precondition is not violated)
public LinearEquation(int x1, int y1, int x2, int y2)
        public LinearEquation(
 */
/* Calculates and returns distance between (x1, y1) and (x2, y2), rounded to
   the nearest hundredth */
    public double distance() {
        return Math.round(Math.sqrt((Math.pow(((double)x2 - x1), 2.0) + Math.pow(((double)y2 - y1), 2.0))) * 100.0) / 100.0;
    }



    /* Calculates and returns the y-intercept of the line between (x1, y1) and
       (x2, y2), rounded to the nearest hundredth */
    public double yIntercept() {
        double m = ((double)(y2 - y1)/(double)(x2 - x1));
        return Math.round(((double)y1 - (m * (double)x1)) * 100.0) / 100.0;
    }



    /* Calculates and returns the slope of the line between (x1, y1) and
       (x2, y2), rounded to the nearest hundredth */
    public double slope() {
        return Math.round(((double)(y2 - y1)/(double)(x2 - x1)) * 100.0) / 100.0;
    }



    /* Returns a String that represents the linear equation of the line through points
       (x1, y1) and (x2, y2) in slope-intercept (y = mx + b) form, e.g. "y = 3x + 1.5".
        When generating the m value (slope), here are examples of "printable" slopes:
           5, -5, 1/2, 6/8 (reducing not required), 8/5, -2/3, -18/7
        Here are non-examples of "printable" slopes:
     1/-2 (should be -1/2), -4/-3 (should be 4/3), 8/4 (should be reduced to 2),
           -12/3 (should be -4), 3/3 (should be 1), -6/6 (should be -1)
        HINT: Be sure to check if the line is horizontal and return an appropriate string,
        e.g. y = 6
        HINT: Absolute value might be helpful for ensuring proper placement of negative sign!
        When generating the b value, here are some examples of "printable" y-intercepts:
           + 1.0 	- 2.35	      + 12.5		- 8.0		+ 17.19
        Here are non-examples of "printable" y-intercepts:
           - -1.0 	+ -2.35	- -12.5	+ -8.0	     - -17.19	+ 0	- 0
        HINT: Absolute value might be helpful for printing negative y-intercepts as
               subtraction!
     */
    public String equation() {
        int yFinal = (y2 - y1);
        int xFinal = (x2 - x1);
        double b = yIntercept();
        double m = ((double) yFinal / xFinal);
        int compare = Double.compare(m, 0.0);
        System.out.println(compare - m);
        if (yFinal % Math.abs(xFinal) != 0) {
            if (m == 1) {
                System.out.println(compare - m);
                System.out.println("a");
                if (b < 0) {
                    return ("y = x - " + b);
                } else if (b > 0){
                    return ("y = x + " + b);
                } else {
                    return ("y = x");
                }
            } else if (m > 0) {
                System.out.println("b");
                if (b < 0) {
                    return ("y = " + Math.abs(yFinal) + "/" + Math.abs(xFinal) + "x - " + b);
                } else if (b > 0) {
                    return ("y = " + Math.abs(yFinal) + "/" + Math.abs(xFinal) + "x + " + b);
                } else {
                    return ("y = " + Math.abs(yFinal) + "/" + Math.abs(xFinal) + "x");
                }
            } else if (m == 0) {
                if (b < 0) {
                    return ("y = " + b);
                } else if (b > 0){
                    return ("y = " + b);
                } else {
                    return ("y = 0");
                }
            } else if (m == -1) {
                System.out.println("c");
                if (b < 0) {
                    return ("y = -x - " + b);
                } else if (b > 0){
                    return ("y = -x + " + b);
                } else {
                    return ("y = -x");
                }
            }else if (m < 0) {
                System.out.println("d");
                if (b < 0) {
                    return ("y = -" + Math.abs(yFinal) + "/" + Math.abs(xFinal) + "x - " + b);
                } else if (b > 0){
                    return ("y = -" + Math.abs(yFinal) + "/" + Math.abs(xFinal) + "x + " + b);
                } else {
                    return ("y = -" + Math.abs(yFinal) + "/" + Math.abs(xFinal) + "x");
                }
            }
        } else {
            if (m == 1) {
                System.out.println("one-m");
                if (b < 0) {
                    return ("y = x " + b);
                } else if (b > 0) {
                    return ("y = x + " + b);
                } else {
                    return ("y = x");
                }
            } else if (m > 0) {
                System.out.println("e");
                if (b < 0) {
                    return ("y = " + m + "x " + b);
                } else if (b > 0) {
                    return ("y = " + m + "x + " + b);
                } else {
                    return ("y = " + m + "x");
                }
            } else if (m == 0) {
                if (b < 0) {
                    return ("y = " + b);
                } else if (b > 0){
                    return ("y = " + b);
                } else {
                    return ("y = 0");
                }
            } else if (m == -1) {
                    if (b < 0) {
                        return ("y = -x " + b);
                    } else if (b > 0) {
                        return ("y = -x + " + b);
                    } else {
                        return ("y = -x");
                    }
            } else {
                System.out.println("f");
                if (b < 0) {
                    return ("y = -" + Math.abs(m) + "x " + b);
                } else if (b > 0) {
                    return ("y = -" + Math.abs(m) + "x + " + b);
                } else {
                    return ("y = -" + Math.abs(m) + "x");
                }
            }
        }
        System.out.println("z");
        return ("y = " + yFinal + "/" + Math.abs(xFinal) + "x + " + b);

    }






    /* Returns a String of the coordinate point on the line that has the given x value, with
       both x and y coordinates as decimals to the nearest hundredth, e.g (-5.0, 6.75) */
    public String coordinateForX(double xValue){
        double m = Math.round(((double)(y2 - y1)/(double)(x2 - x1)) * 100.0) / 100.0;
        double yValue =  ((m * xValue) + yIntercept());
        return ("( " + xValue + ", " + yValue + ")");

    }





    /* "Helper" method for use elsewhere in your methods; returns the value toRound rounded
        to the nearest hundredth
        HINT:  the Math.round method can help with this!
     */
    public double roundedToHundredth(double toRound){
        return Math.round(toRound);
    }




    /* Returns a string that includes all information about the linear equation, each on
       separate lines:
         - The original points: (x1, y1) and (x2, y2)
         - The equation of the line in y = mx + b format (using equation() method)
         - The slope of the line, as a decimal (using slope() method)
         - The y-intercept of the line (using yIntercept() method)
         - The distance between the two points (using distance() method)
      This method should call all other appropriate methods to get the info it needs:
      equation(), slope(), yIntercept(), distance().
      */
    public String lineInfo() {
        return ("The two points are: ("  + x1 + ", " + y1 + ") and (" + + x2 + ", " + y2 + ") " + "\n"
                + "The equation of the line between these points is " + equation() + "\n"
                + "The slope of this line is: " + slope() + "\n"
                + "The y-intercept of this line is " + yIntercept() + "\n"
                + "The distance between the two points is " + distance());
    }
}