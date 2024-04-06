class Solution {
    public String solution(String polynomial) {
          String answer = "";
	        
	        String[] splitString = polynomial.split("\\s*\\+\\s*");
	        
	        int countX = 0;
	        int countY = 0;
	        
	        for(int i = 0; i<splitString.length; i++) {
	        	if(splitString[i].contains("x")) {
	        		String[] str = splitString[i].split("x");
	        		if(str.length == 0) {
	        			countX += 10;
	        		} else {
	        			for(int j = 0; j<str.length; j++) {
	        				countX += Integer.parseInt(str[0]) * 10;
	        			}
	        		}
	        		
	        	} else {
	        		countY += Integer.parseInt(splitString[i]);
	        	}
	        }
	        
	        int x = countX / 10;
	        int y = countY;
	        
	        if( x!=0 && y == 0) {
                if(x == 1) {
                    answer = "x";
                } else {
                    answer = x+"x";
                }
	        } else if( x == 0 && y !=0 ) {
	        	answer = ""+y;
	        } else if ( x!=0 && y !=0) {
                if(x == 1){
                    answer = "x + " + y;
                } else {
                    answer = x+"x + " + y;
                }
	        } else if ( x == 0 && y == 0) {
	        	answer = "";
	        }
	        return answer;
    }
}