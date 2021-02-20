import io.javalin.Javalin;
import sun.misc.JavaLangAccess;

public class MainPizzaWebService {
    public static void main(String[] args) {
        Javalin javalinApp = Javalin.create().start(2020);
        javalinApp.get("/", PizzaController::getAllPizzas);
    }
}
