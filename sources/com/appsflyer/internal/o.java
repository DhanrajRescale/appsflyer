package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFj1vSDK f8553b;

    public /* synthetic */ o(AFj1vSDK aFj1vSDK, int i10) {
        this.f8552a = i10;
        this.f8553b = aFj1vSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8552a;
        AFj1vSDK aFj1vSDK = this.f8553b;
        switch (i10) {
            case 0:
                AFj1vSDK.c(aFj1vSDK);
                return;
            case 1:
                AFj1vSDK.c(aFj1vSDK);
                return;
            case 2:
                AFj1vSDK.b(aFj1vSDK);
                return;
            default:
                AFj1vSDK.a(aFj1vSDK);
                return;
        }
    }
}
