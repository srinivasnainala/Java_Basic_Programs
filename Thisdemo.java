package basicPrograms1;

public class Thisdemo {
	int i=20,j=10,n;
	Thisdemo(int k,int l)
  {
	  this.i=k;
	  this.j=l;
	  System.out.println("adding two numbers : " +(i+j));
  }
	Thisdemo()
	{
		System.out.println("Number is :"+(i));
	}
public static void main(String[] args) {
	Thisdemo t=new Thisdemo(45,45);
	Thisdemo t1=new Thisdemo();
}
}
