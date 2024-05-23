/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppServidora;

import java.io.Serializable;

/**
 *
 * @author Sebastian
 */
public class platillo implements Serializable{
    private int codeNum;
    
    private codigoPlatillo codeID;
    private String nombre;
    private String descripcion;
    private int porcionT;
    private int piezasXPorcion;
    private int caloriasUnaPorcion;
    private int caloriasUnaPieza;
    private int precio;
    private boolean visible;
    private int ventas;
    private int ordenado;

    public int getCodeNum() {
        return codeNum;
    }
    
    public void setCodeNum(int codeNum) {
        this.codeNum = codeNum;
    }
    
    public int getOrdenado() {
        return ordenado;
    }
    
    public void setOrdenado(int odenador) {
        this.ordenado = odenador;
    }
    
    
    public codigoPlatillo getCodeID() {
        return codeID;
    }

    public void setCodeID(codigoPlatillo codeID) {
        this.codeID = codeID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPorcionT() {
        return porcionT;
    }

    public void setPorcionT(int porcionT) {
        this.porcionT = porcionT;
    }

    public int getPiezasXPorcion() {
        return piezasXPorcion;
    }

    public void setPiezasXPorcion(int piezasXPorcion) {
        this.piezasXPorcion = piezasXPorcion;
    }

    public int getCaloriasUnaPorcion() {
        return caloriasUnaPorcion;
    }

    public void setCaloriasUnaPorcion(int caloriasUnaPorcion) {
        this.caloriasUnaPorcion = caloriasUnaPorcion;
    }

    public int getCaloriasUnaPieza() {
        return caloriasUnaPieza;
    }

    public void setCaloriasUnaPieza(int caloriasUnaPieza) {
        this.caloriasUnaPieza = caloriasUnaPieza;
    }
    public void setCodigoPlatillo(codigoPlatillo unTipo)
    {
        this.codeID = unTipo;
    }
    
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
    public boolean getVisible(){
        return visible;
    }
    
    public platillo(){
        this.codeNum = 0;
        this.codeID = null;
        this.descripcion = "";
        this.nombre = "";
        this.porcionT =0;
        this.piezasXPorcion = 0;
        this.caloriasUnaPorcion = 0;
        this.caloriasUnaPieza = 0;
        this.precio = 0;
        this.visible = true;
        this.ordenado = 0;
        this.ventas = 1; 
    }
    
    public platillo(int codeNum, codigoPlatillo codeID, String nombre, String descripcion, int porcion, int piezas, int calorias, int caloriasXpieza, int precio){
        this.codeNum = codeNum;
        this.codeID = codeID;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.porcionT = porcion;
        this.piezasXPorcion = piezas;
        this.caloriasUnaPorcion = calorias;
        this.caloriasUnaPieza = caloriasXpieza;
        this.precio = precio;
        this.visible = false;
        this.ordenado = 0;
        this.ventas = 1;
    }
    
    public String toString(){
        String res = codeID.toString() + "-" + codeNum+ "\n\n";
        res += "Nombre: " + nombre + "\n\n";
        res += "Descripcion:" + descripcion + "\n\n";
        res += "-----------------------------------------------\n\n";
        
        return res;
    }
}
