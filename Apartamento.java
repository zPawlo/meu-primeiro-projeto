package modelo;

public class Apartamento extends Financiamento {
    private int vagasGaragem;
    private int andar;

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, int vagasGaragem, int andar) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.vagasGaragem = vagasGaragem;
        this.andar = andar;
    }

    @Override
    public double calcularPagamentoMensal() {
        double taxaMensal;
        taxaMensal = getTaxaJurosAnual()  / 1200;
        int meses = getPrazoFinanciamento() * 12;
        double pagamentoMensal = getValorImovel() * taxaMensal * Math.pow(1 + taxaMensal, meses) / (Math.pow(1 + taxaMensal, meses) - 1);
        return pagamentoMensal;
    }

    public int getVagasGaragem() {
        return vagasGaragem;
    }

    public int getAndar() {
        return andar;
    }
}
//só pra constar minha indignação, o tanto de erro que deu só por causa de letra maiuscula e minuscula (em todas package)