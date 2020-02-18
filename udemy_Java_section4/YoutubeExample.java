package udemy_Java_section4;

public class YoutubeExample {
    public static void main(String[] args) {
        String name = "Susan";
        //System.out.println(name.toUpperCase());
        String exclaim = addExclamationPoint(name);
        System.out.println(exclaim);

        Animal a = new Animal();
        String dog = a.iAmDog();
        System.out.println(dog);

        Animal b = new Animal();
        String cat = b.doStuff();
        System.out.println(cat);
    
    }//main

    public static String addExclamationPoint(String name){
        return name + "!";
    }//addExclamationPoint
    
}//class