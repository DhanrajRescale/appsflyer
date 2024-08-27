package com.appsflyer.lvl;

import android.content.Context;

/* loaded from: classes.dex */
public class AppsFlyerLVL {

    /* loaded from: classes.dex */
    public interface resultListener {
        void onLvlFailure(Exception exc);

        void onLvlResult(String str, String str2);
    }

    public static void checkLicense(long j10, Context context, resultListener resultlistener) {
        try {
            new AppsFlyerLVLImpl(j10, context, resultlistener).getLVLResult();
        } catch (Exception e10) {
            resultlistener.onLvlFailure(e10);
        }
    }
}
