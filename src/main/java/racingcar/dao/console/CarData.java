package racingcar.dao.console;

public class CarData {

    private final String name;
    private final int position;
    private final int gameId;

    public CarData(final String name, final int position, final int gameId) {
        this.name = name;
        this.position = position;
        this.gameId = gameId;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public int getGameId() {
        return gameId;
    }
}
