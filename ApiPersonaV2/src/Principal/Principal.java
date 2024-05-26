package Principal;

public class Principal {

    public static void main(String[] args) {
        ConsumoAPI consumo = new ConsumoAPI();
        new CRUD(consumo);
    }
    
}
