package Activities;

//Activity5.java
import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args) {
        MyBook newNovel = new MyBook();

        String title = "The Great Java Adventure";

        newNovel.setTitle(title);

        System.out.println("The title is: " + newNovel.getTitle());
    }
}
