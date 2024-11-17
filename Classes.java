import test.student;

public class Classes {

	public static void main(String[] args) {
		//Başka bir sınıfın içindeki değişkenlere erişebilmek içn o classtan nesne türetmemiz lazım.
		
		student	student1 = new student();
		student1.name = "Ahmet";
		student1.id = 1;
		student1.surname = "Koreli";
		
		System.out.println("Öğrencinin Bilgileri");
		System.out.println("ID: " + student1.id);
		System.out.println("Name: " + student1.name);
		System.out.println("Surname: " + student1.surname);
	}

}
