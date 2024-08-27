package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.appsflyer.internal.l;
import com.facebook.applinks.AppLinkData;
import jn.i;
import jn.r;
import on.g;
import on.h;
import sn.a;
import x9.c;

/* loaded from: classes2.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11070a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(AppLinkData.ARGUMENTS_EXTRAS_KEY);
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        r.b(context);
        c a10 = i.a();
        a10.q(queryParameter);
        a10.r(a.b(intValue));
        if (queryParameter2 != null) {
            a10.f40139c = Base64.decode(queryParameter2, 0);
        }
        h hVar = r.a().f21525d;
        i e10 = a10.e();
        l lVar = new l(17);
        hVar.getClass();
        hVar.f30142e.execute(new g(hVar, e10, i10, lVar));
    }
}
