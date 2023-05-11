public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        ShihPoo myPet = new ShihPoo();

        myPet.bark();
        System.out.println("ShihPoo Size: " + myPet.size);
        System.out.println("ShihPoo Hair Color: " + myPet.hairColor);
    }
}