package ru;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import jr.h;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import m.j;
import qu.b2;
import qu.c0;
import qu.e2;
import qu.i;
import qu.o1;
import qu.r0;
import qu.t0;
import vu.u;
import zd.g;

/* loaded from: classes2.dex */
public final class d extends e {

    /* renamed from: c, reason: collision with root package name */
    public final Handler f34003c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34004d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f34005e;

    /* renamed from: f, reason: collision with root package name */
    public final d f34006f;

    public d(Handler handler, String str, boolean z10) {
        this.f34003c = handler;
        this.f34004d = str;
        this.f34005e = z10;
        this.f34006f = z10 ? this : new d(handler, str, true);
    }

    @Override // qu.n0
    public final t0 H(long j10, final Runnable runnable, CoroutineContext coroutineContext) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f34003c.postDelayed(runnable, j10)) {
            return new t0() { // from class: ru.c
                @Override // qu.t0
                public final void a() {
                    d.this.f34003c.removeCallbacks(runnable);
                }
            };
        }
        f0(coroutineContext, runnable);
        return e2.f32201a;
    }

    @Override // qu.b0
    public final void b0(CoroutineContext coroutineContext, Runnable runnable) {
        if (!this.f34003c.post(runnable)) {
            f0(coroutineContext, runnable);
        }
    }

    @Override // qu.b0
    public final boolean d0() {
        if (this.f34005e && Intrinsics.a(Looper.myLooper(), this.f34003c.getLooper())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.f34003c == this.f34003c && dVar.f34005e == this.f34005e) {
                return true;
            }
        }
        return false;
    }

    @Override // qu.n0
    public final void f(long j10, i iVar) {
        j jVar = new j(iVar, this, 26);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f34003c.postDelayed(jVar, j10)) {
            iVar.u(new g(22, this, jVar));
        } else {
            f0(iVar.f32216e, jVar);
        }
    }

    public final void f0(CoroutineContext coroutineContext, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        o1 o1Var = (o1) coroutineContext.g(c0.f32192b);
        if (o1Var != null) {
            o1Var.a(cancellationException);
        }
        r0.f32256b.b0(coroutineContext, runnable);
    }

    public final int hashCode() {
        int i10;
        int identityHashCode = System.identityHashCode(this.f34003c);
        if (this.f34005e) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return identityHashCode ^ i10;
    }

    @Override // qu.b0
    public final String toString() {
        d dVar;
        String str;
        xu.e eVar = r0.f32255a;
        b2 b2Var = u.f38408a;
        if (this == b2Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = ((d) b2Var).f34006f;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            if (this == dVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.f34004d;
            if (str2 == null) {
                str2 = this.f34003c.toString();
            }
            if (this.f34005e) {
                return h.r(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
