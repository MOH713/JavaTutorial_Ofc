package practice_session;

//public class Access_modifiers {
//	public class pratice2 {
//		static class default1 {
//			void message() {
//				System.out.println("This is a message from default access modifier");
//			}
//		}
//
//		static class private1 {
//			private String Name;
//
//			public String get_name() {
//				System.out.println("This is public function to get name");
//				return this.Name;
//			}
//
//			protected void set_name(String Name) {
//				System.out.println("This is protected function to set name");
//				this.Name = Name;
//			}
//
//			public static void main(String[] args) {
//				Scanner sc = new Scanner(System.in);
//				System.out.println("enter your name :-> ");
//				String n = sc.nextLine();
//				private1 d = new private1();
//				System.out.println("the name is " + d.get_name());
//				default1 e = new default1();
//				e.message();
//			}
//		}
//	}
//}






import java.util.Scanner;

public class Access_modifiers {
	static class default1 {
		void message() {
			System.out.println("This is a message from default access modifier");
		}
	}
	static class private1 {
		private String Name;

		public String get_name() {
			System.out.println("This is public function to get name");
			return this.Name;
		}

		protected void set_name(String Name) {
			System.out.println("This is protected function to set name");
			this.Name = Name;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your name :-> ");
			String n = sc.nextLine();
			private1 d = new private1();
			System.out.println("the name is " + d.get_name());
			default1 e = new default1();
			e.message();
		}
	}
}