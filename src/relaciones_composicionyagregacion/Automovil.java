/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_composicionyagregacion;

/**
 *
 * @author Estudiante
 */
public class Automovil {
    private String marca;
    private int año;
    private String modelo;
    
    
    private Llanta[] llantas;
    private Motor motor;
    private Puerta[] puertas;
    
    //constructor //Agregación
    
    public Automovil(){
    this.llantas= new Llanta[4];
    this.motor= new Motor();
    this.puertas= new Puerta[4];
        
}
    
    //Métodos
    
    
    
    public void setMarca(String marca){
        this.marca= marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setAño(int año){
        this.año=año;
    }
    
    public int getAño(){
        return año;
    }
    
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public String getModelo(){
        return modelo;
    }
    
    
    public boolean añadir_llanta(Llanta llantas){
        
    }
    
}
