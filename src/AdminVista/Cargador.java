/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminVista;

import AppCliente.vista.proyecto.Pedido;
import AppServidora.codigoPlatillo;
import AppServidora.platillo;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dayron
 */
public class Cargador {
    
    public Cargador(){}
    
    
    
    public String ZeroADD(int num){
        int length = String.valueOf(num).length(); 
        if(length == 1){
            return "00"+num;
        } else if(length ==2){
            return "0"+num;
        } else if(length == 3){
            return String.valueOf(num);
        }
        return "";
    }
    
    public DefaultTableModel cargarTablaPlatillos(ArrayList<platillo> platillos){
        
        Object [] encabezado = {"Codigo","Nombre","Tipo","Descripcion","Tamano por\n porcion","Piezas por\n porcion","Calorias en porcion","Calorias por pieza","Precio"};
        int cantidad = platillos.size();
        DefaultTableModel tabla = new DefaultTableModel(encabezado,cantidad);
        
        for (int i = 0; i < tabla.getRowCount(); i++) {
            platillo p = platillos.get(i);
            tabla.setValueAt(ZeroADD(p.getCodeNum()),i,0);
            tabla.setValueAt(p.getNombre(), i, 1);
            tabla.setValueAt(p.getCodeID(), i, 2);
            tabla.setValueAt(p.getDescripcion(), i, 3);
            tabla.setValueAt(p.getPorcionT(), i, 4);
            tabla.setValueAt(p.getPiezasXPorcion(), i, 5);
            tabla.setValueAt(p.getCaloriasUnaPorcion(), i, 6);
            
            tabla.setValueAt(p.getCaloriasUnaPieza(), i, 7);
            tabla.setValueAt(p.getPrecio(), i, 8);
            
        }
        
        return tabla;
    }
    
    public DefaultTableModel cargarTablaPlatillosCliente(ArrayList<platillo> platillos){
        
        Object [] encabezado = {"Nombre","Tipo","Descripcion","Tamano por\n porcion","Piezas por\n porcion","Calorias en porcion","Calorias por pieza","Precio",""};
        int cantidad = platillos.size();
        DefaultTableModel tabla = new DefaultTableModel(encabezado,cantidad);
        
        for (int i = 0; i < tabla.getRowCount(); i++) {
            platillo p = platillos.get(i);
           
            tabla.setValueAt(p.getNombre(), i, 0);
            tabla.setValueAt(p.getCodeID(), i, 1);
            tabla.setValueAt(p.getDescripcion(), i, 2);
            tabla.setValueAt(p.getPorcionT(), i, 3);
            tabla.setValueAt(p.getPiezasXPorcion(), i, 4);
            tabla.setValueAt(p.getCaloriasUnaPorcion(), i, 5);

            tabla.setValueAt(p.getCaloriasUnaPieza(), i, 6);
            tabla.setValueAt(p.getPrecio(), i, 7);
          
        }
        return tabla;
    }
    public DefaultTableModel cargarTablaPlatillosVisibles(ArrayList<platillo> platillos){
        
        Object [] encabezado = {"Nombre","Tipo","Descripcion","Tamano por\n porcion","Piezas por\n porcion","Calorias en porcion","Calorias por pieza","Precio",""};
        int cantidad = platillos.size();
        DefaultTableModel tabla = new DefaultTableModel(encabezado,cantidad);
        
        for (int i = 0; i < tabla.getRowCount(); i++) {
            platillo p = platillos.get(i);
            if (p.getVisible()){
                tabla.setValueAt(p.getNombre(), i, 0);
                tabla.setValueAt(p.getCodeID(), i, 1);
                tabla.setValueAt(p.getDescripcion(), i, 2);
                tabla.setValueAt(p.getPorcionT(), i, 3);
                tabla.setValueAt(p.getPiezasXPorcion(), i, 4);
                tabla.setValueAt(p.getCaloriasUnaPorcion(), i, 5);

                tabla.setValueAt(p.getCaloriasUnaPieza(), i, 6);
                tabla.setValueAt(p.getPrecio(), i, 7);
            }
        }
        return tabla;
    }
    
    public DefaultTableModel cargarTablaPlatillosClienteFiltro(ArrayList<platillo> platillos,codigoPlatillo unCodigo){
        
        Object [] encabezado = {"Nombre","Tipo","Descripcion","Tamano por\n porcion","Piezas por\n porcion","Calorias en porcion","Calorias por pieza","Precio",""};
        int cantidad = platillos.size();
        DefaultTableModel tabla = new DefaultTableModel(encabezado,cantidad);
        
        for (int i = 0; i < tabla.getRowCount(); i++) {
            platillo p = platillos.get(i);
            if (p.getCodeID().equals(unCodigo)){
                if (p.getVisible()){
                    tabla.setValueAt(p.getNombre(), i, 0);
                    tabla.setValueAt(p.getCodeID(), i, 1);
                    tabla.setValueAt(p.getDescripcion(), i, 2);
                    tabla.setValueAt(p.getPorcionT(), i, 3);
                    tabla.setValueAt(p.getPiezasXPorcion(), i, 4);
                    tabla.setValueAt(p.getCaloriasUnaPorcion(), i, 5);

                    tabla.setValueAt(p.getCaloriasUnaPieza(), i, 6);
                    tabla.setValueAt(p.getPrecio(), i, 7);
                }
                
            }
        }
        
        return tabla;
    }
    public DefaultTableModel cargarTablaPlatillosCarrito(ArrayList<platillo> platillos){
        
        Object [] encabezado = {"Nombre","Tipo","Cantidad","Descripcion","Tamano por\n porcion","Piezas por\n porcion","Calorias en porcion","Calorias por pieza","Precio",""};
        int cantidad = platillos.size();
        DefaultTableModel tabla = new DefaultTableModel(encabezado,cantidad);
        
        for (int i = 0; i < tabla.getRowCount(); i++) {
            platillo p = platillos.get(i);
            tabla.setValueAt(p.getNombre(), i, 0);
            tabla.setValueAt(p.getCodeID(), i, 1);
            tabla.setValueAt(p.getVentas(), i, 2);
           
            tabla.setValueAt(p.getDescripcion(), i, 3);
            tabla.setValueAt(p.getPorcionT(), i, 4);
            tabla.setValueAt(p.getPiezasXPorcion(), i, 5);
            tabla.setValueAt(p.getCaloriasUnaPorcion(), i, 6);
            
            tabla.setValueAt(p.getCaloriasUnaPieza(), i, 7);
            tabla.setValueAt(p.getPrecio(), i, 8);
            
        }
        
        return tabla;
    }
    public SpinnerModel selectorEnvio(){
        ArrayList<String> lista = new ArrayList();
        lista.add("Recoger");
        lista.add("Express");
        lista.add("Sitio");
        
        SpinnerListModel selector = new SpinnerListModel(lista); 
        
        return selector;
    }
    
