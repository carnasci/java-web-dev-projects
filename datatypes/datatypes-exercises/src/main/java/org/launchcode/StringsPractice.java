package org.launchcode;
import java.util.Scanner;

public class StringsPractice {
    public static void main(String[] args) {
        String phrase = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, ‘and what is the use of a book,’" +
                " thought Alice ‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);

        System.out.println("Which term would you like to search for in the phrase?");
        String searchTerm = input.nextLine();

        System.out.println(phrase.toLowerCase().contains(searchTerm.toLowerCase()));

        System.out.println("Your search term is found at index: " + phrase.toLowerCase().indexOf(searchTerm.toLowerCase()) +
                  "\r\nYour search term has a length of: " + searchTerm.length());

        String newPhrase = phrase.replace(searchTerm, "");
        System.out.println(newPhrase);

    }
}
