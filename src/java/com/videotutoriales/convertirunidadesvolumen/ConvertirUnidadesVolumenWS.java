package com.videotutoriales.convertirunidadesvolumen;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

@WebService(serviceName = "ConvertirUnidadesVolumenWS")
@Stateless
public class ConvertirUnidadesVolumenWS {

    @WebMethod(operationName = "litrosAGalones")
    public double litrosAGalones(@WebParam(name = "litros") double litros) {
        return litros * 0.26417;
    }

    @WebMethod(operationName = "galonesALitros")
    public double galonesALitros(@WebParam(name = "galones") double galones) {
        return galones * 3.7854;
    }
}
