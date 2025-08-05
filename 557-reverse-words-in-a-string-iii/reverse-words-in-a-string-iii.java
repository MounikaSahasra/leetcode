class Solution {
    public String reverseWords(String s) {
        String [] worlds = s.split (" ");

        for (int i = 0; i< worlds.length; i++) {
            worlds[i] = reverse(worlds[i]);
        }

        return String.join(" ", worlds);

    }
    
    private String reverse (String word) {
        char [] words = word.toCharArray(); 
        int end = words.length-1;
        int start = 0;
        while (start < end) {
        char temp = words[start];
        words[start] = words[end];
        words[end] = temp;

        start ++;
        end --;
    }
    return new String(words);
}
}