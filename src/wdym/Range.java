/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wdym;

import java.util.ArrayList;

/**
 *
 * @author analyst
 */
public final class Range {
    public  ArrayList<Letter> LetterRange = new ArrayList<Letter>();
    public static char qwerty[] = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
    
    int [][] qwerty1 = {{'q','w','e','r','t','y','u','i','o','p'},
                        {'a','s','d','f','g','h','j','k','l','-'},
                        {'z','x','c','v','b','n','m','-','-','-'}};
    
    public Range(){	
        
        
        for (int i = 0; i < 9; i++) {
            fill(i);
        }
        Letter letter = new Letter('p', 'o', '-');
        LetterRange.add(letter);

        letter = new Letter('a', '-', 's');
        LetterRange.add(letter);
        
        for (int i = 11; i < 18; i++) {
            fill(i);
        }
        letter = new Letter('l', 'k', '-');
        LetterRange.add(letter);
        letter = new Letter('z', '-', 'x');
        LetterRange.add(letter);
        
        for (int i = 20; i < 26; i++) {
            fill(i);
        }
    }  

    
    public Letter getLetter (char letter){
        Letter letterReturn = null;
        for (int i = 0; i < 26; i++) {
            if(letter == qwerty[i]){
                letterReturn = LetterRange.get(i);
            }
        }
        return letterReturn;
    }
    
    public void fill(int i){
        char letterNew;
        int leftPosition = 0;
        int rightPosition = 0;
        int upPosition = 0;
        int downPosition = 0;
        char leftLetter;
        char rightLetter;
        char upLetter;
        char downLetter;
        int letterqazPosition = 0;
        leftPosition = i - 1;
        rightPosition = i + 1;
        letterNew = qwerty[i];
        upPosition = letterqazPosition - 1;
        downPosition = letterqazPosition + 1;
            
        if(leftPosition < 0){
            leftLetter = '-';
        }else{
            leftLetter = qwerty[leftPosition];
        }
            
        if(rightPosition > 25){
            rightLetter = '-';
        }else{
            rightLetter = qwerty[rightPosition];
        }
//            
//            if(upPosition < 0){
//                upLetter = '-';
//            }else{
//                upLetter = qaz[upPosition];
//            }
//            
//            if(downPosition > 25){
//                downLetter = '-';
//            }else{
//                downLetter = qaz[downPosition];
//            }
            Letter letter = new Letter(letterNew, leftLetter, rightLetter);

            LetterRange.add(letter);

    }
        
}
