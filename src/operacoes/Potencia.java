


    // [ "CRIADOR - LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package operacoes;


// IMPORTAÇÃO DE BIBLIOTECAS:
import java.util.InputMismatchException;
import java.util.Scanner;


// MÉTODO PRINCIPAL DA CLASSE:
public class Potencia {
    
    
    // DECLARAÇÃO DE VARIAVEIS:
    int repetir = 1;
    int escolha_usuario = 0;
    double val1 = 0;
    double val2 = 0;
    
    
    // FUNÇÃO PARA GERAR O MENU DE EXTRAÇÃO DE INFORMAÇÕES "POTÊNCIA":
    public void menu_de_extracao_potencia() {
        
        repetir = 1;
        val1 = 0;
        val2 = 0;
        
        while( repetir != 0 ) {
            
            try {
                
                System.out.println("");
                System.out.println("0 - VOLTAR AO MENU PRINCIPAL.");
                System.out.println("1 - ADICIONAR VALOR INICIAL.");
                System.out.println("2 - FAZER POTÊNCIAÇÃO.");
                System.err.println("    | TOTAL: " + val2);
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
                        System.out.printf("DIGITE O VALOR INICIAL PARA O CALCULO DA POTÊNCIA: ");
                        Scanner inicial1 = new Scanner(System.in);
                        val2 = inicial1.nextDouble();
                    break;
                        
                    // CASO "2" - ADICIONAR VALORES | [ POTÊNCIA ]:
                    case 2:
                        System.out.println("");
                        System.out.printf("DIGITE O VALOR DO EXPOENTE: ");
                        Scanner valores_potencia1 = new Scanner(System.in);
                        val1 = valores_potencia1.nextDouble();
                        this.potenciacao(val2,val1);
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
    
    
    // FUNÇÃO PARA CALCULAR POTÊNCIAÇÃO:
    public void potenciacao(double numero, double expoente) {
        
        val2 = Math.pow(numero, expoente);
        
    }
    
    
}



