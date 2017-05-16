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
public class Jugador {
    
    private String dni;
    private String nombre;
    private String contrato;
    
    public void setDni(String dniP){
    this.dni = dniP;
    }
    public String getDni(){
    return dni;
    }
    
    public void setNombre(String nombreP){
    this.nombre = nombreP;
    }
    public String getNombre(){
    return nombre;
    }
    
    public void setContrato(String contratoP){
    this.contrato = contratoP;
    }
    public String getContrato(){
    return contrato;
    }
    
}
