public class Persona{
    int cedula;
    String nombres;
    int edad;
    double altura;
    double peso;

    public Persona(int cedula, String nombres, int edad, double altura, double peso){
        this.cedula=cedula;
        this.nombres=nombres;
        this.edad=edad;
        this.altura=altura;
        this.peso=peso;
    }

    public int getCedula(){
        return cedula;
    }
    public String getNombres(){
        return nombres;
    }
    public int getEdad(){
        return edad;
    }
    public double getAltura(){
        return altura;
    }
    public double getPeso(){
        return peso;
    }

    public void setCedula(int cedula){
        this.cedula=cedula;
    }
    public void setNombres(String nombres){
        this.nombres=nombres;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }

    public String toString(){
        return "Cedula: "+this.cedula+"\n"+"Nombre: "+this.nombres+"\n"+"Edad: "+this.edad+"\n"+"Altura: "+this.altura+"\n"+"Peso: "+this.peso+"\n";
    }
}