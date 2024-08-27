package cq;

import ek.u;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f13041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f13042c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f13043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f13044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f13045f;

    public /* synthetic */ b(e eVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f13040a = i10;
        this.f13041b = eVar;
        this.f13042c = runnable;
        this.f13043d = j10;
        this.f13044e = j11;
        this.f13045f = timeUnit;
    }

    @Override // cq.f
    public final ScheduledFuture a(u uVar) {
        int i10 = this.f13040a;
        Runnable runnable = this.f13042c;
        e eVar = this.f13041b;
        switch (i10) {
            case 0:
                return eVar.f13054b.scheduleWithFixedDelay(new c(eVar, runnable, uVar, 1), this.f13043d, this.f13044e, this.f13045f);
            default:
                return eVar.f13054b.scheduleAtFixedRate(new c(eVar, runnable, uVar, 0), this.f13043d, this.f13044e, this.f13045f);
        }
    }
}
