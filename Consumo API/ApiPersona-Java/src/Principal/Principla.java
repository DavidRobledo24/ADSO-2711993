package Principal;

public class Principla { 
    public static void main(String[] args) {
        ConsumoAPI consumo = new ConsumoAPI();
        CRUD crud = new CRUD(consumo);
    }
}
