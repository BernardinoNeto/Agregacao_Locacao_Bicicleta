package LocacaoBicicleta;

import java.util.ArrayList;
import java.util.List;

public class AppLocacaoBicicleta {

    static List<Bicicleta> listaBicicletas = new ArrayList<>();
    static Locacao locacao;

    public static void main(String[] args) {

        listaBicicletas.add(new Bicicleta(1, 5.00));
        listaBicicletas.add(new Bicicleta(2, 6.00));
        listaBicicletas.add(new Bicicleta(3, 5.00));

        locacao = new Locacao(1001);

        Bicicleta bicicleta = new Bicicleta(9, 3.00);

        Bicicleta bicicletaEncontrada = pesquisarBicicletaPorId(bicicleta.getIdBicicleta());
        if (bicicletaEncontrada == null) {
            System.out.println("Bicicleta não cadastrada");
        }
        else {
            locacao.definirBicicleta(bicicletaEncontrada);
            System.out.println("Bicicleta definida");
        }

        int idBicicleta = 2;
        bicicletaEncontrada = pesquisarBicicletaPorId(idBicicleta);
        if (bicicletaEncontrada != null) {
            locacao.definirBicicleta(bicicletaEncontrada);
        }

        System.out.println(locacao);
        mostrarBicicletas();

        locacao.finalizarLocacao(4);
        System.out.printf("\nValor da Locação: R$ %.2f\n", locacao.getValorLocacao());

        idBicicleta = 3;
        bicicletaEncontrada = pesquisarBicicletaPorId(idBicicleta);
        if (bicicletaEncontrada != null) {
            bicicletaEncontrada.desativarBicicleta();
        }

        System.out.println(bicicletaEncontrada);
    }

    public static Bicicleta pesquisarBicicletaPorId(int idBicicleta) {
        for (Bicicleta bicicleta : listaBicicletas) {
            if (bicicleta.getIdBicicleta() == idBicicleta) {
                return bicicleta;
            }
        }
        return null;
    }

    public static void mostrarBicicletas() {
        for (Bicicleta bicicleta : listaBicicletas) {
            System.out.println(bicicleta.toString());
        }
    }
}


