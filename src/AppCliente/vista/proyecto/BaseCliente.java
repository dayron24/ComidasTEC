/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppCliente.vista.proyecto;

import java.util.ArrayList;
import AppServidora.platillo;
/**
 *
 * @author Dayron
 */
public class BaseCliente {
    
    private ArrayList<platillo> carrito;
    public int cantidad;
    
    
    public BaseCliente(){
        carrito = new ArrayList();
    }
    
    public void limpiarCarrito(){
        carrito = new ArrayList();
    }
    
    public void agregarCarrito(platillo p){
        for(int i =0;i<carrito.size();i++){
            if(p.getNombre().equals(carrito.get(i).getNombre())){
                carrito.get(i).setVentas(carrito.get(i).getVentas()+1);
                return;
            }
        }
        p.setVentas(1);
        carrito.add(p);
    }
    public void eliminar(String nombre){
        for(int i =0;i<carrito.size();i++){
            if(nombre.equals(carrito.get(i).getNombre())){
                carrito.get(i).setVentas(carrito.get(i).getVentas()-1);
                if (carrito.get(i).getVentas() == 0){
                    carrito.remove(i);
                }
            }
        }          
             
    }
    
    public Pedido enviarPedido(String modo){
       cantidad++;
       return new Pedido(modo,carrito); 
       
    }
    
    public ArrayList<platillo> getCarrito(){
        return carrito;
    }
}
