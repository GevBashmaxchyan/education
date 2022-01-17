package education.storage;

import education.Util.FIleUtil;
import education.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserStroage {
    private Map<String, User> userMap = new HashMap<>();
    private FIleUtil FileUtil;


    public void add(User user) {
        userMap.put(user.getEmail(),user);
        FileUtil.serializeUserMap(userMap);;
    }

    public void print() {
        for (User value : userMap.values()) {
            System.out.println(value);
        }
    }

    public User getByEmail(String email)  {
        return userMap.get(email);



    }


    public void initeData() {
        Map<String, User> userMapFromFile = FileUtil.deserializeUserMap();
        if (userMapFromFile != null) {
            userMap = userMapFromFile;
        }
    }
}
