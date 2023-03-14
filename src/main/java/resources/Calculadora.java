package resources;

import jakarta.jws.WebService;

import java.util.Scanner;


@WebService(endpointInterface = "resources.ICalculadora")
public class Calculadora implements ICalculadora{
    @Override
    public  double calcularPonto(double x1,double x2,double y1, double y2){

        x1 = 1;
        x2 = 1;
        y1 = 1;
        y2 = 1;

        double r = Math.sqrt(((x1 + x2) *2 ) + ((y1 + y2) *2 ));

        return r;

    }

    @Override
    public double numerosInteiros(double A,double B,double C, double R, double S, double D) {
        A = 5;
        B = 10;
        C = 15;

        double soma = A + B;
        R = Math.pow(soma,2);

        double soma2 = B + C;
        S = Math.pow(soma2,2);

        D = (R + S) / 2;

        return D;
    }

    @Override
    public int idade (int dia, int mes, int ano, int soma) {
        System.out.println("Digite o dia de nascimento");
        Scanner scanner = new Scanner(System.in);
        dia = scanner.nextInt();

        System.out.println("Digite o mes de nascimento");
        Scanner scanner1 = new Scanner(System.in);
        mes = scanner1.nextInt();

        System.out.println("Digite o ano de nascimento");
        Scanner scanner2 = new Scanner(System.in);
        ano = scanner2.nextInt();

        int conversaoMes = mes * 30;
        int conversaoAno = (2023 - ano) * 365;
        int conversaoDia = dia;

        soma = (conversaoDia + conversaoMes + conversaoAno);
        return soma;
    }
    @Override
    public double cardapio(int codigo, double preco, int quantidade, double pedido) {
        System.out.println("CARDAPIO\n" +
                "CODIGO 100  CACHORRO QUENTE  PREÇO 1.20\n" +
                "CODIGO 101  BAURU SIMPLES    PREÇO 1.30\n" +
                "CODIGO 102  BAURU COM OVO    PREÇO 1.50\n" +
                "CODIGO 103  HAMBURGGER       PREÇO 1.20\n" +
                "CODIGO 104  CHEESEBURGUER    PREÇO 1.30\n" +
                "CODIGO 105 REFRIGERANTE      PREÇO 1.00\n"
        );
        double cachorroQuente = 100;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o codigo do lanche desejado");
            codigo = scanner.nextInt();

            System.out.println("Digite a quantidade desejada");
            Scanner scanner1 = new Scanner(System.in);
            quantidade = scanner1.nextInt();

            if (codigo == 100) {
                preco = 1.20;
                pedido = preco * quantidade;
                System.out.println("O seu pedido deu: R$" + pedido);
            } else if (codigo == 101) {
                preco = 1.30;
                pedido = preco * quantidade;
                System.out.println("O seu pedido deu: R$" + pedido);
            } else if (codigo == 102) {
                preco = 1.50;
                pedido = preco * quantidade;
                System.out.println("O seu pedido deu: R$" + pedido);
            } else if (codigo == 103) {
                preco = 1.20;
                pedido = preco * quantidade;
                System.out.println("O seu pedido deu: R$" + pedido);
            } else if (codigo == 104) {
                preco = 1.30;
                pedido = preco * quantidade;
                System.out.println("O seu pedido deu: R$" + pedido);
            } else if (codigo == 105) {
                preco = 1.00;
                pedido = preco * quantidade;
                System.out.println("O seu pedido deu: R$" + pedido);

            } else {
                System.out.println("CODIGO INVALIDO, POR FAVOR DIGITE UM CODIGO VALIDO.");
            }


            return pedido;

        }

    @Override
    public double calculadora_produto ( int ABCD, int XYPK, int KLMP, int QRST) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantida de produto devido pelo codigo ABCD");
        ABCD = scanner.nextInt();

        System.out.println("Quantida de produto devido pelo codigo XYPK");
        XYPK = scanner.nextInt();

        System.out.println("Quantida de produto devido pelo codigo KLMP");
        KLMP = scanner.nextInt();

        System.out.println("Quantida de produto devido pelo codigo QRST");
        QRST = scanner.nextInt();

        double produto1 = ABCD * 5.30;
        double produto2 = XYPK * 6.00;
        double produto3 = KLMP * 3.20;
        double produto4 = QRST * 2.50;

        double resultado = (produto1 + produto2 + produto3 + produto4);
        return resultado;
    }

    @Override
    public double Calculador_H(double h ,double n){
        h = 0;
        n = 4;
        for(int i=1; i<=n; i++){
            h = h + 1/i;
        }

        double r = h;
        return r;

    }

    @Override
    public  double Fator(double n){
        Scanner scanner = new Scanner(System.in);

         double resultado = 1 ;
         double x = 0 ;

        System.out.println("Digite o numero para a fatoração");
        n = scanner.nextDouble();
        for (double i=1; i<=n; i++){
            resultado *=i;

        }
        System.out.println(resultado);
        return  resultado;

    }


    }
