package co.com.AutoTeddyShop.models.Utilidades;

public class ValidacionesCatalogos{

    public static boolean nombreCatalogoEsIgual(String nombreEsperado, String nombreActual) {
        if (nombreEsperado == null || nombreActual == null) {
            return false;
        }

        // Comparación ignorando mayúsculas/minúsculas y espacios extras
        return nombreEsperado.trim().equalsIgnoreCase(nombreActual.trim());
    }

    public static boolean descripcionCatalogoEsIgual(String descripcionEsperada, String descripcionActual) {
        if (descripcionEsperada == null || descripcionActual == null) {
            return false;
        }

        // Comparación ignorando mayúsculas/minúsculas y espacios extras
        return descripcionEsperada.trim().equalsIgnoreCase(descripcionActual.trim());
    }
}