/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wdym;

/**
 *
 * @author analyst
 */
public class Letter {

    public void setDown(char down) {
        this.down = down;
    }
    private char letter;
    private char left;
    private char right;
    private char up;
    private char down;

    public Letter(char letter, char left, char right, char up, char down) {
        this.letter = letter;
        this.left = left;
        this.right = right;
        this.up = up;
        this.down = down;
    }
    public Letter(char letter, char left, char right) {
        this.letter = letter;
        this.left = left;
        this.right = right;
    }
    
    public Letter(char letter, char left, char right, char up1, char up2, char down1, char down2) {
        this.letter = letter;
        this.left = left;
        this.right = right;
        this.up = up;
        this.down = down;
    }
    /**
     * @return the letter
     */
    public char getLetter() {
        return letter;
    }

    /**
     * @param letter the letter to set
     */
    public void setLetter(char letter) {
        this.letter = letter;
    }

    /**
     * @return the left
     */
    public char getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(char left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public char getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(char right) {
        this.right = right;
    }

    /**
     * @return the up
     */
    public char getUp() {
        return up;
    }

    /**
     * @param up the up to set
     */
    public void setUp(char up) {
        this.up = up;
    }

    /**
     * @return the down
     */
    public char getDown() {
        return down;
    }

    /**
     * @param down the down to set
     */

    @Override
    public String toString() {
        return "letter =" + letter + " left=" + left + " right=" + right + " up=" + up + " down=" + down + '}';
    }
    
}
