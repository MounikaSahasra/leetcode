class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> us = new Stack <>();
        char [] me = s.toCharArray();

        for (int i = 0; i< me.length; i++) {
            if (us.empty()) {
                us.push(me[i]);
            }
            else {
            char top = us.peek();
            if (me[i] != top) {
                us.push(me[i]);
            }
            else {
            
            if(me[i] == top) {
                us.pop();
            }
            }
        }
        }
        StringBuilder sb = new StringBuilder ();
        for (char p : us) {
            sb.append(p);
        }
        return sb.toString();
    }
}