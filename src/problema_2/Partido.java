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
public class Partido {
    
    private int num_Espectadores;
    private int resultado;
    
    public void setNum_Espectadores(int num_EspectadoresParametro){
        this.num_Espectadores = num_EspectadoresParametro;
    }
    
    public int getNum_Espectadores(){
    return num_Espectadores;
    }
    
    public void setResultado(int resultadoParametro){
     this.resultado = resultadoParametro;
    }
    public int getResultado(){
        return resultado;
    }
}
