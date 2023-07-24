package Homework;

public class TextMessage {

    String wordOfChange = "You're a bad person";
    String text = wordOfChange.replace("bad", "good");


    //конструктор по умолчанию.
    TextMessage (){

    }


    //конструктор с одним аргументом.
    public TextMessage(String wordOfChange) {
        System.out.println(wordOfChange + " You're a person " + wordOfChange);
    }

}
