class Solution {
    public String reverseOnlyLetters(String s) {
        int i = 0;
        int j = s.length()-1;
        char [] si = s.toCharArray();

        while(i<j) {
            if (!Character.isLetter(si[i])) {
                i++;
            }
            else if (!Character.isLetter(si[j])) {
                j--;
            }
            else {
                char temp = si[i];
                si[i] = si[j];
                si[j] = temp;
                i++;
                j--;
            }
        }
        return new String(si);
    }   
}