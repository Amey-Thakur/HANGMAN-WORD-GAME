/**
 * @file Mega.java
 * @project HANGMAN-WORD-GAME
 * @brief A classic graphical Hangman game implemented using Java Applets and AWT/Swing.
 * 
 * This repository is part of a curated Computer Engineering project collection.
 * It selects a hidden word from a curated list of programming languages, and 
 * the user must guess characters to save the "stick man" from being hanged.
 * 
 * @author Amey Thakur (https://github.com/Amey-Thakur)
 * @author Mega Satish (https://github.com/msatmod)
 * @date Released: 2020-01-17
 * @version 1.0.0 (Standard Grade)
 * @repository https://github.com/Amey-Thakur/HANGMAN-WORD-GAME
 * 
 * Academic Context:
 * Course: Object-Oriented Programming Methodology (OOPM)
 * Institution: Terna Engineering College
 */

import java.awt.*; 
import java.applet.*; 
import javax.swing.*;

/**
 * @class Mega
 * @brief Main Applet class for the Hangman Word Game.
 * 
 * Handles core game logic, user input through keyboard and mouse events, 
 * and handles the graphical rendering of the game state including the gallows animation.
 */
public class Mega extends Applet {

    /** @name Game State Variables */
    ///@{
    private String hiddenWord = "";  // The target word selected for the current round
    private String guessWord;        // String to store a full-word guess attempt
    private String guessList;        // String accumulating all characters guessed by the user
    private int missCount;           // Counter for incorrect character guesses
    private int maxMisses;           // Maximum allowed misses (standard is 7)
    private boolean win;             // Flag indicating game victory
    private boolean gameOver;        // Flag indicating game completion
    private boolean mouseOver = true;// Tracks hover state over the 'New Word' UI button
    private boolean hanged;          // Triggers final game-over animation sequence
    private boolean[] knownChars;    // Array mapping identified characters in the hidden word
    ///@}

    /** @name Design Constants */
    ///@{
    private final Color bgColor = new Color(0x00dddddd); // Standard light grey palette
    ///@}

    /**
     * @brief Initializes the Applet environment.
     * Sets standard dimensions, backgrounds, and triggers initial welcome dialogs.
     */
    @Override
    public void init() {
        setSize(1000, 625);
        setBackground(bgColor);

        // Standardized Welcome and Credit Dialogs
        JOptionPane.showMessageDialog(this, "\n \t \t \t Welcome to WORDGAME \n \n - Developed by Amey and Mega");
        JOptionPane.showMessageDialog(this, "\t Guess the letters to SAVE a MAN \n \n  Hit the spacebar to guess the word");
        JOptionPane.showMessageDialog(this, "\t \n Hint: PROGRAMMING LANGUAGES \n \n \t Let's Play. Have fun!!!");	
        JOptionPane.showInputDialog("Player name");
        
        newGame();
    }

