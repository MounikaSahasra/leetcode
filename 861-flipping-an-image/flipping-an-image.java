public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

       for (int [] row : image) {
        int left = 0;
        int right = n-1;

        while (right >= left) {
            int temp = row[left] ^1;
            row[left] = row [right] ^1;
            row[right] = temp;

            left ++;
            right --;
        }
       }

        return image;
    }
}
