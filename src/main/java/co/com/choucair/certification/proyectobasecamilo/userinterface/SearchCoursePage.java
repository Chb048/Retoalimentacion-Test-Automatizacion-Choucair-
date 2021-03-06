package co.com.choucair.certification.proyectobasecamilo.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage {

    public static final Target LOGIN_UC =Target.the("Selecciona la universidad choucair")
            .located(By.xpath("//div[@id='universidad']//strong"));

    public static final Target INPUT_COURSE =Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO =Target.the("Da click para buscar el curso")
            .located(By.id("//button[@class='class,'btn btn-secondary']"));

    public static final Target SELECT_COURSE =Target.the("Da click para buscar el curso")
            .located(By.xpath("//h4[contains(text(),'Recursos Automatizacion Bancolombia')]"));

    public static final Target NAME_COURSE =Target.the("Extrae el nombre del curso")
            .located(By.xpath("//h1[contains(text(),'Recursos Automatizacion Bancolombia')]"));
}
