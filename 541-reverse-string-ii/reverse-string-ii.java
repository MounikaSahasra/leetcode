class Solution {
    public String reverseStr(String s, int k) {
        char [] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i+= k*2) {
            int start = i;
            int last = Math.min (i+k-1 , arr.length-1);
            reverse (arr, start, last);
        }
        return new String(arr);
    }

    private void reverse (char [] arr, int start, int last) {
        while (start < last) {
        char temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;

        start++;
        last--;

        }
    }
}