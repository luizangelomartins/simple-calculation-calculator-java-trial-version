


    // [ "CRIADOR - LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package operacoes;


// IMPORTAÇÃO DE BIBLIOTECAS:
import org.junit.Test;
import static org.junit.Assert.*;


// MÉTODO PRINCIPAL DA CLASSE:
public class SomarTest {
    
    
    // DECLARAÇÃO DE VARIAVEIS:
    double valor1 = 0;
    double valor2 = 0;
    double valor3 = 0;
    
    
    public SomarTest() {
    }

    
    // TESTE DA FUNÇÃO DE EXTRAÇÃO DE DADOS:
    /**
     * Test of menu_de_extracao_somar method, of class Somar.
     */
    @Test
    public void testMenu_de_extracao_somar() {
        
    }

    
    // TESTE DA FUNÇÃO DE SOMA:
    /**
     * Test of somar_numeros method, of class Somar.
     */
    @Test
    public void testSomar_numeros() {
        
        valor1 = 50.44;
        valor2 = 54.76;
        valor3 = valor1 + valor2;
        assertEquals(105.20, valor3, 1);
        
    }
    
    
}




