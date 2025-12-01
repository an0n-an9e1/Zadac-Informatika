package z10;

class Z10_Student {
int id;
String ime;
Z10_Student(int i,String n){

	id = i;
	ime= n;
	
}
void display() {System.out.println(id + " " +ime);}
public static void main(String args[]) {
	Z10_Student s1 = new Z10_Student(111, "Petar");
	Z10_Student s2 = new Z10_Student(222, "Marko");
	s1.display();
	s2.display();
}
}
