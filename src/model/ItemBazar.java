package model;

public class ItemBazar extends Produto {

    private String categoria;

    public ItemBazar(int id, String nome, double preco, String categoria) {
        super(id, nome, preco);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Categoria: " + categoria);
    }
}