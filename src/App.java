import java.util.Scanner;

public class App {
    public static int MAX_ITENS = 10;
    public static Tatuagem[] catalogo = new Tatuagem[MAX_ITENS];
    public static Scanner input = new Scanner(System.in);
    public static int indice = 0;

    public static void main(String[] args) throws Exception {
        menu();
    }

    public static void cadastrar() {
        Tatuagem t = new Tatuagem();        
        System.out.println("**\tCadastrar tatuagem**");
        System.out.println("\tInsira as informações da tatuagem.");
        System.out.println("\t\tDigite o nome da tatuagem:");
        t.nome = input.nextLine();
        System.out.println("\t\tDigite o estilo da tatuagem:");
        t.estilo = input.nextLine();
        t.id = indice + 1;
        catalogo[indice] = t;
        indice += 1;
        System.out.println("Tatuagem cadastrada com sucesso.");
    }

    public static void alterar() {

    }

    public static void excluir() {

    }

    public static void pesquisar() {

    }

    public static void listar() {

    }

    public static void sair() {
        System.out.println("Até logo!");
        System.exit(0);
    }

    public static void menu() {
        boolean ctrlMenu = false;
        while (!ctrlMenu) {
            System.out.println("\t*** Catálogo de Tatuagens *** \t");
            System.out.println("\tOpções do menu:");
            System.out.println("\t\t(C)adastrar");
            System.out.println("\t\t(A)lterar");
            System.out.println("\t\t(E)xcluir");
            System.out.println("\t\t(P)esquisar");
            System.out.println("\t\t(L)istar");
            System.out.println("\t\t(S)air");
            System.out.println("\tDigite a primeira letra da opção desejada:");
            char opcao = input.nextLine().toUpperCase().charAt(0);
            switch (opcao) {
                case 'C':
                    cadastrar();
                    break;
                case 'A':
                    alterar();
                    break;
                case 'E':
                    excluir();
                    break;
                case 'P':
                    pesquisar();
                    break;
                case 'L':
                    listar();
                    break;
                case 'S':
                    sair();
                    break;
                default:
                    System.out.println("ERRO! Selecione uma opção da lista.");
                    break;
            }        
        
        };
    }
    
}
