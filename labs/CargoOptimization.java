// CS1020 (AY2013/4 Semester 2)
// Take-home lab #4
// Name: Kaung Htet Aung
// Matric. No.: A0117993R
// Lab group: C01
// This program reads in the sequence of characters and store them into the stacks in an efficient way by just looking at 
// the top of the stack 

import java.util.*;

public class CargoOptimization {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String lineContainers = s.nextLine();
		// use an array list to represent the stacks in the terminal
		ArrayList<Stack<Container>> stacks = new ArrayList<Stack<Container>>();
		stacks.add(new Stack<Container>());
		for(int i=0;i<lineContainers.length();i++){
			Container newArrival = new Container(lineContainers.charAt(i));
			//debug
			System.out.println(newArrival.getDestination());
			int sizeArr = stacks.size();
			for(int j=0;j<sizeArr;j++){
				if(stacks.get(j).empty()){
					stacks.get(j).push(newArrival);
				}else{
					int index = findBestStack(newArrival,stacks);
					//debug
					System.out.println("Best index: " + index);
					if(index == -1){
						stacks.add(new Stack<Container>());
						stacks.get(sizeArr).push(newArrival);
					}else{
						stacks.get(index).push(newArrival);
					}
				}
			}
		}
		System.out.println(stacks.size());
	}

	// returns the index of the best stack to put the container
	public static int findBestStack(Container newArrival, ArrayList<Stack<Container>> stacks) {
		int index = 0, min = 'Z';
		for(int i=0;i<stacks.size();i++){
			int temp = newArrival.calculateFitWith(stacks.get(i));
			//debug
			System.out.println(stacks.get(i).peek().getDestination()+" - " + newArrival.getDestination() + " = " +temp);
			if(temp == 0){ //Best
				index = i;
				break;
			}
			if(temp < min && temp>0){
				min = temp;
				index = i;
			}else if(temp<0){
				index = -1;
			}
		}
		return index;
	}
}


class Container {
	private char destination;
	public Container(char destination) {
		this.destination = destination;
	}
	public char getDestination() {
		return destination;
	}

	// method should return compatibility score between this container and the target stack. 
	// they are most compatible when the container at the top of the stack has the same destination as this container
	public int calculateFitWith(Stack<Container> candidate) {
		return candidate.peek().getDestination() - this.getDestination();
	}
}
