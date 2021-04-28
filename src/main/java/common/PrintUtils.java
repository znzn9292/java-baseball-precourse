package common;

public class PrintUtils {

    private static final String START_GAME = "숫자야구게임을 시작합니다.";
    private static final String INPUT_ANSWER = "숫자를 입력해주세요 : ";
    private static final String END_GAME = "3개의 숫자를 모두 맞히셨습니다! 게임종료";
    private static final String CONTINUE_GAME = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    private static final String THREE_LENGTH_MESSAGE = "정답은 3자리로 입력해 주세요.";

    /**
     * 게임 시작 알림
     */
    public static void printStartGame() {
        System.out.println(START_GAME);
    }

    /**
     * 게임 진행 알림 (숫자입력)
     */
    public static void printInputAnswer() {
        System.out.print(INPUT_ANSWER);
    }

    /**
     * 게임 종료 알림
     */
    public static void printEndGame() {
        System.out.println(END_GAME);
    }

    /**
     * 새로운 게임 진행 여부 알림
     */
    public static void printContinueGame() {
        System.out.println(CONTINUE_GAME);
    }

    /**
     * 새로운 게임 진행 여부 알림
     */
    public static void printThreeLengthMessage() {
        System.out.println(THREE_LENGTH_MESSAGE);
    }
}
