package v8_this;

public class AS {
int a;
int b;
int c;
AS(int a, int b, int c){
	this.a= a;
	this.b=b;
	this.c=c;
 }

void calculateAS() {
	System.out.println((a+b+c)/ 3);
	
}
public static void main(String args[]) {
	AS firstN = new AS (3, 5, 7);
	AS secondN= new AS (13, 25, 29);
	
	firstN.calculateAS();
	secondN.calculateAS();
}

}
