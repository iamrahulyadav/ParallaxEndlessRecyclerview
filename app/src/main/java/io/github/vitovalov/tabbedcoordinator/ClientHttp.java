package io.github.vitovalov.tabbedcoordinator;

/**
 * Created by dharam on 3/1/2016.
 */
import android.content.Context;

import com.loopj.android.http.AsyncHttpClient;

public class ClientHttp {
    public static AsyncHttpClient client;
    public static AsyncHttpClient getInstance(Context ctx1) {
        if (client == null) {

            client = new AsyncHttpClient();

        }
        return client;
    }


}