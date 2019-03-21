package com.zujianhua.componentlib;

/**
 * Created by Administrator on 2019/3/21.
 */

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    public static ServiceFactory getInstance(){
        return instance;
    }

    public ServiceFactory() {
    }

    private IloginService mIloginService;

    private IMienService mIMienService;

    public IloginService getmIloginService() {
        return mIloginService;
    }

    public void setmIloginService(IloginService mIloginService) {
        this.mIloginService = mIloginService;
    }

    public IMienService getmIMienService() {
        return mIMienService;
    }

    public void setmIMienService(IMienService mIMienService) {
        this.mIMienService = mIMienService;
    }
}
