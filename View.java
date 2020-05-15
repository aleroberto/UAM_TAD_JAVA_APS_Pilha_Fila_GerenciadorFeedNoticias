/**
 * @author
 * @author: Alexandre Roberto RA 21434418
 * @author: Jhonatan Lima Ra 21337942
 * @author: Emanuelle Fernandes de Macedo Pimenta 21433185
 */

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
            default:
                this.exibirMenu();
                break;
            }
        } catch(Exception ex) {
            System.out.println("");
            throw new Exception();
        }
    }
}
