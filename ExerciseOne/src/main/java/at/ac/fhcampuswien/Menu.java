package at.ac.fhcampuswien;

import java.util.Scanner;

public class Menu {

    private AppController controller;
    private final String INVALID_USER_INPUT_MESSAGE;
    private final String EXIT_MESSAGE;

    public Menu() {
        this.INVALID_USER_INPUT_MESSAGE = "Invalid selection!";
        this.EXIT_MESSAGE = "Bye Bye!";
    }

    public void start() {
        controller = new AppController();
        printMenu();
        handleInput("");
    }

    private void handleInput(String Input) {
        Scanner sc = new Scanner(System.in);
        Input = String.valueOf(sc.next().charAt(0));
        switch (Input) {
            case ("a") -> {
                getTopHeadlinesAustria(this.controller);
                start();
            }
            case ("b") -> {
                getAllNewsBitcoin(this.controller);
                start();
            }

            case ("y") -> {
                getArticleCount(this.controller);
                start();
            }

            case ("q") -> printExitMessage();
            default -> {
                printInvalidInputMessage();
                start();
            }
        }

    }

    private void getArticleCount(AppController controller) {
        System.out.println("Number of articles: "+controller.getArticleCount());
    }

    private void getTopHeadlinesAustria(AppController controller) {
        System.out.println(controller.getTopHeadlinesAustria());
    }

    private void getAllNewsBitcoin(AppController controller) {
        System.out.println(controller.getAllNewsBitcoin());
    }


    private void printExitMessage() {
        System.out.println(EXIT_MESSAGE);
    }

    private void printInvalidInputMessage() {
        System.out.println(INVALID_USER_INPUT_MESSAGE);
    }

    private void printMenu() {
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

