package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8540a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFd1ySDK f8541b;

    public /* synthetic */ i(AFd1ySDK aFd1ySDK, int i10) {
        this.f8540a = i10;
        this.f8541b = aFd1ySDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8540a;
        AFd1ySDK aFd1ySDK = this.f8541b;
        switch (i10) {
            case 0:
                AFd1ySDK.c(aFd1ySDK);
                return;
            default:
                AFd1ySDK.a(aFd1ySDK);
                return;
        }
    }
}
