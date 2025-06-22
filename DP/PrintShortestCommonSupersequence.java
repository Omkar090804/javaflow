class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();

        int t[][]=new int[n+1][m+1];
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
            if(str1.charAt(i - 1) == str2.charAt(j - 1)){
                t[i][j]= 1 + t[i-1][j-1];
            }
            else{
                t[i][j] = Math.max(t[i][j-1],t[i-1][j]);
            }
            }
        }
        int i=n;
        int j=m;
        StringBuilder scs = new StringBuilder();
        while(i>0 && j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
               scs.append(str1.charAt(i-1));
               i--;
               j--;
            }
            else if(t[i-1][j]> t[i][j-1]){
                scs.append(str1.charAt(i-1));
                i--;
            }
            else{
                  scs.append(str2.charAt(j-1));
                  j--;
            }
        }
       while(i>0){
        scs.append(str1.charAt(i-1));
        i--;
       }
       while(j>0){
        scs.append(str2.charAt(j-1));
                  j--;
       }
       return scs.reverse().toString();
    }
}
