package main;

import modelo.Financiamento;
import modelo.Casa;
import modelo.Apartamento;
import modelo.Terreno;
import util.InterfaceUsuario;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        double valorImovel = interfaceUsuario.pedirValorImovel();
        int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
        double taxaJurosAnual = interfaceUsuario.pedirTaxaJurosAnual();

        Casa casa1 = new Casa(valorImovel, prazoFinanciamento, taxaJurosAnual, 100, 200);
        Casa casa2 = new Casa(300000, 10, 10, 150, 300);
        Apartamento apartamento1 = new Apartamento(400000, 10, 10, 2, 5);
        Apartamento apartamento2 = new Apartamento(500000, 10, 10, 3, 10);
        Terreno terreno = new Terreno(200000, 10, 0.10, "Residencial");

        financiamentos.add(casa1);
        financiamentos.add(casa2);
        financiamentos.add(apartamento1);
        financiamentos.add(apartamento2);
        financiamentos.add(terreno);

        double somaValoresImoveis = 0;
        double somaValoresFinanciamentos = 0;

        for (Financiamento financiamento : financiamentos) {
            financiamento.mostrarDadosFinanciamento();
            somaValoresImoveis += financiamento.getValorImovel();
            somaValoresFinanciamentos += financiamento.calcularTotalPagamento();
        }

        System.out.println("Soma dos valores dos imóveis: " + somaValoresImoveis);
        System.out.println("Soma dos valores dos financiamentos: " + somaValoresFinanciamentos);
    }
}