class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
       Set <Integer> seenA = new HashSet <>();
       Set <Integer> seenB = new HashSet <>();
       Set <Integer> common = new HashSet <>();
       int [] c = new int [A.length];

       for (int i = 0; i < A.length; i++) {
          seenA.add(A[i]);
          seenB.add(B[i]);

          if (seenB.contains(A[i])) {
            common.add(A[i]);
          }
          if (seenA.contains(B[i])) {
            common.add(B[i]);
          }
          c[i] = common.size();
       }
       return c;
    }
}