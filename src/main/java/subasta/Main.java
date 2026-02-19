package subasta;

public class Main {
    private static void cerrar(Subasta subasta) {
        System.out.println("*********************");
        System.out.println("Se cierra la subasta:");
        System.out.println("*********************");

        double maximo = Integer.MIN_VALUE;
        Puja pujaActual = null;
        for (Lote lote : subasta.getLotes()) {
            System.out.println(lote.getDescripcion());
            for(Puja puja : lote.getPujas()){
                if (puja.getCantidad() > maximo) {
                    maximo = puja.getCantidad();
                    pujaActual = puja;
                }
            }
            if (pujaActual != null) {
                System.out.printf("Adjudicado a %s por %f%n", pujaActual.getPujador().getNombre(), pujaActual.getCantidad());
            }else{
                System.out.println("La puja ha quedado desierta");
            }
            maximo = Integer.MIN_VALUE;
            pujaActual = null;
            System.out.println("");
        }
    }
    public static void main(String[] args) {

        CasaSubasta sothebys = new CasaSubasta("Sothebys", "London");
        Subasta subastaPicasos = new Subasta("Picasos", sothebys, "hoy");
        Lote loteAzul = new Lote(1, "Época azul", subastaPicasos);
        Lote loteRosa = new Lote(2, "Época rosa", subastaPicasos);
        Articulo cuadro1 = new Articulo("Cuadro 1", 120, loteAzul);
        Articulo cuadro2 = new Articulo("Cuadro 2", 300, loteAzul);
        Articulo cuadro3 = new Articulo("Cuadro 3", 200, loteRosa);
        Pujador pepe = new Pujador("Pepe");
        Puja p1 = new Puja(pepe, loteAzul, 200);
        Pujador maria = new Pujador("Maria");
        Puja m1 = new Puja(maria, loteAzul, 300);

        for(Lote l: subastaPicasos.getLotes()) {
            System.out.println(l);
            System.out.print("Precio de salida: ");
            System.out.println(l.getArticulos().stream().
                    mapToDouble(Articulo::getPrecio).sum());
            for (Articulo articulo : l.getArticulos()) {
                System.out.println("\t" + articulo);
            }
            System.out.println("");
        }
        cerrar(subastaPicasos);
    }
}
