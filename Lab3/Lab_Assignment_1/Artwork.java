// Muhammad Eman
// Sp24-Bse-071
// section: BSE B



public class Artwork{
		private String title;
		private int publishedYear;
		private Artist artist;

//constructor 1
	Artwork(String title , int publishedYear , Artist artist){
		this.title = title;
		this.publishedYear = publishedYear;
		this.artist = artist;
	}

//constructor 2
	Artwork(String title , int publishedYear){
		this.title  = title;
		this.publishedYear = publishedYear;

		//artist.setName("Unknown Artist");
	}	
	
	Artwork(){
		title = "Unknown";
		publishedYear = 0000;
}
	



	Artwork(Artwork a){
		this.getTitle = a.getTitle;
		this.getYear = a.getYear;
	}


//settter and gettters
	public void setTitle(String title){
		this.title = title;
	}



	public void setYear(int publishedYear){

		this.publishedYear = publishedYear;
	}

	public void setArtist(Artist artist){

		this.artist = artist;
	}



	public String getTitle(){
		return title;
	}


	public int getYear(){
		return publishedYear;
	}


	public Artist getArtist(){
		return artist;
	}


	public void displayWithArtist(){

		System.out.println("---------------------------");
		System.out.println("ArtWork Title : "+title);
		System.out.println("Year Published : "+publishedYear);
		System.out.println("Artist Name : "+artist.getName());


	}

	public void display(){
System.out.println("---------------------------");
		System.out.println("ArtWork Title : "+title);
		System.out.println("Year Published : "+publishedYear);


	}

	
}