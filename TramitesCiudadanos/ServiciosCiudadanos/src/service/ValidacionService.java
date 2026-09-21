package service;

import excepcion.DatosInvalidosException;

public class ValidacionService {

    public static void validarCURP(String curp)
            throws DatosInvalidosException {

        if(curp == null || curp.length() != 18){
            throw new DatosInvalidosException(
                    "La CURP debe contener 18 caracteres");
        }
    }
}