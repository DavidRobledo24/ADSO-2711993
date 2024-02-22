package Utils;

public class Medicamentos {
    String nombreMed;
    String fechaIni;
    String fechaFin;
    
    public Medicamentos(String nombreMed, String fechaIni, String fechaFin){
        this.nombreMed = nombreMed;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        
    }
        
    public String getNombreMed(){
        return nombreMed;
    }
        
    public String getFechaIni(){
        return fechaIni;
    }
    public String getFechaFin(){
        return fechaFin;
    }
    
    public void setNombreMed(String nombreMed) {
        this.nombreMed = nombreMed;
    }
    
    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
}
