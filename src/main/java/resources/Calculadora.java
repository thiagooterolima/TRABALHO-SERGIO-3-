package resources;

import jakarta.jws.WebService;

import java.util.Scanner;


@WebService(endpointInterface = "resources.ICalculadora")
public class Calculadora implements ICalculadora{

    @Override
    public double somar (double x, double y){
        double s = x + y;
        return s;
    }

    @Override
    public double calculadoraRaizQuadrada(double x){
        double r = Math.sqrt(x);
        return r;
    }

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
    public double calculadora_produto(int ABCD , int XYPK, int KLMP, int QRST) {
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


}
