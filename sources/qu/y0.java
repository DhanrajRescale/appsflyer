package qu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class y0 implements Runnable, Comparable, t0 {
    private volatile Object _heap;

    /* renamed from: a, reason: collision with root package name */
    public long f32299a;

    /* renamed from: b, reason: collision with root package name */
    public int f32300b = -1;

    public y0(long j10) {
        this.f32299a = j10;
    }

    @Override // qu.t0
    public final void a() {
        z0 z0Var;
        synchronized (this) {
            try {
                Object obj = this._heap;
                kp.g gVar = c1.f32193a;
                if (obj == gVar) {
                    return;
                }
                if (obj instanceof z0) {
                    z0Var = (z0) obj;
                } else {
                    z0Var = null;
                }
                if (z0Var != null) {
                    synchronized (z0Var) {
                        if (b() != null) {
                            z0Var.b(this.f32300b);
                        }
                    }
                }
                this._heap = gVar;
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final vu.g0 b() {
        Object obj = this._heap;
        if (obj instanceof vu.g0) {
            return (vu.g0) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = this.f32299a - ((y0) obj).f32299a;
        if (j10 > 0) {
            return 1;
        }
        if (j10 < 0) {
            return -1;
        }
        return 0;
    }

    public final int d(long j10, z0 z0Var, a1 a1Var) {
        y0 y0Var;
        synchronized (this) {
            if (this._heap == c1.f32193a) {
                return 2;
            }
            synchronized (z0Var) {
                try {
                    y0[] y0VarArr = z0Var.f38372a;
                    if (y0VarArr != null) {
                        y0Var = y0VarArr[0];
                    } else {
                        y0Var = null;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a1.f32178g;
                    a1Var.getClass();
                    if (a1.f32180i.get(a1Var) != 0) {
                        return 1;
                    }
                    if (y0Var == null) {
                        z0Var.f32309c = j10;
                    } else {
                        long j11 = y0Var.f32299a;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - z0Var.f32309c > 0) {
                            z0Var.f32309c = j10;
                        }
                    }
                    long j12 = this.f32299a;
                    long j13 = z0Var.f32309c;
                    if (j12 - j13 < 0) {
                        this.f32299a = j13;
                    }
                    z0Var.a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void e(z0 z0Var) {
        if (this._heap != c1.f32193a) {
            this._heap = z0Var;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public String toString() {
        return "Delayed[nanos=" + this.f32299a + ']';
    }
}
