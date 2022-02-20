package junit.init;

public class Calculator {

    //Metódo que soma dois números
    public int sum(int num1, int num2) {

        if(num1 < 0 || num2 < 0) {
            throw new RuntimeException("Adding negative numbers is not allowed");
        }

        return num1 + num2;
    }

    public int subtraction(int num1, int num2) {

        return num1 - num2;

    }

    public int multiplication(int num1, int num2) {

        return num1 * num2;

    }

    public float division(int num1, int num2) {

        return num1 / num2;

    }

}
