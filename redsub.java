package phase3;

public class redsub {
	    static void reduce(int n) {
	        while (n > 9) {
	            int res = 0;
	            String s1 = n + "";
	            for (int i = 0; i < s1.length() - 1; i++) {
	                int dig1 = s1.charAt(i) - '0';
	                int dig2 = s1.charAt(i + 1) - '0';
	                res = res * 10 + Math.abs(dig1 - dig2);
	                System.out.println(res+" ");
	            }
	            n = res;
	        }
	        System.out.println(n);
	    }

	    public static void main(String[] args) {
	        reduce(248);
	    }
	}

