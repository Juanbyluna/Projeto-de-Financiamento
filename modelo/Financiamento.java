package modelo;

// Atributos privados para encapsulamento
public class Financiamento {
    private double valorImovel;
    private double prazoFinanciamento;
    private double taxaJurosAnual;

    public Financiamento(double valorDesejadoImovel, double prazoFinanciamentoAnos, double taxaJuros) {
        this.valorImovel = valorDesejadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoAnos;
        this.taxaJurosAnual = taxaJuros;
    }
    public double getValorImovel() {
        return valorImovel;
    }
    public double getPrazoFinanciamento() {
        return prazoFinanciamento;
    }
    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public double calcularPagamentoMensal() {
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }

    public double calcularTotalPagamento() {
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }

    //Método que exibe todos os daods do financiamento
    public void exibirDadosFinanciamento() {
        System.out.println("Dados do Financiamento:");
        System.out.println("Valor do Imóvel: " + this.valorImovel);
        System.out.println("Prazo do Financiamento (anos): " + this.prazoFinanciamento);
        System.out.println("Taxa de Juros Anual: " + this.taxaJurosAnual);
        System.out.println("Pagamento Mensal: " + this.calcularPagamentoMensal());
        System.out.println("Total a Pagar: " + this.calcularTotalPagamento()); 
    }
}
