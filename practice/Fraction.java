// Fraction class
import java.util.*;
class Fraction {

	/************** Data members **********************/
	private int numer;
	private int denom;

	/************** Constructors **********************/
	public Fraction(){
		this(1,1);
	}

	public Fraction(int numer,int denom){
		this.numer = numer;
		this.denom = denom;
	}

	/**************** Accessors ***********************/
	public int getNumer() {return numer;}
	public int getDenom() {return denom;}

	/**************** Mutators ************************/
	public void setNumer(int newNumer){
		numer = newNumer;
	}
	public void setDenom(int newDenom){
		denom = newDenom;
	}

	/***************** Other methods ******************/

	public Fraction simplify(int numer,int denom){
		int value = gcd(numer,denom);
		return new Fraction(numer/value,denom/value);
	}
	public Fraction add(Fraction f){
		int totalDenom = this.getDenom() * f.getDenom();
		return simplify((this.getNumer() * f.getDenom()) + (f.getNumer() * this.getDenom()),totalDenom);
	}

	private int gcd(int a,int b){
		if(b==0){return a;}
		return gcd(b,a%b);
	}

	@Override
	public String toString(){
		return getNumer() + "/" + getDenom();
	}

	@Override

	public boolean equals(Object obj) {
		if(obj instanceof Fraction){
			Fraction newFraction = simplify(this.getNumer(),this.getDenom());
			Fraction fraction = (Fraction) obj;
			fraction = simplify(fraction.getNumer(),fraction.getDenom());
			return newFraction.getDenom() == fraction.getDenom() && newFraction.getNumer() == fraction.getNumer();
		}else{
			return false;
		}
	}
}

