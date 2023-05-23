/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victortrimpai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        
        
        
        
        
        
        FactorySolicitudes factory = FactorySolicitudes.getInstancia();
        Solicitudes solicitud1 = factory.crearSolicitud("Solicitud");
        solicitud1.CrearSolictud();

        FactoryCreditos Factb = FactoryCreditos.getInstancia();
        Creditos credito1 = Factb.crearCredito("Credito");
        credito1.CrearCredito();
        
    }

}
