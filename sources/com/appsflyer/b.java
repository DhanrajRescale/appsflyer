package com.appsflyer;

import com.appsflyer.internal.AFg1fSDK;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFg1fSDK[] f8388b;

    public /* synthetic */ b(AFg1fSDK[] aFg1fSDKArr, int i10) {
        this.f8387a = i10;
        this.f8388b = aFg1fSDKArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8387a;
        AFg1fSDK[] aFg1fSDKArr = this.f8388b;
        switch (i10) {
            case 0:
                AFLogger.valueOf(aFg1fSDKArr);
                return;
            default:
                AFLogger.AFInAppEventType(aFg1fSDKArr);
                return;
        }
    }
}
