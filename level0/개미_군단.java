class Solution {
    public int solution(int hp) {
        if(hp == 0) {
            return 0;
        } else if(hp == 1) {
            return 1;
        } else if(hp == 2) {
            return 2;
        } else if(hp == 3) {
            return 1;
        } else if(hp == 4) {
            return 2;
        } else if(hp == 5) {
            return 1;
        } else {
            int[] array = new int[hp + 1];

            array[1] = 1;
            array[2] = 2;
            array[3] = 1;
            array[4] = 2;
            array[5] = 1;
            
            for(int i = 6; i <= hp; i++) {
                array[i] = array[i - 1] + 1;
                
                if(1 <= i - 3) {
                    array[i] = array[i] < array[i - 3] + 1 ? array[i] : array[i - 3] + 1; 
                }
                
                if(1 <= i - 5)  {
                    array[i] = array[i] < array[i - 5] + 1 ? array[i] : array[i - 5] + 1;
                }
            }

            return array[hp];
        }
    }
}