public class Bebida extends Produto {
    private int ml;

    public Bebida(String descricao, double preco, int ml) {
        this.descricao = descricao;
        this.preco = preco;
        this.ml = ml;
    }

    @Override
    public String toString() {
        return "Bebida: " + descricao + " - " + ml + "ml - R$" + preco;
    }
}