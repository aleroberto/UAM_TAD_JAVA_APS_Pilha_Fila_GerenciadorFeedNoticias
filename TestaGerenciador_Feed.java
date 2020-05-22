import java.util.*;
public class TestaGerenciador_Feed {
    public static void main(String[] args) {
        View view2 = new View();
        try {
            view2.exibirMenu();
        } catch(Exception exce) {
            try {
                new View().exibirMenu();
            } catch(Exception ess) {
                System.out.println("Atencao!! Digite somente numeros");
            }
        } finally {
            System.out.println("Obrigado por utilizar nossos servicos");
        }
    }
}
