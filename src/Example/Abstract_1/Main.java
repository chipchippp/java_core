package Example.Abstract_1;

public class Main {
    public static void main(String[] args) {

//        Trong Java, từ khóa abstract được sử dụng để khai báo một lớp hoặc phương thức trừu tượng.
//        Một lớp trừu tượng không thể được khởi tạo trực tiếp và thường chứa một hoặc nhiều phương thức trừu tượng mà không có thân phương thức
//        (phần thân của phương thức được định nghĩa bởi các lớp con kế thừa lớp trừu tượng).
//        Dưới đây là một ví dụ minh họa cách sử dụng lớp và phương thức trừu tượng.


        // Không thể khởi tạo đối tượng của lớp trừu tượng
        // Animal animal = new Animal(); // Lỗi
        // Khởi tạo đối tượng của lớp con `Dog`
        Animal dog = new Dog();
        dog.makeSound(); // Gọi phương thức `makeSound` của `Dog`
        dog.sleep();    // Gọi phương thức `sleep` của `Animal`

        // Khởi tạo đối tượng của lớp con `Cat`
        Animal cat = new Cat();
        cat.makeSound(); // Gọi phương thức `makeSound` của `Cat`
        cat.sleep();    // Gọi phương thức `sleep` của `Animal`

        // Khởi tạo đối tượng của lớp con `DogBunny`
        Animal dogBunny = new Animal.DogBunny();
        System.out.println(dogBunny.fname);
        System.out.println(dogBunny.age);
        System.out.println(((Animal.DogBunny) dogBunny).dateOfBirth);
        dogBunny.makeSound(); // Gọi phương thức `makeSound` của `DogBunny`
        dogBunny.sleep();    // Gọi phương thức `sleep` của `Animal`

    }
}
