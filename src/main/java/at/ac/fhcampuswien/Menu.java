package at.ac.fhcampuswien;


import java.util.Scanner;

public class Menu  {

    private AppController controller;
    private String INVALID_USER_INPUT_MESSAGE;
    private  String EXIT_MESSAGE;

      public Menu(){
          this.INVALID_USER_INPUT_MESSAGE ="Invalid selection!";
          this.EXIT_MESSAGE = "Bye Bye!";
      }



    public  void start() {
        printMenu();
        handleInput("");

    }
    private void handleInput (String Input) {
        Scanner sc = new Scanner(System.in);
          Input = String.valueOf(sc.next().charAt(0));
        switch (Input) {
            case "a" -> getTopHeadlinesAustria(this.controller);
            case "b" -> getAllNewsBitcoin(this.controller);
            case "y" -> getArticleCount(this.controller);
            case "q" -> printExitMessage();
            default -> {
                printInvalidInputMessage();
                start();
            }
        }

    }
    private void getArticleCount (AppController controller) {
    }
    private void getTopHeadlinesAustria (AppController controller) {
    }
    private void getAllNewsBitcoin (AppController controller) {
    }
    private void printExitMessage () {
        System.out.println(EXIT_MESSAGE);
    }
    private void printInvalidInputMessage () {
        System.out.println(INVALID_USER_INPUT_MESSAGE);
    }
    private void printMenu () {
        System.out.println("******************************");
        System.out.println("*    Welcome to NewsApp   *");
        System.out.println("******************************");
        System.out.println("Enter what you wanna do:");
        System.out.println("a: Get top headlines austria");
        System.out.println("b: Get all news about bitcoin");
        System.out.println("y: Count articles");
        System.out.println("q: Quit program");
    }
}

