package com.webengage.sdk.android;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class z0 {
    public static /* synthetic */ NotificationChannel b(String str, String str2, int i10) {
        return new NotificationChannel(str, str2, i10);
    }

    public static /* bridge */ /* synthetic */ NotificationChannelGroup c(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillId f(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillManager g(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return AutofillManager.class;
    }
}
