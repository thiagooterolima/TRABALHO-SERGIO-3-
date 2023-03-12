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
}
