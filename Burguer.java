public class Burguer extends Produto {
    private int gramas;

    public Burguer(String descricao, double preco, int gramas) {
        this.descricao = descricao;
        this.preco = preco;
        this.gramas = gramas;
    }

    @Override
    public String toString() {
        return "Burguer: " + descricao + " - " + gramas + "g - R$" + preco;
    }
}