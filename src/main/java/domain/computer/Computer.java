package domain.computer;

import common.StringValidator;
import domain.game.enums.ContinueCode;

import java.util.Map;
import java.util.Random;

public class Computer {

    /**
     * 정답 생성
     * @return
     */
    public String makeRandomAnswer() {
        Random random = new Random();
        StringBuffer numStr = new StringBuffer();
        int length = 3;

        for(int i = 0; i < length; i++) {
            int ran = random.nextInt(10);
            numStr.append(ran);
        }

        return numStr.toString();
    }

    /**
     * 정답 검증
     * @param inputAnswerNumber
     * @return
     */
    public boolean isAnswerCheck(String inputAnswerNumber, String answer) {
        if(!StringValidator.isInputNumberValid(inputAnswerNumber)) {
            return false;
        }
        return EnswerChecker.check(inputAnswerNumber, answer);
    }

    /**
     * 게임 추가 진행 여부
     * @param inputNewGameNumber
     */
    public boolean isContinueGame(String inputNewGameNumber) {
        return ContinueCode.NEW.getValue().equals(inputNewGameNumber);
    }


}
