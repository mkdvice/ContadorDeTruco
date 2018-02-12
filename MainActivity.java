package com.example.mkdvi.contadortruco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0; //Valor inicial da cada Dupla.
    int scoreTeamB = 0; //Valor inicial da cada Dupla.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0); // Mostra na tela o número 0.
    }
    /**
     * Mostra a pontução da dupla A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pontuacao_dupla_A); //Encontra o TextView da Pontuação da Dupla A.
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adiciona 1 ponto para Dupla A .
     */

    public void addOneForDuplaA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adiciona 3 pontos para Dupla A .
     */
    public void addThreeForDuplaA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Adiciona 6 pontos para Dupla A .
     */
    public void addSixForDuplaA(View v) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Adiciona 9 pontos para Dupla A .
     */
    public void addNineForDuplaA(View v) {
        scoreTeamA = scoreTeamA + 9;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Adiciona 12 pontos para Dupla A.
     */
    public void addTwelveForDuplaA(View v) {
        scoreTeamA = scoreTeamA + 12;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Mostra a pontução da dupla B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pontuacao_dupla_B);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adiciona 1 ponto para Dupla B.
     */
    public void addOneForDuplaB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Adiciona 3 pontos para Dupla B.
     */
    public void addThreeForDuplaB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Adiciona 6 pontos para Dupla B .
     */
    public void addSixForDuplaB(View v) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Adiciona 9 pontos para Dupla B .
     */
    public void addNineForDuplaB(View v) {
        scoreTeamB = scoreTeamB + 9;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Adiciona 12 pontos para Dupla B.
     */
    public void addTwelveForDuplaB(View v) {
        scoreTeamB = scoreTeamB + 12;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Reseta as pontuações para 6.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }

}
