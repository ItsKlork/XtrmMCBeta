package net.xtrmmc.xtrmmcbeta.managers;

import net.xtrmmc.xtrmmcbeta.enums.Game;

public class GamesManager {

    private Game currentGame = Game.NONE;

    public GamesManager() {

    }

    public Game getGame() {
        return currentGame;
    }

    public void setGame(Game game) {
        currentGame = game;
    }

}
