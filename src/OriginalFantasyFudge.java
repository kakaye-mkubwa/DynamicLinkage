public class OriginalFantasyFudge extends AbstractFoodProcessorProgram{

    /**
     * Return the name of the food processing program object
     * @return
     */
    @Override
    public String getName() {
        return "Original Fantasy Fudge";
    }

    /**
     * A call to this function tells a food processing program to
     * start doing whatever it is supposed to be doing
     */
    @Override
    public void start() {
        double milkWeight;
        double cocoWeight;
        System.out.println("\n..........Starting Recipe..........");

        String ingredients = "********Ingredients********\n" +
                "Granulated sugar\n" +
                "Butter\n" +
                "Evaporated milk\n" +
                "Semi-sweet chocolate chips\n" +
                "Mini-marshmallows\n" +
                "Walnuts–I love nuts in this recipe, but you can definitely leave them out if you want a nut-free fudge.\n" +
                "Vanilla extract";

        System.out.println(ingredients);

        System.out.println("\n..........Instructions..........");

        String instructions = "* It’s really easy to make Original Fantasy Fudge, and fudge is always nice to have around for a treat to satisfy your sweet tooth. Plus, it’s a great holiday gift to share! One thing that is important is a candy thermometer. I will talk more about that later. Let’s get to how easy this fudge is to make.\n" +
                "\n" +
                "* Line a sheet pan with parchment paper. If you don’t have parchment paper, aluminum foil will also work. Lightly spray the parchment paper or foil with a non-stick spray. This will make it a whole lot easier to remove your fudge from the pan when it’s ready to be cut.\n" +
                "* In a large saucepan, mix together the sugar, butter, and evaporated milk over medium heat. Be sure to stir it until the sugar is dissolved.\n" +
                "* Bring the mixture to a full boil for 5 minutes. This is where a candy thermometer comes in handy. If you have one, the temperature should read 234°F.\n" +
                "* Remove from heat and stir in the chocolate chips until they have melted. Then, beat in the marshmallows, walnuts, and vanilla extract.\n" +
                "* Spread out the fudge onto your lined sheet pan and let it cool for at least 2 hours before cutting.\n";

        System.out.println(instructions);

        getEnvironment().mix(4);

        System.out.println("..........End Recipe..........");
    }
}
