package ConvertStringArray;

import java.security.SecureRandom;
import java.util.Random;

public class CommonResource {
    int size = 4;
    int lengthOfWord = 6;
    StringBuilder[] lines = new StringBuilder[size];

    CommonResource(StringBuilder[] lines) {
        this.lines = lines;
    }
    CommonResource(){

    }
    String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Random random = new Random();

    public void createArray(){
        for (int i = 0; i < size; i++) {
            lines[i] = new StringBuilder("");
            for (int j = 0; j < lengthOfWord; j++) {
                char ch = letters.charAt(random.nextInt(0, letters.length()-1));
                lines[i].append(ch);
            }
        }
    }

    public void printArray(){
        for (int i = 0; i < lines.length; i++) {
            System.out.print(lines[i].toString() + " ");
        }
    }
}
