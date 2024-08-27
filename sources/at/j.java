package at;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f2787a;

    /* renamed from: b, reason: collision with root package name */
    public final ft.e f2788b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2789c;

    /* renamed from: d, reason: collision with root package name */
    public long f2790d;

    /* renamed from: e, reason: collision with root package name */
    public long f2791e;

    /* renamed from: f, reason: collision with root package name */
    public long f2792f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f2793g;

    public j(k kVar, long j10, Runnable runnable, long j11, ft.e eVar, long j12) {
        this.f2793g = kVar;
        this.f2787a = runnable;
        this.f2788b = eVar;
        this.f2789c = j12;
        this.f2791e = j11;
        this.f2792f = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        this.f2787a.run();
        ft.e eVar = this.f2788b;
        if (!eVar.b()) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            k kVar = this.f2793g;
            kVar.getClass();
            long convert = timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
            long j11 = l.f2794a;
            long j12 = convert + j11;
            long j13 = this.f2791e;
            long j14 = this.f2789c;
            if (j12 >= j13 && convert < j13 + j14 + j11) {
                long j15 = this.f2792f;
                long j16 = this.f2790d + 1;
                this.f2790d = j16;
                j10 = (j16 * j14) + j15;
            } else {
                j10 = convert + j14;
                long j17 = this.f2790d + 1;
                this.f2790d = j17;
                this.f2792f = j10 - (j14 * j17);
            }
            this.f2791e = convert;
            ft.b.d(eVar, kVar.c(this, j10 - convert, timeUnit));
        }
    }
}
