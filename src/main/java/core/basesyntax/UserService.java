package core.basesyntax;

public class UserService {
    private final PasswordValidator passwordValidator = new PasswordValidator();
    private final UserDao userDao = new UserDao();
    public void registerUser(String email, String password, String repeatPassword) {
        try {
          passwordValidator.validate(password, repeatPassword);
          userDao.saveUser(email);//write your code here
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again!");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