    /**
     * @brief Resets the internal game state for a new round.
     * Selects a new word and resets all counters and flags.
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
     * @brief Renders the visual representation of the game.
     * Draws the UI buttons, the gallows structure, the stick figure, and the word bank.
     */
    @Override
    public void paint(Graphics g) {
        // --- 1. Draw "New Word" Navigation Button ---
        g.setColor(mouseOver ? Color.white : new Color(0x00eeeeee));
        g.fillRect(50, 60, 100, 30);
        
        g.setColor(new Color(0x00aaaaaa));
        g.drawRect(49, 59, 102, 32);
        
        g.setColor(Color.black);
        g.setFont(new Font("Helvetica", Font.BOLD, 16));
        g.drawString("new word", 64, 80);

        // --- 2. Render Gallows Architecture ---
        g.setFont(new Font("Helvetica", Font.BOLD, 32));
        g.drawLine(50, 550, 375, 550);   // Horizontal base base
        g.drawLine(150, 550, 150, 150);  // Vertical main support
        g.drawLine(150, 150, 375, 150);  // Horizontal top beam
        g.drawLine(375, 150, 375, 199);  // Hanging rope

        // --- 3. Word Rendering System ---
        for (int i = 0; i < hiddenWord.length(); i++) {
            int xPos = i * 30 + 225;
            // Render underlines for active characters
            if (hiddenWord.charAt(i) != ' ') {
                g.drawLine(xPos, 100, xPos + 15, 100);
            }
            // Display character if successfully discovered
            if (knownChars[i]) {
                g.drawString(String.valueOf(hiddenWord.charAt(i)), xPos - 1, 95);
            }
        }

        // --- 4. Dynamic Stick Figure Progression (Additive rendering) ---
        switch (missCount) {
            case 7: 
                animateHang(g); 
                break;
            case 6: 
                g.drawLine(375, 270, 300, 280); // Left Arm segment
            case 5: 
                g.drawLine(375, 270, 450, 280); // Right Arm segment
            case 4: 
                g.drawLine(375, 400, 325, 450); // Left Leg segment
            case 3: 
                g.drawLine(375, 400, 425, 450); // Right Leg segment
            case 2: 
                g.drawLine(375, 250, 375, 400); // Spinal support / Thorax
            case 1: 
                g.drawOval(349, 199, 51, 51);   // Head perimeter
                g.setColor(new Color(0x00ffcc99)); // Skin-tone fill
                g.fillOval(350, 200, 50, 50);   // Head volume
                break;
        }
        
        // --- 5. Display Guess History ---
        g.setColor(Color.black);
        g.setFont(new Font("Helvetica", Font.BOLD, 32));
        for(int i = 0; i < guessList.length(); i++) {
            g.drawString(String.valueOf(guessList.charAt(i)), 50 + i * 28, 40);
        }

        // --- 6. Endgame Condition Rendering ---
        if (win || missCount == maxMisses) {
            gameOver = true;
            if (win) {
                g.setColor(new Color(0x00009900)); // Success green
                g.drawString("You Win!", 600, 200);
            } else {
                g.setColor(Color.red); // Error red
                g.drawString("You Lose!", 600, 200);
            }
            
            // Implementation requirement: Reveal the full answer upon termination
            g.setColor(Color.black);
            for(int i = 0; i < hiddenWord.length(); i++) {
                int xPos = i * 30 + 225;
                g.drawString(String.valueOf(hiddenWord.charAt(i)), xPos - 1, 95);
            }
        }

        // --- 7. Status Information (Heads-Up Display) ---
        g.setColor(Color.black);
        g.setFont(new Font("Helvetica", Font.BOLD, 16));
        g.drawString("Misses: " + missCount, 155, 168);
    }
    
    /**
     * @brief Word Bank Selection logic.
     * @return A lowercase String selecting a programming language.
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
     * @brief Validates a full word guess against the secret.
     * @param guess The raw input string from the user.
     * @return true if case-insensitive match is found.
     */
    private boolean validateGuess(String guess) {
        return guess != null && guess.equalsIgnoreCase(hiddenWord);
    }
    
    /**
     * @brief Modal dialog for full-word guess attempts.
     */
    public void guessTheWord() {
        guessWord = JOptionPane.showInputDialog(null, "Guess the word to SAVE LIFE:");
        if (validateGuess(guessWord)) {
            win = true;
        } else if (guessWord != null) {
            missCount = maxMisses; // High-stakes: incorrect word guess results in instant loss
        }
    }

    /**
     * @brief Legacy input handling for character/action detection.
     * @param e Event object.
     * @param k Key code.
     */
    @Override
    public boolean keyDown(Event e, int k) {
        if (!gameOver) {
            char keyChar = (char) k;
            
            if (keyChar == ' ') {
                guessTheWord(); // Spacebar triggers full-word guess attempt
            } else {
                // Ignore redundant character guesses
                if (guessList.indexOf(keyChar) != -1 || guessList.indexOf(Character.toLowerCase(keyChar)) != -1) {
                    return true;
                }
                
                guessList += keyChar;
                boolean rightGuess = false;
                
                // Scan the target word for matching characters
                for(int i = 0; i < hiddenWord.length(); i++) {
                    if (Character.toLowerCase(keyChar) == hiddenWord.charAt(i)) {
                        rightGuess = true;
                        knownChars[i] = true;
                    }				
                }
                
                if (!rightGuess) missCount++;
                
                // Check if all necessary characters have been uncovered
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
     * @brief Mouse event dispatcher for interaction with UI elements.
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
     * @brief Real-time coordinate tracking for hovering effects.
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
     * @brief Executes the final "Hanging" animation sequence.
     * Performs graphical transformations and a color-fading loop to simulate the outcome.
     * Uses a blocking loop to ensure sequential rendering in the applet context.
     * @param g The Graphics context for the component.
     */
    private void animateHang(Graphics g) {
        hanged = true;
    
        g.setColor(Color.black);
    
        // Construct final posture
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
        
        // Color transition logic: Simulated cyanosis / face color shifting
        for (int i = 0; i < 220000; i++) {
            int c = Math.min(i / 1000, 255);
            g.setColor(new Color(255 - c, 0, c));
            g.fillOval(350, 200, 50, 50);
        }
        
        // Render final cleanup and limb positions
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
