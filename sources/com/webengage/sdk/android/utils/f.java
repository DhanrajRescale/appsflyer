package com.webengage.sdk.android.utils;

import android.content.Context;

/* loaded from: classes2.dex */
public class f {
    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
