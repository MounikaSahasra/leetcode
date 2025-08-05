class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] chars = s.toCharArray();

        while (start < end) {
            while ( start < end && !isVowel(chars[start]))
            start ++;
            while ( start < end && !isVowel(chars[end]))
            end --;

            char temp = chars[start];
            chars[start] = chars [end];
            chars[end] = temp;

            start ++;
            end --;
        }
        return new String(chars);


    }
    private boolean isVowel ( char ch ) {
            return "aeiouAEIOU".indexOf(ch) != -1 ;
        }
}