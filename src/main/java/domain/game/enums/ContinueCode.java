package domain.game.enums;

/**
 * 게임 새로운 시작, 종료 코드
 */
public enum ContinueCode {
    NEW("1"),   // 새로운 게임
    QUIT("2");  // 게임 종료

    private String value;

    ContinueCode(String value) {
        this.value = value;
    }

    public String getValue() {
        if(value == null){
            value = "";
        }
        return value;
    }
}
