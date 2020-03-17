import java.net.URL;
import java.net.URLClassLoader;

/**
 * Food processor programs call methods of classes that implement this
 * interface.
 */
public class FoodProcessorEnvironment implements FoodProcessorEnvironmentIF {
    private  String filePathInput;
    private static  URL[] classPath; // URL for loading programs.



    public FoodProcessorEnvironment(String filePathInput) {
        this.filePathInput = filePathInput;
        try {
//            classPath = new URL[]{new URL("file:///bin")};
//            classPath = new URL[]{new URL("file:///home/m3n/IdeaProjects/Dynamic%20Linkage/src/")};
            classPath = new URL[]{new URL(filePathInput)};
        } catch (java.net.MalformedURLException e) {
              throw new ExceptionInInitializerError(e);
        } // try
    }



    /**
     * Make a slice of food of the given width.
     * @param width The width of the slice to make.
     */
    public void slice(int width) {
        //...
    } // slice(int)

    /**
     * Mix food at the given speed.
     * @param speed The speed to mix at.
     */
    public void mix(int speed) {
        //...
    } // mix(int)

    /**
     * Weight food.
     * @return the wieght in ounces.
     */
    public double weigh() {
        double weight = 0.0;
        //...
        return weight;
    } // weight()
    //...
    /**
     * Run the named program.
     * @param programName the name of the program to run.
     */
    void run(String programName) {
        // Create a ClassLoader to load the program classes.  When those
        // classes are no longer used, they can be garbage collected when
        // their ClassLoader is garbage collected.
        URLClassLoader classLoader = new URLClassLoader(classPath);
        Class programClass;
        try {
            programClass = classLoader.loadClass(programName);
        } catch (ClassNotFoundException e) {
            // Not found
            //...
            System.out.println("Class not found");
            System.out.println("Error : " + e.getMessage());
            return;
        } // try
        AbstractFoodProcessorProgram program;
        try {
            program = (AbstractFoodProcessorProgram)programClass.newInstance();
        } catch (Exception e) {
            // Unable to run
            //...
            return;
        } // try
        program.setEnvironment(this);
        display(program.getName());
        program.start();
    } // run(String)

    private void display(String s) {
        //...

        System.out.println("Environment Created!");
        System.out.println("Program Selected!");
        System.out.println("Calling run on environment ...");
        System.out.println("Program Name - " + s);
        System.out.println("Program Class - class " + s);
        System.out.println("Displaying the program name - " + s);
        System.out.println("***************************************************************");
    } // display(String)
} // class FoodProcessorEnvironment
