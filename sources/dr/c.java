package dr;

import com.google.firebase.perf.session.gauges.GaugeManager;
import gr.i;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GaugeManager f14478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14479c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f14480d;

    public /* synthetic */ c(GaugeManager gaugeManager, String str, i iVar, int i10) {
        this.f14477a = i10;
        this.f14478b = gaugeManager;
        this.f14479c = str;
        this.f14480d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f14477a;
        GaugeManager gaugeManager = this.f14478b;
        i iVar = this.f14480d;
        String str = this.f14479c;
        switch (i10) {
            case 0:
                GaugeManager.d(gaugeManager, str, iVar);
                return;
            default:
                GaugeManager.c(gaugeManager, str, iVar);
                return;
        }
    }
}
