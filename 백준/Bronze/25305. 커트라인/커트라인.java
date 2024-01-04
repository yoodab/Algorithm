import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] score = new int[N];

        
        for(int i = 0 ; i<N;i++){
        	score[i]=sc.nextInt();
        }
        
        
        // 삽입 정렬
        int tmp = 0;
        for(int i=0; i<N; i++){
            for(int j=i;j>0;j--){
                if(score[j]<score[j-1]){
                	tmp=score[j];
                	score[j]=score[j-1];
                	score[j-1]=tmp;                   
                }
            }
        }
       
        System.out.println(score[N-k]);
    }

}