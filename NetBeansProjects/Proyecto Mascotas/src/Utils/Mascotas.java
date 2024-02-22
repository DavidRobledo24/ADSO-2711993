package Utils;


public class Mascotas {
    String nombre;
    String edad;
    
    
    
    
    public Mascotas(String nombre, String edad){
        this. nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getEdad(){
        return edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(String edad) {
        this.edad = edad;
    }

}

