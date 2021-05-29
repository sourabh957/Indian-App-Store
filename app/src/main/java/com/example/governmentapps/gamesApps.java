package com.example.governmentapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gamesApps extends AppCompatActivity {
    Button actionStrategyGames, cardBoardGames, casualPuzzleGames, racingGames, rolePlayingGames, sportsWordGames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_apps);
        getWindow().setBackgroundDrawableResource(R.drawable.indian_flag2);

        sportsWordGames = (Button) findViewById(R.id.sports_word_games);
        sportsWordGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSportsWordsGames();
            }
        });

        rolePlayingGames = (Button) findViewById(R.id.role_playing_games);
        rolePlayingGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRolePlayingGames();
            }
        });

        racingGames = (Button) findViewById(R.id.racing_games);
        racingGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRacingGames();
            }
        });

        casualPuzzleGames = (Button) findViewById(R.id.casual_puzzle_games);
        casualPuzzleGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCasualPuzzleGames();
            }
        });

        cardBoardGames = (Button) findViewById(R.id.card_board_games);
        cardBoardGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCardBoardGames();
            }
        });

        actionStrategyGames = (Button) findViewById(R.id.action_strategy_games);
        actionStrategyGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActionStartegyGames();
            }
        });

    }

    private void openSportsWordsGames() {
        Intent intent = new Intent(this, sportsWordsGamesApps.class);
        startActivity(intent);
    }

    private void openRolePlayingGames() {
        Intent intent = new Intent(this, rolePlayingGamesApps.class);
        startActivity(intent);
    }

    private void openRacingGames() {
        Intent intent = new Intent(this, racingGamesApps.class);
        startActivity(intent);
    }

    private void openCasualPuzzleGames() {
        Intent intent = new Intent(this, casualPuzzleGamesApps.class);
        startActivity(intent);
    }

    private void openCardBoardGames() {
        Intent intent = new Intent(this, cardBoardGamesApps.class);
        startActivity(intent);
    }

    private void openActionStartegyGames() {
        Intent intent = new Intent(this, actionStrategyGamesApps.class);
        startActivity(intent);
    }
}