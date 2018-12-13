package com.creator.guru.newstube;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    String mURL ;

    public NewsLoader(Context context, String url) {
        super(context);
        this.mURL = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (mURL == null) {
            return null;
        }

        List<News> newsList = QueryUtils.fetchNewsData(mURL);
        return newsList;
    }
}
