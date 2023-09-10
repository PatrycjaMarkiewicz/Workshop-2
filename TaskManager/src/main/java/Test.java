import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class Test {
    public static void main(String[] args) {
//        User user1 = new User();
//        user1.setUserName("kubus");
//        user1.setEmail("sokolo@wp.pl");
//        user1.setPassword("sokolowki123");
//
//        UserDao userDao = new UserDao();
//        userDao.create(user1);
//        System.out.println(user1.getId());
//
        UserDao userDao = new UserDao();
//        User user = userDao.read(4);
//        System.out.println(user.getEmail());
//        System.out.println(user.getUserName());
//        System.out.println(user.getPassword());
//        System.out.println(user.getId());
//        user.setEmail("aaabghbb");
//        user.setUserName("alicja");
//        user.setPassword("alicja");
//        userDao.update(user);
//        userDao.delete(5);
        User[] users= userDao.findAll();
        for(int i=0; i<users.length; i++){
            System.out.println(users[i].toString());
        }
    }
}
