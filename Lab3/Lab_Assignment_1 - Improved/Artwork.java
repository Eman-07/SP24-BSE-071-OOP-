// Muhammad Eman
// Sp24-Bse-071
// section: BSE B



public class Artwork{
		private String title;
		private int publishedYear;
		private Artist artist;


            //constructors


        Artwork(){
            this.title = "Unknown";
            this.publishedYear = 0000;
            this.artist = new Artist("Unknown Artist");
        }

        Artwork(String title, int publishedYear){
                this.title = title;
                this.publishedYear = publishedYear;
                this.artist = new Artist("Unknown Artist");
        }

        Artwork(String title, int publishedYear, Artist artist){
            this.title = title;
            this.publishedYear = publishedYear;
            this.artist = artist;
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


	// public void displayWithArtist(){

	// 	System.out.println("---------------------------");
	// 	System.out.println("ArtWork Title : "+title);
	// 	System.out.println("Year Published : "+publishedYear);
	// 	System.out.println("Artist Name : "+artist.getName());
    
    
	// }
    
    
    
    //METHODS 
	public void display(){
		System.out.println("ArtWork Title : "+title);
		System.out.println("Year Published : "+publishedYear);
        System.out.println("Artist Name : "+artist.getName());
        System.out.println("---------------------------");
        

	}


    public Artwork shallowCopy(Artwork ap){

            Artwork a = new Artwork(ap.getTitle(),ap.getYear(),ap.getArtist());

            return a;
    }


	public Artwork deepCopy(Artwork ap){

		Artwork a = new Artwork(ap.getTitle(),ap.getYear(),new Artist(ap.getArtist().getName()));

		return a;
}

	
}