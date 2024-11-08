
public class Example {

	public static void main(String[] args) {
		
		int Kira = 500;
		
		float LebAlis = 12 * 3.5f;
		float FndkAlis = 25 * 15.7f;
		float BdmAlis = 40 * 22f;
		float TotalAlis = LebAlis + FndkAlis + BdmAlis;
		
		float LebSatis = LebAlis + ((LebAlis)*50)/100;
		float FndkSatis = FndkAlis + ((FndkAlis)*40)/100;
		float BdmSatis = BdmAlis + ((BdmAlis)*60)/100;
		float TotalSatis = LebSatis + FndkSatis + BdmSatis;
		
		float NetKazanc = TotalSatis - TotalAlis;
		
		System.out.println("Kazanilan Para: " + NetKazanc);
		if(NetKazanc > Kira)
			System.out.println("Kira Ödendi.");
		else {
			System.out.println("Kira Ödenemedi.");
		}			
	}

}
