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
        
        int[][] something;
        something = new int [rows][columns];
        
        for(int i = 0; i < rows; i++){
            for(int u = 0; u < columns; u++){
                something[i][u] = inp.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(something));
    }
    
}
