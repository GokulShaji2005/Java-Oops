package tutorial_8;
import java.util.*;

class Book{
    String author,title;

    Book(String title,String author){
        this.title=title;
        this.author=author;
    }

    void display(){
        System.out.println("Author:"+ author);
        System.out.println("Title:"+ title);
    }
}

class Technical extends Book{
    String sub;
    Technical(String title,String author,String sub){
        super(title, author);
        this.sub=sub;
    }

    void display(){
         System.out.println("Author:"+ author);
        System.out.println("Title:"+ title);
        System.out.println("Subject:"+ sub);
    }
}

class Story extends Technical{
    String genre;
    Story(String title,String author,String sub,String genre){
        super(title, author, sub);
      this.genre=genre;
    }

    void display(){
            System.out.println("Author:"+ author);
        System.out.println("Title:"+ title);
        System.out.println("Subject:"+ sub);
        System.out.println("Genre:"+ genre);
    }
}

public class MethodOverriding {

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Title:");
        String title=sc.nextLine();
          System.out.println("Author:");
           String author=sc.nextLine();
          System.out.println("Subject:");
           String sub=sc.nextLine();
          System.out.println("Genre:");
         String genre=sc.nextLine();

         Book b1=new Book(title, author);
         Book b2=new Technical(title, author, sub);
         Book b3=new Story(title, author, sub, genre);

         b1.display();
         b2.display();
         b3.display();
     }
}