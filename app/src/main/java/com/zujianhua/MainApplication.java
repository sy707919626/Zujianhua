package com.zujianhua;

import android.app.Application;

import com.zujianhua.componentlib.AppConfig;
import com.zujianhua.componentlib.IComponetApp;

/**
 * Created by Administrator on 2019/3/21.
 */

public class MainApplication extends Application implements IComponetApp{
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
    public void initializal(Application application) {
        for (String component: AppConfig.COMPONENTS){
            try {

                //通过配置文件中的Application的路径，实例化，并将MainApp的application对象传过去
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if (object instanceof IComponetApp){
                    ((IComponetApp)object).initializal(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
