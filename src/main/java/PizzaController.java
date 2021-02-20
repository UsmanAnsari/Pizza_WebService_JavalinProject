import io.javalin.http.Context;

public final class PizzaController {
    public PizzaController() {
    }

    static String[] availablePizzas = {
            "Cheese Pizza",
            "Veggie Pizza",
            "Pepperoni Pizza",
            "Margherita Pizza",
            "BBQ Chicken Pizza",
            "Supreme Pizza"
    };

    public static void getAllPizzas(Context context) {
        context.json(availablePizzas);
    }
}
