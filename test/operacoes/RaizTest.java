


    // [ "CRIADOR - LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package operacoes;


// IMPORTAÇÃO DE BIBLIOTECAS:
import org.junit.Test;
import static org.junit.Assert.*;


// MÉTODO PRINCIPAL DA CLASSE:
public class RaizTest {
    
    
    // DECLARAÇÃO DE VARIAVEIS:
    double valor1 = 0;
    double valor2 = 0;
    
    
    public RaizTest() {
    }

    
    // TESTE DA FUNÇÃO DE EXTRAÇÃO DE DADOS:
    /**
     * Test of menu_de_extracao_raiz method, of class Raiz.
     */
    @Test
    public void testMenu_de_extracao_raiz() {
        
    }

    
    // TESTE DA FUNÇÃO DE CALCULO DA RAIZ:
    /**
     * Test of calcular_raiz method, of class Raiz.
     */
    @Test
    public void testCalcular_raiz() {
        
        valor1 = 144.0;
        valor2 = Math.sqrt(valor1);
        assertEquals(12.0, valor2, 1);
        
    }
    
    
}




