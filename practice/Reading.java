// Kaung Htet Aung
// A0117993R
// C01
// This program reads data in different formats and performs
// the respective operations.

import java.util.*;
public class Reading {
	private static final String LIMIT = "LIMIT",SENTINEL = "SENTINEL",EOF = "EOF",
			ADD = "ADD", SUB = "SUB", MUL = "MUL";

	//Return the output according to the op instruction
	private static int operate(String op,int operand1,int operand2){
		switch(op){
			case ADD:
				return operand1 + operand2;
			case SUB:
				return operand1 - operand2;
			case MUL:
				return operand1 * operand2;
		}
		throw new AssertionError("Unknown op: "+op);
	}

	public static void main(String[] args) {
		String op;
		List<Integer> results = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		op = sc.nextLine();
		switch(op){
			case LIMIT:
				int numberOP = sc.nextInt();
				sc.nextLine();
				for(int i=0;i<numberOP;i++){
					String instruction = sc.nextLine();	
					String[] operation = instruction.split("\\s+");
					results.add(operate(operation[0],Integer.parseInt(operation[1]),Integer.parseInt(operation[2])));
				}
				break;
			case SENTINEL:
				String instruction = sc.nextLine();	
				while(!instruction.equals("-1")){
					String[] operation = instruction.split("\\s+");
					results.add(operate(operation[0],Integer.parseInt(operation[1]),Integer.parseInt(operation[2])));
					instruction = sc.nextLine();
				}
				break;
			case EOF:
				String instruction1 = sc.nextLine();
				while(sc.hasNextLine()){
					String[] operation = instruction1.split("\\s+");
					results.add(operate(operation[0],Integer.parseInt(operation[1]),Integer.parseInt(operation[2])));
					instruction1 = sc.nextLine();
				}
				String[] operation = instruction1.split("\\s+");
				results.add(operate(operation[0],Integer.parseInt(operation[1]),Integer.parseInt(operation[2])));
				break;
		}
		for(int value:results){
			System.out.println(value);
		}
	}
}
