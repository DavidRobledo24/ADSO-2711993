package Principal;

public class Principla { 
    public static void main(String[] args) {
        ConsumoAPI consumo = new ConsumoAPI();
        CRUD crud = new CRUD(consumo);
               
        //EndPoint - Obtener
//        String respuesta01 = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
//        System.out.println("Respusta obtener: "+ respuesta01);



//        //Extrayendo datos de un texto Json
//        JsonArray listado = JsonParser.parseString(respuesta01).getAsJsonArray();
//        for(int i =0;i<listado.size();i++){
//            JsonObject temp = listado.get(i).getAsJsonObject();
//            String cedula = temp.get("cedula").getAsString();
//            String nombres = temp.get("nombres").getAsString();
//            String apellidos = temp.get("apellidos").getAsString();
//            String telefono = temp.get("telefono").getAsString();
//            String direccion = temp.get("direccion").getAsString();
//            String email = temp.get("email").getAsString();
//            System.out.println(cedula+" - "+nombres+" - "+apellidos+" - "+telefono+" - "+direccion+" - "+email);
//        }
    }
}
