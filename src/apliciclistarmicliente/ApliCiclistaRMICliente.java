/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apliciclistarmicliente;

import java.rmi.Naming;
import modelo.IServicioCiclista;
import vista.GUIPrincipal;

/**
 *
 * @author William Duarte
 */
public class ApliCiclistaRMICliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String rmiRegistryHost = "192.168.16.15";
     	try {
            if (args.length > 0) {
                rmiRegistryHost = args[0];
            }
            
            IServicioCiclista model = (IServicioCiclista) Naming.lookup("//" + rmiRegistryHost +"/ApliCiclista");
            if(model == null){
                System.out.println("Error... Cliente ");
      		return;	
            }
            GUIPrincipal gui = new GUIPrincipal(model);
	gui.setVisible(true);
    	} catch (Exception e) {
            System.out.println("Error...  " + e);
    	}		
    }
    
}
