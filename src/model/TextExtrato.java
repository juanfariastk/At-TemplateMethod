package model;

public class TextExtrato extends Extrato {

    public TextExtrato(Cliente cliente) {
        super(cliente);
    }
    @Override
    protected String getHeader(String nomeCliente) {
       return "Registro de Alugueis de " + nomeCliente;
    }

    @Override
    protected String getLineSeparator() {
       return System.lineSeparator();
    }

    @Override
    protected String alugelFormater(String dvdTitulo, double valor) {
        String s= "\t"+ dvdTitulo+"\t"+ valor + this.getLineSeparator();
        return s;
    }

    @Override
    protected String getFooter(double valorTotal, int pontosTotais) {
        
        String s="";
        s+="Valor total : "+valorTotal+this.getLineSeparator();
        s+="Voce tem um total: "+pontosTotais+" pontos de alugador frequente.";
        
        return s;

    }

}
