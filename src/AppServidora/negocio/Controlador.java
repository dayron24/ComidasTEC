/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServidora.negocio;

import AppCliente.vista.proyecto.Pedido;
import general.Peticion;
import java.util.StringTokenizer;
import AppServidora.BaseDeDatos;
import AppServidora.platillo;
import java.util.ArrayList;
/**
 *
 * @author ersolano
 */
public class Controlador {
    
    private AdmUsuarios admUsr = new AdmUsuarios();
    private BaseDeDatos base = new BaseDeDatos();
    
    public Controlador() {
    }
    
    public Peticion procesarPeticion(Peticion peticionRecibida) {
        switch (peticionRecibida.getAccion()){
            case SALUDAR: 
                peticionRecibida.setDatosSalida("Saludos cliente " + peticionRecibida.getDatosEntrada() + " desde el servidor!");
                break;
            case INGRESAR: 
                 String credenciales = (String) peticionRecibida.getDatosEntrada();
                 String [] partes  = credenciales.split("-"); 
                 boolean admOK = admUsr.validarAdm(partes[0], partes[1]);
                 peticionRecibida.setDatosSalida(admOK);
                break;
            case AGREGAR:
                platillo p = (platillo) peticionRecibida.getDatosEntrada();
                base.agregarPlatillo(p);
                peticionRecibida.setDatosSalida("Platillo ingresado");
                break;
                
            case VER_PRODUCTOS:
                
                peticionRecibida.setDatosSalida(base.getPlatillos());
                break;
            case CONSULTAR_PRODUCTO:
                base.setPlatillos((ArrayList<platillo>)peticionRecibida.getDatosEntrada());
                 peticionRecibida.setDatosSalida("Platillo ingresado");
                break;
            case AGREGAR_CARRITO:
                Pedido pedido = (Pedido) peticionRecibida.getDatosEntrada();
                base.recibirPedidos(pedido);
                peticionRecibida.setDatosSalida(pedido.getModo());
                break;
            case CONSULTA:
//                Pedido pedido = (Pedido) peticionRecibida.getDatosEntrada();
//                base.recibirPedidos(pedido);
                peticionRecibida.setDatosSalida(base.getPedidos());
                break;
                
        }
        return peticionRecibida;
    }
    
}
