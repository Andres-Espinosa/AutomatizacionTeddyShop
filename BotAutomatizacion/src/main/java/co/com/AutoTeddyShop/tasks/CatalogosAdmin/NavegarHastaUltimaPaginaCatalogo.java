package co.com.AutoTeddyShop.tasks.CatalogosAdmin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.AutoTeddyShop.userinterface.CatalogosAdmin.CrearCatalogoAdmin.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
public class NavegarHastaUltimaPaginaCatalogo implements Task {

    public static NavegarHastaUltimaPaginaCatalogo delListadoCatalogos() {
        return new NavegarHastaUltimaPaginaCatalogo();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        while (BOTON_SIGUIENTE_CATALOGO.resolveFor(actor).isVisible()) {
            if (!BOTON_SIGUIENTE_CATALOGO.resolveFor(actor).isEnabled()) {
                break;
            }
            try {
                BOTON_SIGUIENTE_CATALOGO.resolveFor(actor).click();
                actor.attemptsTo(
                        WaitUntil.the(TABLA_CATALOGO, isVisible()).forNoMoreThan(5).seconds()
                );
            } catch (Exception e) {
                break;
            }
        }
    }
}