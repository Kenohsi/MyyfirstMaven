package at.ac.fhcampuswien;

public abstract class Menu {

    private AppController controller;
    private String INVALID_USER_INPUT_MESSAGE;
    private String EXIT_MESSAGE;


    public Menu (String INVALID_USER_INPUT_MESSAGE, String EXIT_MESSAGE, AppController controller) {
        this.controller = controller;
        this.INVALID_USER_INPUT_MESSAGE = INVALID_USER_INPUT_MESSAGE;
        this.EXIT_MESSAGE = EXIT_MESSAGE;

    }


    public void start () {
    }
    private void handleInput (String Input) {
    }
    private void getArticleCount (AppController controller) {
    }
    private void getTopHeadlinesAustria (AppController controller) {
    }
    private void getAllNewsBitcoin (AppController controller) {
    }
    private void printExitMessage () {
    }
    private void printInvalidInputMessage () {
    }
    private void printMenu () {
    }
}

