import java.util.Scanner;

public class ATM {
	
	// Without Loops

	public static void main(String[] args) {
		

		double ahmetBalance = 2500;
		String ahmetIban = "TR1234 5678 910 111 222 3333 55 66";
		String aUserName = "akoreli";
		String aPassword = "123";
		
		
		double ozkanBalance = 500;
		String ozkanIban = "TR4321 5678 910 111 222 3333 55 66";
		String oUserName = "ozkn";
		String oPassword = "1234";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-  -  -  -  -  -  -ATM'YE HOSGELDİNİZ-  -  -  -  -  -  -");
		System.out.println("Lütfen Bilgilerinizi Giriniz");
		System.out.print("Kullanıcı Adı: ");
		String userName = scanner.nextLine();
		System.out.print("Sifre :");
		String password = scanner.nextLine();
		
		String optionString = "Bakiye Goruntuleme -->1\n"
				+ "Para Cekme -->2\n"
				+ "Farklı Hesaba Para Yatırma -->3\n"
				+ "Çıkış yapmak için 'q' tuşuna basınız.";
		
		if(userName.equals("akoreli") && password.equals("123")) {
			System.out.println("Giris Basarili: Ahmet Köreli");
			System.out.println(optionString);
			System.out.println("Lutfen Yapmak İstediğiniz İşlemi Seçiniz: ");
			String option = scanner.nextLine();
			

			switch (option) 
			{
				case "1":
				System.out.println("Ahmet Bakiye: " + ahmetBalance);
				break;
				
				case "2":
				System.out.print("Çekmek İstediğiniz Tutarı Giriniz: ");
				int wthdrwMoney = scanner.nextInt();
				if(ahmetBalance>=wthdrwMoney)
				{
					ahmetBalance -= wthdrwMoney;
					System.out.println("Para hesabınızdan çekildi");
					System.out.print("Kalan Bakiyeniz: " + ahmetBalance);
				}else {
					System.out.println("Bakiyenizden Fazla Para Çekemezsiniz.");
				}
				break;
				
				case "3":
					System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
					int dpstMoney = scanner.nextInt();
					if(dpstMoney <= ahmetBalance)
					{
						System.out.println("Yatırmak istediginiz IBAN'ı giriniz: ");
						scanner.nextLine(); //Degeri yakalayamama durumunda kullanıyoruz
						String dpstIban = scanner.nextLine();	
					}
					break;
					
					
			}
			
		} else if(userName.equals("ozkn") && password.equals("1234")) {
			System.out.println("Giris Basarili: Özkan Tel");
			System.out.println(optionString);
			System.out.println("Lutfen Yapmak İstediğiniz İşlemi Seçiniz: ");

		
			//Code Here
		
		
		
		
		
		
		
		
		} else {
			System.out.println("Kullanıcı Adi veya Sifre Hatalı.");
		}
			
		
		
		

	}

}
