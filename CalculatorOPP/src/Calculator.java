import java.text.DecimalFormat;

public class Calculator {

    public double add(double n1, double n2) {

        return n1 + n2;
    }

    public double sub(double n1, double n2) {

        return n1 - n2;
    }

    public double multiply(double n1, double n2) {

        return n1 * n2;
    }

    public double divide(double n1, double n2) {

        if (n1 == 0 || n2 == 0)
            return -1;
        else
            return n1 / n2;
    }

    double result;
    public double calculate(double n1, double n2, char operator) {

        DecimalFormat df = new DecimalFormat("#.##");

        switch (operator) {
            case '+':
                result = add(n1, n2);
                System.out.println("Soma = "+ result);
                break;

            case '-':
                result = sub(n1, n2);
                System.out.println("Subtração = "+ result);
                break;

            case '*':
                result = multiply(n1, n2);
                System.out.println("Multiplicação = "+ result);
                break;

            case '/':
                result = divide(n1, n2);
                if (result == -1)
                    System.out.println("Impossivel dividir por zero");
                else
                    System.out.println("Divisão = "+ df.format(result));
                break;

            default:
                System.out.println("Operador Invalido!");
                break;

        }
        return 0;
    }
}
