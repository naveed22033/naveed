package Day4DSA;

public class PartitionArrayTwoSubArray {
	

	public static int findSplitPoint(int []arr,int n){
		int leftSum=0;
		for(int i=0;i<arr.length;i++){
			leftSum+=arr[i];
			int rightSum=0;
			for(int j=i+1;j<n;j++)
				rightSum+=arr[j];
				if(leftSum==rightSum)
					return i+1;
				}
				return -1;
		
}
	public static void findSubArray(int []arr,int n){
		int splitPoint=findSplitPoint(arr,n);
		if(splitPoint==-1||splitPoint==n){
			System.out.println("not possible");
		return;
		}
		for(int i=0;i<n;i++){
			if(splitPoint==i)
			System.out.println();
				
			System.out.print(arr[i]+" ");
			
		
		}
	}
		

	public static void main(String[] args) {
		
		int []array={6, -4, -3, 2, 3};
		int n=array.length;
		findSubArray(array,n);

	}

}
