import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        
        for(int i = 0 ; i<N;i++){
            nums[i]=sc.nextInt();
        }
        // 선택 정렬
        int tmp = 0;
        for(int i=0; i<N; i++){
        	int minIndex = i;
            for(int j=i+1;j<N;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex = j;                    
                }
            }
            tmp=nums[i];
            nums[i]=nums[minIndex];
            nums[minIndex]=tmp;    
        }
        for(int i=0;i<N;i++){
            System.out.println(nums[i]);
        }
    }

}