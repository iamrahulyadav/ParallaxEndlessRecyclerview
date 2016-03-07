package io.github.vitovalov.tabbedcoordinator;

/**
 * Created by dharam on 3/1/2016.
 */
import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private String user_id;

    private String review;

    public Student(String user_id, String review) {
        this.user_id = user_id;
        this.review = review;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String name) {
        this.user_id = name;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String emailId) {
        this.review = emailId;
    }

}