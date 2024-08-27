package vu;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import qu.j2;

/* loaded from: classes2.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final kp.g f38366a = new kp.g("NO_THREAD_ELEMENTS", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f38367b = c0.f38359a;

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f38368c = d0.f38361a;

    /* renamed from: d, reason: collision with root package name */
    public static final e0 f38369d = e0.f38364a;

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f38366a) {
            return;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            j2[] j2VarArr = h0Var.f38380c;
            int length = j2VarArr.length - 1;
            if (length < 0) {
                return;
            }
            j2 j2Var = j2VarArr[length];
            Intrinsics.c(null);
            Object obj2 = h0Var.f38379b[length];
            throw null;
        }
        Object R = coroutineContext.R(null, f38368c);
        Intrinsics.d(R, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        a3.a.u(R);
        throw null;
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object R = coroutineContext.R(0, f38367b);
        Intrinsics.c(R);
        return R;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return f38366a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.R(new h0(coroutineContext, ((Number) obj).intValue()), f38369d);
        }
        a3.a.u(obj);
        throw null;
    }
}
