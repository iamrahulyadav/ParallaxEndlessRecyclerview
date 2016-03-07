package io.github.vitovalov.tabbedcoordinator;

import java.util.ArrayList;

/**
 * Created by dharam on 3/2/2016.
 */
public class MyPojo {

    ArrayList<StoreData> stores;
    String head;

    public MyPojo(String head,ArrayList<StoreData> data){

        this.head = head;
        this.stores = data;
    }
    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public ArrayList<StoreData> getData() {
        return stores;
    }

    public void setData(ArrayList<StoreData> data) {
        this.stores = data;
    }

}
