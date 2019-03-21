package com.zujianhua.componentlib;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by Administrator on 2019/3/21.
 */

public interface IloginService {
    void launch(Context context, String targetClass);

    Fragment newUserInfoFragment(FragmentManager fragmentManager,
                                 int viewId, Bundle bundle);
}


