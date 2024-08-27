package g7;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f3 extends k7.z0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f16766d;

    /* renamed from: e, reason: collision with root package name */
    public final m f16767e;

    /* renamed from: f, reason: collision with root package name */
    public final tu.f f16768f;

    public f3(ga.a diffCallback) {
        xu.e eVar = qu.r0.f32255a;
        qu.b2 mainDispatcher = vu.u.f38408a;
        xu.e workerDispatcher = qu.r0.f32255a;
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(workerDispatcher, "workerDispatcher");
        m mVar = new m(diffCallback, new k7.c(this), mainDispatcher, workerDispatcher);
        this.f16767e = mVar;
        this.f22653c = k7.y0.f22626c;
        this.f22651a.g();
        o(new d3(this, 0));
        p(new e3(this));
        this.f16768f = mVar.f16905h;
    }

    @Override // k7.z0
    public final int a() {
        return this.f16767e.f16903f.f16984d.e();
    }

    @Override // k7.z0
    public final long b(int i10) {
        return -1L;
    }

    public final void p(Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        m mVar = this.f16767e;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        AtomicReference atomicReference = mVar.f16906i;
        if (atomicReference.get() == null) {
            c2.e1 listener2 = mVar.f16908k;
            Intrinsics.checkNotNullParameter(listener2, "listener");
            atomicReference.set(listener2);
            i iVar = mVar.f16903f;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(listener2, "listener");
            h.c cVar = iVar.f16985e;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(listener2, "listener");
            ((CopyOnWriteArrayList) cVar.f17583b).add(listener2);
            c0 c0Var = (c0) ((tu.k1) ((tu.q0) cVar.f17584c)).getValue();
            if (c0Var != null) {
                listener2.invoke(c0Var);
            }
        }
        mVar.f16907j.add(listener);
    }

    public final Object q(int i10) {
        Object value;
        Object value2;
        Object value3;
        m mVar = this.f16767e;
        tu.k1 k1Var = mVar.f16902e;
        do {
            try {
                value2 = k1Var.getValue();
                ((Boolean) value2).booleanValue();
            } catch (Throwable th2) {
                do {
                    value = k1Var.getValue();
                    ((Boolean) value).booleanValue();
                } while (!k1Var.l(value, Boolean.FALSE));
                throw th2;
            }
        } while (!k1Var.l(value2, Boolean.TRUE));
        Object b10 = mVar.f16903f.b(i10);
        do {
            value3 = k1Var.getValue();
            ((Boolean) value3).booleanValue();
        } while (!k1Var.l(value3, Boolean.FALSE));
        return b10;
    }

    public final void r(k7.y0 y0Var) {
        k7.y0 strategy = k7.y0.f22624a;
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f16766d = true;
        this.f22653c = strategy;
        this.f22651a.g();
    }

    public final Object s(c3 c3Var, au.c cVar) {
        m mVar = this.f16767e;
        mVar.f16904g.incrementAndGet();
        i iVar = mVar.f16903f;
        iVar.getClass();
        Object a10 = iVar.f16987g.a(0, new m3(iVar, c3Var, null), cVar);
        zt.a aVar = zt.a.f42823a;
        if (a10 != aVar) {
            a10 = Unit.f23355a;
        }
        if (a10 != aVar) {
            a10 = Unit.f23355a;
        }
        if (a10 == aVar) {
            return a10;
        }
        return Unit.f23355a;
    }
}
