import java.util.Random;

public class papelazo {
    public static void main(String[] args) {
        Random random = new Random();
        int jugador1Gana = 0;
        int jugador2Gana = 0;
        int ronda = 0;

        while (jugador1Gana < 2 && jugador2Gana < 2) {
            ronda++;
            int playerUno = random.nextInt(3) + 1;
            int playerDos = random.nextInt(3) + 1;

            String jugadaJugador1;
            String jugadaJugador2;

            if (playerUno == 1) {
                jugadaJugador1 = "piedra";
            } else if (playerUno == 2) {
                jugadaJugador1 = "papel";
            } else {
                jugadaJugador1 = "tijera";
            }

            if (playerDos == 1) {
                jugadaJugador2 = "piedra";
            } else if (playerDos == 2) {
                jugadaJugador2 = "papel";
            } else {
                jugadaJugador2 = "tijera";
            }

            System.out.println("Ronda " + ronda + ":");
            System.out.println("Jugador 1: " + jugadaJugador1 + "\tJugador 2: " + jugadaJugador2);
            System.out.println();

            if (playerUno == playerDos) {
                System.out.println("Empate en la ronda " + ronda);
            } else if ((playerUno == 1 && playerDos == 3) || (playerUno == 2 && playerDos == 1) || (playerUno == 3 && playerDos == 2)) {
                System.out.println("¡Jugador 1 gana la ronda " + ronda + "!");
                jugador1Gana++;
            } else {
                System.out.println("¡Jugador 2 gana la ronda " + ronda + "!");
                jugador2Gana++;
            }
        }

        if (jugador1Gana >= 2) {
            System.out.println("\n¡Jugador 1 gana 2 rondas!");
        } else {
            System.out.println("\n¡Jugador 2 gana 2 rondas!");
        }
    }
}
