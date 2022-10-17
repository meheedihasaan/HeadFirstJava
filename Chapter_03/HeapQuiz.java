/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_03;

/**
 *
 * @author Acer
 */
public class HeapQuiz {
    
    int id = 0;

    public static void main(String[] args) {
        int x = 0;

        //Create HeapQuiz array
        HeapQuiz[] heapQuiz = new HeapQuiz[5];

        while (x < 3){
            heapQuiz[x] = new HeapQuiz();
            heapQuiz[x].id = x;
            x += 1;
        }

        //Memory Management
        heapQuiz[3] = heapQuiz[1];
        heapQuiz[4] = heapQuiz[1];
        heapQuiz[3] = null;
        heapQuiz[4] = heapQuiz[0];
        heapQuiz[0] = heapQuiz[3];
        heapQuiz[3] = heapQuiz[2];
        heapQuiz[2] = heapQuiz[0];


        try {
            System.out.println(heapQuiz[4].id);
            System.out.println(heapQuiz[3].id);
            System.out.println(heapQuiz[1].id);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
   }
}
