public class Compra implements Comparable<Compra> {

    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return descricao + " - R$ " + valor;
    }


    //RESOLUÇÃO DA PROFESSORA (mais simples)
    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }

    // RESOLUÇÃO QUE PEGUEI NA INTERNET (e funcionou)
//    @Override
//    public int compareTo(Compra outraCompra) {
//        if (this.getValor()<outraCompra.getValor())
//            return -1;
//        else if (outraCompra.getValor()<this.getValor())
//            return 1;
//        return 0;
//    }





}
