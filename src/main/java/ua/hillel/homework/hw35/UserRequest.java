package ua.hillel.homework.hw35;

public class UserRequest {

    private String name;
    private String job;

    public UserRequest(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public UserRequest(String name, String job) {
        this.name = name;
        this.job = job;
    }
}
