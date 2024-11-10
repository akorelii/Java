import java.util.Iterator;
import java.util.Random;

public class TCKN {
	private Long id;
	private String dogumYeri;
	private String tcNo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDogumYeri() {
		return dogumYeri;
	}
	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}
	public String getTckn() {
		return tcNo;
	}
	
	boolean kontrol = true;
	public void setTckn(String tcNo) {
		
		if(tcNo.length()==11)
		{
			for (int i = 0; i < tcNo.length(); i++) {
				char karakter = tcNo.charAt(i);
				if(Character.isDigit(karakter))
				{
					kontrol = true;
				}else {
					kontrol = false;
					break;
				}
			}
			if(kontrol)
			{
				this.tcNo = tcNo;

				Random random = new Random();
				int giseNo = random.nextInt(100);
				sonucuYazdir("Gişe No : " + giseNo);
			}else {
				System.out.println("Lütfen bütün karakterleri rakam olarak giriniz.");
			}	
		}else {
			sonucuYazdir("TC 11 karakter olmak zorundadır.");
		}
	}
	
	public void sonucuYazdir(String sonuc)
	{
		System.out.println(sonuc);
	}
	
	
	
	
	
	
	
	
	
	
	
}