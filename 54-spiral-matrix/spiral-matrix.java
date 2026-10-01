class Solution { 
    public List<Integer> spiralOrder(int[][] matrix) { 
        
        List<Integer> result = new ArrayList<>();
 
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0 ) 
        { 
            return result;  
        } 
         
        int row = matrix.length; 
        int column = matrix[0].length; 
        int top = 0; 
        int bottom = row - 1; 
        int left = 0; 
        int right = column - 1; 
        
        while(top <= bottom && left <= right)
        { 
            //traverse the top row 
            for(int i = left; i <= right; i++)  
            { 
                result.add(matrix[top][i]); 
            } 
            top++; 
 
            
            //traverse right column  
            for(int i = top; i <= bottom; i++) 
            { 
                result.add(matrix[i][right]); 
            } 
 
            right--; 
 
             
            // check if top<=bottom && left <= right 
            if(top <= bottom && left <= right) 
            { 
                //traverse the bottom row 
                for(int i = right; i >= left; i--) 
                { 
                    result.add(matrix[bottom][i]); 
                } 
            } 
            bottom--; 
 
            //traverse the left column  
            if(left <= right)       // ⭐ ONLY IMPORTANT CHANGE
            {
                for(int i = bottom; i >= top; i--) 
                { 
                    result.add(matrix[i][left]); 
                } 
                left++;
            }
 
        } 
        return result; 
 
    } 
}