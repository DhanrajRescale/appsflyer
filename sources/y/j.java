package y;

import com.google.android.gms.common.api.Api;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class j extends c2.o implements c2.w1, c2.m {
    public a0.b A;

    /* renamed from: p, reason: collision with root package name */
    public Function1 f40779p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f40780q;

    /* renamed from: r, reason: collision with root package name */
    public a0.l f40781r;

    /* renamed from: s, reason: collision with root package name */
    public Function0 f40782s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f40783t;

    /* renamed from: u, reason: collision with root package name */
    public final a f40784u = new a(this, 0);

    /* renamed from: v, reason: collision with root package name */
    public final x.a f40785v = new x.a(this, 3);

    /* renamed from: w, reason: collision with root package name */
    public final y1.d f40786w = new y1.d();

    /* renamed from: x, reason: collision with root package name */
    public boolean f40787x;

    /* renamed from: y, reason: collision with root package name */
    public final x1.i0 f40788y;

    /* renamed from: z, reason: collision with root package name */
    public final su.c f40789z;

    public j(h0 h0Var, boolean z10, a0.l lVar, Function0 function0, boolean z11) {
        this.f40779p = h0Var;
        this.f40780q = z10;
        this.f40781r = lVar;
        this.f40782s = function0;
        this.f40783t = z11;
        d dVar = new d(this, null);
        x1.k kVar = x1.h0.f39855a;
        x1.o0 o0Var = new x1.o0(dVar);
        Q0(o0Var);
        this.f40788y = o0Var;
        this.f40789z = hl.f.a(Api.BaseClientBuilder.API_PRIORITY_OTHER, null, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object T0(y.j r8, yt.a r9, qu.f0 r10) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof y.e
            if (r0 == 0) goto L16
            r0 = r9
            y.e r0 = (y.e) r0
            int r1 = r0.f40665e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f40665e = r1
            goto L1b
        L16:
            y.e r0 = new y.e
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.f40663c
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f40665e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            ut.n.b(r9)
            goto L6c
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            qu.f0 r10 = r0.f40662b
            y.j r8 = r0.f40661a
            ut.n.b(r9)
            goto L5b
        L3e:
            ut.n.b(r9)
            a0.b r9 = r8.A
            if (r9 == 0) goto L5d
            a0.l r2 = r8.f40781r
            if (r2 == 0) goto L5b
            a0.a r6 = new a0.a
            r6.<init>(r9)
            r0.f40661a = r8
            r0.f40662b = r10
            r0.f40665e = r4
            java.lang.Object r9 = r2.a(r6, r0)
            if (r9 != r1) goto L5b
            goto L6e
        L5b:
            r8.A = r5
        L5d:
            long r6 = w2.o.f38808b
            r0.f40661a = r5
            r0.f40662b = r5
            r0.f40665e = r3
            java.lang.Object r8 = r8.X0(r10, r6, r0)
            if (r8 != r1) goto L6c
            goto L6e
        L6c:
            kotlin.Unit r1 = kotlin.Unit.f23355a
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y.j.T0(y.j, yt.a, qu.f0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r11v4, types: [a0.j, java.lang.Object, a0.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object U0(y.j r8, qu.f0 r9, y.b0 r10, yt.a r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof y.f
            if (r0 == 0) goto L16
            r0 = r11
            y.f r0 = (y.f) r0
            int r1 = r0.f40690g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f40690g = r1
            goto L1b
        L16:
            y.f r0 = new y.f
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.f40688e
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f40690g
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            ut.n.b(r11)
            goto Lb6
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            a0.b r8 = r0.f40687d
            y.b0 r9 = r0.f40686c
            qu.f0 r10 = r0.f40685b
            y.j r2 = r0.f40684a
            ut.n.b(r11)
            goto L8d
        L45:
            y.b0 r10 = r0.f40686c
            qu.f0 r9 = r0.f40685b
            y.j r8 = r0.f40684a
            ut.n.b(r11)
            goto L6e
        L4f:
            ut.n.b(r11)
            a0.b r11 = r8.A
            if (r11 == 0) goto L6e
            a0.l r2 = r8.f40781r
            if (r2 == 0) goto L6e
            a0.a r6 = new a0.a
            r6.<init>(r11)
            r0.f40684a = r8
            r0.f40685b = r9
            r0.f40686c = r10
            r0.f40690g = r5
            java.lang.Object r11 = r2.a(r6, r0)
            if (r11 != r1) goto L6e
            goto Lb8
        L6e:
            a0.b r11 = new a0.b
            r11.<init>()
            a0.l r2 = r8.f40781r
            if (r2 == 0) goto L92
            r0.f40684a = r8
            r0.f40685b = r9
            r0.f40686c = r10
            r0.f40687d = r11
            r0.f40690g = r4
            java.lang.Object r2 = r2.a(r11, r0)
            if (r2 != r1) goto L88
            goto Lb8
        L88:
            r2 = r8
            r8 = r11
            r7 = r10
            r10 = r9
            r9 = r7
        L8d:
            r11 = r8
            r8 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L92:
            r8.A = r11
            long r10 = r10.f40622i
            r2 = 0
            r0.f40684a = r2
            r0.f40685b = r2
            r0.f40686c = r2
            r0.f40687d = r2
            r0.f40690g = r3
            y.v0 r8 = (y.v0) r8
            hu.c r8 = r8.D
            m1.c r2 = new m1.c
            r2.<init>(r10)
            java.lang.Object r8 = r8.b(r9, r2, r0)
            if (r8 != r1) goto Lb1
            goto Lb3
        Lb1:
            kotlin.Unit r8 = kotlin.Unit.f23355a
        Lb3:
            if (r8 != r1) goto Lb6
            goto Lb8
        Lb6:
            kotlin.Unit r1 = kotlin.Unit.f23355a
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y.j.U0(y.j, qu.f0, y.b0, yt.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object V0(y.j r7, qu.f0 r8, y.c0 r9, yt.a r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof y.g
            if (r0 == 0) goto L16
            r0 = r10
            y.g r0 = (y.g) r0
            int r1 = r0.f40716f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f40716f = r1
            goto L1b
        L16:
            y.g r0 = new y.g
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.f40714d
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f40716f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            ut.n.b(r10)
            goto L72
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            y.c0 r9 = r0.f40713c
            qu.f0 r8 = r0.f40712b
            y.j r7 = r0.f40711a
            ut.n.b(r10)
            goto L5f
        L40:
            ut.n.b(r10)
            a0.b r10 = r7.A
            if (r10 == 0) goto L61
            a0.l r2 = r7.f40781r
            if (r2 == 0) goto L5f
            a0.c r6 = new a0.c
            r6.<init>(r10)
            r0.f40711a = r7
            r0.f40712b = r8
            r0.f40713c = r9
            r0.f40716f = r4
            java.lang.Object r10 = r2.a(r6, r0)
            if (r10 != r1) goto L5f
            goto L74
        L5f:
            r7.A = r5
        L61:
            long r9 = r9.f40637i
            r0.f40711a = r5
            r0.f40712b = r5
            r0.f40713c = r5
            r0.f40716f = r3
            java.lang.Object r7 = r7.X0(r8, r9, r0)
            if (r7 != r1) goto L72
            goto L74
        L72:
            kotlin.Unit r1 = kotlin.Unit.f23355a
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y.j.V0(y.j, qu.f0, y.c0, yt.a):java.lang.Object");
    }

    @Override // c2.w1
    public final void D() {
        ((x1.o0) this.f40788y).D();
    }

    @Override // c2.w1
    public final void J(x1.k kVar, x1.l lVar, long j10) {
        ((x1.o0) this.f40788y).J(kVar, lVar, j10);
    }

    @Override // g1.n
    public final void J0() {
        this.f40787x = false;
        W0();
    }

    public final void W0() {
        a0.b bVar = this.A;
        if (bVar != null) {
            a0.l lVar = this.f40781r;
            if (lVar != null) {
                lVar.b(new a0.a(bVar));
            }
            this.A = null;
        }
    }

    public abstract Object X0(qu.f0 f0Var, long j10, au.c cVar);
}
