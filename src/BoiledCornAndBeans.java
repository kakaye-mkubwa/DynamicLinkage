public class BoiledCornAndBeans extends AbstractFoodProcessorProgram{

    /**
     * Return the name of the food processing program object
     * @return
     */
    @Override
    public String getName() {
        return "BoiledCornAndBeans (Githeri)";
    }

    /**
     * A call to this function tells a food processing program to
     * start doing whatever it is supposed to be doing
     */
    @Override
    public void start() {
        System.out.println("\n..........Starting Recipe..........");

        String ingredients = "2 tablespoon canola oil\n" +
                "½ medium onion diced\n" +
                "1 garlic clove minced\n" +
                "1 large tomato diced\n" +
                "2 green onion chopped\n" +
                "¼ teaspoon curry powder\n" +
                "½ teaspoon white pepper\n" +
                "2 teaspoons Paprika\n" +
                "2 cups cooked corn\n" +
                "4 cups cooked beans 2 15oz cooked cooked beans\n" +
                "1- 1 1/2 cup water\n" +
                "2 tablespoon chopped cilantro";

        System.out.println(ingredients);

        System.out.println("\n..........Instructions..........");

        String instructions = "* In a medium- large skillet, add oil, onions, garlic, and sauté, for about 2-3 minutes, stirring constantly to prevent any burns. Add tomatoes,  curry, paprika, white pepper, corn and drained beans\n" +
                "\n" +
                "* Then pour about 1 – 1 1/2 cups or more of water bring to a boil and let it simmer for all the flavors to come together about 15 -20 minutes, stirring occasionally.\n" +
                "* Adjust for thickness, taste with water and salt. Throw in cilantro and serve warm";

        System.out.println(instructions);

        getEnvironment().mix(4);

        System.out.println("..........End Recipe..........");
    }
}
