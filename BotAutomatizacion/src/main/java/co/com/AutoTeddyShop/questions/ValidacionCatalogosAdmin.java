package co.com.AutoTeddyShop.questions;

import co.com.AutoTeddyShop.models.Utilidades.SessionVariables;
import co.com.AutoTeddyShop.tasks.CatalogosAdmin.NavegarHastaUltimaPaginaCatalogo;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import java.util.List;
import static co.com.AutoTeddyShop.userinterface.CatalogosAdmin.CrearCatalogoAdmin.*;
import static jxl.biff.FormatRecord.logger;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacionCatalogosAdmin implements Question<Boolean> {


        public static co.com.AutoTeddyShop.questions.ValidacionCatalogosAdmin validacionCatalogosAdmin() {
            return new co.com.AutoTeddyShop.questions.ValidacionCatalogosAdmin();
        }

        @Override
        public Boolean answeredBy(Actor actor) {

            String nombreEsperado = actor.recall(SessionVariables.NombreCatalogoC.toString());
            String descripcionEsperada = actor.recall(SessionVariables.DescripcionCatalogo.toString());

            actor.attemptsTo(WaitUntil.the(TABLA_CATALOGO, isVisible()).forNoMoreThan(10).seconds());
            actor.attemptsTo(NavegarHastaUltimaPaginaCatalogo.delListadoCatalogos());

            List<WebElementFacade> filas = FILAS_TABLA_CATALOGO.resolveAllFor(actor);
            if (filas.isEmpty()) {
                return false;
            }

            WebElementFacade ultimaFila = filas.get(filas.size() - 1);

            String nombreActual = ultimaFila.findElement(By.xpath("./td[1]")).getText();
            String descripcionActual = ultimaFila.findElement(By.xpath("./td[2]")).getText();

            boolean nombreValido = nombreEsperado.equals(nombreActual);
            boolean compañiaValida = descripcionEsperada.equals( descripcionActual);

            System.out.println("Comparación nombre: esperado=" + nombreEsperado + ", actual=" + nombreActual + " => " + nombreValido);
            System.out.println("Comparación compañia: esperado=" + descripcionEsperada + ", actual=" + descripcionActual + " => " + compañiaValida);

            return nombreValido && compañiaValida;
        }
    }