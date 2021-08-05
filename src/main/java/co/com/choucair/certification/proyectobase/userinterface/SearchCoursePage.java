package co.com.choucair.certification.proyectobase.userinterface;

import co.com.choucair.certification.proyectobase.tasks.Search;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
    private String course;

    public static final Target BUTTON_UC  = Target.the("Selecciona la universidad choucair")
            .located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_COURSE  = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO  = Target.the("Da clic para buscar el curso1")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE  = Target.the("Da clic para buscar el curso2")
            .located(By.xpath("//a[contains(text(),'Pruebas AFT Accounting and Financial')]"));
    public static final Target NAME_COURSE  = Target.the("Extraer el nombre del curso")
            .located(By.xpath("//h1[contains(text(),'Pruebas AFT Accounting and Financial Testing')]"));


    public static Performable the(String course) {

        return Tasks.instrumented(Search.class,course);

    }
}
