public class Atasco {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {
            int trenes = in.nextInt();
            int[] velocidades = new int[trenes];
            // En principio, hay los mismos grupos que trenes
            int grupos = trenes;

            // Leemos las velocidades
            for (int i = 0; i < trenes; i++) {
                velocidades[i] =  in.nextInt();
            }
            // Las pruebas que he hecho han ido bien, sin embargo,
            // el veredicto es WA. Hay algo que no debo haber entendido
            for (int i = 0; i < velocidades.length - 1 ; i++) {
                // Cuando uno `choca` hay un grupo menos
                if (velocidades[i] > velocidades[i + 1]) {
                    grupos--;
                }
            }
            System.out.println(grupos);
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

}