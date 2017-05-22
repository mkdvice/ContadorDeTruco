package com.mkdvicefuton.trucolajebalada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 6; //Valor inicial da cada Dupla.
    int scoreTeamB = 6; //Valor inicial da cada Dupla.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(6); // Mostra na tela o número 6.
    }
    /**
     * Mostra a pontução da dupla A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pontuacao_dupla_A); //Encontra o TextView da Pontuação da Dupla A.
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adiciona 1 ponto para Dupla A e remove 1 Ponto da Dupla B.
     */

    public void addOneForDuplaA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
        scoreTeamB = scoreTeamB - 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adiciona 3 pontos para Dupla A e remove 3 Pontos da Dupla B.
     */
    public void addThreeForDuplaA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
        scoreTeamB = scoreTeamB - 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adiciona 6 pontos para Dupla A e remove 6 Pontos da Dupla B.
     */
    public void addSixForDuplaA(View v) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
        scoreTeamB = scoreTeamB - 6;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adiciona 9 pontos para Dupla A e remove 9 Pontos da Dupla B.
     */
    public void addNineForDuplaA(View v) {
        scoreTeamA = scoreTeamA + 9;
        displayForTeamA(scoreTeamA);
        scoreTeamB = scoreTeamB - 9;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adiciona 12 pontos para Dupla A e remove 12 Pontos da Dupla B.
     */
    public void addTwelveForDuplaA(View v) {
        scoreTeamA = scoreTeamA + 12;
        displayForTeamA(scoreTeamA);
        scoreTeamB = scoreTeamB - 12;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Mostra a pontução da dupla B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pontuacao_dupla_B);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adiciona 1 ponto para Dupla B e remove 1 Ponto da Dupla A.
     */
    public void addOneForDuplaB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
        scoreTeamA = scoreTeamA - 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adiciona 3 pontos para Dupla B e remove 3 Pontos da Dupla A.
     */
    public void addThreeForDuplaB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
        scoreTeamA = scoreTeamA - 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adiciona 6 pontos para Dupla B e remove 6 Pontos da Dupla A.
     */
    public void addSixForDuplaB(View v) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
        scoreTeamA = scoreTeamA - 6;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adiciona 9 pontos para Dupla B e remove 9 Pontos da Dupla A.
     */
    public void addNineForDuplaB(View v) {
        scoreTeamB = scoreTeamB + 9;
        displayForTeamB(scoreTeamB);
        scoreTeamA = scoreTeamA - 9;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adiciona 12 pontos para Dupla B e remove 12 Pontos da Dupla A.
     */
    public void addTwelveForDuplaB(View v) {
        scoreTeamB = scoreTeamB + 12;
        displayForTeamB(scoreTeamB);
        scoreTeamA = scoreTeamA - 12;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Reseta as pontuações para 6.
     */
    public void resetScore(View v) {
        scoreTeamA = 6;
        scoreTeamB = 6;
        displayForTeamA(6);
        displayForTeamB(6);
    }

}