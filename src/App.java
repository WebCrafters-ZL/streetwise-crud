import java.util.Scanner;

public class App {
    public static int MAX_ITENS = 10;
    public static Tatuagem[] catalogo = new Tatuagem[MAX_ITENS];
    public static Scanner input = new Scanner(System.in);
    public static int indice = 0;

    public static void main(String[] args) throws Exception {
        // Código para iniciar o programa a partir do menu de opções
        menu();
    }

    public static void cadastrar() {
        // Código para cadastrar uma tatuagem
        Tatuagem t = new Tatuagem();
        System.out.println("\t**Cadastrar tatuagem**");
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

    public static void pesquisar() {
        // Código para pesquisar uma tatuagem
        System.out.println("\t**Pesquisar tatuagem**");
        System.out.println("\t\tDigite o nome da tatuagem:");
        String nomeTatuagem = input.nextLine();
        for (int i = 0; i < indice; i++) {
            Tatuagem t = catalogo[i];
            if (t != null && t.nome.toLowerCase().contains(nomeTatuagem.toLowerCase())) {
                System.out.print("Tatuagem encontrada:\t");
                System.out.println("Cód.: " + t.id + " | Nome: " + t.nome + " | Estilo: " + t.estilo);
                break;
            }
        }
    }

    public static void alterar() {
        // Código para alterar uma tatuagem
        System.out.println("\t**Alterar tatuagem**");
        System.out.println("\tPesquise a tatuagem que deseja alterar");
        System.out.println("\t\tDigite o nome da tatuagem:");
        String nomeTatuagem = input.nextLine();
        for (int i = 0; i < indice; i++) {
            Tatuagem t = catalogo[i];
            if (t != null && t.nome.toLowerCase().contains(nomeTatuagem.toLowerCase())) {
                System.out.print("Tatuagem encontrada:\t");
                System.out.println("Cód.: " + t.id + " | Nome: " + t.nome + " | Estilo: " + t.estilo);
                System.out.println("Digite o nome atualizado:");
                t.nome = input.nextLine();
                System.out.println("Digite o estilo atualizado:");
                t.estilo = input.nextLine();
                catalogo[i] = t;
                System.out.println("Tatuagem atualizada com sucesso.");
                System.out.println("Cód.: " + t.id + " | Nome: " + t.nome + " | Estilo: " + t.estilo);
                break;
            }
        }
    }

    public static void excluir() {
        // Código para excluir uma tatuagem
        System.out.println("\t**Excluir tatuagem**");
        System.out.println("\tPesquise a tatuagem que deseja excluir");
        System.out.println("\t\tDigite o nome da tatuagem:");
        String nomeTatuagem = input.nextLine();
        for (int i = 0; i < indice; i++) {
            Tatuagem t = catalogo[i];
            if (t != null && t.nome.toLowerCase().contains(nomeTatuagem.toLowerCase())) {
                System.out.print("Tatuagem encontrada:\t");
                System.out.println("Cód.: " + t.id + " | Nome: " + t.nome + " | Estilo: " + t.estilo);
                catalogo[i] = null;
                System.out.println("Tatuagem excluída com sucesso.");
                break;
            }
        }
    }

    public static void listar() {
        // Código para listar todas as tatuagens
        System.out.println("\t**Listar tatuagens**");
        for (int i = 0; i < indice; i++) {
            Tatuagem t = catalogo[i];
            if (t != null) {
                System.out.println("Cód.: " + t.id + "\t|\tNome: " + t.nome + "\t|\tEstilo: " + t.estilo);
            }
        }
    }

    public static void sair() {
        // Código para sair do programa
        System.out.println("Até logo!");
        System.exit(0);
    }

    public static void menu() {
        boolean ctrlMenu = false;
        while (!ctrlMenu) {
            System.out.println("\t*** Catálogo de Tatuagens *** \t");
            System.out.println("\tOpções do menu:");
            System.out.println("\t\t(C)adastrar");
            System.out.println("\t\t(P)esquisar");
            System.out.println("\t\t(A)lterar");
            System.out.println("\t\t(E)xcluir");
            System.out.println("\t\t(L)istar tudo");
            System.out.println("\t\t(S)air");
            System.out.println("\tDigite a primeira letra da opção desejada:");
            char opcao = input.nextLine().toUpperCase().charAt(0);
            switch (opcao) {
                case 'C':
                    cadastrar();
                    break;
                case 'P':
                    pesquisar();
                    break;
                case 'A':
                    alterar();
                    break;
                case 'E':
                    excluir();
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
        }
    }
}
