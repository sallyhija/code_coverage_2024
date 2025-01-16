package code_coverage_4.code_coverage_4;


/**
 * Hello world!
 *
 */

enum Triangle_Types {
	  equilateral,
	  isosceles,
	  Scalene,
	  Nottriangle,
    ERROR
    
	} 

class TriangleClassifier {
	
	private static Triangle_Types triangle;
	
	public static String classifyTriangle(int a, int b, int c) {
		
		Triangle_Types triangle = null;
		
		if(c<a+b) {
			if(b<a+c) {
				if(a<b+c) {
					if(a==b) {
						if(b==c) {
							triangle=Triangle_Types.equilateral;
							}
						else {triangle=Triangle_Types.isosceles;}
						}
					else if (a==c) {triangle=Triangle_Types.isosceles;}
					else if (b==c) {triangle=Triangle_Types.isosceles;}



					else {
						triangle=Triangle_Types.Scalene;
					}
				}
				else {
					triangle=Triangle_Types.Nottriangle;
				}
			}
			else {
				triangle=Triangle_Types.Nottriangle;
				}
			}
		else {	
			triangle=Triangle_Types.Nottriangle;
		}
		return triangle.toString();
	}
		
			
/*	        
	        if (isEquilateral(a, b, c)) {
	        	triangle= Triangle_Types.equilateral;
	        }else if(isIsosceles(a, b, c)) {
	        	triangle= Triangle_Types.isosceles;
	        }else if(isTriangle(a, b, c)){
	        	triangle= Triangle_Types.Scalene;
	        }else {
	        	triangle=Triangle_Types.Nottriangle;
	        }

		
	       
	    }
	

	    private static boolean isTriangle(int a, int b, int c) {
	        return (a + b > c) && (a + c > b) && (b + c > a);
	    }

	    private static boolean isEquilateral(int a, int b, int c) {
	        return (a + b > c) || (b + c > a) && (a + c > b) && (a == b) && (b == c);
	    }    
	    	


	    private static boolean isIsosceles(int a, int b, int c ) {
	    	return (a + b > c) && (a + c > b) && (b + c > a) && (a == b) || (b == c) || (c == a);
	    }
	   
	    
	    public static Triangle_Types get_type() {
	    	return triangle;
	    }
*/
}
