package d0;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class q0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.y f13203c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0 f13204d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(int i10, int i11, t.y yVar, r0 r0Var) {
        super(1);
        this.f13201a = i10;
        this.f13202b = i11;
        this.f13203c = yVar;
        this.f13204d = r0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        if (r3 == null) goto L7;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r8) {
        /*
            r7 = this;
            d0.f r8 = (d0.f) r8
            java.lang.Object r0 = r8.f13159c
            d0.q r0 = (d0.q) r0
            kotlin.jvm.functions.Function1 r0 = r0.getKey()
            int r1 = r7.f13201a
            int r2 = r8.f13157a
            int r1 = java.lang.Math.max(r1, r2)
            int r8 = r8.f13158b
            int r8 = r8 + r2
            int r8 = r8 + (-1)
            int r3 = r7.f13202b
            int r8 = java.lang.Math.min(r3, r8)
            if (r1 > r8) goto L52
        L1f:
            if (r0 == 0) goto L2d
            int r3 = r1 - r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.invoke(r3)
            if (r3 != 0) goto L32
        L2d:
            d0.d r3 = new d0.d
            r3.<init>(r1)
        L32:
            t.y r4 = r7.f13203c
            int r5 = r4.c(r3)
            if (r5 >= 0) goto L3b
            int r5 = ~r5
        L3b:
            java.lang.Object[] r6 = r4.f34926b
            r6[r5] = r3
            int[] r4 = r4.f34927c
            r4[r5] = r1
            d0.r0 r4 = r7.f13204d
            java.lang.Object[] r5 = r4.f13211b
            int r4 = r4.f13212c
            int r4 = r1 - r4
            r5[r4] = r3
            if (r1 == r8) goto L52
            int r1 = r1 + 1
            goto L1f
        L52:
            kotlin.Unit r8 = kotlin.Unit.f23355a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.q0.invoke(java.lang.Object):java.lang.Object");
    }
}
