/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import modelo.IServicioCiclista;

/**
 *
 * @author William Duarte
 */
public class ViewInsertarCiclista extends UnicastRemoteObject implements IActualizableCiclista, Serializable{
    private IServicioCiclista model ;
    private transient GUIInsertarCiclista gui;
    
    public ViewInsertarCiclista(IServicioCiclista ser) throws RemoteException {
        model = ser;
        model.addVista(this);
        gui = new GUIInsertarCiclista(model);
        gui.setVisible(true);
    }
    
    public void cambio() throws RemoteException {
        
    }
}
