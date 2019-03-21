package com.zujianhua.logincomponent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.zujianhua.componentlib.IloginService;

/**
 * Created by Administrator on 2019/3/21.
 */

public class LoginService implements IloginService{
    @Override
    public void launch(Context context, String targetClass) {
        Intent intent = new Intent(context, LoginActivity.class);
        intent.putExtra(LoginActivity.EXTRA_TARGET_CLASS, targetClass);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Override
    public Fragment newUserInfoFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        UserInfoFaragment faragment = new UserInfoFaragment();
        faragment.setArguments(bundle);
        fragmentManager.beginTransaction().add(viewId, faragment).commit();
        return faragment;
    }
}
