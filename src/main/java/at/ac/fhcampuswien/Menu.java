package at.ac.fhcampuswien;

public class Menu extends AppController {

    private String INVALID_USER_INPUT_MESSAGE;
    private String EXIT_MESSAGE;

    public Menu (){
    }
    public Menu (String INVALID_USER_INPUT_MESSAGE, String EXIT_MESSAGE) {
        this.INVALID_USER_INPUT_MESSAGE = INVALID_USER_INPUT_MESSAGE;
        this.EXIT_MESSAGE = EXIT_MESSAGE;
    }
}
