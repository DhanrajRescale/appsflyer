package w1;

import kotlin.jvm.functions.Function0;
import qu.f0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public b2.f f38757a;

    /* renamed from: b, reason: collision with root package name */
    public Function0 f38758b = new x.a(this, 24);

    /* renamed from: c, reason: collision with root package name */
    public f0 f38759c;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r8, long r10, yt.a r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof w1.b
            if (r0 == 0) goto L14
            r0 = r12
            w1.b r0 = (w1.b) r0
            int r1 = r0.f38753c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f38753c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            w1.b r0 = new w1.b
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f38751a
            zt.a r0 = zt.a.f42823a
            int r1 = r6.f38753c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            ut.n.b(r12)
            goto L45
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            ut.n.b(r12)
            w1.g r1 = r7.d()
            if (r1 == 0) goto L4a
            r6.f38753c = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.f(r2, r4, r6)
            if (r12 != r0) goto L45
            return r0
        L45:
            w2.o r12 = (w2.o) r12
            long r8 = r12.f38810a
            goto L4c
        L4a:
            long r8 = w2.o.f38808b
        L4c:
            w2.o r10 = new w2.o
            r10.<init>(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.d.a(long, long, yt.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r5, yt.a r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof w1.c
            if (r0 == 0) goto L13
            r0 = r7
            w1.c r0 = (w1.c) r0
            int r1 = r0.f38756c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38756c = r1
            goto L18
        L13:
            w1.c r0 = new w1.c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f38754a
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f38756c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ut.n.b(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            ut.n.b(r7)
            w1.g r7 = r4.d()
            if (r7 == 0) goto L46
            r0.f38756c = r3
            java.lang.Object r7 = r7.O(r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            w2.o r7 = (w2.o) r7
            long r5 = r7.f38810a
            goto L48
        L46:
            long r5 = w2.o.f38808b
        L48:
            w2.o r7 = new w2.o
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.d.b(long, yt.a):java.lang.Object");
    }

    public final f0 c() {
        f0 f0Var = (f0) this.f38758b.mo2invoke();
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final g d() {
        b2.f fVar = this.f38757a;
        if (fVar != null) {
            return (g) fVar.c(i.f38775a);
        }
        return null;
    }
}
