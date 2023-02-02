import java.util.Scanner;

public class Math {
    Scanner input = new Scanner(System.in);
    private double a;
    private double b;
    private String operator;

    public Math() {
        setA(input.nextDouble());
        input.nextLine();
        setOperator(input.nextLine());

        setB(input.nextDouble());


    }

    public double calculate() {


        double calculate = switch (operator) {
            case "+":
                yield a +b;
            case "-":
                yield a - b;
            case "*":
                yield a * b;
            case "/":
                yield a / b;
            default:
                yield 0000;

        };
        return calculate;
    }


    public double getA() {
        return a;
    }


    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}

