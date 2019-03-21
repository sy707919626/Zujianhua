package com.zujianhua.minecomponent;

import android.app.Application;

import com.zujianhua.componentlib.IComponetApp;
import com.zujianhua.componentlib.ServiceFactory;

/**
 * Created by Administrator on 2019/3/21.
 */

public class MineApplication extends Application implements IComponetApp{
    private static Application application;

    public static Application getApplication(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initializal(this);
    }

    @Override
    public void initializal(Application app) {
        application = app;
        ServiceFactory.getInstance().setmIMienService(new MineService());
    }
}
