public class Equipo{
    //caracteristicas
    //atributo
    String nombreEquipo;
    int fundacion;
    int partidosGanados;
    int partidosEmpatados;
    int partidosPerdidos;
    Jugador[] listaEquipo;

//parametros
    public Equipo(String nombreEquipo, int fundacion, int partidosGanados, int partidosEmpatados, int partidosPerdidos, int cantidad){
        this.nombreEquipo = nombreEquipo;
        this.fundacion = fundacion;
        this.partidosGanados = partidosGanados;
        this.partidosEmpatados = partidosEmpatados;
        this.partidosPerdidos = partidosPerdidos;
        
        this.listaEquipo = new Jugador [cantidad]; 
    }

    public String getNombreEquipo(){
        return nombreEquipo;
    }
    public int getFundacion(){
        return fundacion;
    }
    public int getPartidosGanados(){
        return partidosGanados;
    }
    public int getPartidosEmpatados(){
        return partidosEmpatados;
    }
    public int getPartidosPerdidos(){
        return partidosPerdidos;
    }
    public Jugador[] getListaEquipo(){
        return listaEquipo;
    }

    public void setNombreEquipo(String nombreEquipo){
        this.nombreEquipo = nombreEquipo;
    }
    public void setFundacion(int fundacion){
        this.fundacion = fundacion;
    }
    public void setPartidosGandados(int partidosGanados){
        this.partidosGanados = partidosGanados;
    }
    public void setPartidosEmpatados(int partidosEmpatados){
        this.partidosEmpatados = partidosEmpatados;
    }
    public void setPartidosPerdidos(int partidosPerdidos){
        this.partidosPerdidos = partidosPerdidos;
    }
    public void setListaEquipo(Jugador[] listaEquipo){
        this.listaEquipo  = listaEquipo;
    }

    public void agregarJugador(Jugador miembro){
        boolean agregado = false;
        for(int i=0;i<listaEquipo.length;i++){
            if(listaEquipo[i]==null){
                agregado = true;
                listaEquipo[i] = miembro;
                break;
            }           
        }
        if(agregado){
            System.out.println("Jugador agregado con exito.");
        }
        else{
            System.out.println("Error.");
        }
    }

    public void eliminarJugador(Jugador jugadorEliminar){
        boolean eliminado = false;
        for(int i=0; i<listaEquipo.length;i++){
            if(jugadorEliminar == listaEquipo[i]){
                for(;listaEquipo[i]!=null;i++){
                    listaEquipo[i]=listaEquipo[i+1];
                    eliminado = true;
                    break;
                }
            }
        }
        if(eliminado = true){
            System.out.println("Jugador eliminado.");
        }
        else{
        System.out.println("Error.");
        }
    }

    public void cambioEquipo(Equipo equipo, Jugador miembro){
        boolean cambiado = false;
        for(int i=0;i<listaEquipo.length;i++){
            if(miembro==listaEquipo[i]){
               for(;listaEquipo[i]!=null;i++){
                    listaEquipo[i]=listaEquipo[i+1];
                    //cambiado = true;  
                }
                for(int j=0;j<listaEquipo.length;j++){
                    if(listaEquipo[j]==null){
                        listaEquipo[j] = miembro;
                        cambiado = true;
                    }           
                } 
            }
        }
        if(cambiado == true){
            System.out.println("Cambio de equipo exitoso.");
        }
        else{
            System.out.println("Erro al cambiar de equipo.");
        }
    }

    
    
    

}