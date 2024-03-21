package Principal;

public class Principal {

    public static void main(String[] args) {
        BaseDatos baseDatos = new BaseDatos();
        new CRUD(baseDatos);
    }
}
