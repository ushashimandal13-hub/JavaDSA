package Assignment6;
public class Q2 {		
		public static int power(int x, int y){        
	        return (int)Math.pow(x,y);
	    }
		public static int countDigits(int n){
	        int count=0;
	        while(n>0){	            
	            n=n/10;
	            count++;
	        }
	        //for(; n!=0 ; n=n/10, count++);
	        return count;
	    }
	    public static boolean isArmstrong(int n){
	        int sum = 0 , num = n , p = countDigits(n);
	        while(n!=0)
	        {
	        	sum = sum + power(n%10,p);
	        	n = n/ 10 ;
	        }
	        return sum==num;
	    }
	        public static void main(String[] args){
		        int count=0;
		        System.out.println("Armstrong numbers between 100 and 10000:");
		        for(int i=100; i<10000;i++){
		            if(isArmstrong(i)){
		                System.out.println(i);
		                count++;
		            }
		        }
		        System.out.println("Total Armstrong Numbers Found:"+count);
		    }  
	}
