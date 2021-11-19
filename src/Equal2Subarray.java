public class Equal2Subarray {

    public static void main(String [] args){

        int array[]=new int []{1,5,1};
        int prefixSum[]=new int[array.length];
prefixSum[0]=array[0];
        for(int i=1;i< array.length;i++)
        {
            prefixSum[i]=prefixSum[i-1]+array[i];
        }

        for(int i=1;i< array.length;i++){
            if(prefixSum[i-1]==prefixSum[array.length-1]-prefixSum[i]){
                System.out.println(array[i]+"   i "+"     ");
            }
        }









    }


}
