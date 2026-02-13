import java.util.Scanner;
class Pro{
	int pcode;
	String pname;
	double price;

	void read(Scanner sc){
		System.out.println("Enter product code:");
		pcode = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Product Name: ");
                pname = sc.nextLine();

		System.out.println("Enter Product price:");
		price = sc.nextInt();
	}
	void display(){
		System.out.println("Product code" + pcode);
		System.out.println("Product name" + pname);
		System.out.println("Price" + price);
	}
}
public class product {
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);

		  Pro p1 = new Pro();
                  Pro p2 = new Pro();
                  Pro p3 = new Pro();

                  System.out.println("Enter details for Product 1");
                  p1.read(sc);

                  System.out.println("\nEnter details for Product 2");
                  p2.read(sc);

                  System.out.println("\nEnter details for Product 3");
                  p3.read(sc);

                  System.out.println("\nProduct with Lowest Price:");

                  if (p1.price < p2.price && p1.price < p3.price) {
                  p1.display();
                  }
                  else if (p2.price < p3.price) {
                  p2.display();
                  }
                  else {
                  p3.display();
                  }

                  sc.close();
    }
}
		
