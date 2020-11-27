


    // [ "CRIADOR - LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package operacoes;


// IMPORTAÇÃO DE BIBLIOTECAS:
import java.util.Scanner;


// MÉTODO PRINCIPAL DA CLASSE:
public class Somar {
    
    
    // DECLARAÇÃO DE VARIAVEIS:
    int val1 = 0;
    int val2 = 0;
    
    
    // FUNÇÃO PARA GERAR O MENU DE EXTRAÇÃO DE INFORMAÇÕES "SOMAR":
    public void menu_de_extracao_somar() {
        
        System.out.printf("DIGITE O PRIMEIRO VALOR: ");
        Scanner valores_soma1 = new Scanner(System.in);
        val1 = valores_soma1.nextInt();
        System.out.printf("DIGITE O SEGUNDO VALOR: ");
        Scanner valores_soma2 = new Scanner(System.in);
        val2 = valores_soma2.nextInt();
        this.somar_numeros(val1, val2);
        
    }
    
    
    // FUNÇÃO PARA SOMAR NÚMEROS:
    public void somar_numeros(int valor1, int valor2) {
        
    }
    
    
}




