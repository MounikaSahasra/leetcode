class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> us = new Stack<>();
        Stack<Character> me = new Stack<>();
        
        for(int i =0; i<s.length() ; i++) {
            if(Character.isLetter(s.charAt(i))){
                us.push(s.charAt(i));
            }else if (! us.isEmpty()) {
                us.pop();
            }
        }

        for(int i =0; i<t.length() ; i++) {
            if(Character.isLetter(t.charAt(i))){
                me.push(t.charAt(i));
            }else if (! me.isEmpty()) {
                me.pop();
            }

        }
        
        return us.equals(me);
    }
}