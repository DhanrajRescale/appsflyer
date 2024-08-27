package cq;

import ek.u;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class g extends a3.i implements ScheduledFuture {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f13055i = 0;

    /* renamed from: h, reason: collision with root package name */
    public final ScheduledFuture f13056h;

    public g(f fVar) {
        this.f13056h = fVar.a(new u(this, 17));
    }

    @Override // a3.i
    public final void c() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f13056h;
        Object obj = this.f156a;
        if ((obj instanceof a3.b) && ((a3.b) obj).f136a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f13056h.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f13056h.getDelay(timeUnit);
    }
}
