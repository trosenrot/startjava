public class Calculator {
    public static void main(String[] args) {
        double x = 5;
        double y = 7;
        double result = 0;
        char c = '-';
        if (c == '+') {
            result = x + y;
            System.out.println(x + " + " + y + " = " + result);
        } else if (c == '-') {
            result = x - y;
            System.out.println(x + " - " + y + " = " + result);
        } else if (c == '/') {
            result = x / y;
            System.out.println(x + " / " + y + " = " + result);
        } else if (c == '*') {
            result = x * y;
            System.out.println(x + " * " + y + " = " + result);
        } else if (c == '%') {
            result = x % y;
            System.out.println(x + " % " + y + " = " + result);
        } else if (c == '^') {
            result = 1;
            for (int j = 0; j < y; j++) {
                result *= x;
            }
            System.out.println(x + " ^ " + y + " = " + result);
        }
    }
}