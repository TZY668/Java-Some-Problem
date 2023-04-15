public class user {
    private String id;
    private String username;
    private String passward;


    public user() {
    }

    public user(String id, String username, String passward) {
        this.id = id;
        this.username = username;
        this.passward = passward;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return passward
     */
    public String getPassward() {
        return passward;
    }

    /**
     * 设置
     * @param passward
     */
    public void setPassward(String passward) {
        this.passward = passward;
    }


}

