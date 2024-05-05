package phase3;

public class maxsubarr {
	    static int maxSubArray(int[] nums) {
	        int max=Integer.MIN_VALUE,sum=0;
	        for(int i=0;i<nums.length;i++){
	            sum+=nums[i];
	            if(sum>max){
	                max=sum;
	            }
	            if(sum<0){
	                sum=0;
	            }
	        }
	        return max;
	    }
	    public static void main(String[] args) {
			int a[]={1,2,3,4,5,6,7};
			System.out.println(maxSubArray(a));
		}
	}

