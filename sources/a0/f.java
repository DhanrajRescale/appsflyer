package a0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n1.t;
import q0.d0;
import q0.g0;
import q0.s;
import q0.v;
import q0.w;
import q0.z;
import qu.f0;
import t0.g1;

/* loaded from: classes.dex */
public final class f implements tu.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.f9a = i10;
        this.f10b = obj;
        this.f11c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    @Override // tu.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r11, yt.a r12) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.f.a(java.lang.Object, yt.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(int r5, yt.a r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof tu.d1
            if (r0 == 0) goto L13
            r0 = r6
            tu.d1 r0 = (tu.d1) r0
            int r1 = r0.f36427c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36427c = r1
            goto L18
        L13:
            tu.d1 r0 = new tu.d1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f36425a
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f36427c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ut.n.b(r6)
            goto L50
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            ut.n.b(r6)
            if (r5 <= 0) goto L53
            java.lang.Object r5 = r4.f10b
            r6 = r5
            iu.v r6 = (iu.v) r6
            boolean r6 = r6.f20556a
            if (r6 != 0) goto L53
            iu.v r5 = (iu.v) r5
            r5.f20556a = r3
            java.lang.Object r5 = r4.f11c
            tu.g r5 = (tu.g) r5
            tu.z0 r6 = tu.z0.f36595a
            r0.f36427c = r3
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L50
            return r1
        L50:
            kotlin.Unit r5 = kotlin.Unit.f23355a
            return r5
        L53:
            kotlin.Unit r5 = kotlin.Unit.f23355a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.f.b(int, yt.a):java.lang.Object");
    }

    public final Object c(j jVar) {
        int i10 = this.f9a;
        Object obj = this.f11c;
        Object obj2 = this.f10b;
        switch (i10) {
            case 0:
                if (jVar instanceof d) {
                    ((List) obj2).add(jVar);
                } else if (jVar instanceof e) {
                    ((List) obj2).remove(((e) jVar).f8a);
                }
                ((g1) obj).setValue(Boolean.valueOf(!((List) obj2).isEmpty()));
                return Unit.f23355a;
            case 1:
            default:
                if (jVar instanceof n) {
                    ((z) obj2).Q0((n) jVar);
                } else if (jVar instanceof o) {
                    ((z) obj2).S0(((o) jVar).f19a);
                } else if (jVar instanceof m) {
                    ((z) obj2).S0(((m) jVar).f17a);
                } else {
                    z zVar = (z) obj2;
                    f0 f0Var = (f0) obj;
                    g0 g0Var = zVar.f31561s;
                    if (g0Var == null) {
                        g0Var = new g0(zVar.f31557o, zVar.f31560r);
                        c2.g.s(zVar);
                        zVar.f31561s = g0Var;
                    }
                    g0Var.c(jVar, f0Var);
                }
                return Unit.f23355a;
            case 2:
                if (jVar instanceof n) {
                    n nVar = (n) jVar;
                    q0.a aVar = (q0.a) ((w) obj2);
                    s sVar = aVar.f31460h;
                    if (sVar == null) {
                        sVar = d0.a(aVar.f31459g);
                        aVar.f31460h = sVar;
                        Intrinsics.c(sVar);
                    }
                    v a10 = sVar.a(aVar);
                    a10.b(nVar, aVar.f31455c, aVar.f31463k, aVar.f31464l, ((t) aVar.f31457e.getValue()).f28179a, ((q0.i) aVar.f31458f.getValue()).f31503d, aVar.f31465m);
                    aVar.f31461i.setValue(a10);
                } else if (jVar instanceof o) {
                    n nVar2 = ((o) jVar).f19a;
                    v vVar = (v) ((q0.a) ((w) obj2)).f31461i.getValue();
                    if (vVar != null) {
                        vVar.d();
                    }
                } else if (jVar instanceof m) {
                    n nVar3 = ((m) jVar).f17a;
                    v vVar2 = (v) ((q0.a) ((w) obj2)).f31461i.getValue();
                    if (vVar2 != null) {
                        vVar2.d();
                    }
                } else {
                    ((w) obj2).f31551b.c(jVar, (f0) obj);
                }
                return Unit.f23355a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.Unit e(c0.x r8) {
        /*
            r7 = this;
            int r0 = r7.f9a
            r1 = 1
            java.lang.Object r2 = r7.f10b
            r3 = 0
            java.lang.Object r4 = r7.f11c
            r5 = 0
            switch(r0) {
                case 6: goto L4f;
                default: goto Lc;
            }
        Lc:
            if (r8 == 0) goto L12
            c0.a0 r8 = (c0.a0) r8
            java.util.List r5 = r8.f7447j
        L12:
            t0.g1 r4 = (t0.g1) r4
            if (r5 == 0) goto L45
            java.lang.String r2 = (java.lang.String) r2
            boolean r8 = r5.isEmpty()
            if (r8 == 0) goto L20
        L1e:
            r1 = r3
            goto L44
        L20:
            java.util.Iterator r8 = r5.iterator()
        L24:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r8.next()
            c0.n r0 = (c0.n) r0
            c0.b0 r0 = (c0.b0) r0
            java.lang.Object r5 = r0.f7473j
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L24
            boolean r5 = kotlin.jvm.internal.Intrinsics.a(r5, r2)
            if (r5 == 0) goto L24
            r5 = 40
            int r0 = r0.f7477n
            if (r0 <= r5) goto L24
        L44:
            r3 = r1
        L45:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            r4.setValue(r8)
            kotlin.Unit r8 = kotlin.Unit.f23355a
            return r8
        L4f:
            c0.a0 r8 = (c0.a0) r8
            java.util.List r8 = r8.f7447j
            t0.g1 r2 = (t0.g1) r2
            t0.g1 r4 = (t0.g1) r4
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L63
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L63
        L61:
            r1 = r3
            goto L8b
        L63:
            java.util.Iterator r8 = r8.iterator()
        L67:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r8.next()
            c0.n r0 = (c0.n) r0
            c0.b0 r0 = (c0.b0) r0
            java.lang.Object r0 = r0.f7473j
            java.lang.Object r6 = r4.getValue()
            ut.p r6 = (ut.p) r6
            if (r6 == 0) goto L84
            java.lang.Object r6 = r6.f37400a
            java.lang.String r6 = (java.lang.String) r6
            goto L85
        L84:
            r6 = r5
        L85:
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r6)
            if (r0 == 0) goto L67
        L8b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            r2.setValue(r8)
            java.lang.Object r8 = r2.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto La1
            r4.setValue(r5)
        La1:
            kotlin.Unit r8 = kotlin.Unit.f23355a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.f.e(c0.x):kotlin.Unit");
    }

    public f(g1 g1Var, g1 g1Var2) {
        this.f9a = 6;
        this.f11c = g1Var;
        this.f10b = g1Var2;
    }
}
