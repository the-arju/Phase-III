package phase3;

public class oddindexsum {
	public static void main(String[] args) {
        int sum=0;
        int a[]={1,2,3,4,5,6,9,10};
        for(int i=0;i<a.length;i++){
            if(i%2!=0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
