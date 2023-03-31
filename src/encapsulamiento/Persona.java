/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 * Esta clase representa a una persona
 * @author Lluncor Nina Bryan Alexander
 */
public class Persona {
    private String nombre;
    private String dni;
    private double peso;
    
    public String getNombre(){
            return this.nombre;
    }

    public Persona(String nombre, String dni, double peso) {
        this.nombre = nombre;
        this.dni = dni;
        this.peso = peso;
    }
    
    /**
     * Esta funcion permite emcapsular el nombre de la persona 
     * @param nombre Este es el valor del nuevo nombre
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    }
    
    
           
    
}
