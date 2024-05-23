/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppCliente.vista.proyecto;

import AppServidora.platillo;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Dayron
 */
public class Pedido implements Serializable{
    
   private ArrayList<platillo> carrito;
   String modo;
   
   public Pedido(){
       carrito = new ArrayList();
       modo ="";
   }
   
   public Pedido(String modo,ArrayList<platillo> carrito){
       this.carrito = carrito;
       this.modo = modo;
   }

    public ArrayList<platillo> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<platillo> carrito) {
        this.carrito = carrito;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }
   
   
}
