import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int val =1;
        for(int i=1; i<=n/2+1; i++){
            
            for(int j=1; j<=n/2+1-i;j++){
                System.out.print("\t");
            }
            int cval =i;
            
            for(int j=1; j<=2*i-1; j++){
                
                System.out.print(cval+"\t");
                
                if(j<= (2*i-1)/2){
                   cval++; 
                }else{
                    cval--;
                }
            }
            System.out.println();
             
            val++;
        }
        for(int i=n/2; i>=1; i--){
            
            for(int j=1; j<=n/2+1-i;j++){
                System.out.print("\t");
            }
            int cval =i;
            
            for(int j=1; j<=2*i-1; j++){
                
                System.out.print(cval+"\t");
                
                if(j<= (2*i-1)/2){
                   cval++; 
                }else{
                    cval--;
                }
            }
            System.out.println();
             
            val++;
        }

    }
}
