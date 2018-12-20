public class MathOperations
{
    public double calculate(double n1, String op, double n2)
    {
        double res = 0;
        switch (op)
        {
            case "+":
                res = n1+n2;
                break;
            case "-":
                res = n1-n2;
                break;
            case "*":
                res = n1*n2;
                break;
            case "/":
                res = n1/n2;
                break;
            default:
                res = 0;
                break;
        }
        return res;
    }

    public double root (double value){
        double result = 0;

        if (value > 0){
            result = Math.sqrt(value);
        }

        return result;
    }

    public double percent (double value){

        double result = value / 100;

        return result;
    }
}