    public SpinnerModel selectorTipos(){
        ArrayList<codigoPlatillo> lista = new ArrayList();
        lista.add(codigoPlatillo.BEB);
        lista.add(codigoPlatillo.ENT);
        lista.add(codigoPlatillo.PTN);
        lista.add(codigoPlatillo.PTR);
        
        SpinnerListModel selector = new SpinnerListModel(lista); 
        
        return selector;
    }
    
    public JButton crearBoton(String texto){
        JButton btn= new JButton();
        btn.setText(texto);
        btn.setSize(77, 23);
        return btn;
    }
    public JSpinner crearCombo(){
        JSpinner btn= new JSpinner();
       
        return btn;
    }
    
    public ArrayList<platillo> cargarTodo(ArrayList<Pedido> pedidos,ArrayList<platillo> menu){
//        for(int i = 0;i<pedidos.size();i++){
//            for(int j=0;j<pedidos.get(i).getCarrito().size();j++){
//                for(int k=0;k<menu.size();k++){
//                    if(pedidos.get(i).getCarrito().get(j).getNombre().equals(menu.get(k).getNombre())){
//                        menu.get(k).setOrdenado(menu.get(k).getOrdenado()+pedidos.get(i).getCarrito().get(j).getVentas());
//                    }
//                }
//            }
//        }
        
        for(int k = 0; k < menu.size();k++){
            for(int i = 0 ; i < pedidos.size(); i++){
                for(int j =0; j < pedidos.get(i).getCarrito().size();j++){
                    if(menu.get(k).getNombre().equals(pedidos.get(i).getCarrito().get(j).getNombre())){
                        menu.get(k).setOrdenado(menu.get(k).getOrdenado()+pedidos.get(i).getCarrito().get(j).getVentas());
                    }
                }
            }
        }
        
        return menu;
    }
    
    
    public int indexArray(platillo[] arr){
        platillo menorActual = arr[0];
        int res = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i].getOrdenado() < menorActual.getOrdenado()){
                menorActual = arr[i];
                res = i;
            }
        }
        return res;
    }
    
    public String getTop10(ArrayList<platillo> menuFinal){
//        ArrayList<platillo> menuFinal = cargarTodo( pedidos, menu);
        String res = "";
        platillo n = new platillo();
        platillo tmp[] = {n,n,n,n,n,n,n,n,n,n};
        tmp[0] = (menuFinal.get(0));
        for(int i =1; i< menuFinal.size();i++){
            for(int j =0; j < tmp.length;j++){
                if(menuFinal.get(i).getOrdenado() > 0){
//                    if(tmp10.get(j).getOrdenado() <= menuFinal.get(i).getOrdenado()){
//                        tmp10.add(j,menuFinal.get(i));
//                        break;
//                    } else{
//                        tmp10.add(menuFinal.get(i));
//                    }
                      if(menuFinal.get(i).getOrdenado() > tmp[j].getOrdenado()){
                          tmp[indexArray(tmp)] = menuFinal.get(i);
                          break;
                      }
                }
                
            }
        }
        
        
        for(int f =0; f< tmp.length;f++){
            if(tmp[f].getOrdenado() > 0){
                res += "Cantidad: " + tmp[f].getOrdenado() +"\n"+ tmp[f].toString();
            }
            
        }
        
        
        
        return res;
    }
    
    public String nunca(ArrayList<platillo> menuFinal){
//        ArrayList<platillo> menuFinal = cargarTodo( pedidos, menu);
        String res = "";
        for(int f =0; f< menuFinal.size();f++){
            if(menuFinal.get(f).getOrdenado() == 0){
                res += menuFinal.get(f).toString();
            }
        }
        return res;
    }
    
    public double[] porcentajes(ArrayList<Pedido> pedidos){
        double res[] = {0,0,0};
        int total = pedidos.size();
        int express =0;
        int sitio = 0;
        int recoger = 0;
        for(int i = 0;i < pedidos.size();i++){
            if(pedidos.get(i).getModo().equals("Express")){
                express++;
            } else if(pedidos.get(i).getModo().equals("Recoger")){
                recoger++;
            } else if(pedidos.get(i).getModo().equals("Sitio")){
                sitio++;
            }
        }
        res[0] = sitio/total;
        res[1] = recoger/total;
        res[2] = express/total;
        
        return res;
    }
    
}
