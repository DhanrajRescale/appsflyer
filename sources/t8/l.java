package t8;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final y8.j f35620a;

    /* renamed from: b, reason: collision with root package name */
    public final List f35621b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35622c;

    /* renamed from: d, reason: collision with root package name */
    public final y8.j f35623d;

    /* renamed from: e, reason: collision with root package name */
    public final z8.g f35624e;

    /* renamed from: f, reason: collision with root package name */
    public final n8.e f35625f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f35626g;

    public l(y8.j jVar, List list, int i10, y8.j jVar2, z8.g gVar, n8.e eVar, boolean z10) {
        this.f35620a = jVar;
        this.f35621b = list;
        this.f35622c = i10;
        this.f35623d = jVar2;
        this.f35624e = gVar;
        this.f35625f = eVar;
        this.f35626g = z10;
    }

    public final void a(y8.j jVar, j jVar2) {
        Context context = jVar.f41362a;
        y8.j jVar3 = this.f35620a;
        if (context == jVar3.f41362a) {
            if (jVar.f41363b != y8.l.f41388a) {
                if (jVar.f41364c == jVar3.f41364c) {
                    if (jVar.A == jVar3.A) {
                        if (jVar.B == jVar3.B) {
                            return;
                        }
                        throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
                    }
                    throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's lifecycle.").toString());
                }
                throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's target.").toString());
            }
            throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot set the request's data to null.").toString());
        }
        throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's context.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(y8.j r13, yt.a r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof t8.k
            if (r0 == 0) goto L13
            r0 = r14
            t8.k r0 = (t8.k) r0
            int r1 = r0.f35619e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35619e = r1
            goto L18
        L13:
            t8.k r0 = new t8.k
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f35617c
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f35619e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            t8.j r13 = r0.f35616b
            t8.l r0 = r0.f35615a
            ut.n.b(r14)
            goto L71
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            ut.n.b(r14)
            java.util.List r14 = r12.f35621b
            int r2 = r12.f35622c
            if (r2 <= 0) goto L47
            int r4 = r2 + (-1)
            java.lang.Object r4 = r14.get(r4)
            t8.j r4 = (t8.j) r4
            r12.a(r13, r4)
        L47:
            java.lang.Object r14 = r14.get(r2)
            t8.j r14 = (t8.j) r14
            int r7 = r2 + 1
            z8.g r9 = r12.f35624e
            t8.l r2 = new t8.l
            y8.j r5 = r12.f35620a
            java.util.List r6 = r12.f35621b
            n8.e r10 = r12.f35625f
            boolean r11 = r12.f35626g
            r4 = r2
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.f35615a = r12
            r0.f35616b = r14
            r0.f35619e = r3
            r13 = r14
            t8.i r13 = (t8.i) r13
            java.lang.Object r14 = r13.d(r2, r0)
            if (r14 != r1) goto L70
            return r1
        L70:
            r0 = r12
        L71:
            y8.k r14 = (y8.k) r14
            y8.j r1 = r14.b()
            r0.a(r1, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.l.b(y8.j, yt.a):java.lang.Object");
    }
}
