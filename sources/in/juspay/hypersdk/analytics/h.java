package in.juspay.hypersdk.analytics;

import in.juspay.hypersdk.analytics.LogSessioniserExp;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LogSessioniserExp f20201b;

    public /* synthetic */ h(LogSessioniserExp logSessioniserExp, int i10) {
        this.f20200a = i10;
        this.f20201b = logSessioniserExp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20200a;
        LogSessioniserExp logSessioniserExp = this.f20201b;
        switch (i10) {
            case 0:
                LogSessioniserExp.LogSessioniserTimerTask.a(logSessioniserExp);
                return;
            case 1:
                LogSessioniserExp.b(logSessioniserExp);
                return;
            case 2:
                LogSessioniserExp.d(logSessioniserExp);
                return;
            default:
                LogSessioniserExp.e(logSessioniserExp);
                return;
        }
    }
}
