package common;

public class StringValidator {

    public static final int RANDOM_SIZE = 3;

    /**
     * 입력 숫자 유효성 확인
     * @param number
     * @return
     */
    public static boolean isInputNumberValid(String number){
        boolean isValid = true;
        if(isNull(number) || number.trim().length() != RANDOM_SIZE){
            PrintUtils.printThreeLengthMessage();
            isValid = false;
        }
        return isValid;
    }

    private static boolean isNull(String number) {
        return number == null;
    }
}

