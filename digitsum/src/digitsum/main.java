package digitsum;

public class main {

	public static void main(String[] args) {
		
		System.out.println(getEvenDigitSum(21148));
	}
	
	
		
		public static int getEvenDigitSum(int number) { 
			
		   if (number < 0) {
				return -1;
		}
	           int num=0;
	           int sum=0;
			
		  while (number > 0) {
				num= number % 10;
				if (num % 2 == 0) {
					
			    sum = sum + num;
				}
		        number /= 10;
					
		}
		 return sum;
			}

	}
			


