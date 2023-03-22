package LocacaoBicicleta;

public class Bicicleta {

    private int idBicicleta;
    private double precoPorHora;
    private char situacao;

    public Bicicleta(int idBicleta, double precoPorHora) {
        this.idBicicleta = idBicleta;
        this.precoPorHora = precoPorHora;
        this.situacao = 'D';
    }

    public void locarBicicleta(){
        this.situacao = 'L';
    }

    public void devolverBicicleta(){
        this.situacao = 'D';
    }

    public void desativarBicicleta(){
        this.situacao = 'Q';
    }

    public int getIdBicicleta() {
        return idBicicleta;
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public char getSituacao() {
        return situacao;
    }

    public void setPrecoPorHora(double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "idBicleta = " + idBicicleta + ", precoPorHora = " + precoPorHora +
                ", situacao = " + situacao + '}';
    }
}
