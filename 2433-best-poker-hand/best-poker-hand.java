class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        boolean isFlush = true;
        for (int i =0; i < suits.length; i ++) {
            if ( suits[i] != suits[1]){
            isFlush = false;
            break;
            }
        }
        if (isFlush == true) return "Flush";

        Map <Integer, Integer> rak = new HashMap <> ();
        for (int rank : ranks) {
            rak.put(rank, rak.getOrDefault (rank,0)+1);
        }
        int maxfreq = 0;

        for (int count : rak.values()) {
            maxfreq = Math.max(maxfreq, count);
        }
        if (maxfreq >= 3) return "Three of a Kind";
        else if (maxfreq == 2) return "Pair";
        else {
            return "High Card";
        }
    }
}