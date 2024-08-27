package jj;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends vl.b {

    /* renamed from: g, reason: collision with root package name */
    public Context f21410g;

    /* renamed from: h, reason: collision with root package name */
    public AppsFlyerLib f21411h;

    public final void t0(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        AppsFlyerLib appsFlyerLib = this.f21411h;
        if (appsFlyerLib != null) {
            appsFlyerLib.setCustomerUserId(userId);
        }
    }
}
