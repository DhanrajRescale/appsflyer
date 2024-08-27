package i5;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f19385a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f19386b;

    /* renamed from: c, reason: collision with root package name */
    public final e5.b f19387c;

    /* renamed from: d, reason: collision with root package name */
    public int f19388d;

    /* renamed from: e, reason: collision with root package name */
    public Object f19389e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f19390f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19391g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19392h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19393i;

    public d1(m0 m0Var, c1 c1Var, b5.i1 i1Var, int i10, e5.b bVar, Looper looper) {
        this.f19386b = m0Var;
        this.f19385a = c1Var;
        this.f19390f = looper;
        this.f19387c = bVar;
    }

    public final synchronized void a(long j10) {
        boolean z10;
        boolean z11;
        yk.j.H0(this.f19391g);
        if (this.f19390f.getThread() != Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.H0(z10);
        ((e5.r) this.f19387c).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (true) {
            z11 = this.f19393i;
            if (z11 || j10 <= 0) {
                break;
            }
            this.f19387c.getClass();
            wait(j10);
            ((e5.r) this.f19387c).getClass();
            j10 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z11) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z10) {
        this.f19392h = z10 | this.f19392h;
        this.f19393i = true;
        notifyAll();
    }

    public final void c() {
        yk.j.H0(!this.f19391g);
        this.f19391g = true;
        m0 m0Var = this.f19386b;
        synchronized (m0Var) {
            if (!m0Var.f19575y && m0Var.f19560j.getThread().isAlive()) {
                m0Var.f19558h.a(14, this).b();
                return;
            }
            e5.m.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
