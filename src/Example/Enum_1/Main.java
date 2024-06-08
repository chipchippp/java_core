package Example.Enum_1;

public class Main {
    public static void main(String[] args) {
//        Trong Java, enum (viết tắt của "enumeration") là một kiểu dữ liệu đặc biệt dùng để định nghĩa một tập hợp
//        các hằng số có tên. enum cung cấp một cách để định nghĩa và nhóm các giá trị cố định, giúp mã nguồn dễ đọc và
//        bảo trì hơn. Nó thường được sử dụng khi bạn cần đại diện cho một tập hợp các giá trị không thay đổi,
//        chẳng hạn như các ngày trong tuần, các mùa trong năm, hoặc trạng thái của một quy trình.
//
//Đặc điểm của Enum
//Các giá trị trong enum được gọi là các hằng số enum và chúng là các thể hiện của kiểu enum.
//Mỗi hằng số enum là một đối tượng public static final của kiểu enum.
//enum có thể chứa các phương thức, các biến, và các constructor giống như các lớp thông thường.
//enum cung cấp các phương thức tiện ích như values() và valueOf(String name) để làm việc với các hằng số enum.


        Enum_1 enum1 = Enum_1.MONDAY;
        switch (enum1) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        for (Enum_2 p : Enum_2.values()) {
            System.out.println(p + ": mass = " + p.getMass() + ", radius = " + p.getRadius() + ", surface gravity = " + p.surfaceGravity());
        }
    }
}
