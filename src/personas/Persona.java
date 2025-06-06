package personas;

import java.io.Serializable;

/**
 *
 * @author Sheila R.
 */
public abstract class Persona implements Serializable {
    protected String dni;
    protected String nombre;
    protected String apellido;
    
    public Persona(){
        
    }
    
    public Persona(String dni, String nombre, String apellido){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
      
    
}
