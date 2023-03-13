package resources;

import jakarta.jws.WebService;


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





}
