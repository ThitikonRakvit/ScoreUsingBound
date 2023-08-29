/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scorebound;

import java.util.Scanner;

/**
 *
 * @author thiti
 */
public class ScoreUsingBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LiveScoreBean score = new LiveScoreBean();
        Subscriber1 sub1 = new Subscriber1();
        Subscriber2 sub2 = new Subscriber2();
        score.addPropertyChangeListener(sub1);
        score.addPropertyChangeListener(sub2);

        String data = "s";
        while (!data.equals("")) {
            Scanner kb = new Scanner(System.in);
            data = kb.nextLine();
            if (!data.equals("")) {
                score.setScoreLine(data);
            }
        }

    }

}
