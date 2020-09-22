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
        System.out.println("First Question: ");
        System.out.println(linear(3, 2, 5));

        System.out.println("Second question: ");
        System.out.println(quadratic(2, 5, -3, -6));

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
   public static double[] quadratic(double a, double b, double c, double d) {
        double [] answer = new double [3];
        double discrimininate = getDiscriminate(b, a, c);
        if (discrimininate < 0){
            answer[0] = 0;
            return answer;
        }
        else if(discrimininate == 0){
            answer [0] = 1;
            double solution = (b*(-1)/2*a);
            answer[1] = solution;
        }
        else{
            answer[0] = 2;
            double solution = (b*(-1) + (Math.sqrt((b*b) - (4*a*c))))/2*a;
        }

   }

    private static double getDiscriminate(double b, double a, double c) {
        return (b+b) - (4*a*c);
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



