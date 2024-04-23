//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends




class GfG {
    int convertfive(int num) {
        int l=Integer.toString(num).length();
        int dd=num;
        int k=num;
        for(int i=0;i<l;i++){
            int d=dd%10;
            if(d==0){
                k+=5*Math.pow(10,i);
            }
            dd/=10;
            
        }
        return k;
    }
}