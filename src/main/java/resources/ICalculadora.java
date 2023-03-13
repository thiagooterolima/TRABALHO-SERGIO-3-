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



}
