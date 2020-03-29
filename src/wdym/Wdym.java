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
import static java.lang.System.console;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 *
 * @author analyst
 */
public class Wdym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       Range range = new Range();
       Command com;
        for (int i = 0; i < 26; i++) {
            System.out.println(range.LetterRange.get(i));
        }
        Scanner reader = new Scanner(System.in);
           
        while (true) {
            System.out.print("> ");
            reader = new Scanner(System.in);
            String commandConsole = reader.next();
            String command = null;
            
            com = new Command(commandConsole.toCharArray()[0], commandConsole.toCharArray()[1]);
            
            command = CorrectCommand(commandConsole, com);
            
            if (command.equals("vi")){
                com.vi();
            }
            if (command.equals("dd")){
                com.dd();
            }
            if (command.equals("ls")){
                com.ls();
            }
        }
    }
    
    public static String CorrectCommand(String command, Command com) throws FileNotFoundException, IOException{
        String original;
        String inserted;
        String didYouMean;
        File file = new File("C:\\Users\\analyst\\Desktop\\commands.txt"); 

        BufferedReader br = new BufferedReader(new FileReader(file)); 

        String st; 
        while ((st = br.readLine()) != null){
            String[] parts = st.split("=");
            original = parts[0];
            inserted = command;
            if (inserted.equals(parts[1])){
                return original;
            } 
        } 
        didYouMean = FindCommand(command, com);

        return didYouMean;
    }
    
    public static String FindCommand(String command, Command com) throws IOException{
        String didYouMean = null;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        StringBuilder sb6 = new StringBuilder();
        StringBuilder sb7 = new StringBuilder();
        StringBuilder sb8 = new StringBuilder();
        
        sb1.append(com.letter1.getLeft());
        sb1.append(com.letter2.getLetter());
        String commandTry1 =  sb1.toString(); 
        
        sb2.append(com.letter1.getRight());
        sb2.append(com.letter2.getLetter());
        String commandTry2 =  sb2.toString();
        
        sb3.append(com.letter1.getLetter());
        sb3.append(com.letter2.getLeft());
        String commandTry3 = sb3.toString(); 
        
        sb4.append(com.letter1.getLetter());
        sb4.append(com.letter2.getRight());
        String commandTry4 = sb4.toString(); 
        
        sb5.append(com.letter1.getLeft());
        sb5.append(com.letter2.getLeft());
        String commandTry5 =  sb5.toString();
        
        sb6.append(com.letter1.getRight());
        sb6.append(com.letter2.getLeft());
        String commandTry6 =  sb6.toString();
        
        sb7.append(com.letter1.getLeft());
        sb7.append(com.letter2.getRight());
        String commandTry7 =  sb7.toString();
        
        sb8.append(com.letter1.getRight());
        sb8.append(com.letter2.getRight());
        String commandTry8 =  sb8.toString();
        
        
        if(commandTry1.equals("ls") | commandTry2.equals("ls") | commandTry3.equals("ls") | commandTry4.equals("ls") | commandTry5.equals("ls") | commandTry6.equals("ls") | commandTry7.equals("ls") | commandTry8.equals("ls")){
            didYouMean = "ls";
            System.out.println("Did You Mean " + didYouMean + "? (y/n)");
            Scanner reader = new Scanner(System.in);
            reader = new Scanner(System.in);
            String answer = reader.next();

            if (answer.equals("y")){
                String addToFile = "\n" + didYouMean + "=" + command;
                Files.write(Paths.get("C:\\Users\\analyst\\Desktop\\commands.txt"), addToFile.getBytes(), StandardOpenOption.APPEND);
                return didYouMean;
            }
        }else if(commandTry1.equals("vi") | commandTry2.equals("vi") | commandTry3.equals("vi") | commandTry4.equals("vi") | commandTry5.equals("vi") | commandTry6.equals("vi") | commandTry7.equals("vi") | commandTry8.equals("vi")){
            didYouMean = "vi";
            System.out.println("Did You Mean " + didYouMean + "? (y/n)");
            Scanner reader = new Scanner(System.in);
            reader = new Scanner(System.in);
            String answer = reader.next();

            if (answer.equals("y")){
                String addToFile = "\n" + didYouMean + "=" + command;
                Files.write(Paths.get("C:\\Users\\analyst\\Desktop\\commands.txt"), addToFile.getBytes(), StandardOpenOption.APPEND);
                return didYouMean;
            }
        }else if(commandTry1.equals("dd") | commandTry2.equals("dd") | commandTry3.equals("dd") | commandTry4.equals("dd") | commandTry5.equals("dd") | commandTry6.equals("dd") | commandTry7.equals("dd") | commandTry8.equals("dd")){
            didYouMean = "dd";
            System.out.println("Did You Mean " + didYouMean + "? (y/n)");
            Scanner reader = new Scanner(System.in);
            reader = new Scanner(System.in);
            String answer = reader.next();

            if (answer.equals("y")){
                String addToFile = "\n" + didYouMean + "=" + command;
                Files.write(Paths.get("C:\\Users\\analyst\\Desktop\\commands.txt"), addToFile.getBytes(), StandardOpenOption.APPEND);
                return didYouMean;
            }
        } else {
            System.out.println("Command Not Found");
        }
       
        return "Command Not Found";
    }
    
}
