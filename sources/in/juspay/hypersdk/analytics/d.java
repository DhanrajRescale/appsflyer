package in.juspay.hypersdk.analytics;

import in.juspay.hypersdk.analytics.LogPusher;
import in.juspay.hypersdk.analytics.LogPusherExp;
import in.juspay.hypersdk.analytics.LogSessioniser;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20195a;

    public /* synthetic */ d(int i10) {
        this.f20195a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20195a) {
            case 0:
                LogPusher.LogPushTimerTask.lambda$run$0();
                return;
            case 1:
                LogPusherExp.LogPushTimerTask.a();
                return;
            case 2:
                LogSessioniser.LogSessioniserTimerTask.a();
                return;
            case 3:
                LogPusher.lambda$static$0();
                return;
            case 4:
                LogPusher.lambda$stopLogPusherOnTerminate$2();
                return;
            case 5:
                LogPusher.lambda$startLogPusherTimer$1();
                return;
            case 6:
                LogPusherExp.a();
                return;
            case 7:
                LogPusherExp.e();
                return;
            case 8:
                LogSessioniser.e();
                return;
            case 9:
                LogSessioniser.c();
                return;
            case 10:
                LogSessioniser.b();
                return;
            case 11:
                LogSessioniser.a();
                return;
            default:
                LogPusherExp.stopLogPusherOnTerminate();
                return;
        }
    }
}
