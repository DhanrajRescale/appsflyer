package tu;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class q1 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f36538a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f36539b;

    public q1(p0 p0Var, g7.u uVar) {
        this.f36538a = p0Var;
        this.f36539b = uVar;
    }

    @Override // tu.t0
    public final List b() {
        return this.f36538a.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(tu.g r5, yt.a r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof tu.p1
            if (r0 == 0) goto L13
            r0 = r6
            tu.p1 r0 = (tu.p1) r0
            int r1 = r0.f36531c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36531c = r1
            goto L18
        L13:
            tu.p1 r0 = new tu.p1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f36529a
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f36531c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            ut.n.b(r6)
            goto L44
        L2f:
            ut.n.b(r6)
            tu.o1 r6 = new tu.o1
            kotlin.jvm.functions.Function2 r2 = r4.f36539b
            r6.<init>(r2, r5)
            r0.f36531c = r3
            tu.t0 r5 = r4.f36538a
            java.lang.Object r5 = r5.c(r6, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tu.q1.c(tu.g, yt.a):java.lang.Object");
    }
}
