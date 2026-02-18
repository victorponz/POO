record UserDto (String name, String email){
}
public class MainUserDto{
    public static void main(String[] args) {
        UserDto u = new UserDto("hola", "mundo");
        System.out.println(u.name() + " - "  + u.email());
    }
}
