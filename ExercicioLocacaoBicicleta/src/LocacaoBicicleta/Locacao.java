package LocacaoBicicleta;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Locacao {

    private int idLocacao;
    private Date data;
    private double valorLocacao;
    private Bicicleta bicicleta;

    public Locacao(int idLocacao) {
        this.idLocacao = idLocacao;
        this.data = new Date();
    }

    public boolean definirBicicleta(Bicicleta bike){
        if (this.bicicleta.getSituacao() == 'L'){
            return false;
        }
        this.bicicleta = bike;
        this.bicicleta.locarBicicleta();
        return true;
    }

    public void finalizarLocacao(int qtdeHora){
        this.valorLocacao = this.bicicleta.getPrecoPorHora() * qtdeHora;
        this.bicicleta.locarBicicleta();
    }

    public void registrarQuebra(){
        this.bicicleta.desativarBicicleta();
    }

    public int getIdLocacao() {
        return idLocacao;
    }

    public Date getData() {
        return data;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/mm/yy");
        return "Locacao{" + "idLocacao = " + idLocacao + ", data = " + formatoData.format(data) +
                ", valorLocacao = " + valorLocacao + ", bicicleta = " + bicicleta + '}';
    }
}
