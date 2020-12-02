


    // [ "CRIADOR - LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package operacoes;


// IMPORTAÇÃO DE BIBLIOTECAS:
import org.junit.Test;
import static org.junit.Assert.*;


// MÉTODO PRINCIPAL DA CLASSE:
public class PotenciaTest {
    
    
    // DECLARAÇÃO DE VARIAVEIS:
    double valor1 = 0;
    double valor2 = 0;
    double valor3 = 0;
    
    
    public PotenciaTest() {
    }

    
    // TESTE DA FUNÇÃO DE EXTRAÇÃO DE DADOS:
    /**
     * Test of menu_de_extracao_potencia method, of class Potencia.
     */
    @Test
    public void testMenu_de_extracao_potencia() {
        
    }

    
    // TESTE DA FUNÇÃO DE POTÊNCIAÇÃO:
    /**
     * Test of potenciacao method, of class Potencia.
     */
    @Test
    public void testPotenciacao() {
        
        valor1 = 50.0;
        valor2 = 2.0;
        valor3 = Math.pow(valor1, valor2);
        assertEquals(2500.0, valor3, 1);
        
    }
    
    
}




