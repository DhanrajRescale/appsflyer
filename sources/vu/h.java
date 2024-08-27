package vu;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import qu.b1;
import qu.k2;
import qu.p0;

/* loaded from: classes2.dex */
public final class h extends p0 implements au.d, yt.a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38373h = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final qu.b0 f38374d;

    /* renamed from: e, reason: collision with root package name */
    public final yt.a f38375e;

    /* renamed from: f, reason: collision with root package name */
    public Object f38376f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f38377g;

    public h(qu.b0 b0Var, yt.a aVar) {
        super(-1);
        this.f38374d = b0Var;
        this.f38375e = aVar;
        this.f38376f = i.f38381a;
        this.f38377g = f0.b(aVar.getContext());
    }

    @Override // qu.p0
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof qu.u) {
            ((qu.u) obj).f32275b.invoke(cancellationException);
        }
    }

    @Override // qu.p0
    public final yt.a c() {
        return this;
    }

    @Override // au.d
    public final au.d getCallerFrame() {
        yt.a aVar = this.f38375e;
        if (aVar instanceof au.d) {
            return (au.d) aVar;
        }
        return null;
    }

    @Override // yt.a
    public final CoroutineContext getContext() {
        return this.f38375e.getContext();
    }

    @Override // qu.p0
    public final Object h() {
        Object obj = this.f38376f;
        this.f38376f = i.f38381a;
        return obj;
    }

    @Override // yt.a
    public final void resumeWith(Object obj) {
        Object tVar;
        yt.a aVar = this.f38375e;
        CoroutineContext context = aVar.getContext();
        Throwable a10 = ut.l.a(obj);
        if (a10 == null) {
            tVar = obj;
        } else {
            tVar = new qu.t(a10, false);
        }
        qu.b0 b0Var = this.f38374d;
        if (b0Var.d0()) {
            this.f38376f = tVar;
            this.f32251c = 0;
            b0Var.b0(context, this);
            return;
        }
        b1 a11 = k2.a();
        if (a11.j0()) {
            this.f38376f = tVar;
            this.f32251c = 0;
            a11.g0(this);
            return;
        }
        a11.i0(true);
        try {
            CoroutineContext context2 = aVar.getContext();
            Object c10 = f0.c(context2, this.f38377g);
            try {
                aVar.resumeWith(obj);
                Unit unit = Unit.f23355a;
                do {
                } while (a11.l0());
            } finally {
                f0.a(context2, c10);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f38374d + ", " + qu.i0.M(this.f38375e) + ']';
    }
}
