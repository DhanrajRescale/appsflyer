package t0;

import android.view.Choreographer;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h0 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f35031a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Choreographer f35032b;

    /* JADX WARN: Type inference failed for: r0v0, types: [t0.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [au.i, kotlin.jvm.functions.Function2] */
    static {
        xu.e eVar = qu.r0.f32255a;
        f35032b = (Choreographer) yk.g.X(((ru.d) vu.u.f38408a).f34006f, new au.i(2, null));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object R(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // t0.a1
    public final Object U(Function1 function1, yt.a frame) {
        qu.i iVar = new qu.i(1, zt.f.b(frame));
        iVar.s();
        g0 g0Var = new g0(iVar, function1);
        f35032b.postFrameCallback(g0Var);
        iVar.u(new t.g0(g0Var, 17));
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
