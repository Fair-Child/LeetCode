/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        
        if(s == null || s.length()==0 || numRows <=0) {
            return ""; 
        }
        else if(numRows == 1) {         
            return s;
        }
        
        StringBuilder res = new StringBuilder();
        
        int size = 2*numRows-2;
        
        for(int i=0;i<numRows;i++){  
            for(int j=i;j<s.length();j+=size){  
                res.append(s.charAt(j));  
                if(i != 0 && i != numRows - 1){
                    int temp = j+size-2*i;
                    if(temp<s.length())
                        res.append(s.charAt(temp));
                }
            }                  
        }
        return res.toString();  
    }
}
// @lc code=end

