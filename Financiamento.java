package modelo;

public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public static void add(Casa casa1) {
    }

    public static void add(Apartamento apartamento1) {
    }

    public static void add(Terreno terreno) {
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public double calcularPagamentoMensal() {
        return 0;
    }

    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * prazoFinanciamento * 12;
    }

    public void mostrarDadosFinanciamento() {
        System.out.println("Valor do imóvel: " + valorImovel);
        System.out.println("Prazo do financiamento: " + prazoFinanciamento + " anos");
        System.out.println("Taxa de juros anual: " + taxaJurosAnual + "%");
        System.out.println("Valor total do financiamento: " + calcularTotalPagamento());
    }
}