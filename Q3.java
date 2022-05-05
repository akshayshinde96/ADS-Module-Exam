class Stack{
	
	int arr[];
	int size;
	int top1; //stack1 top
	int top2; //stack2 top
	
	
	//constructor
	Stack(int n){
		size=n;
		arr= new int[n];
		top1 = n/2+1;
		top2 =n/2;
	}
	
	//stack1 push
	void push1(int x){
		
		if(top1>0){
			top1--;
			arr[top1]=x;
		}
		else
		{
			System.out.println("Overflow");
			return;
		}
	}
	//stack2 push
	void push2(int x){
		if(top2<size-1){
			top2++;
			arr[top2]=x;
		}
		else
		{
			System.out.println("Overflow");
		}
	}
	
	
	//stack1 pop
	int pop1(){
		if(top1<=size/2){
			int x=arr[top1];
			top1++;
			return x;
		}
		else
		{
			System.out.println("Underflow");
		}
		return 0;
	}
	//stack2 pop
	int pop2(){
		if(top2>=size/2+1){
			int x=arr[top2];
			top2--;
			return x;
		}
		else{
			System.out.println("Underflow");
		}
		return 1;
	}
}

class Q3{
	public static void main(String args[]){
		
		Stack s = new Stack(10);
		s.push1(5);
		s.push2(10);
		s.push2(15);
		s.push1(11);
		s.push2(7);
		s.push2(40);
		
		System.out.println("Popped element from stack1 is "+s.pop1());
		System.out.println("Popped element from stack2 is "+s.pop2());
	}
}