import java.util.*;

class Solution {
    public String finalString(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        boolean reversed = false;

        for (char ch : s.toCharArray()) {
            if (ch == 'i') {
                reversed = !reversed; // flip the direction
            } else {
                if (!reversed) {
                    deque.addLast(ch); // normal order
                } else {
                    deque.addFirst(ch); // reversed order
                }
            }
        }

        // Build result from deque
        StringBuilder sb = new StringBuilder();
        if (!reversed) {
            while (!deque.isEmpty()) {
                sb.append(deque.removeFirst());
            }
        } else {
            while (!deque.isEmpty()) {
                sb.append(deque.removeLast());
            }
        }

        return sb.toString();
    }
}
