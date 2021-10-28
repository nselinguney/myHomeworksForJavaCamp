package day3;

public class UserManager {

	public void signUp(Users user) {
		
		System.out.println(user.getName() + user.getLastName() + "Sisteme kaydoldunuz");
	}

	public void updatePassword(Users user) {
		
		System.out.println(user.getName() + "Şifreniz başarıyla güncellendi.");
		
	}
	
	public void updateMail(Users user) {
		
		System.out.println(user.getName() + user.getLastName() + "Mail adresiniz başarıyla güncellendi.");
	}
	
	public void displayUser(Users user) {
		
		System.out.println(
				"Kullanıcı Id: " + user.getId() +
				" Ad: " + user.getName() +
				" Soyad: " + user.getLastName() +
				" E-Mail: " + user.getEmail() +
				" Kurs: " + user.getCourses()
		);
	}
}
