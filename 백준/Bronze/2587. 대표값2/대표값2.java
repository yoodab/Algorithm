import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int sum = 0;
        int tmp = 0;
        
        for(int i = 0 ; i<5;i++){
            nums[i]=sc.nextInt();
            sum+=nums[i];
        }
        // 삽입 정렬
        for(int i=0; i<5; i++){
            for(int j=i;j>0;j--){
                if(nums[j]<nums[j-1]){
                	tmp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=tmp;                   
                }
            }
        }
       
        System.out.println(sum/5);
        System.out.println(nums[2]);
    }

}