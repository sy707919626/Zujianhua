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

        if (mIloginService == null){
            mIloginService = new EmptyLoginService();
        }

        return mIloginService;

    }

    public void setmIloginService(IloginService mIloginService) {
        this.mIloginService = mIloginService;
    }

    public IMienService getmIMienService() {
        if (mIMienService == null){
            mIMienService = new EmptyMineService();
        }
        return mIMienService;
    }

    public void setmIMienService(IMienService mIMienService) {
        this.mIMienService = mIMienService;
    }
}
