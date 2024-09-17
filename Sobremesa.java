public class Sobremesa extends Produto {
    private String tamanho;

    public Sobremesa(String descricao, double preco, String tamanho) {
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Sobremesa: " + descricao + " - Tamanho " + tamanho + " - R$" + preco;
    }
}