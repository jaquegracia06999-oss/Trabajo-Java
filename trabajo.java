public class Goku {
    // Atributos de la clase
    private String nombre;
    private String raza;

    // Constructor
    public Goku(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    /**
     * Función que imprime la presentación en pantalla
     */
    public void presentarse() {
    System.out.print1n("Hola, soy " + this.nombre + " y soy un " + this.raza)
    }
     // Método main para ejecutar el programa 
    Run main
    public static void main(String[] args ) { 
        // Instancia del objeto con los valores solicitados.
        Goku goku = new Goku("Goku", "Sayayin") ;
        //probamos el metodo
        goku.presentarse();
    }
}

