import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        Scanner leitura = new Scanner(System.in);

        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Digite o Limite do Cartão:");
            double limiteInformado = leitura.nextInt();
            Cartao meuCartao = new Cartao(limiteInformado);
        System.out.println("------------------------------");
        System.out.println();

        ArrayList<Compra> listaCompras = new ArrayList<>();

        int operacao = 1;

        while (operacao != 2){

            if (operacao == 1){

                System.out.println("____________COMPRA____________");
                    System.out.println("Digite a Descrição da Compra:");
                    String recebeDescricao = leitura.next();
                    System.out.println();

                    System.out.println("Digite o Valor da Compra:");
                    double recebeValor = leitura.nextDouble();
                    System.out.println();

                    Compra compra = new Compra(recebeDescricao,recebeValor);

                    if (meuCartao.lancaCompra(compra) == true) {
                        listaCompras.add(new Compra(recebeDescricao,recebeValor));
                        System.out.println("COMPRA EFETUADA!!");
                        System.out.println("(saldo restante = R$ " + meuCartao.getSaldo() + ")");
                        System.out.println("------------------------------");

                    } else {
                        System.out.println("------------------------------");
                        System.out.println(">>>> SALDO INSUFICIENTE!! <<<<");
                        System.out.println("------------------------------");
                        //System.out.println("(saldo atual = R$ " + meuCartao.getSaldo() + ")");
                        operacao = 0;
                    }

            } else if (operacao == 0){

                System.out.println("_______ITENS COMPRADOS________");
                Collections.sort(listaCompras);
                listaCompras.forEach(System.out::println);
                System.out.println();
                System.out.println("(saldo do cartão: R$ " + meuCartao.getSaldo() + ")");

                System.out.println();
                System.out.println("------------------------------");
                System.out.println("       COMPRA ENCERRADA       ");
                System.out.println("------------------------------");
                break;
            }

            System.out.println();
            System.out.println("Digite 1 para continuar ou 0 para sair:");
            operacao = leitura.nextInt();
            System.out.println();

        }

    }
}
