


    // [ "CRIADOR - LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package simplecalculator;


// IMPORTAÇÃO DE BIBLIOTECAS:
import java.util.InputMismatchException;
import java.util.Scanner;
import operacoes.Somar;


// MÉTODO PRINCIPAL DA CLASSE:
public class Menu {
    
    
    // DECLARAÇÃO DE VARIAVEIS E OBJETOS:
    int repetir = 1;
    int escolha_usuario = 0;
    Somar calculos_de_soma = new Somar();
    
    
    // FUNÇÃO PARA EXIBIÇÃO DO MENU GERAL:
    public void exibir_menu() {
        
        
        while( repetir != 0 ) {
            
            try {
                
                // EXIBIÇÃO DO MENU:
                System.out.println("");
                System.err.println("CALCULADORA SIMPLES:");
                System.out.println("MENU PRINCIPAL");
                System.out.println("");
                System.out.println("0 - SAIR.");
                System.out.println("1 - SOMAR.");
                System.out.println("");
                System.out.printf("DIGITE SUA RESPOSTA: ");
                Scanner escolher = new Scanner(System.in);
                escolha_usuario = escolher.nextInt();

                switch( escolha_usuario ) {

                    // CASO "0" - SAIR:
                    case 0:
                        repetir = 0;
                    break;

                    // CASO "1" - SOMAR:
                    case 1:
                        calculos_de_soma.menu_de_extracao_somar();
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
    
    
}




