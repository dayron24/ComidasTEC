/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServidora;

import AppCliente.vista.proyecto.Pedido;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sebastian
 */
public class BaseDeDatos {
    private ArrayList<platillo> platillos = new ArrayList();
    
    ///los pedidos realizados
    private ArrayList<Pedido> pedidos = new ArrayList(); 
    
    private int x =0;

    public BaseDeDatos() {
    }
    
    public int getX(){
        return x;
    }
    
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    public void setPlatillos(ArrayList<platillo> platillos) {
        this.platillos = platillos;
    }
    
    public void recibirPedidos(Pedido pedidosRecibidos ){
        //System.out.println(pedidosRecibidos.getModo());
        pedidos.add(pedidosRecibidos);
    
    }
    
    public ArrayList<platillo> getPlatillos() {
        return platillos;
    }
    
    public boolean agregarPlatillo(platillo p){
        platillos.add(p);
        p.setCodeNum(x);
        x++;
        return true;
    }
    
    
}
