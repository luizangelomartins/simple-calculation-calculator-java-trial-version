


    // [ "CRIADOR - LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package simplecalculator;


// IMPORTAÇÃO DE BIBLIOTECAS:
import java.util.InputMismatchException;
import java.util.Scanner;
import operacoes.Dividir;
import operacoes.Multiplicar;
import operacoes.Potencia;
import operacoes.Raiz;
import operacoes.Somar;
import operacoes.Subtrair;


// MÉTODO PRINCIPAL DA CLASSE:
public class Menu {
    
    
    // DECLARAÇÃO DE VARIAVEIS E OBJETOS:
    int repetir = 1;
    int escolha_usuario = 0;
    
    Somar calculos_de_soma = new Somar();
    Subtrair calculos_de_subtracao = new Subtrair();
    Multiplicar calculos_de_multiplicacao = new Multiplicar();
    Dividir calculos_de_divisao = new Dividir();
    Raiz calculos_de_raiz = new Raiz();
    Potencia calculos_de_potencia = new Potencia();
    
    
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
                System.out.println("2 - SUBTRAIR.");
                System.out.println("3 - MULTIPLICAR.");
                System.out.println("4 - DIVIDIR.");
                System.out.println("5 - RAIZ QUADRADA.");
                System.out.println("6 - POTÊNCIAÇÃO.");
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
                    
                    // CASO "2" - SUBTRAIR:
                    case 2:
                        calculos_de_subtracao.menu_de_extracao_subtrair();
                    break;
                        
                    // CASO "3" - MULTIPLICAR:
                    case 3:
                        calculos_de_multiplicacao.menu_de_extracao_multiplicar();
                    break;
                        
                    // CASO "4" - DIVIDIR:
                    case 4:
                        calculos_de_divisao.menu_de_extracao_dividir();
                    break;
                        
                    // CASO "5" - RAIZ QUADRADA:
                    case 5:
                        calculos_de_raiz.menu_de_extracao_raiz();
                    break;
                    
                    // CASO "6" - POTÊNCIAÇÃO:
                    case 6:
                        calculos_de_potencia.menu_de_extracao_potencia();
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




