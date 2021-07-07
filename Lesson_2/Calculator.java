public class Calculator {
    private int x;
    private int y;
    private char mathSign;


    public int getX() {
        return x;
    } 

    public boolean setX(int x) {
        if (x > 0) {
            this.x = x;
            return true;
        } else {
            System.out.println("Введено некорректное значение! (число должно быть > 0)");
            return false;
        }
    }

    public int getY() {
        return y;
    }

    public boolean setY(int y) {
        if (y > 0) {
            this.y = y;
            return true;
        } else {
            System.out.println("Введено некорректное значение! (число должно быть > 0)");
            return false;
        }
    }

    public char getMathSign() {
        return mathSign;
    }

    public boolean setMathSign(char mathSign) {
        switch (mathSign) {
            case '+' :
            case '-' :
            case '/' :
            case '*' :
            case '%' :
            case '^' :
                this.mathSign = mathSign;
                return true;
            default :
                System.out.println("Введено некорректное значение! (доступные операции: +, -, *, /, ^, %)");
                return false;
        }
    }

    public void calculate() {
        switch (mathSign) {
            case '+' :
                System.out.println(x + " + " + y + " = " + (x + y));
                break;
            case '-' :
                System.out.println(x + " - " + y + " = " + (x - y));
                break;
            case '/' :
                System.out.println(x + " / " + y + " = " + (x / y));
                break;
            case '*' :
                System.out.println(x + " * " + y + " = " + (x * y));
                break;
            case '%' :
                System.out.println(x + " * " + y + " = " + (x % y));
                break;
            case '^' :
                int result = 1;
                for (int j = 0; j < y; j++) {
                    result *= x;
                }
                System.out.println(x + " ^ " + y + " = " + result);
                break;
        }
    }
}
