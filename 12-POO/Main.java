public class Main{
    public static void main(String [] args){

        Jugador jugador01 = new Jugador(10,"David Robledo",23,"POR");
        Jugador jugador02 = new Jugador(20,"Maradona",24,"LD");
        Jugador jugador03 = new Jugador(30,"Michael Schumacher",25,"LI");
        Jugador jugador04 = new Jugador(40,"Arnold Schwarzenegger",26,"DFC");
        Jugador jugador05 = new Jugador(50,"Freddie Mercury",21,"MC");
        Jugador jugador06 = new Jugador(60,"Popeye",23,"MCO");
        Jugador jugador07 = new Jugador(70,"John Wick",23,"ST");
        Jugador jugador08 = new Jugador(80,"Mario Bros",27,"POR");
        Jugador jugador09 = new Jugador(90,"ARmando Banquitos",29,"LD");
        Jugador jugador10 = new Jugador(11,"John Cenna",24,"LI");

        Equipo equipo01 = new Equipo("Mermelada",2023,100054,2,0,6);
        Equipo equipo02 = new Equipo("Shampoo",1204,3,5,3534362,5);

        System.out.println(" ");
        System.out.println("Equipo 1");
        equipo01.agregarJugador(jugador01);
        equipo01.agregarJugador(jugador02);
        equipo01.agregarJugador(jugador03);
        equipo01.agregarJugador(jugador04);
        equipo01.agregarJugador(jugador05);

        System.out.println(" ");
        System.out.println("Equipo 2");
        equipo02.agregarJugador(jugador06);
        equipo02.agregarJugador(jugador07);
        equipo02.agregarJugador(jugador08);
        equipo02.agregarJugador(jugador09);
        equipo02.agregarJugador(jugador10);

        System.out.println(" ");
        System.out.println("eliminacion de jugador.");
        equipo01.eliminarJugador(jugador01);
        equipo01.eliminarJugador(jugador02);
        
        System.out.println(" ");
        System.out.println("Cambio de equipo.");
        equipo02.cambioEquipo(equipo01,jugador06);
        
        
    } 
}