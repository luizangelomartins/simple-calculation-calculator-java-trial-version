


    // [ "CRIADOR - LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package operacoes;


// IMPORTAÇÃO DE BIBLIOTECAS:
import org.junit.Test;
import static org.junit.Assert.*;


// MÉTODO PRINCIPAL DA CLASSE:
public class DividirTest {
       
    
    // DECLARAÇÃO DE VARIAVEIS:
    double valor1 = 0;
    double valor2 = 0;
    double valor3 = 0;
    
    
    public DividirTest() {
    }

    
    // TESTE DA FUNÇÃO DE EXTRAÇÃO DE DADOS:
    /**
     * Test of menu_de_extracao_dividir method, of class Dividir.
     */
    @Test
    public void testMenu_de_extracao_dividir() {
        
    }

    
    // TESTE DA FUNÇÃO DE DIVISÃO:
    /**
     * Test of dividir_numeros method, of class Dividir.
     */
    @Test
    public void testDividir_numeros() {
        
        valor1 = 60.0;
        valor2 = 4.0;
        valor3 = valor1 / valor2;
        assertEquals(15.0, valor3, 1);
        
    }
    
    
}




