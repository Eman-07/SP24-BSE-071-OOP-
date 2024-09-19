// Muhammad Eman
// Sp24-Bse-071
// section: BSE B


public class Main{

		public static void main(String arguments[]){


		Artwork a1 = new Artwork(); //this will load default constructor which will assign unknown values to parameters
		a1.display();



		Artwork a2 = new Artwork("Sketch",2024);

		a2.display();


		
		Artist at1 = new Artist("Ali");


		Artwork a3 = new Artwork("Painting",2004, at1);

		a3.displayWithArtist();



//deep copy shallow copy stuff 

		Artist a4 = new Artist("Drawing" , "2019" , at1);

		

//copying a4 to a5;
		Artist a5 = new Artist(a4);
		
		
		
	}	
}