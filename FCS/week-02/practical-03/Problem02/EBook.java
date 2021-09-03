public class EBook extends Book {

	private String url;

	//No-parameter construction
	public EBook() {}

	//Constructor with parameters
	public EBook(String title, int year, String publish, int pages, String url) {
		super(title,year,publish,pages,url);
		this.url = url;
	}

	//get and set.
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
}