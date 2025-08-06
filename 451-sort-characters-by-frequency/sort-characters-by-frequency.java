class Solution {
    public String frequencySort(String s) {
        Map <Character, Integer> map = new HashMap<>();
        for (char p : s.toCharArray()) {
            map.put (p, map.getOrDefault(p, 0)+1);
        }
        PriorityQueue <Character> pm = new PriorityQueue <> ( 
            (a, b) -> map.get(b) - map.get(a));

        pm.addAll(map.keySet());

        StringBuilder sb = new StringBuilder ();
        while (!pm.isEmpty()) {
            char m = pm.poll();
            int us = map.get(m);

            for (int i = 0; i<us; i++) {
               sb.append(m);
            }
        }
        return sb.toString();
    }
}