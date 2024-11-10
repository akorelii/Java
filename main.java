import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gişe Uygulamasına Hoşgeldiniz!");
		System.out.print("Lütfen TCKN Giriniz: ");
		
		String tcNo = scanner.nextLine();
		
		TCKN tcknNesne = new TCKN();
		tcknNesne.setTckn(tcNo);
		
	}

}
