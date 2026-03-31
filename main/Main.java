package main;
import modelo.Financiamento;
import util.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        // Coleta de dados com validação
        double valorImovel = interfaceUsuario.pedirValorImovel();
        int prazoAnos = interfaceUsuario.pedirPrazoFinanciamento();
        double taxaJuros = interfaceUsuario.pedirTaxaJuros();

        // Instanciação e exibição
        Financiamento financiamento = new Financiamento(valorImovel, prazoAnos, taxaJuros);
        financiamento.exibirDadosFinanciamento();
    }
}
