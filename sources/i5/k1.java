package i5;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class k1 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final e5.b f19533a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19534b;

    /* renamed from: c, reason: collision with root package name */
    public long f19535c;

    /* renamed from: d, reason: collision with root package name */
    public long f19536d;

    /* renamed from: e, reason: collision with root package name */
    public b5.u0 f19537e = b5.u0.f3616d;

    public k1(e5.b bVar) {
        this.f19533a = bVar;
    }

    @Override // i5.o0
    public final void a(b5.u0 u0Var) {
        if (this.f19534b) {
            c(b());
        }
        this.f19537e = u0Var;
    }

    @Override // i5.o0
    public final long b() {
        long j10;
        long j11 = this.f19535c;
        if (this.f19534b) {
            ((e5.r) this.f19533a).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f19536d;
            if (this.f19537e.f3617a == 1.0f) {
                j10 = e5.x.F(elapsedRealtime);
            } else {
                j10 = elapsedRealtime * r4.f3619c;
            }
            return j11 + j10;
        }
        return j11;
    }

    public final void c(long j10) {
        this.f19535c = j10;
        if (this.f19534b) {
            ((e5.r) this.f19533a).getClass();
            this.f19536d = SystemClock.elapsedRealtime();
        }
    }

    @Override // i5.o0
    public final b5.u0 d() {
        return this.f19537e;
    }

    public final void e() {
        if (!this.f19534b) {
            ((e5.r) this.f19533a).getClass();
            this.f19536d = SystemClock.elapsedRealtime();
            this.f19534b = true;
        }
    }
}
