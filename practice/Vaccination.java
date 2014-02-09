import java.util.*;

public class Vaccination {

	public static void main(String[] args) {
		String name;
		int no,age, totalAge = 0;
		boolean vaccinated;
		int numVaccinated = 0; 
		double avgAge;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of children: ");
		no = sc.nextInt();
		System.out.println("Number of children is "+no);
		sc.nextLine();
		for(int i=0;i<no;i++){
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.println("Name is \""+name+"\"");

			System.out.print("Age: ");
			age = sc.nextInt();
			System.out.println("Age is "+age);
			totalAge += age;

			System.out.print("Vaccinated for chickenpox? ");
			vaccinated = sc.nextBoolean();
			if(vaccinated){
				numVaccinated++;
				System.out.println("Vaccinated for chickenpox");
			}else{
				System.out.println("Not vaccinated for chickenpox");
			}
			sc.nextLine();
		}
		avgAge = (double)totalAge / no;
		System.out.printf("Average age is %.2f\n",avgAge);
		System.out.printf("Percentage of children vaccinated is %.2f%%\n", 100*(double)numVaccinated/no);
	}
}

