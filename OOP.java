
public class OOP {

	public static void main(String[] args) {
		
		printName();
		
		addNumbers(10, 5);
		
		int divideResult = divideNumbers();
		System.out.println("Bölüm Sonuç: " + divideResult);
		
		int MultiplyResult = MultiplyNumbers(5, 10);
		System.out.println("Çarpım Sonuç: " + MultiplyResult);
		
		
		
		
	}
	
	public static void printName()//Parametresiz + Geriye değer döndürmeyen
	{
		System.out.println("Ahmet");
	}

	public static void addNumbers(int num1,int num2)//Parametreli + Geriye değer döndürmeyen
	{
		int result = num1 + num2;
		System.out.println("Toplam Sonuç: " + result);
	}
	
	public static int divideNumbers()//Parametresiz + Geriye değer döndüren
	{
		int num1 = 15;
		int num2 = 3;
		int divideResult = num1/num2;
		return divideResult;
	}
	
	public static int MultiplyNumbers(int num1,int num2)//Parametreli + Geriye değer döndüren
	{
		int result = num1*num2;
		return result; // return metodu sonlandirir, sonrasina kod yazılırsa okunamaz.
	}
	
	
	
}
