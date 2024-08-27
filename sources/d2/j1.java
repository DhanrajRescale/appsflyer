package d2;

import android.view.Choreographer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j1 implements t0.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final Choreographer f13467a;

    /* renamed from: b, reason: collision with root package name */
    public final h1 f13468b;

    public j1(Choreographer choreographer, h1 h1Var) {
        this.f13467a = choreographer;
        this.f13468b = h1Var;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object R(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // t0.a1
    public final Object U(Function1 function1, yt.a frame) {
        h1 h1Var = this.f13468b;
        if (h1Var == null) {
            CoroutineContext.Element g10 = frame.getContext().g(kotlin.coroutines.f.O);
            if (g10 instanceof h1) {
                h1Var = (h1) g10;
            } else {
                h1Var = null;
            }
        }
        qu.i iVar = new qu.i(1, zt.f.b(frame));
        iVar.s();
        i1 i1Var = new i1(iVar, this, function1);
        if (h1Var != null && Intrinsics.a(h1Var.f13429c, this.f13467a)) {
            synchronized (h1Var.f13431e) {
                try {
                    h1Var.f13433g.add(i1Var);
                    if (!h1Var.f13436j) {
                        h1Var.f13436j = true;
                        h1Var.f13429c.postFrameCallback(h1Var.f13437k);
                    }
                    Unit unit = Unit.f23355a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            iVar.u(new y0(2, h1Var, i1Var));
        } else {
            this.f13467a.postFrameCallback(i1Var);
            iVar.u(new y0(3, this, i1Var));
        }
        Object p10 = iVar.p();
        if (p10 == zt.a.f42823a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return p10;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element g(kotlin.coroutines.i iVar) {
        return kotlin.coroutines.h.a(this, iVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext l(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return kotlin.coroutines.g.a(this, context);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext z(kotlin.coroutines.i iVar) {
        return kotlin.coroutines.h.b(this, iVar);
    }
}
