public class App { 
    public static void main(String[] args) throws Exception { 
 
        // Create object from pet class 
        Pet myPet = new Pet(); 
 
        myPet.meow(); 
        System.out.println("Cat's Eye Color: " + myPet.eyeColor); 
        System.out.println("Cat's Hair Color: " + myPet.haircolor); 
    } 
}