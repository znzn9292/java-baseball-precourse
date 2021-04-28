package domain.game;

import common.PrintUtils;
import domain.computer.Computer;
import domain.player.Player;

public class Game {

    private String SYSTEM_ANSWER;

    private final Computer computer;
    private final Player player;

    public Game(Computer computer, Player player) {
        this.computer = computer;
        this.player = player;
        this.SYSTEM_ANSWER = computer.makeRandomAnswer();
    }

    /**
     * 게임 시작
     */
    public void run() {
        PrintUtils.printStartGame();
        process();
    }

    /**
     * 게임 중
     */
    public void process() {
        boolean isAnswer = false;
        while(!isAnswer) {
            String inputAnswerNumber = player.getInputAnswerNumber();
            isAnswer = computer.isAnswerCheck(inputAnswerNumber, SYSTEM_ANSWER);
        }

        end();
    }

    /**
     * 게임 종료
     */
    public void end() {
        PrintUtils.printEndGame();
        String inputNewGameNumber = player.getInputNewGame();
        if(computer.isContinueGame(inputNewGameNumber)) {
            Game game = new Game(new Computer(), new Player());
            game.run();
        }
    }

}
