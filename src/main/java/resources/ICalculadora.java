package resources;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface ICalculadora  {

    @WebMethod
    double somar (
            @WebParam(name = "x")double x,
            @WebParam(name = "y")double y
    );

    @WebMethod
    double calculadoraRaizQuadrada(@WebParam(name= "x")double x);


    @WebMethod
    double calcularPonto (

            @WebParam(name = "x1") double x1,
            @WebParam(name = "x2") double x2,

            @WebParam(name = "y1") double y1,
            @WebParam(name = "y2") double y2

    );

    @WebMethod
    double numerosInteiros(

            @WebParam(name = "A") double A,
            @WebParam(name = "B") double B,
            @WebParam(name = "C") double C,
            @WebParam(name = "R") double R,
            @WebParam(name = "S") double S,
            @WebParam(name = "D") double D


    );

    @WebMethod
    int idade(
      @WebParam(name = "dia") int dia,
      @WebParam(name = "mes") int mes,
      @WebParam(name = "ano") int ano,
      @WebParam(name = "soma") int soma
    );

    @WebMethod
    double calculadora_produto(
            @WebParam(name = "ABCD") int ABCD,
            @WebParam(name = "XYPK") int XYPK,
            @WebParam(name = "KLMP") int KLMP,
            @WebParam(name = "QRST") int QRST


    );


}
