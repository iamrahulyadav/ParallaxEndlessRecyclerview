package io.github.vitovalov.tabbedcoordinator;

/**
 * Created by dharam on 3/4/2016.
 */
public class MyTestPojo implements Item{

    String head;

    public MyTestPojo(String head){

        this.head = head;

    }
    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    @Override
    public boolean isSection() {
        return false;
    }
}
