/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_2;

/**
 *
 * @author sena
 */
public class Sanciones {
    
    private String descripcion;
    private int num_Partidos;
    
    public void setDescripcion(String descripcionParametro){
        this.descripcion = descripcionParametro;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setNum_Partidos(int num_PartidosParametro){
        this.num_Partidos = num_PartidosParametro;
    }
    
    public int getNum_Partidos(){
        return num_Partidos;
    }
}
