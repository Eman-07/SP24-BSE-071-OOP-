public class Pages {
    private int numOfPages;


//constructors
	Pages(){
		numOfPages = 0;
	}
	
	Pages(int numOfPages){
		this.numOfPages = numOfPages;
	}

	Pages(Pages p){
		this.numOfPages = p.getNumOfPages();
	}


//setters and getters

	public void setNumbOfPages(int numOfPages){
			this.numOfPages = numOfPages;

		}

	public int getNumOfPages(){

		return numOfPages;	
	}
    
}
