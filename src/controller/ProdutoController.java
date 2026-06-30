package controller;

import java.util.ArrayList;
import model.Produto;
import repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    @Override
    public void listarTodos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto p : listaProdutos) {
                p.visualizar();
            }
        }
    }

    @Override
    public void procurarPorId(int id) {

        for (Produto p : listaProdutos) {
            if (p.getId() == id) {
                p.visualizar();
                return;
            }
        }

        System.out.println("Produto não encontrado!");
    }

    @Override
    public void cadastrar(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    @Override
    public void atualizar(Produto produto) {

        for (Produto p : listaProdutos) {
            if (p.getId() == produto.getId()) {

                p.setNome(produto.getNome());
                p.setPreco(produto.getPreco());

                System.out.println("Produto atualizado com sucesso!");
                return;
            }
        }

        System.out.println("Produto não encontrado para atualização!");
    }

    @Override
    public void deletar(int id) {

        boolean removido = listaProdutos.removeIf(p -> p.getId() == id);

        if (removido) {
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado para remoção!");
        }
    }
}