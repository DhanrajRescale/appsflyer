package qu;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class q2 extends vu.y {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f32254e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q2(yt.a r3, kotlin.coroutines.CoroutineContext r4) {
        /*
            r2 = this;
            qu.r2 r0 = qu.r2.f32258a
            kotlin.coroutines.CoroutineContext$Element r1 = r4.g(r0)
            if (r1 != 0) goto Ld
            kotlin.coroutines.CoroutineContext r0 = r4.l(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f32254e = r0
            kotlin.coroutines.CoroutineContext r3 = r3.getContext()
            yt.b r0 = kotlin.coroutines.f.O
            kotlin.coroutines.CoroutineContext$Element r3 = r3.g(r0)
            boolean r3 = r3 instanceof qu.b0
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = vu.f0.c(r4, r3)
            vu.f0.a(r4, r3)
            r2.o0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qu.q2.<init>(yt.a, kotlin.coroutines.CoroutineContext):void");
    }

    public final boolean n0() {
        boolean z10;
        if (this.threadLocalIsSet && this.f32254e.get() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32254e.remove();
        return !z10;
    }

    public final void o0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f32254e.set(new Pair(coroutineContext, obj));
    }

    @Override // vu.y, qu.x1
    public final void t(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f32254e.get();
            if (pair != null) {
                vu.f0.a((CoroutineContext) pair.f23353a, pair.f23354b);
            }
            this.f32254e.remove();
        }
        Object a10 = v.a(obj);
        yt.a aVar = this.f38410d;
        CoroutineContext context = aVar.getContext();
        q2 q2Var = null;
        Object c10 = vu.f0.c(context, null);
        if (c10 != vu.f0.f38366a) {
            q2Var = yk.g.d0(aVar, context, c10);
        }
        try {
            this.f38410d.resumeWith(a10);
            Unit unit = Unit.f23355a;
        } finally {
            if (q2Var == null || q2Var.n0()) {
                vu.f0.a(context, c10);
            }
        }
    }
}
