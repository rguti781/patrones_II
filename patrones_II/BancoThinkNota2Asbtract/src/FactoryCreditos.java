/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victortrimpai
 */
public class FactoryCreditos {
    

    private static FactoryCreditos instancia;

    private FactoryCreditos() {
    }

    public static FactoryCreditos getInstancia() {
        if (instancia== null) {
            instancia = new FactoryCreditos();
        }
        return instancia;
    }

    public Creditos crearCredito(String EstadoCredito) {
        if (EstadoCredito.equalsIgnoreCase("Credito")) {
            return new Credito() ;
        } else {
            return null;
        }
    }
}
    
    

