


    // [ "CRIADOR - LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package operacoes;


// IMPORTAÇÃO DE BIBLIOTECAS:
import org.junit.Test;
import static org.junit.Assert.*;


// MÉTODO PRINCIPAL DA CLASSE:
public class MultiplicarTest {
    
    
    // DECLARAÇÃO DE VARIAVEIS:
    double valor1 = 0;
    double valor2 = 0;
    double valor3 = 0;
    
    
    public MultiplicarTest() {
    }

    
    // TESTE DA FUNÇÃO DE EXTRAÇÃO DE DADOS:
    /**
     * Test of menu_de_extracao_multiplicar method, of class Multiplicar.
     */
    @Test
    public void testMenu_de_extracao_multiplicar() {
        
    }

    
    // TESTE DA FUNÇÃO DE MULTIPLICAÇÃO:
    /**
     * Test of multiplicar_numeros method, of class Multiplicar.
     */
    @Test
    public void testMultiplicar_numeros() {
        
        valor1 = 5.40;
        valor2 = 2.35;
        valor3 = valor1 * valor2;
        assertEquals(12.69, valor3, 1);
        
    }
    
    
}




