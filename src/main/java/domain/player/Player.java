package domain.player;

import common.PrintUtils;

import java.util.Scanner;

public class Player {

    private String getScanner() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    /**
     * Player 정답 제출
     * @return
     */
    public String getInputAnswerNumber() {
        PrintUtils.printInputAnswer();
        return getScanner();
    }

    /**
     * Player 새로운 게임 진행 여부
     * @return
     */
    public String getInputNewGame() {
        PrintUtils.printContinueGame();
        return getScanner();
    }
}
