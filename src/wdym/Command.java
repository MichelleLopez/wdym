/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wdym;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author analyst
 */
public class Command {
    Letter letter1;
    Letter letter2;
    Range range = new Range();

    public Command(char letter1, char letter2){
        this.letter1 = range.getLetter(letter1);
        this.letter2 = range.getLetter(letter2);
    }
    
    public void vi(){
        int height = 12;
        int length = 25;
        for (int i = 0; i < height; i++) 
        { 
            for (int j = 0; j < length; j++)  
            { 
      
                // for first row, print '*' 
                // i.e, for top part of crown 
                if (i == 0)  
                { 
      
                    // print '*' at first, middle and last column 
                    if (j == 0 || j == height || j == length - 1)  
                    { 
                        System.out.print("*"); 
                    } 
                    else { 
                        System.out.print(" "); 
                    } 
                } 
      
                // print '*' at base of 
                // crown i.e, for last row 
                else if (i == height - 1)  
                { 
                    System.out.print("*"); 
                } 
      
                // fill '#' to make a perfect crown 
                else if ((j < i || j > height - i) && 
                        (j < height + i || j >= length - i)) 
                    System.out.print("#"); 
                else
                    System.out.print(" "); 
            } 
            System.out.println(); 
        } 
    }
    
    public void dd(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert a number: ");
        reader = new Scanner(System.in);
        int answer = reader.nextInt();
        if(answer > 1){
            int fact=1;  
            for(int i=1;i<=answer;i++){    
                fact=fact*i;    
            }    
            System.out.println("Factorial of "+answer+" is: "+fact);
        }
            
       }  
    
    public void ls() throws FileNotFoundException, IOException{
        File file = new File("C:\\Users\\analyst\\Desktop\\commands.txt"); 

        BufferedReader br = new BufferedReader(new FileReader(file)); 

        String st; 
        while ((st = br.readLine()) != null){
            System.out.println(st);
            
        } 
    }
}

