package repository;

import model.Produto;

public interface ProdutoRepository {
	
	 void listarTodos();
	
	 void procurarPorId(int id);
	
	 void cadastrar(Produto produto);
	
	 void atualizar(Produto produto);
	
	 void deletar(int id);

}
