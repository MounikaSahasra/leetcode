class Solution {
    public String truncateSentence(String s, int k) {
       
        // StringBuilder result = new StringBuilder ();

        // for (int i =0; i< k; i++) {
        //     result.append(words[i]);
        //     if (i < k - 1) result.append(" ");
        // }

        // return result.toString();

        int count = 0;
        for (int i =0; i<s.length(); i++) {
            if (s.charAt(i)== ' ') 
            count ++;
            if (count == k) 
            return s.substring(0,i);
        }
        return s;
    }
}