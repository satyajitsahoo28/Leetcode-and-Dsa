class Solution {
    public int minOperations(int n) {
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=(2*i)+1;
            sum+=arr[i];
        }

        int equNum=sum/6;
        int operation=0;
        int si=0;
        int ei=arr.length-1;
        while(si<=ei){
            while(arr[si]<n && arr[ei]>n){
                arr[si]+=1;
                arr[ei]-=1;
                operation++;
            }
            si++;
            ei--;
        }
        return operation;
        
    }
}