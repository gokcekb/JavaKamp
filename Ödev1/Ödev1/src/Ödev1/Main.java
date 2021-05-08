package �dev1;

public class Main {

	public static void main(String[] args) {
		Camp camp1 = new Camp();
		camp1.Id = 1;
		camp1.name = " Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA & REACT)";
		camp1.detail = "2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.";
		camp1.instructor = "Engin Demiro�";
		camp1.percentTage = "% 40";

		Camp camp2 = new Camp();
		camp2.Id = 2;
		camp2.name = " Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# & ANGULAR)";
		camp2.detail = "2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.";
		camp2.instructor = "Engin Demiro�";
		camp2.percentTage = "% 35";

		Camp camp3 = new Camp();
		camp3.Id = 3;
		camp3.name = " Programlamaya Giri� ��in Temel Kurs";
		camp3.detail = "PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.";
		camp3.instructor = "Engin Demiro�";
		camp3.percentTage = "% 95";

		Camp[] camps = { camp1, camp2, camp3 };
		for (Camp camp : camps) {
			System.out.println(camp.name);
		}

		CampManager campManager = new CampManager();
		campManager.addToMyCamp(camp1);
		campManager.addToMyCamp(camp2);
		campManager.addToMyCamp(camp3);

		PercentageOfCompletion percentTage = new PercentageOfCompletion();
		percentTage.Percenttage(camp1);
		percentTage.Percenttage(camp2);
		percentTage.Percenttage(camp3);

	}

}
