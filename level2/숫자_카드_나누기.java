class Solution {
    public int getGCD(int num1, int num2) {
        if(num1 == num2)
            return num1;

        int y = num1 < num2 ? num2 : num1;
        int x = num1 < num2 ? num1 : num2;
        int r = y % x;

        while(r != 0) {
            y = x;
            x = r;
            r = y % x;
        }

        return x;
    }
    
    public int solution(int[] arrayA, int[] arrayB) {
        int numA = arrayA[0];
        int numB = arrayB[0];
        int ret = 0;

        for(int i = 1; i < arrayA.length; i++) {
            numA = getGCD(numA, arrayA[i]);

            if(numA == 1) {
                break;
            }
        }

        for(int i = 1; i < arrayB.length; i++) {
            numB = getGCD(numB, arrayB[i]);

            if(numB == 1) {
                break;
            }
        }

        for(int i = 1; i < arrayB.length; i++) {
            if(numA < arrayB[i] && arrayB[i] % numA == 0) {
                numA = 1;
                break;
            }
        }
        
        for(int i = 0; i < arrayA.length; i++) {
            if(numB < arrayA[i] && arrayA[i] % numB == 0) {
                numB = 1;
                break;
            }
        }
        
        if(numA == 1) {
            if(numB == 1) {
                ret = 0;
            } else {
                ret = numB;
            }
        } else {
            if(numB == 1) {
                ret = numA;
            } else {
                ret = Math.max(numA, numB);
            }
        }

        return ret;
    }
}