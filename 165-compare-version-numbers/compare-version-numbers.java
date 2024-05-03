class Solution {
    public int compareVersion(String version1, String version2) {
        // if(version1.length()==version2.length()){
        //     int a=Integer.parseInt(version1);
        //     int b=Integer.parseInt(version2);

        //     if(a<b){
        //         return -1;
        //     }
        //     else if(a>b){
        //         return 1;
        //     }
        //     else{
        //         return 0;
        //     }

        // }
       
        String s1[]=version1.split("[.]");
        String s2[]=version2.split("[.]");
        // if(s1.length==1 && s2.length!=1){
        //     s1[0]="0";
        // }
        // else if(s2.length==1 && s1.length!=1){
        //     s2[0]="0";
        // }

        // int ans=0,v1=0,v2=0;
        // while(v1< s1.length && v2<s2.length){

        //     int a=Integer.parseInt(s1[v1]);
        //     int b=Integer.parseInt(s2[v2]);
        //     if(a<b){
        //         return -1;
        //     }
        //     else if(a>b){
        //         return 1;
        //     }
            
        //     v1++;
        //     v2++;
        // }
        // return 0;

        int maxLen=Math.max(s1.length,s2.length);
        for(int i=0;i<maxLen;i++){
            int v1=(i<s1.length)?Integer.parseInt(s1[i]):0;
            int v2=(i<s2.length)?Integer.parseInt(s2[i]):0;

            if(v1<v2){
                return -1;
            }
            else if(v1>v2){
                return 1;
            }
        }
        return 0;
    }
}