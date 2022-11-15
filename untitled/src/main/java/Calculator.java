public class Calculator {

    public Double add(double a, double b) {

        return a + b;
    }

    public Double substract(double a, double b) {

        if (b <= 0) {
            return null;
        }
        return a - b;
    }

    public Double multiply(double a, double b) {
        return a * b;

    }

    public Double divide(double a, double b) {
        if(b ==0){
            return null;
        }
        return a / b;

    }

    public Integer reverseSign(int x) {
        if(x == 0){
            return null;
        }
        return -1 * x;
    }
}
