public class Calculator {
    private int x;
    public int getX() {
        return x;
    } 
    public boolean setX(int x) {
        if (x > 0) {
            this.x = x;
            return true;
        }
        else {
            System.out.println("Введено некорректное значение! (число должно быть > 0)");
            return false;
        }
    }

    private int y;
    public int getY() {
        return y;
    }
    public boolean setY(int y) {
        if (y > 0) {
            this.y = y;
            return true;
        }
        else {
            System.out.println("Введено некорректное значение! (число должно быть > 0)");
            return false;
        }
    }

    private char c = '-';
    public char getC() {
        return c;
    }
    public boolean setC(char c) {
        switch (c) {
            case '+' :
            case '-' :
            case '/' :
            case '*' :
            case '%' :
            case '^' :
                this.c = c;
                return true;
            default :
                System.out.println("Введено некорректное значение! (доступные операции: +, -, *, /, ^, %)");
                return false;
        }
    }

    public void Calculation() {
        switch (c) {
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
