class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int ncount = 0;
        int m = flowerbed.length;
            
        if (m==1 && flowerbed[0] == 0) {
            return true;
        }

         if(m > 1 && flowerbed[0] == 0 && (flowerbed[1] ==0) ) {
            ncount++;
            flowerbed[0] = 1;
         }
        
        
         if (m > 2 &&(flowerbed[m-1] == 0 )&& (flowerbed[m-2] ==0)) {
            ncount++;
            flowerbed[m-1] = 1;
         }

        for (int i=0; i+1 < flowerbed.length; i++) {
          
            if ( flowerbed[i] == 0 && flowerbed[i+1] ==0 && flowerbed[i-1] ==0 ) {
                ncount++;
                flowerbed[i] = 1;    
            }

        }
        return (ncount>=n);
    }
}