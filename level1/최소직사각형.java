class Solution {
    public int solution(int[][] sizes) {
        int width = Integer.MIN_VALUE;
        int height = Integer.MIN_VALUE;
        
        for(int i = 0; i < sizes.length; i++) {
            int w, h;
            
            if(sizes[i][0] < sizes[i][1]) {
                w = sizes[i][1];
                h = sizes[i][0];
            } else {
                w = sizes[i][0];
                h = sizes[i][1];
            }
            
            width = width < w ? w : width;
            height = height < h ? h : height;
        }
        
        return width * height;
    }
}