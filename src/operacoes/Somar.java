


    // [ "CRIADOR - LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package operacoes;


// IMPORTAÇÃO DE BIBLIOTECAS:
import java.util.InputMismatchException;
import java.util.Scanner;


// MÉTODO PRINCIPAL DA CLASSE:
public class Somar {
    
    
    // DECLARAÇÃO DE VARIAVEIS:
    int repetir = 1;
    int escolha_usuario = 0;
    double val1 = 0;
    double val2 = 0;
    
    
    // FUNÇÃO PARA GERAR O MENU DE EXTRAÇÃO DE INFORMAÇÕES "SOMAR":
    public void menu_de_extracao_somar() {
        
        repetir = 1;
        val1 = 0;
        val2 = 0;
        
        while( repetir != 0 ) {
            
            try {
                
                System.out.println("");
                System.out.println("0 - VOLTAR AO MENU PRINCIPAL.");
                System.out.println("1 - ADICIONAR VALOR INICIAL.");
                System.out.println("2 - SOMAR VALORES.");
                System.err.println("    | TOTAL DA SOMA: " + val2);
                System.out.println("");
                System.out.printf("DIGITE SUA RESPOSTA: ");
                Scanner escolher = new Scanner(System.in);
                escolha_usuario = escolher.nextInt();

                switch( escolha_usuario ) {

                    // CASO "0" - VOLTAR AO MENU PRINCIPAL:
                    case 0:
                        repetir = 0;
                    break;

                    // CASO "1" - ADICIONAR VALOR INICIAL:
                    case 1:
                        System.out.println("");
                        System.out.printf("DIGITE O VALOR INICIAL PARA SOMA: ");
                        Scanner inicial1 = new Scanner(System.in);
                        val2 = inicial1.nextDouble();
                    break;
                    
                    // CASO "2" - ADICIONAR VALORES | [ SOMAR ]:
                    case 2:
                        System.out.println("");
                        System.out.printf("DIGITE O VALOR PARA ADIÇÃO: ");
                        Scanner valores_soma1 = new Scanner(System.in);
                        val1 = valores_soma1.nextDouble();
                        this.somar_numeros(val1);
                     break;

                     // VALORES INVALIDOS:
                    default:
                        System.err.println("POR FAVOR DIGITE UM VALOR VALIDO!");
                        System.err.println("TENTE NOVAMENTE!");

                }
                
            }catch(InputMismatchException e) {
                
                System.err.println("POR FAVOR DIGITE UM VALOR VALIDO!");
                System.err.println("TENTE NOVAMENTE!");
                
            }
                    
        }
        
    }
    
    
    // FUNÇÃO PARA SOMAR NÚMEROS:
    public void somar_numeros(double valor1) {
        
        val2 = val2 + valor1;
        
    }
    
    
}




