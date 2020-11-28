


    // [ "CRIADOR - LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package operacoes;


// IMPORTAÇÃO DE BIBLIOTECAS:
import org.junit.Test;
import static org.junit.Assert.*;


// MÉTODO PRINCIPAL DA CLASSE:
public class SubtrairTest {
    
    
    // DECLARAÇÃO DE VARIAVEIS:
    double valor1 = 0;
    double valor2 = 0;
    double valor3 = 0;
    
    
    public SubtrairTest() {
    }

    
    // TESTE DA FUNÇÃO DE EXTRAÇÃO DE DADOS:
    /**
     * Test of menu_de_extracao_subtrair method, of class Subtrair.
     */
    @Test
    public void testMenu_de_extracao_subtrair() {
        
    }

    
    // TESTE DA FUNÇÃO DE SUBTRAÇÃO:
    /**
     * Test of subtrair_numeros method, of class Subtrair.
     */
    @Test
    public void testSubtrair_numeros() {
        
        valor1 = 50.44;
        valor2 = 38.76;
        valor3 = valor1 - valor2;
        assertEquals(11.68, valor3, 1);
        
    }
    
    
}




