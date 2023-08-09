public class Calculator {
    private int operand1;
    private int operand2;
    private String operator;

    public Calculator(int operand1, int operand2, String operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;

    }

    public int Addition() {
        int sum;
        sum = operand1 + operand2;
        return sum;
    }

    public int Subtraction() {
        int subs;
        subs = operand1 - operand2;
        return subs;
    }

    public int Multiply() {
        int mul;
        mul = operand1 * operand2;
        return mul;

    }

    public void Divide() {
        int div;
        try {
            div = operand1 / operand2;
            System.out.println(div);
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
            System.out.println("Cannot divide a value by zero.");

        }
    }


    public static void main(String[] args) {
        Calculator cal = new Calculator(6,3,"/");
        Calculator cal1 = new Calculator(6,3,"-");
        switch(cal.operator)
        {
            case "+":
                System.out.println(cal.Addition());
                break;
            case "-":
                System.out.println(cal.Subtraction());
                break;
            case "*":
                System.out.println(cal.Multiply());
                break;
            case "/":
                cal.Divide();
                break;
            default:
                System.out.println("Default");
                break;

        };
        switch(cal1.operator)
        {
            case "+":
                System.out.println(cal1.Addition());
                break;
            case "-":
                System.out.println(cal1.Subtraction());
                break;
            case "*":
                System.out.println(cal1.Multiply());
                break;
            case "/":
                cal1.Divide();
                break;
            default:
                System.out.println("Default");
                break;

        }


    }
}
