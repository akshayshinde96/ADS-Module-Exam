class Q1{
	
	void insertion(int a[]){
		int n=a.length;
		for(int i=1;i<n;i++){
			
			int x=a[i];
			int y=i-1;
			
			while(y>=0 && a[y]>x){
				a[y+1]=a[y];
				y=y-1;
			}
			a[y+1]=x;
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	
	
	void display(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[]){
		
		Q1 q = new Q1();
		int arr[]={1,2,4,5,3};
		q.display(arr);
		System.out.println();
		q.insertion(arr);
		q.display(arr);
	}
}