package ruchin.snakeAndLadder.model;

public class User {

    private static Long userId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private Integer position;
    private String userName;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public User(Long userId, String userName) {
        this.position=0;
        this.setUserId(userId);
        this.userName = userName;
    }
}
