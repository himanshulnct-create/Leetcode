class Solution {
    public String reverseWords(String s) {
      int left = 0,
          right = s.length()-1;

     while (left<s.length()){
        if(s.charAt(left)== ' '){
            left++;
        }else{
            break;
        }
     } 
     while (right>=0){
        if(s.charAt(right)== ' '){
            right--;
        }else{
            break;
        }
     }

     StringBuilder sB = new StringBuilder();

     while(left<=right){
        if(s.charAt(left)!= ' '){
            sB.append(s.charAt(left));
            left++;
        }else if(s.charAt(left)==' '){
            if(sB.charAt(sB.length()-1)!= ' '){
                sB.append(' ');
                left++;
            }else{
                left++;
            }
        }
     }
     int i = 0; 
     int j = sB.length() -1;

     while(i<j){
        char temp = sB.charAt(i);
        sB.setCharAt(i, sB.charAt(j));
        sB.setCharAt(j,temp);
        i++;
        j--;
     }
     int start = 0;
     int end =0;

     while(start<sB.length()){
        while(end<sB.length() && sB.charAt(end)!= ' '){
            end++;
        }

        int p1 = start,
            p2 = end - 1;
        
        while(p1<p2){
        char temp = sB.charAt(p1);
        sB.setCharAt(p1, sB.charAt(p2));
        sB.setCharAt(p2,temp);
        p1++;
        p2--;
        }
        start = end + 1;
        end = start;

     }
     return sB.toString(); 
    }
}