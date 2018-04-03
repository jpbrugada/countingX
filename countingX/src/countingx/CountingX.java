/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingx;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class CountingX {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = 5;
        int columns = 5;
        int temp;
        int i = 0;
        int u = 0;
        int highestValue;
        int tempValue1, tempValue2 = 0, tempValue3, tempValue4 = 0, tempValue5, tempValue6 = 0;
        int x = 0, y = 0;
        
        int[][] something;
        something = new int [rows][columns];
        
        for(i = 0; i < rows; i++){
            for(u = 0; u < columns; u++){
                something[i][u] = inp.nextInt();
            }
        }
        //x1 = [0][0], x2 = [0][2], x3 = [1][1], x4 = [2][0], x5 = [2][2]
        //x1 = [0][1]
        for(int j = 0; j < 3; j++){
            tempValue1 = something[x][y] + something[x][y+2] + something[x+1][y+1] + something[x+2][y] + something[x+2][y+2];
            x++;
            if(tempValue1 > tempValue2){
                    tempValue2 = tempValue1;
            }
        }
        y = 1; 
        x = 0;
        for(int j = 0; j < 3; j++){
            tempValue3 = something[x][y] + something[x][y+2] + something[x+1][y+1] + something[x+2][y] + something[x+2][y+2];
            x++;
            if(tempValue3 > tempValue4){
                    tempValue4 = tempValue3;
            }
        }
        y = 2;
        x = 0;
        for(int j = 0; j < 3; j++){
            tempValue5 = something[x][y] + something[x][y+2] + something[x+1][y+1] + something[x+2][y] + something[x+2][y+2];
            x++;
            if(tempValue5 > tempValue6){
                    tempValue6 = tempValue5;
            }
        }
        if(tempValue2 > tempValue4 && tempValue2 > tempValue6){
            System.out.println(tempValue2);
        }
        if(tempValue4 > tempValue2 && tempValue4 > tempValue6){
            System.out.println(tempValue4);
        }
        if(tempValue6 > tempValue4 && tempValue6 > tempValue2){
            System.out.println(tempValue6);
        }
    }
}
