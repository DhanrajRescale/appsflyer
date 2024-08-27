package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFi1aSDK f8546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f8547c;

    public /* synthetic */ m(AFi1aSDK aFi1aSDK, Runnable runnable, int i10) {
        this.f8545a = i10;
        this.f8546b = aFi1aSDK;
        this.f8547c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8545a;
        Runnable runnable = this.f8547c;
        AFi1aSDK aFi1aSDK = this.f8546b;
        switch (i10) {
            case 0:
                AFi1aSDK.e(aFi1aSDK, runnable);
                return;
            case 1:
                AFi1aSDK.c(aFi1aSDK, runnable);
                return;
            default:
                AFi1aSDK.a(aFi1aSDK, runnable);
                return;
        }
    }
}
