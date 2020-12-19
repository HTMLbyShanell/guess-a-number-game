/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_highlow;

import java.awt.Toolkit;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Shanell A. Spann
 * ITDEV110 - ITOOP
 * Assignment #7
 * Oct 26th
 */
public class Spann_HighLow {

    /**
     * @param args the command line arguments
     * @throws javax.sound.sampled.LineUnavailableException
     */
    public static void main(String[] args) throws LineUnavailableException {
        
        Toolkit.getDefaultToolkit().beep();
        SoundUtils su = new SoundUtils();
        su.tone(261,300);
        
        Admin a = new Admin();
        a.Greeting();
        gameController gc = new gameController();
        gc.gameController();
        a.goodBye();
        su.tone(261,300);
    }
    
}
