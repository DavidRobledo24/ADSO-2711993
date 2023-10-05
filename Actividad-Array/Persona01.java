Public class Persona01{
    String nombres;
    int cedula;
    int edad;

    public Persona(String nombres,int cedula,  int edad){
        this.nombres=nombres;
        this.cedula=cedula;
        this.edad=edad;
    }

    public String getNombres(){
        return nombres;
    }
    public int getCedula(){
        return cedula;
    }
    public int getEdad(){
        return edad;
    }

    public void setNombres(String nombres){
        this.nombres=nombres;
    }
    public void setCedula(int cedula){
        this.cedula=cedula;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }

    public String toString(){
        return "Nombre: "+this.nombres+"\n"+"Cedula: "+this.cedula+"\n"+"Edad: "+this.edad+"\n"+"Altura: "+this.altura+"\n"+"Peso: "+this.peso+"\n";
    }
}