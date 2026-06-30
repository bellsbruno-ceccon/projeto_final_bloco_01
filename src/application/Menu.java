package application;

import java.util.Scanner;
import controller.ProdutoController;
import model.ItemBazar;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProdutoController controller = new ProdutoController();

        int opcao;

        do {

            System.out.println(Cores.ROXO + "\n****************************************");
            System.out.println("        BAZAR MARIETA DUTRA");
            System.out.println("****************************************" + Cores.RESET);

            System.out.println(Cores.CIANO + "\nMenu de opções:");
            System.out.println("----------------------------" + Cores.RESET);

            System.out.println(Cores.VERDE + "1 - Listar produtos");
            System.out.println("2 - Cadastrar produto");
            System.out.println("3 - Buscar por ID");
            System.out.println("4 - Deletar produto");
            System.out.println("5 - Atualizar produto");
            System.out.println(Cores.AMARELO + "0 - Sair" + Cores.RESET);

            System.out.print("\nDigite uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    controller.listarTodos();
                    break;

                case 2:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Categoria: ");
                    String categoria = sc.nextLine();

                    ItemBazar item = new ItemBazar();
                    item.setId(id);
                    item.setNome(nome);
                    item.setPreco(preco);
                    item.setCategoria(categoria);

                    controller.cadastrar(item);
                    break;

                case 3:
                    System.out.print("ID: ");
                    int buscaId = sc.nextInt();
                    controller.procurarPorId(buscaId);
                    break;

                case 4:
                    System.out.print("ID: ");
                    int delId = sc.nextInt();
                    controller.deletar(delId);
                    break;

                case 5:
                    System.out.print("ID: ");
                    int idAtualizar = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nomeAtualizar = sc.nextLine();

                    System.out.print("Preço: ");
                    double precoAtualizar = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Categoria: ");
                    String categoriaAtualizar = sc.nextLine();

                    ItemBazar atualizado = new ItemBazar();
                    atualizado.setId(idAtualizar);
                    atualizado.setNome(nomeAtualizar);
                    atualizado.setPreco(precoAtualizar);
                    atualizado.setCategoria(categoriaAtualizar);

                    controller.atualizar(atualizado);
                    break;

                case 0:
                    System.out.println(Cores.VERMELHO + "Saindo do sistema..." + Cores.RESET);
                    break;

                default:
                    System.out.println(Cores.VERMELHO + "Opção inválida!" + Cores.RESET);
            }

        } while (opcao != 0);

        sc.close();
    }
}