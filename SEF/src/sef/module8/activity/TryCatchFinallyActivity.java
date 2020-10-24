package sef.module8.activity;
//Needs to be completed
//The following program, when run, results in an exception.
//1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed. 

public class TryCatchFinallyActivity {
public static void main(String[] args) {

	TryCatchFinallyActivity obj=new TryCatchFinallyActivity();
	obj.catchMeIfYouCan(); 
}
	void catchMeIfYouCan()
{
	int [] arr={0,1,2,3,4,5,6,7,8,9};
	try {	{
	for(int b=0;b<=10;b++);

{
	System.out.println(arr[b]);
}
}

	
	} 
	catch (Exception e) {
		System.out.println("This is an exception");
	
} finally {
	System.out.println("This should get printed even if there is an exception");
}
}
}



