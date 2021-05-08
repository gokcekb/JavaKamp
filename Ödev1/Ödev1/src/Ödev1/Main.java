package Ödev1;

public class Main {

	public static void main(String[] args) {
		Camp camp1 = new Camp();
		camp1.Id = 1;
		camp1.name = " Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA & REACT)";
		camp1.detail = "2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.";
		camp1.instructor = "Engin Demiroð";
		camp1.percentTage = "% 40";

		Camp camp2 = new Camp();
		camp2.Id = 2;
		camp2.name = " Yazýlým Geliþtirici Yetiþtirme Kampý (C# & ANGULAR)";
		camp2.detail = "2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.";
		camp2.instructor = "Engin Demiroð";
		camp2.percentTage = "% 35";

		Camp camp3 = new Camp();
		camp3.Id = 3;
		camp3.name = " Programlamaya Giriþ Ýçin Temel Kurs";
		camp3.detail = "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.";
		camp3.instructor = "Engin Demiroð";
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
