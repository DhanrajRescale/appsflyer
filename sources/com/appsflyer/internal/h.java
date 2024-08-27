package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorEvent;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8538b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8539c;

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.f8537a = i10;
        this.f8538b = obj;
        this.f8539c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8537a;
        Object obj = this.f8539c;
        Object obj2 = this.f8538b;
        switch (i10) {
            case 0:
                AFd1ySDK.AFInAppEventParameterName((AFd1ySDK) obj2, (AFh1xSDK) obj);
                return;
            case 1:
                AFi1dSDK.a((AFi1dSDK) obj2, (SensorEvent) obj);
                return;
            case 2:
                AFi1jSDK.a((AFi1jSDK) obj2, (Context) obj);
                return;
            default:
                AFi1nSDK.a((AFi1nSDK) obj2, (Context) obj);
                return;
        }
    }
}
