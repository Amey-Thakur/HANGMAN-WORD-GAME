/**
 * Project: Hangman Word Game (Mini Project)
 * Course: Object-Oriented Programming Methodology (OOPM)
 * Description: A classic graphical Hangman game implemented using Java Applets and AWT/Swing components.
 *              The game selects a hidden word from a curated list, and the user must guess
 *              characters to save the "stick man" from being hanged.
 * 
 * Authors: Amey Thakur, Mega Satish, Saakshi Deokar
 * Batch: 2022
 * Institution: Terna Engineering College
 * Repository: https://github.com/Amey-Thakur/HANGMAN-WORD-GAME
 */

import java.awt.*; 
import java.applet.*; 
import javax.swing.*;

/**
 * Main Applet class for the Hangman Word Game.
 * Handles game logic, event processing, and graphical rendering.
 */
public class Mega extends Applet {

    // --- Game State Variables ---
    private String hiddenWord = "";  // The target word to be guessed
    private String guessWord;        // Full word guess input by the user
    private String guessList;        // List of all characters guessed by the player
    private int missCount;           // Number of incorrect guesses
    private int maxMisses;           // Maximum allowed misses before game over (7)
    private boolean win;             // Flag indicating if the player has won
    private boolean gameOver;        // Flag indicating if the game has ended
    private boolean mouseOver = true;// Flag for 'New Game' button hover state
    private boolean hanged;          // Flag to trigger the final hanging animation
    private boolean[] knownChars;    // Tracks revealed characters in the hidden word

    // --- Design Constants ---
    private final Color bgColor = new Color(0x00dddddd); // Standard light grey background

    /**
     * Initializes the Applet, sets dimensions, and displays welcome messages.
     */
    @Override
    public void init() {
        setSize(1000, 625);
        setBackground(bgColor);

        // Display Welcome and Credit Dialogs
        JOptionPane.showMessageDialog(this, "\n \t \t \t Welcome to WORDGAME \n \n - Developed by Amey, Mega, Saakshi");
        JOptionPane.showMessageDialog(this, "\t Guess the letters to SAVE a MAN \n \n  Hit the spacebar to guess the word");
        JOptionPane.showMessageDialog(this, "\t \n Hint: PROGRAMMING LANGUAGES \n \n \t Lets Play. Have fun!!!");	
        JOptionPane.showInputDialog("Player name");
        
        newGame();
    }

    /**
     * Resets the game state for a new round with a fresh word selection.
     */
    public void newGame() {
        hiddenWord = getHiddenWord();
        guessList = "";
        guessWord = "";
        knownChars = new boolean[hiddenWord.length()];

        // Initialize revealed status (handle words with spaces)
        for (int i = 0; i < hiddenWord.length(); i++) {	
            knownChars[i] = (hiddenWord.charAt(i) == ' ');
        }
        
        win = false;
        missCount = 0;
        maxMisses = 7;
        gameOver = false;
        hanged = false;
    }
    
    /**
     * Renders all graphical components of the game.
     * Includes UI buttons, the gallows, the stick figure, and game status text.
     */
    @Override
    public void paint(Graphics g) {
        // --- 1. Draw "New Word" Button ---
        g.setColor(mouseOver ? Color.white : new Color(0x00eeeeee));
        g.fillRect(50, 60, 100, 30);
        
        g.setColor(new Color(0x00aaaaaa));
        g.drawRect(49, 59, 102, 32);
        
        g.setColor(Color.black);
        g.setFont(new Font("Helvetica", Font.BOLD, 16));
        g.drawString("new word", 64, 80);

        // --- 2. Draw Gallows ---
        g.setFont(new Font("Helvetica", Font.BOLD, 32));
        g.drawLine(50, 550, 375, 550);   // Base beam
        g.drawLine(150, 550, 150, 150);  // Vertical pole
        g.drawLine(150, 150, 375, 150);  // Horizontal top bar
        g.drawLine(375, 150, 375, 199);  // Noose rope

        // --- 3. Draw Word Blanks and Revealed Characters ---
        for (int i = 0; i < hiddenWord.length(); i++) {
            int xPos = i * 30 + 225;
            // Draw underline for non-space characters
            if (hiddenWord.charAt(i) != ' ') {
                g.drawLine(xPos, 100, xPos + 15, 100);
            }
            // Draw character if discovered
            if (knownChars[i]) {
                g.drawString(String.valueOf(hiddenWord.charAt(i)), xPos - 1, 95);
            }
        }

        // --- 4. Draw Stick Figure (Progression based on misses) ---
        switch (missCount) {
            case 7: 
                animateHang(g); 
                break;
            case 6: 
                g.drawLine(375, 270, 300, 280); // Left Arm
            case 5: 
                g.drawLine(375, 270, 450, 280); // Right Arm
            case 4: 
                g.drawLine(375, 400, 325, 450); // Left Leg
            case 3: 
                g.drawLine(375, 400, 425, 450); // Right Leg
            case 2: 
                g.drawLine(375, 250, 375, 400); // Main Body
            case 1: 
                g.drawOval(349, 199, 51, 51);   // Head Outline
                g.setColor(new Color(0x00ffcc99)); // Skin Tone
                g.fillOval(350, 200, 50, 50);   // Head Fill
                break;
        }
        
        // --- 5. Render Guessed Letters List ---
        g.setColor(Color.black);
        g.setFont(new Font("Helvetica", Font.BOLD, 32));
        for(int i = 0; i < guessList.length(); i++) {
            g.drawString(String.valueOf(guessList.charAt(i)), 50 + i * 28, 40);
        }

        // --- 6. Handle Game Outcomes (Victory/Loss) ---
        if (win || missCount == maxMisses) {
            gameOver = true;
            if (win) {
                g.setColor(new Color(0x00009900)); // Success Green
                g.drawString("You Win!", 600, 200);
            } else {
                g.setColor(Color.red); // Error Red
                g.drawString("You Lose!", 600, 200);
            }
            
            // Reveal full word on completion
            g.setColor(Color.black);
            for(int i = 0; i < hiddenWord.length(); i++) {
                int xPos = i * 30 + 225;
                g.drawString(String.valueOf(hiddenWord.charAt(i)), xPos - 1, 95);
            }
        }

        // --- 7. Status HUD ---
        g.setColor(Color.black);
        g.setFont(new Font("Helvetica", Font.BOLD, 16));
        g.drawString("Misses: " + missCount, 155, 168);
    }
    
