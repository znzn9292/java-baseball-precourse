import domain.computer.Computer;
import domain.game.Game;
import domain.player.Player;

public class BaseballApplication {
    public static void main(String[] args) {
        Game game = new Game(new Computer(), new Player());
        game.run();
    }
}
