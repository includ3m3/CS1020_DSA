import java.util.*;

class Digit {

	// Data attributes
	private int digit;
	private Digit next;

	// Constructors
	// This default constructor has an empty body
	public Digit() {
	}

	public Digit(int digit, Digit next) {
		this.digit = digit;
		this.next = next;
	}

	// Accessors
	public int getDigit() {
		return digit;
	}

	public Digit getNext() {
		return next;
	}

	public void setDigit(int digit) {
		this.digit = digit;
	}

	public void setNext(Digit next) {
		this.next = next;
	}
}

// Added the tail attribute and updated the methods accordingly
// Added a recursive version of sum
class BigNumber {
	private Digit head = null;
	private Digit tail = null;
	private int length = 0;

	// Constructors
	// This default constructor has an empty body
	public BigNumber() {

	}

	// Build a linked list of digits
	public BigNumber(String number) {
		for(int i=0;i<number.length();i++){
			add(Character.getNumericValue(number.charAt(i)));
			//System.out.println(number.charAt(i));
		}
	}

	public Digit getHead() {
		return head;
	}

	public int getLength() {
		return length;
	}

	// Append a digit to the linked list
	public void add(int digit) {
		Digit temp = new Digit(digit,null);
		if(head == null){
			head = temp;
		}else{
			temp.setNext(head);
			head = temp;
		}
		length++;
		if(length == 1){
			tail = temp;
		}
	}
	public void remove(){
		head = head.getNext();
		length--;
		if(head == null){
			tail = null;
		}
	}
	public void addFirst(int digit){
		head = new Digit(digit,head);
		length++;
		if(length == 1){
			tail = head;
		}
	}
	public void addLast(int digit){
		if(tail == null){
			tail = new Digit(digit,null);
			head = tail;
		}else{
			tail.setNext(new Digit(digit,null));
			tail = tail.getNext();
		}
		length++;
	}

	public Digit getTail() {
		return tail;
	}


	// Sum two big numbers recursively and return its sum
	public static String sum_recursive(BigNumber n1, BigNumber n2) {
		BigNumber temp = sum_recursive_helper(n1.getHead(),n2.getHead(),0);
		while(temp.getLength() > 1 && temp.getHead().getDigit() == 0){
			temp.remove();	
		}
		return temp.toString();
	}
	public static BigNumber sum_recursive_helper(Digit d1,Digit d2,int carry){
		int sum,tempD1,tempD2,real_no;
		Digit d1Next,d2Next;
		BigNumber temp = new BigNumber();
		if(d1 == null && d2 == null){
			if(carry == 1){
				temp.add(carry);
			}
		}else{
			tempD1 = (d1 == null) ? 0 : d1.getDigit();
			tempD2 = (d2 == null) ? 0 : d2.getDigit();
			sum = tempD1 + tempD2 + carry;
			// Debug
			//System.out.println("D1 : " + tempD1 + " D2 : " + tempD2 + " Carry : "+ carry + " Sum: " + sum%10);
			real_no = sum % 10;
			carry = sum / 10;
			d1Next = (d1 == null) ? null : d1.getNext();
			d2Next = (d2 == null) ? null : d2.getNext();
			temp = sum_recursive_helper(d1Next,d2Next,carry);
			temp.addLast(real_no);
		}
		return temp;
	}

	public String toString() {
		String temp = "";
		Digit curr = head;
		while(curr!=null){
			temp += curr.getDigit();
			curr = curr.getNext();
		}
		return temp;
	}
}

public class TestBigNumber {

	public static void main(String[] args) {
		// Declare a Scanner object to read input
		int lines;
		Scanner sc = new Scanner(System.in);
		List <BigNumber> numberList = new ArrayList<BigNumber>();
		// Declare the necessary variables
		lines = sc.nextInt();
		for(int i=0;i<lines;i++){
			numberList.add(new BigNumber(sc.next()));
			numberList.add(new BigNumber(sc.next()));
		}
		for(int i=0;i<numberList.size();i=i+2){
			System.out.println(BigNumber.sum_recursive(numberList.get(i),numberList.get(i+1)));
		}
	}
}
