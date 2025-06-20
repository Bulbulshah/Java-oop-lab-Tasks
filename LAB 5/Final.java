package Task5;

public class Final {
void pi() {
	final double pi=3.14;
	System.out.println("THE VALUE OF PI IS" + pi);
	
	double pi=9.8; //error because of final keyword we dont override
	System.out.println("THE VALUE OF PI IS" + pi);
			
}
}
