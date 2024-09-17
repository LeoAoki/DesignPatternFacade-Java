public class Combo {
    private Burguer burguer;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public void CriarCombo(int tipo) {
        switch (tipo) {
            case 1:
                burguer = new Burguer("Cheeseburguer", 15.0, 200);
                sobremesa = new Sobremesa("Brownie", 7.0, "Médio");
                bebida = new Bebida("Coca-Cola", 5.0, 350);
                break;
            case 2:
                burguer = new Burguer("Baconburguer", 18.0, 250);
                sobremesa = new Sobremesa("Sorvete", 8.0, "Grande");
                bebida = new Bebida("Suco de Laranja", 6.0, 500);
                break;
            default:
                System.out.println("Combo não disponível.");
        }
    }

    @Override
    public String toString() {
        if (burguer == null || sobremesa == null || bebida == null) {
            return "Nenhum combo selecionado.";
        }
        return burguer.toString() + "\n" + sobremesa.toString() + "\n" + bebida.toString();
    }
}