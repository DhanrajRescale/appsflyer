package qu;

/* loaded from: classes2.dex */
public abstract class b1 extends b0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f32184f = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f32185c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32186d;

    /* renamed from: e, reason: collision with root package name */
    public vt.q f32187e;

    public final void f0(boolean z10) {
        long j10;
        long j11 = this.f32185c;
        if (z10) {
            j10 = 4294967296L;
        } else {
            j10 = 1;
        }
        long j12 = j11 - j10;
        this.f32185c = j12;
        if (j12 <= 0 && this.f32186d) {
            shutdown();
        }
    }

    public final void g0(p0 p0Var) {
        vt.q qVar = this.f32187e;
        if (qVar == null) {
            qVar = new vt.q();
            this.f32187e = qVar;
        }
        qVar.h(p0Var);
    }

    public abstract Thread h0();

    public final void i0(boolean z10) {
        this.f32185c = (z10 ? 4294967296L : 1L) + this.f32185c;
        if (z10) {
            return;
        }
        this.f32186d = true;
    }

    public final boolean j0() {
        return this.f32185c >= 4294967296L;
    }

    public abstract long k0();

    public final boolean l0() {
        Object t10;
        vt.q qVar = this.f32187e;
        if (qVar == null) {
            return false;
        }
        if (qVar.isEmpty()) {
            t10 = null;
        } else {
            t10 = qVar.t();
        }
        p0 p0Var = (p0) t10;
        if (p0Var == null) {
            return false;
        }
        p0Var.run();
        return true;
    }

    public void m0(long j10, y0 y0Var) {
        j0.f32226j.q0(j10, y0Var);
    }

    public abstract void shutdown();
}
