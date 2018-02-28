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
public class Llanta {
    private String marca;
    private String modelo;
    private int tamaño_pulgadas;
  
    /*
  public Llanta(String marca, String modelo, int tamaño_pulgadas){
      this.marca=marca;
      this.modelo=modelo;
      this.tamaño_pulgadas=tamaño_pulgadas;
  }  

*/
    
  public String getMarca(){
      return marca;
  }
  
  public void setMarca(String marca){
      this.marca=marca;
  }
  
  public String getModelo(){
      return modelo;
  }
  
  public void setModelo(String modelo){
      this.modelo=modelo;
  }
  
  public int getTamañodepulgadas(){
      return tamaño_pulgadas;
  }
  
  public void settamañodepulgadas(int tamaño_pulgadas){
      this.tamaño_pulgadas=tamaño_pulgadas;
  }
}
