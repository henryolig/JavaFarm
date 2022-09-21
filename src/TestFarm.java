import junit.framework.*;

import javax.xml.transform.Result;
import java.util.ArrayList;

public class TestFarm extends TestCase {
    protected Chicken chik1, chik2;
    protected Cow cow1, cow2;
    protected Crop crop1, crop2;
    protected ArrayList<Item> animalList = new ArrayList<>();
    protected ArrayList<Item> cropList = new ArrayList<>();
    protected ArrayList<Animal> listenList = new ArrayList<>();



    // assigning the values
    protected void setUp(){

        chik1 = new Chicken("Gary", true, 4, 2);
        chik2 = new Chicken("Susanna", false, 3, 3);
        cow1 = new Cow("Henry", false, 2, 4);
        cow2 = new Cow("Olivia", true, 3, 3);
        crop1 = new Crop("Crabgrass", true, 7, 6);
        crop2 = new Crop("Slimygrass", true, 5, 9);



    }

    // test method to add two values
    public void testListen(){
        listenList.add(chik1);
        listenList.add(cow1);
        listenList.add(chik2);
        listenList.add(cow2);
        String result = Farm.listen(listenList);
        assertEquals("Cluck, Mooooo, Cluck, Mooooo", result);
    }

    public void testIsSellable(){
        boolean result = Farm.isSellable(chik1);
        boolean result1 = Farm.isSellable(chik2);
        boolean result2 = Farm.isSellable(crop2);
        assertEquals(true, result);
        assertEquals(false, result1);
        assertEquals(true, result2);
    }

    public void testSell() {
        animalList.add(chik1);
        animalList.add(cow1);
        animalList.add(chik2);
        animalList.add(cow2);

        cropList.add(crop1);
        cropList.add(crop2);
        int result = Farm.sell(animalList);
        int result2 = Farm.sell(cropList);
        assertEquals(16, result);
        assertEquals(75, result2);

    }
        public void testValuable(){
        ArrayList<Comparable> compList = new ArrayList<>();
        ArrayList<Comparable> comcropList = new ArrayList<>();

            compList.add(chik1);
            compList.add(cow1);
            compList.add(chik2);
            compList.add(cow2);

            comcropList.add(crop1);
            comcropList.add(crop2);
            int result = Farm.getMostValuable(compList);
            int result2 = Farm.getMostValuable(comcropList);
            assertEquals(2, result);
            assertEquals(0, result2);

        }
    }