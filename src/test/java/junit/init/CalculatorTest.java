package junit.init;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;

    int num1 = 10, num2 = 5;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    //Testes de adição

    @Test
    public void mustAddTwoNumbers() {

        //Execução
        int result = calculator.sum(num1, num2);

        //Verificação

        Assertions.assertThat(result).isEqualTo(15);

    }

    @Test(expected = RuntimeException.class)
    public void notMustAddTwoNumbers() {

        //Execução
        int result = calculator.sum(-num1, num2);

    }

    //Testes de subtração

    @Test
    public void mustSubtractTwoNumbers() {

        //Execução
        int result = calculator.subtraction(num1, num2);

        //Verificação
        Assertions.assertThat(result).isEqualTo(5);
    }


    //Testes de multiplicação

    @Test
    public void mustMultiplyTwoNumbers() {

        //Execução
        int result = calculator.multiplication(num1, num2);

        //Verificação
        Assertions.assertThat(result).isEqualTo(50);
    }

    //Testes de Divisão

    @Test
    public void mustShareTwoNumbers() {

        //Execução
        float result = calculator.division(num1, num2);

        //Verificação
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test(expected = ArithmeticException.class)
    public void mustNotDivideByZero() {

        //cenário
        int num1 = 10, num2 = 0;

        //Execução
        float result = calculator.division(num1, num2);

        //Verificação
        Assertions.assertThat(result).isEqualTo(2);
    }

}
