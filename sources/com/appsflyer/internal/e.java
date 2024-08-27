package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFd1iSDK f8532b;

    public /* synthetic */ e(AFd1iSDK aFd1iSDK, int i10) {
        this.f8531a = i10;
        this.f8532b = aFd1iSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8531a;
        AFd1iSDK aFd1iSDK = this.f8532b;
        switch (i10) {
            case 0:
                AFd1iSDK.a(aFd1iSDK);
                return;
            case 1:
                AFd1iSDK.c(aFd1iSDK);
                return;
            case 2:
                AFd1iSDK.b(aFd1iSDK);
                return;
            default:
                AFd1iSDK.b(aFd1iSDK);
                return;
        }
    }
}
