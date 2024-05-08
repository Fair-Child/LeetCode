class Solution {
    public int myAtoi(String s) {
        int sign = 1, index = 0, result = 0, length = s.length();
		
		//move index to the first non-empty space position
		while (index < length && s.charAt(index) == ' ') index++;
		//check the sign of integer
		if (index < length && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
			sign = s.charAt(index) == '+'? 1:-1;
			index++;
		}
		
		while (index < length && s.charAt(index)>= '0' && s.charAt(index) <= '9') {
			int temp = s.charAt(index++) - '0';
			if (result > ((Integer.MAX_VALUE - temp) / 10) ) {
				return sign == 1? Integer.MAX_VALUE:Integer.MIN_VALUE;
			} else {
				result = result * 10 + temp;
			}
		}
		return sign * result;	
    }
}