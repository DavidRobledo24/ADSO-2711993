public class Jugador{
    int cedula;
    String nombre;
    int edad;
    String posicion;
    
    public Jugador(int cedula, String nombre, int edad, String posicion){
        this.cedula=cedula;
        this.nombre=nombre;
        this.edad=edad;
        this.posicion=posicion;
    }

    public int getCedula(){
        return cedula;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String posicion(){
        return posicion;
    }

    public void setCedula(int cedula){
        this.cedula=cedula;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setPosicion(String posicion){
        this.posicion=posicion;
    }
}