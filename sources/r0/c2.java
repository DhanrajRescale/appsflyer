package r0;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c2 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z2 f32350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f32351b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(z2 z2Var, float f10) {
        super(1);
        this.f32350a = z2Var;
        this.f32351b = f10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r6.containsKey(r1) != false) goto L13;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            w2.j r6 = (w2.j) r6
            long r0 = r6.f38798a
            m0.r4 r6 = new m0.r4
            float r2 = r5.f32351b
            r0.z2 r3 = r5.f32350a
            r6.<init>(r2, r0, r3)
            r0.f1 r0 = new r0.f1
            r0.x0 r1 = new r0.x0
            r1.<init>()
            r6.invoke(r1)
            java.util.LinkedHashMap r6 = r1.f32801a
            r0.<init>(r6)
            r0.t r1 = r3.f32833c
            t0.j0 r1 = r1.f32722g
            java.lang.Object r1 = r1.getValue()
            r0.a3 r1 = (r0.a3) r1
            int r1 = r1.ordinal()
            r0.a3 r2 = r0.a3.f32324a
            if (r1 == 0) goto L4e
            r4 = 1
            if (r1 == r4) goto L3b
            r4 = 2
            if (r1 != r4) goto L35
            goto L3b
        L35:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L3b:
            r0.a3 r1 = r0.a3.f32326c
            boolean r4 = r6.containsKey(r1)
            if (r4 == 0) goto L45
        L43:
            r2 = r1
            goto L4e
        L45:
            r0.a3 r1 = r0.a3.f32325b
            boolean r6 = r6.containsKey(r1)
            if (r6 == 0) goto L4e
            goto L43
        L4e:
            r0.t r6 = r3.f32833c
            r0.f1 r1 = r6.d()
            boolean r1 = kotlin.jvm.internal.Intrinsics.a(r1, r0)
            if (r1 != 0) goto L81
            t0.n1 r1 = r6.f32727l
            r1.setValue(r0)
            r0.s r0 = new r0.s
            r1 = 0
            r0.<init>(r1, r6, r2)
            r0.e1 r1 = r6.f32719d
            yu.d r1 = r1.f32384b
            r3 = 0
            boolean r4 = r1.e(r3)
            if (r4 == 0) goto L7c
            r0.mo2invoke()     // Catch: java.lang.Throwable -> L77
            r1.a(r3)
            goto L7c
        L77:
            r6 = move-exception
            r1.a(r3)
            throw r6
        L7c:
            if (r4 != 0) goto L81
            r6.i(r2)
        L81:
            kotlin.Unit r6 = kotlin.Unit.f23355a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.c2.invoke(java.lang.Object):java.lang.Object");
    }
}
