package modelo;

import util.DescontoMaiorDoQueJurosException;

public class Casa extends Financiamento {
    private double areaConstruida;
    private double tamanhoTerreno;
    private double desconto;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, double areaConstruida, double tamanhoTerreno) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.areaConstruida = areaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
    }

    @Override
    public double calcularPagamentoMensal() {
        double pagamentoMensal = super.calcularPagamentoMensal();
        if (desconto > pagamentoMensal) {
            throw new DescontoMaiorDoQueJurosException("Erro: Desconto maior do que o valor dos juros da mensalidade.");
        }
        return pagamentoMensal - desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}