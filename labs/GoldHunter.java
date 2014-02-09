// CS1020 (AY2013/4 Semester 2)
// Take-home lab #2
// Name: Kaung Htet Aung
// Matric. No.: A0117993R
// Lab group: C01 
// Finding the amount of gold tons based on the surrounding number of mines
// as they are directly proportional to each other 

import java.util.*;

public class GoldHunter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyMap map = new MyMap(sc);

		for(int i=0;i<map.getNumRow();i++){
			for(int j=0;j<map.getNumCol();j++){
				if(map.getLabel(i,j) == '.'){
					showMines(map,i,j);
				}
			}
		}
		map.display();

	}
	//This method is to loop through the surrounding cells to get the number of mines 
	//and set the number of gold tons in the map 
	public static void showMines(MyMap map,int row,int col){
		int mines = 0;
		for(int i=row-1;i<row+2;i++){
			for(int j=col-1;j<col+2;j++){
				if(map.indexWithinRange(i,j)){
					if(map.getLabel(i,j) == '*'){
						mines++;
					}
				}
			}
		}
		map.setGoldVal(row,col,mines);
	}
}

