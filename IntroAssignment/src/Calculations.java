public class Calculations {

    static double a;
    static double b;
    static double c;
    static Double d;

    static float finalEquation;
    static float finalEquationAnswer1;
    static float finalEquationAnswer2;

    Calculations(double a1, double b1, double c1, Double d1) {
        this.a = a1;
        this.b = b1;
        this.c = c1;
        this.d = d1;
    }


    public static void main(String[] args) {
        Calculations test = new Calculations(7, 4, 0, null);
        test.firstMethod();

        Calculations test1 = new Calculations(2, 8, 4, -4.0);
        test1.secondMethod();

        Calculations test2 = new Calculations(4, 9, 56, 4.0);
        test2.thirdMethod();

        Calculations test3 = new Calculations(9, 2, 3, 5.0);
        test3.fourthMethod();
    }

    //ax + b= c
   public static void firstMethod() {
        if(a != 0) {
            double equation = c - (b);
            finalEquation = (float) (equation / a);
            System.out.println("x: " + finalEquation);
        }
        else if(a == 0){
            System.out.println("Error");
        }
    }

    //ax^2 + bx + c = d
   public static void secondMethod() {
        double subtract = c-(d);
        double divide = 2*a;
        float squareRootEquation = (float) (Math.pow(b,2) - (4*a*subtract));
        if (squareRootEquation < 0 || a == 0){
            System.out.println("No real solutions");
        }
        else if (squareRootEquation == 0){
            finalEquation = (float) ((-(b) + Math.sqrt(squareRootEquation)) / divide);
            System.out.println("x: " + finalEquation);
        }
        else {
            finalEquationAnswer1 = (float) ((-(b) + Math.sqrt(squareRootEquation)) / divide);
            finalEquationAnswer2 = (float) ((-(b) - Math.sqrt(squareRootEquation)) / divide);
            System.out.println("x: " + finalEquationAnswer1 + ",    x: " + finalEquationAnswer2);
        }

    }

    //distance between 2 points
    public static void thirdMethod() {
        //horizontal distance
        double x = c-a;
        float finalHorizontalDistance = (float) Math.pow(x, 2);
        //vertical distance
        double y = d-b;
        float finalVerticalDistance = (float) Math.pow(y, 2);

        finalEquation = (float) Math.sqrt(finalHorizontalDistance + finalVerticalDistance);

        System.out.println("Distance between 2 points: " + finalEquation);
   }

   //direction between 2 points
    public static void fourthMethod() {
        //horizontal distance
        double x = c-a;
        //vertical distance
        double y = d-b;
        float tempAnswer = (float) Math.atan(x/y);
        finalEquation = (float) Math.toDegrees(tempAnswer);
        System.out.println("Direction between 2 points in degrees: " + finalEquation);
    }


}