    /**
     * Selects a random programming language from the word bank.
     * @return The selected word in lowercase.
     */
    private String getHiddenWord() {
        String[] wordList = {
            "Java", "C language", "C++", "Python", "JavaScript", 
            "SQL", "Ruby", "Swift", "MATLAB", "Smalltalk", 
            "Lua", "Pearl", "Pascal", "PHP", "Fortran"
        };
    
        int index = (int)(Math.random() * wordList.length);
        String selected = wordList[index];
        return selected.toLowerCase();
    }
    
    /**
     * Validates a full word guess against the hidden target.
     * @param guess The player's input string.
     * @return true if matches, false otherwise.
     */
    private boolean validateGuess(String guess) {
        return guess != null && guess.equalsIgnoreCase(hiddenWord);
    }
    
    /**
     * Triggers an input dialog for the user to attempt a full word guess.
     */
    public void guessTheWord() {
        guessWord = JOptionPane.showInputDialog(null, "Guess the word to SAVE LIFE:");
        if (validateGuess(guessWord)) {
            win = true;
        } else if (guessWord != null) {
            missCount = maxMisses; // Immediate loss for wrong word guess
        }
    }

    /**
     * Captures keyboard input for character guessing or triggering word guess.
     */
    @Override
    public boolean keyDown(Event e, int k) {
        if (!gameOver) {
            char keyChar = (char) k;
            
            if (keyChar == ' ') {
                guessTheWord(); // Spacebar triggers word guess
            } else {
                // Check for duplicate guesses
                if (guessList.indexOf(keyChar) != -1 || guessList.indexOf(Character.toLowerCase(keyChar)) != -1) {
                    return true;
                }
                
                guessList += keyChar;
                boolean rightGuess = false;
                
                // Check Hidden Word
                for(int i = 0; i < hiddenWord.length(); i++) {
                    if (Character.toLowerCase(keyChar) == hiddenWord.charAt(i)) {
                        rightGuess = true;
                        knownChars[i] = true;
                    }				
                }
                
                if (!rightGuess) missCount++;
                
                // Check if all characters are discovered
                win = true;
                for(boolean known : knownChars) {
                    if (!known) {
                        win = false;
                        break;
                    }
                }
            }
            repaint();
        }
        return true;
    }
        
    /**
     * Handles mouse clicks, specifically for the "New Word" button.
     */
    @Override
    public boolean mouseDown(Event evt, int x, int y) {
        if (x > 50 && x < 150 && y > 60 && y < 90) {
            newGame();
            repaint();
        }
        return true;
    }
    
    /**
     * Tracks mouse movements for UI hover effects.
     */
    @Override
    public boolean mouseMove(Event evt, int x, int y) {
        boolean previousState = mouseOver;
        mouseOver = (x > 50 && x < 150 && y > 60 && y < 90);
        
        if (previousState != mouseOver && !hanged) {
            repaint();
        }
        return true;		
    }
        
    /**
     * Performs the final "Hanging" sequence with a color-shifting animation.
     * Uses a busy-wait loop to achieve a smooth color fade on the stick figure's face.
     */
    private void animateHang(Graphics g) {
        hanged = true;
    
        g.setColor(Color.black);
    
        g.drawLine(375, 270, 335, 280);
        g.drawLine(375, 270, 415, 280);
        g.drawLine(335, 280, 375, 250);
        g.drawLine(415, 280, 375, 250);
        g.drawLine(375, 400, 350, 375);
        g.drawLine(375, 400, 400, 375);
        g.drawLine(350, 375, 350, 400);
        g.drawLine(400, 375, 400, 400);
        g.drawLine(375, 250, 375, 400);
        g.drawOval(349, 199, 51, 51);
        
        // Color transition loop: Head turning from natural to blue
        for (int i = 0; i < 220000; i++) {
            int c = Math.min(i / 1000, 255);
            g.setColor(new Color(255 - c, 0, c));
            g.fillOval(350, 200, 50, 50);
        }
        
        // Cleanup and final visual states
        g.setColor(bgColor);
        g.drawLine(335, 280, 375, 250);
        g.drawLine(415, 280, 375, 250);
        
        g.setColor(Color.black);
        g.drawLine(375, 250, 375, 400);
        g.drawLine(375, 270, 370, 330);
        g.drawLine(375, 270, 380, 330);
        g.drawLine(375, 400, 370, 460);
        g.drawLine(375, 400, 380, 460);
    }
}
