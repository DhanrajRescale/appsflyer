package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8527b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f8526a = i10;
        this.f8527b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8526a;
        Object obj = this.f8527b;
        switch (i10) {
            case 0:
                ((AFe1wSDK) obj).AFKeystoreWrapper();
                return;
            case 1:
                AFb1vSDK.valueOf((AFd1kSDK) obj);
                return;
            default:
                ((AFb1vSDK) obj).AFLogger();
                return;
        }
    }
}
