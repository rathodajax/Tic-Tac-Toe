/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictacteo;

/**
 *
 * @author ajay
 */
public abstract class Player
{
    private char playerSing = Game.CROSS_CHAR;

    public static final String WRONG_MOVE_MESSAGE =
            "\nWrong move. Please check your input and try again!\n";

    protected abstract void makeMove();

    public char getPlayerSing()
    {
        return playerSing;
    }

    public void setPlayerSing(char playerSing)
    {
        this.playerSing = playerSing;
    }
}
