package modelo;

public class Terreno extends Financiamento {
    private String tipoZona;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, String tipoZona) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.tipoZona = tipoZona;
    }

    @Override
    public double calcularPagamentoMensal() {
        double pagamentoMensal = super.calcularPagamentoMensal();
        return pagamentoMensal * 1.02;
    }

    public String getTipoZona() {
        return tipoZona;
    }
}