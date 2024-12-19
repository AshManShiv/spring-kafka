package ashwini.kafkaguide.springboot.entity;



public class User {

    private String userName;
    private String userId ;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
