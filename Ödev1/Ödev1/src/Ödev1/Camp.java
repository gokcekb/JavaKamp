package �dev1;

public class Camp {
	
	public Camp() {
		 // constructor blo�u, yazmasanda arka planda �al���r.
		
	}
	
	public Camp (int id, String name, String detail, String intructor,String percentTage) {
		this(); 
		this.Id = id; 
		this.name = name;
		this.detail=detail;
		this.instructor=instructor;
		this.percentTage =percentTage;
	}


	int Id ;
	String name ;
	String detail ;
	String instructor ;
	String percentTage;

}

