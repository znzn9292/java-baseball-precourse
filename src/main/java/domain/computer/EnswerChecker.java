package domain.computer;

import common.Converter;
import common.StringValidator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnswerChecker {

    private static final int STRIKE_LOOP_SIZE = 3;
    private static final int BALL_LOOP_SIZE = 3;

    private static final String STRIKE = "STRIKE";
    private static final String BALL = "BALL";

    public static boolean check(String inputAnswerNumber, String answer) {
        Map<String, Integer> scoreMap = new HashMap<>();
        List<String> inputAnswerList = Converter.toList(inputAnswerNumber);
        List<String> answerList = Converter.toList(answer);

        strike(inputAnswerList, answerList, scoreMap);
        ball(inputAnswerList, answerList, scoreMap);
        resultViewScore(scoreMap.get(STRIKE), scoreMap.get(BALL));
        return scoreMap.get(STRIKE) + scoreMap.get(BALL) <= 0;
    }

    public static Map<String, Integer> strike(List<String> inputAnswer, List<String> answer, Map<String, Integer> scoreMap) {
        int strikeTotScore = loopStrikeProcess(inputAnswer, answer);
        scoreMap.put(STRIKE, strikeTotScore);
        return scoreMap;
    }

    private static int loopStrikeProcess(List<String> inputAnswer, List<String> answer) {
        int strikeScore = 0;
        for(int i = 0; i < STRIKE_LOOP_SIZE; i++) {
            strikeScore += countStrike(inputAnswer, answer, i);
        }
        return strikeScore;
    }

    private static int countStrike (List<String> inputAnswerList, List<String> answerList, int index) {
        if (inputAnswerList.get(index).equals(answerList.get(index))) {
            return 1;
        }
        return 0;
    }

    public static Map<String, Integer> ball(List<String> inputAnswer, List<String> answer, Map<String, Integer> scoreMap) {
        int ballTotScore = loopBallProcess(inputAnswer, answer);
        scoreMap.put(BALL, ballTotScore);
        return scoreMap;
    }

    private static int loopBallProcess(List<String> inputAnswer, List<String> answer) {
        int ballScore = 0;
        for (int i = 0; i < BALL_LOOP_SIZE; i++) {
            ballScore += countBall(inputAnswer, answer, i);
        }
        return ballScore;
    }

    private static int countBall (List<String> inputAnswerList, List<String> answerList, int index) {
        if (inputAnswerList.indexOf(answerList.get(index)) != index && inputAnswerList.contains(answerList.get(index))) {
            return 1;
        }
        return 0;
    }

    private static void resultViewScore(int strikeScore, int ballScore) {
        StringBuffer viewMsg = new StringBuffer();
        if(strikeScore > 0) {
            viewMsg.append(strikeScore + "스트라이크 ");
        }
        if(ballScore > 0) {
            viewMsg.append(ballScore + "볼 ");
        }
        if(strikeScore <= 0 && ballScore <= 0) {
            viewMsg.append("낫싱");
        }
        System.out.println(viewMsg.toString());
    }

}
