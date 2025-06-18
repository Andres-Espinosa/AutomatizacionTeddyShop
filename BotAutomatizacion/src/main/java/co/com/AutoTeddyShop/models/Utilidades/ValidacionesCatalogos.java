package co.com.AutoTeddyShop.models.Utilidades;

public class ValidacionesCatalogos {

    public static boolean nombreCatalogoEsIgual(String nombreEsperado, String nombreActual) {
        if (nombreEsperado == null || nombreActual == null) {
            return false;
        }

        // Comparación ignorando mayúsculas/minúsculas y espacios extras
        return nombreEsperado.trim().equalsIgnoreCase(nombreActual.trim());
    }

    public static boolean compañiacatalogoEsIgual(String compañiaEsperada, String compañiaActual) {
        if (compañiaEsperada == null ||     compañiaActual == null) {
            return false;
        }

        // Comparación ignorando mayúsculas/minúsculas y espacios extras
        return compañiaEsperada.trim().equalsIgnoreCase(compañiaActual.trim());
    }
}
