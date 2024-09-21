package org.example.javaconstructor;

public class Main {

  public static void main(String[] args){
  Practice1 practice1 = new Practice1("Jhon michael");
  Practice1 add = new Practice1(2, 5);
  
  Encapsulation1 data1 = new Encapsulation1("This is title #1", "Thiis description", "Josh");
  
  System.out.println("title:" + data1.getTitle());
  System.out.println("description:" +  data1.getDescription());
  System.out.println("author:" + data1.getAuthor());
    }
}
