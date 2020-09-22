public class Calculations {

    static double a;
    static double b;
    static double c;
    static double d;

    static float finalEquation;
    static float finalEquationAnswer1;
    static float finalEquationAnswer2;

    Calculations(double a1, double b1, double c1, double d1) {
        this.a = a1;
        this.b = b1;
        this.c = c1;
        this.d = d1;
    }

    public static void main(String[] args) {
        System.out.println("First Question: ");
        System.out.println(linear(3, 2, 5));

        System.out.println("Second Question: ");
        System.out.println(quadratic(2, -5, 3, 6));

        System.out.println("Third Question: ");
        System.out.println(distance(4, 9, 56, 4));

        System.out.println("Fourth Question: ");
        System.out.println(direction(9, 2, 3, 5));

    }

    //ax + b= c
   public static double linear(double a, double b, double c) {
        return ((c-b)/a);
    }

    //ax^2 + bx + c = d
   public static String quadratic(double a, double b, double c, double d) {
        double subtract = c - (d);
        double divide = 2 * a;
        float squareRootEquation = (float) (Math.pow(b, 2) - (4 * a * subtract));
        if (squareRootEquation < 0 || a == 0) {
            return "No solutions";
        }
        else if (squareRootEquation == 0) {
            finalEquation = (float) ((-(b) + Math.sqrt(squareRootEquation)) / divide);
            String answer1 = Float.toString(finalEquation);
            return answer1;
        }
        else {
            finalEquationAnswer1 = (float) ((-(b) + Math.sqrt(squareRootEquation)) / divide);
            finalEquationAnswer2 = (float) ((-(b) - Math.sqrt(squareRootEquation)) / divide);
            String answer1 = Float.toString(finalEquationAnswer1);
            String answer2 = Float.toString(finalEquationAnswer2);
            return answer1 + "  ,  " + answer2;
        }

   }

    //distance between 2 points
    public static double distance(double a, double b, double c, double d) {
        //horizontal distance
        double x = c-a;
        float finalHorizontalDistance = (float) Math.pow(x, 2);
        //vertical distance
        double y = d-b;
        float finalVerticalDistance = (float) Math.pow(y, 2);

        finalEquation = (float) Math.sqrt(finalHorizontalDistance + finalVerticalDistance);

        return finalEquation;

   }

   //direction between 2 points
    public static double direction(double a, double b, double c, double d) {
        //horizontal distance
        double x = c-a;
        //vertical distance
        double y = d-b;
        float tempAnswer = (float) Math.atan(x/y);

        finalEquation = (float) Math.toDegrees(tempAnswer);

        return finalEquation;
    }


}



