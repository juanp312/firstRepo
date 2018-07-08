public class MainIf {

    public static void main(String[] args) {

        //If Statement

        int a = 2;
        if (a > 3) {
            System.out.println("El numero es mayor que tres");
        } else {
            System.out.println("hi putos im in the else");
        }

        // else with sum

        int sum = 8;
        if (sum < 10) {
            sum = sum + 5;
            System.out.println("oh yeah the sum is " + sum);
        } else {
            System.out.println("Sorry i cant Sum");
        }

        sum = sum + 5;
        if (sum <= 10) {
            sum = sum + 5;
        }
    }
}
