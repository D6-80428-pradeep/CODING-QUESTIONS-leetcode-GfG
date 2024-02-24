class Solution {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }
}
//below concept is correct but memory limit is exceeded 
// class Solution {
//     public int bulbSwitch(int n) {

//         long [] arr=new long[n];
//         Arrays.fill(arr,0);
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j=j+i+1){
//                 if(arr[j]==0){
//                     arr[j]=1;
//                 }else{
//                     arr[j]=0;
//                 }
//             }
//         }
//        int count=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]==1){
//                 count++;
//             }
//         }
//         return count;
//     }
// }