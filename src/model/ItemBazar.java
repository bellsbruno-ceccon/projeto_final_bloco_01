package model;

public class ItemBazar extends Produto {

    private String categoria;

    // ✔ IMPORTANTE: construtor vazio (OBRIGATÓRIO)
    public ItemBazar() {
        super();
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