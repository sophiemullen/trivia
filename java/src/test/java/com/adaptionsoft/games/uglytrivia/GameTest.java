package com.adaptionsoft.games.uglytrivia;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
    Player player1, player2;

    @Before
    public void setUp() {
        game = new Game();
        players = new ArrayList();
        placesInGame = new int[6];
        amountOfGold = new int[6];
        inPenaltyBox = new boolean[6];
        popQuestions = new LinkedList();
        scienceQuestions = new LinkedList();
        sportsQuestions = new LinkedList();
        rockQuestions = new LinkedList();

        player1 = new Player.Builder()
                .withName("sophie")
                .build();
        player2 = new Player.Builder()
                .withName("yannick")
                .build();
    }

    @Test
    public void createRockQuestion() {
        assertThat(game.createRockQuestion(5)).isEqualTo("Rock Question 5");
    }

    @Test
    public void isPlayable_whenTooFewPlayers_returnsFalse() {
        game.add(player1);
        assertThat(game.isPlayable()).isFalse();
    }

    @Test
    public void isPlayable_whenEnoughPlayers_returnsTrue() {
        Player player1 = new Player.Builder()
                .withName("sophie")
                .build();
        Player player2 = new Player.Builder()
                .withName("yannick")
                .build();
        game.add(player1);
        game.add(player2);
        System.out.println(game.howManyPlayers());
        assertThat(game.isPlayable()).isTrue();
    }

    @Test
    public void add_whenPlayerAdded_returnsTrue() {
        assertThat(game.add(player1)).isTrue();
    }

    @Test
    public void howManyPlayers_returnsCorrectNumberOfPlayers() {
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
        game.add(player1);
        assertThat(game.wrongAnswer()).isTrue();
    }


}