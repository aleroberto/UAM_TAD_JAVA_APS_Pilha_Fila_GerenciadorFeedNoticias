import java.util.Scanner;
import java.io.*;
public class View {

    Scanner scanner = new Scanner(System.in);
    Gerenciador gerenciador = new Gerenciador();

    void exibirMenu() throws Exception {
        int optionUser = 0;
        String noticiaNova = null;
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("");
        System.out.println("   ******************************************************************");
        System.out.println("   ******************************************************************");
        System.out.println("   ***       Bem vindo ao Sistema de Cadastro e de Consulta       ***");
        System.out.println("   **               Digite 1 para        Cadastrar                 **");
        System.out.println("   **               Digite 2 para        Recentes                  **");
        System.out.println("   ***              Digite 3 para        Antigos                  ***");
        System.out.println("   ***              Digite 9 para        Encerrar                 ***");
        System.out.println("   ******************************************************************");
        System.out.println("   ******************************************************************");
        System.out.println("");

        try {
            System.out.print("Digite sua resposta:");
            optionUser = scanner.nextInt();
            switch(optionUser) {
            case 1:

                System.out.print("Digite a Noticia:  ");
                noticiaNova = ob.readLine();
                gerenciador.inserirNoticia(noticiaNova);
                this.exibirMenu();
                break;
            case 2:
                gerenciador.imprimirRecentes();
                this.exibirMenu();
                break;
            case 3:
                gerenciador.imprimirAntigos();
                this.exibirMenu();
                break;
            case 9:
                this.encerrar();
                System.exit(0);
            default:
                this.exibirMenu();
                break;
            }
        } catch(Exception ex) {
            System.out.println("");
            throw new Exception();
        }
    }
    void encerrar() {
        System.out.println("");
        System.out.println("   ******************************************************************");
        System.out.println("   ******************************************************************");
        System.out.println("   **                                                              **");
        System.out.println("   ***            Obrigado por utilizar nosso servicos            ***");
        System.out.println("   ***                                                            ***");
        System.out.println("   **               Alexandre Roberto RA 21434418                 ***");
        System.out.println("   **           Igor Oliveira da Silva  RA 20926645               ***");
        System.out.println("   ***        Emanuelle Fernandes de Macedo Pimenta 21433185      ***");
        System.out.println("   **                                                              **");
        System.out.println("   ******************************************************************");
        System.out.println("   ******************************************************************");
        System.out.println("");
    }
}