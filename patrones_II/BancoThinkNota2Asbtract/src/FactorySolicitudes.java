/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victortrimpai
 */
public class FactorySolicitudes {

    private static FactorySolicitudes instancia;

    private FactorySolicitudes() {
    }

    public static FactorySolicitudes getInstancia() {
        if (instancia == null) {
            instancia = new FactorySolicitudes();
        }
        return instancia;
    }

    public Solicitudes crearSolicitud(String EstadoSolicitud) {
        if (EstadoSolicitud.equalsIgnoreCase("Solicitud")) {
            return new Solicitud();
        } else {
            return null;
        }
    }
}
