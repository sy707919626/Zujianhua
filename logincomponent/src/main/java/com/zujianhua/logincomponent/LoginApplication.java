package com.zujianhua.logincomponent;

import android.app.Application;

import com.zujianhua.componentlib.IComponetApp;
import com.zujianhua.componentlib.ServiceFactory;

/**
 * Created by Administrator on 2019/3/21.
 */

public class LoginApplication extends Application implements IComponetApp {
    private static Application application;

    public static Application getApplication(){
        return application;
    }

    @Override
    public void onCreate() { //组件化时不会调用onCreate方法
        super.onCreate();
        initializal(this);
    }

    @Override
    public void initializal(Application app) {
        application = app;
        ServiceFactory.getInstance().setmIloginService(new LoginService());
    }
}
