package Ödev1;

public class Camp {
	
	public Camp() {
		 // constructor bloðu, yazmasanda arka planda çalýþýr.
		
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

