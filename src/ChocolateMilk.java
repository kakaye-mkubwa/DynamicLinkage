public class ChocolateMilk extends AbstractFoodProcessorProgram{
    /**
     * Return the name of the food processing program object
     * @return
     */
    @Override
    public String getName() {
        return "Chocolate Milk";
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

        System.out.println("Place milk on the scale...");
        milkWeight = getEnvironment().weigh();
        System.out.println("Milk weight is "+milkWeight);
        System.out.println("Remove milk from the scale and place it in the mixer ...");

        getEnvironment().mix(4);

        System.out.println("..........End Recipe..........");
    }//start
    //...
}//class Chocolate Milk - a concreteFoodProcessor Program
