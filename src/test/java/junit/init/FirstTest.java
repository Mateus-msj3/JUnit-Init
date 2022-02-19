package junit.init;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest {

    @Test
    public void structureTest() {

        // Elementos de um teste

        /*
        *   1 - Cenário
        */

        int number1 = 10, nymber2 = 5;

        /*
         *   2 - Execução
         */

        int result = number1 + nymber2;

        /*
         *   3 - Verificações
         */

        Assert.assertEquals(15, result);
    }
}
