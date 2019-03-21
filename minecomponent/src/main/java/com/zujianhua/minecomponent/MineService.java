package com.zujianhua.minecomponent;

import android.content.Context;
import android.content.Intent;

import com.zujianhua.componentlib.IMienService;

/**
 * Created by Administrator on 2019/3/21.
 */

public class MineService implements IMienService {
    @Override
    public void launch(Context context, int Userid) {
        Intent intent = new Intent(context, MineActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("ID", Userid);
        context.startActivity(intent);
    }
}
