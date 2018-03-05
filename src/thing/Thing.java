
package thing;

/**
 *
 * @author 18275
 */
import java.util.Scanner;
public class Thing {

    /**
     * @param args the command line arguments
     */
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        
        
        
        
        
        
    }
    public static void swapLobster(){
        System.out.println("How many lobsters do you want?");
        int lobster = in.nextInt();
        for(int i = 0; i < lobster; i++){
            System.out.println("What is the size of the array?");
            int n = in.nextInt();
            System.out.println("What is the size of the lobster?");
            int k = in.nextInt();
            int[] array = new int[n];
            System.out.println("What are the values of the array?");
            for (int x = 0; x < n; x++){
                array[x] = in.nextInt();
            }
            if(k == 1){
                System.out.println("Lobster #" + (i + 1) + ": Sortable");
            }else if (n%k == 0){
                System.out.println("Lobster #" + (i + 1) + ": Unsortable");
            }else{
                System.out.println("Lobster #" + (i + 1) + ": Sortable");
            }
            
        }
    }
    public static void rockPaperScissors(){
        boolean gabe = false;
        boolean andrew = false;
        String gabeTurn = " ";
        String andrewTurn = " ";
        System.out.println("How many games?");
        int n = in.nextInt();
        for (int i = 0; i < n; i++){
        System.out.println("How many matches?");
        int m = in.nextInt();
        for (int x = 0; x < m; x++){
            gabeTurn = in.next().toUpperCase();
            andrewTurn = in.next().toUpperCase();
            if(gabeTurn.equals("R") && andrewTurn.equals("P")){
                andrew = true;
                
            }
        }
        }
    }
    public static void yertleTheTurtle(){
        
    }
}
