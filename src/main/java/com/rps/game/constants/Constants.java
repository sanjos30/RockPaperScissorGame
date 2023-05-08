package com.rps.game.constants;

public class Constants {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static final String USER_STEP_1_WELCOME = "STARTING THE TOURNAMENT!\n\n";
    public static final String USER_STEP_1 = USER_STEP_1_WELCOME + "ENTER TOTAL NUMBER OF GAMES IN THIS TOURNAMENT OF ROCK PAPER SCISSOR:";
    public static final String USER_STEP_2_TOURNAMENT_BEGINS = "			TOURNAMENT BEGINS 			";

    public static final String USER_ERROR_MESSAGE_INVALID_INPUT = "Invalid selection. Please select a numeric value again!";
    public static final String USER_ERROR_MESSAGE_INVALID_HAND_GESTURE = "Invalid input. Choose an integer type 0, 1 or 2. Press 9 to exit";
    public static final String RUNTIME_ERROR_MESSAGE_GENERIC = "Exiting now. A runtime exception is caused.";
    public static final String RUNTIME_ERROR_MESSAGE_INVALID_HAND_GESTURE = "Invalid hand gesture. Cannot be mapped to a possible move";

    public static final int MINIMUM_VALID_INPUT_CODE = 2;
    public static final int USER_GAME_EXIT_CODE = 9;
    //count constants - game outcomes
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static String FORMATTED_STRING_WITH_LINE_BREAK = "%-15s%-15s%-15s%-15s\n";

}
