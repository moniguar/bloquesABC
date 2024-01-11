import java.util.HashSet;
import java.util.Set;

public class BloquesABC {

    public static void main(String[] args) {
        System.out.println("Prueba A        : "+puedo_obtener_palabra("A"));          // True
        System.out.println("Prueba LIBRO    : "+puedo_obtener_palabra("LIBRO"));      // True
        System.out.println("Prueba BOZO     : "+puedo_obtener_palabra("BOZO"));       // False
        System.out.println("Prueba TRAJE    : "+puedo_obtener_palabra("TRAJE"));      // True
        System.out.println("Prueba COMUN    : "+puedo_obtener_palabra("COMUN"));      // True
        System.out.println("Prueba CAMPANA  : "+puedo_obtener_palabra("CAMPANA"));    // False
        System.out.println("Prueba DORITO   : "+puedo_obtener_palabra("DORITO"));     // True
        System.out.println("Prueba ARLEQUIN : "+puedo_obtener_palabra("ARLEQUIN"));   // True
    }

   // Colección de bloques
    private static final String[] bloques = {
            "BO", "XK", "DQ", "CP", "NA", "GT", "RE", "TG", "QD", "FS",
            "HU", "VI", "AT", "OB", "ER", "FS", "LY", "PC", "ZM", "JW"
    };

     public static boolean puedo_obtener_palabra(String palabra) {
        palabra = palabra.toUpperCase(); // Convertir la palabra a mayúsculas
        Set<Character> bloquesUsados = new HashSet<>();

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            boolean bloqueEncontrado = false;

            // Buscar el bloque que contiene la letra
            for (String bloque : bloques) {
                char lado1 = bloque.charAt(0);
                char lado2 = bloque.charAt(1);

                if (!bloquesUsados.contains(lado1) && (letra == lado1 || letra == lado2)) {
                    bloquesUsados.add(lado1);
                    bloqueEncontrado = true;
                    break;
                } else if (!bloquesUsados.contains(lado2) && (letra == lado2 || letra == lado1)) {
                    bloquesUsados.add(lado2);
                    bloqueEncontrado = true;
                    break;
                }
            }

            if (!bloqueEncontrado) {
                // Si no se encuentra un bloque con la letra, no se puede obtener la palabra
                return false;
            }
        }

        // Si se llega hasta aquí, significa que se pueden usar todos los bloques para formar la palabra
        return true;
    }

  
}
