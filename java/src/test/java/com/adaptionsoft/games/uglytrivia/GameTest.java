package com.adaptionsoft.games.uglytrivia;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    private Game game;
    private List players;
    private int[] placesInGame;
    private int[] amountOfGold;
    boolean[] inPenaltyBox;
    private LinkedList popQuestions;
    private LinkedList scienceQuestions;
    private LinkedList sportsQuestions;
    private LinkedList rockQuestions;
    int currentPlayer = 0;
    boolean isGettingOutOfPenaltyBox;

    @Before
    public void setUp() {
        game = new Game();
        players = new ArrayList();
        placesInGame = new int[6];
        amountOfGold = new int[6];
        inPenaltyBox  = new boolean[6];
        popQuestions = new LinkedList();
        scienceQuestions = new LinkedList();
        sportsQuestions = new LinkedList();
        rockQuestions = new LinkedList();
    }

    @Test
    public void createRockQuestion() {
        assertThat(game.createRockQuestion(5)).isEqualTo("Rock Question 5");
    }

    @Test
    public void isPlayable_whenTooFewPlayers_returnsFalse() {
        String player1 = "sophie";
        game.add(player1);
        assertThat(game.isPlayable()).isFalse();
    }

    @Test
    public void isPlayable_whenEnoughPlayers_returnsTrue() {
        String player1 = "sophie";
        String player2 = "yannick";
        game.add(player1);
        game.add(player2);
        System.out.println(game.howManyPlayers());
        assertThat(game.isPlayable()).isTrue();
    }

    @Test
    public void add_whenPlayerAdded_returnsTrue() {
        String player1 = "sophie";
        assertThat(game.add(player1)).isTrue();
    }

    @Test
    public void howManyPlayers_returnsCorrectNumberOfPlayers() {
        String player1 = "sophie";
        game.add(player1);
        assertThat(game.howManyPlayers()).isEqualTo(1);
    }

    @Test
    public void howManyPlayers_whenListIsEmpty_returnsZero() {
        assertThat(game.howManyPlayers()).isEqualTo(0);
    }

    @Test
    public void roll() throws Exception {
    }

    @Test
    public void wasCorrectlyAnswered() {
    }

    @Test
    public void wrongAnswer_alwaysReturnsTrue() {
        String player1 = "sophie";
        game.add(player1);
        assertThat(game.wrongAnswer()).isTrue();
    }


}