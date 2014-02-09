// CentredBall class:
//   Class attribute: quantity - number of balls created
//   Instance attributes: colour, radius, centre
import java.awt.*;

class CentredBall {

	/************** Data members **********************/
	private static int quantity = 0; 

	private String colour;
	private double radius;
	private Point  centre;

	/************** Constructors **********************/
	public CentredBall(){
		this("yellow",10.0,0,0);
	}
	public CentredBall(String colour,double radius,Point centre){
		this(colour,radius,centre.x,centre.y);
	}
	public CentredBall(String colour,double radius, int xCoord, int yCoord){
		this.centre = new Point();
		this.centre.setLocation(xCoord,yCoord);
		this.colour = colour;
		this.radius = radius;
	}
	/**************** Accessors ***********************/
	public String getColour(){ return colour; }
	public double getRadius(){ return radius; }
	public Point getCentre(){ return centre; }

	/**************** Mutators ************************/
	public void setColour(String newColour){
		colour = newColour;
	}

	public void setRadius(double newRadius){
		radius = newRadius;
	}

	public void setCentre(Point newCentre){
		centre = newCentre;
	}

	/***************** Overriding methods ******************/
	// Overriding toString() method
	public String toString() {
		return "[colour="+getColour()+", radius="+ getRadius() +", centre=(" + getCentre().x +","+getCentre().y+")]";
	}

	// Overriding equals() method
	public boolean equals(Object obj) {
		if(obj instanceof CentredBall){
			CentredBall ball = (CentredBall) obj;
			return this.getColour().equals(ball.getColour()) && this.getRadius() == ball.getRadius() && this.getCentre().x == ball.getCentre().x && this.getCentre().y == ball.getCentre().y;
		}else{
			return false;
		}
	}
}

