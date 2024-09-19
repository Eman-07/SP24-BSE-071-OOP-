// Muhammad Eman
// Sp24-Bse-071
// section: BSE B


public class Artist{
		private String name;
		
//constructors
	Artist(){
		name = "noname"	;
	}

	Artist(String name){
		this.name = name;
	}

//getters and setters

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void display(){
		System.out.println("Artist Name : "+name);
	}
}