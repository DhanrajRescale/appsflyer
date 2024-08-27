package i0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0.v0 f18838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f18839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18840c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f18841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f18842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p2.c0 f18843f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p2.v f18844g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w2.b f18845h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18846i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(l0.v0 v0Var, q1 q1Var, boolean z10, boolean z11, Function1 function1, p2.c0 c0Var, p2.v vVar, w2.b bVar, int i10) {
        super(2);
        this.f18838a = v0Var;
        this.f18839b = q1Var;
        this.f18840c = z10;
        this.f18841d = z11;
        this.f18842e = function1;
        this.f18843f = c0Var;
        this.f18844g = vVar;
        this.f18845h = bVar;
        this.f18846i = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        if (r4 != false) goto L28;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            t0.n r9 = (t0.n) r9
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r10 = r10 & 3
            r0 = 2
            if (r10 != r0) goto L1c
            r10 = r9
            t0.r r10 = (t0.r) r10
            boolean r0 = r10.G()
            if (r0 != 0) goto L17
            goto L1c
        L17:
            r10.V()
            goto Lc7
        L1c:
            i0.d0 r10 = new i0.d0
            i0.q1 r2 = r8.f18839b
            kotlin.jvm.functions.Function1 r3 = r8.f18842e
            p2.c0 r4 = r8.f18843f
            p2.v r5 = r8.f18844g
            w2.b r6 = r8.f18845h
            int r7 = r8.f18846i
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            t0.r r9 = (t0.r) r9
            r0 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r9.b0(r0)
            g1.l r0 = g1.l.f16404b
            int r1 = r9.P
            t0.r1 r2 = r9.o()
            c2.k r3 = c2.l.M
            r3.getClass()
            c2.j r3 = c2.k.f7746b
            b1.c r0 = androidx.compose.ui.layout.a.j(r0)
            t0.f r4 = r9.f35166a
            boolean r4 = r4 instanceof t0.f
            if (r4 == 0) goto Lca
            r9.e0()
            boolean r4 = r9.O
            if (r4 == 0) goto L5a
            r9.n(r3)
            goto L5d
        L5a:
            r9.n0()
        L5d:
            c2.i r3 = c2.k.f7749e
            t0.t.v0(r9, r10, r3)
            c2.i r10 = c2.k.f7748d
            t0.t.v0(r9, r2, r10)
            c2.i r10 = c2.k.f7750f
            boolean r2 = r9.O
            if (r2 != 0) goto L7b
            java.lang.Object r2 = r9.Q()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            boolean r2 = kotlin.jvm.internal.Intrinsics.a(r2, r3)
            if (r2 != 0) goto L7e
        L7b:
            nn.d.s(r1, r9, r1, r10)
        L7e:
            t0.m2 r10 = new t0.m2
            r10.<init>(r9)
            r1 = 0
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            nn.d.q(r1, r0, r10, r9, r2)
            r10 = 1
            v.e.x(r9, r1, r10, r1)
            i0.q1 r0 = r8.f18839b
            i0.a1 r2 = r0.a()
            i0.a1 r3 = i0.a1.f18782a
            boolean r4 = r8.f18840c
            if (r2 == r3) goto Lb0
            a2.u r2 = r0.c()
            if (r2 == 0) goto Lb0
            a2.u r2 = r0.c()
            kotlin.jvm.internal.Intrinsics.c(r2)
            boolean r2 = r2.m()
            if (r2 == 0) goto Lb0
            if (r4 == 0) goto Lb0
            goto Lb1
        Lb0:
            r10 = r1
        Lb1:
            l0.v0 r2 = r8.f18838a
            i0.l1.j(r2, r10, r9, r1)
            i0.a1 r10 = r0.a()
            i0.a1 r0 = i0.a1.f18784c
            if (r10 != r0) goto Lc7
            boolean r10 = r8.f18841d
            if (r10 != 0) goto Lc7
            if (r4 == 0) goto Lc7
            i0.l1.i(r2, r9, r1)
        Lc7:
            kotlin.Unit r9 = kotlin.Unit.f23355a
            return r9
        Lca:
            al.d.v0()
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
