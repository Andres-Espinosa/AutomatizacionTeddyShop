package co.com.AutoTeddyShop.models;

import java.io.File;
import java.nio.file.Path;

public class DatosCatalogos {

    private String nombreCatalogo;
    private String compañia;
    private String descripcionCatalogo;
    //private File imagen;

    public String getNombreCatalogo() {
        return nombreCatalogo;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setNombreCatalogo(String nombreCatalogo) {
        this.nombreCatalogo = nombreCatalogo;
    }

    public String getDescripcionCatalogo() {
        return descripcionCatalogo;
    }

    public void setDescripcionCatalogo(String descripcionCatalogo) {
        this.descripcionCatalogo = descripcionCatalogo;
    }

    //public Path getImagenPath() {
    //    return imagen.toPath();
    //}
//
    //public void setImagen(File imagen) {
    //    this.imagen = imagen;
    //}

    public DatosCatalogos(String nombreCatalogo, String compañia, String descripcionCatalogo, File imagen) {
        this.nombreCatalogo = nombreCatalogo;
        this.compañia = compañia;
        this.descripcionCatalogo = descripcionCatalogo;
        //this.imagen = imagen;
    }
}
