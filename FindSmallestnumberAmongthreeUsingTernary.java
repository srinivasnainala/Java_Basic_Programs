package basicPrograms1;

public class FindSmallestnumberAmongthreeUsingTernary {
public static void main(String[] args) {
	int a=10,b=90,c=145;
	String result=(a<b && a<c)?"a is Smallest number":
		          (b<a &&b<c)?"b is smallest number":
		        	"c is smallest number";
	System.out.println(result);
}
}
