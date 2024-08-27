package g7;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17064a;

    /* renamed from: b, reason: collision with root package name */
    public final x3 f17065b;

    /* renamed from: c, reason: collision with root package name */
    public final b3 f17066c;

    /* renamed from: d, reason: collision with root package name */
    public final tu.f f17067d;

    /* renamed from: e, reason: collision with root package name */
    public final y3 f17068e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f17069f;

    /* renamed from: g, reason: collision with root package name */
    public final hr.c f17070g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f17071h;

    /* renamed from: i, reason: collision with root package name */
    public final su.c f17072i;

    /* renamed from: j, reason: collision with root package name */
    public final u2 f17073j;

    /* renamed from: k, reason: collision with root package name */
    public final qu.q1 f17074k;

    /* renamed from: l, reason: collision with root package name */
    public final tu.r f17075l;

    public t2(Object obj, x3 pagingSource, b3 config, tu.f retryFlow, e4 e4Var, y3 y3Var, l1.d jumpCallback) {
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(retryFlow, "retryFlow");
        Intrinsics.checkNotNullParameter(jumpCallback, "jumpCallback");
        this.f17064a = obj;
        this.f17065b = pagingSource;
        this.f17066c = config;
        this.f17067d = retryFlow;
        this.f17068e = y3Var;
        this.f17069f = jumpCallback;
        if (config.f16675f == Integer.MIN_VALUE) {
            this.f17070g = new hr.c(17);
            this.f17071h = new AtomicBoolean(false);
            this.f17072i = hl.f.a(-2, null, 6);
            this.f17073j = new u2(config);
            qu.q1 controller = hl.f.l();
            this.f17074k = controller;
            n2 block = new n2(this, null);
            Intrinsics.checkNotNullParameter(controller, "controller");
            Intrinsics.checkNotNullParameter(block, "block");
            this.f17075l = new tu.r(new o2(this, null), q6.l.u(new b0(controller, block, null)));
            return;
        }
        pagingSource.getClass();
        throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
    }

    public static final Object a(t2 t2Var, tu.r rVar, b1 b1Var, yt.a aVar) {
        t2Var.getClass();
        tu.f a10 = r0.a(rVar, new z1(null, t2Var, b1Var));
        a2 operation = new a2(0, b1Var, null);
        Intrinsics.checkNotNullParameter(a10, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object c10 = el.l.x(new tu.j((Function2) new l0(a10, operation, null)), -1).c(new a0.f(4, t2Var, b1Var), aVar);
        if (c10 != zt.a.f42823a) {
            return Unit.f23355a;
        }
        return c10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x03c3, code lost:
    
        r8.getClass();
        r10 = r19;
        r13 = r20;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0031. Please report as an issue. */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0385 A[Catch: all -> 0x03b2, TRY_LEAVE, TryCatch #2 {all -> 0x03b2, blocks: (B:189:0x036e, B:191:0x0385), top: B:188:0x036e }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06c6 A[Catch: all -> 0x02cf, TRY_ENTER, TryCatch #8 {all -> 0x02cf, blocks: (B:201:0x02a9, B:207:0x033b, B:212:0x02b8, B:214:0x02c2, B:217:0x02d5, B:219:0x02db, B:221:0x02f2, B:223:0x02f7, B:225:0x0302, B:227:0x0308, B:230:0x031f, B:232:0x0336, B:234:0x06c6, B:235:0x06cb), top: B:200:0x02a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0603 A[Catch: all -> 0x0633, TryCatch #3 {all -> 0x0633, blocks: (B:65:0x05f7, B:67:0x0603, B:72:0x0630, B:73:0x063a, B:75:0x064d, B:77:0x0651, B:79:0x0659, B:81:0x065d, B:82:0x0662, B:83:0x0660, B:84:0x0665), top: B:64:0x05f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0651 A[Catch: all -> 0x0633, TryCatch #3 {all -> 0x0633, blocks: (B:65:0x05f7, B:67:0x0603, B:72:0x0630, B:73:0x063a, B:75:0x064d, B:77:0x0651, B:79:0x0659, B:81:0x065d, B:82:0x0662, B:83:0x0660, B:84:0x0665), top: B:64:0x05f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x065d A[Catch: all -> 0x0633, TryCatch #3 {all -> 0x0633, blocks: (B:65:0x05f7, B:67:0x0603, B:72:0x0630, B:73:0x063a, B:75:0x064d, B:77:0x0651, B:79:0x0659, B:81:0x065d, B:82:0x0662, B:83:0x0660, B:84:0x0665), top: B:64:0x05f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0660 A[Catch: all -> 0x0633, TryCatch #3 {all -> 0x0633, blocks: (B:65:0x05f7, B:67:0x0603, B:72:0x0630, B:73:0x063a, B:75:0x064d, B:77:0x0651, B:79:0x0659, B:81:0x065d, B:82:0x0662, B:83:0x0660, B:84:0x0665), top: B:64:0x05f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /* JADX WARN: Type inference failed for: r0v9, types: [yu.a] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [yu.a] */
    /* JADX WARN: Type inference failed for: r1v33, types: [yu.a] */
    /* JADX WARN: Type inference failed for: r1v44, types: [yu.a] */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r5v23, types: [g7.v3] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v46, types: [g7.v3] */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, g7.v3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(g7.t2 r22, g7.b1 r23, g7.s0 r24, yt.a r25) {
        /*
            Method dump skipped, instructions count: 1782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.t2.b(g7.t2, g7.b1, g7.s0, yt.a):java.lang.Object");
    }

    public static final Object c(t2 t2Var, b1 loadType, w4 viewportHint, k2 k2Var) {
        t2Var.getClass();
        if (y1.f17135a[loadType.ordinal()] == 1) {
            Object f10 = t2Var.f(k2Var);
            if (f10 != zt.a.f42823a) {
                return Unit.f23355a;
            }
            return f10;
        }
        if (viewportHint != null) {
            hr.c cVar = t2Var.f17070g;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
            if (loadType != b1.f16664b && loadType != b1.f16665c) {
                throw new IllegalArgumentException(("invalid load type for reset: " + loadType).toString());
            }
            ((q.h) cVar.f18690b).e(null, new y.q0(12, loadType, viewportHint));
            return Unit.f23355a;
        }
        throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
    }

    public static final void d(t2 t2Var, qu.f0 f0Var) {
        if (t2Var.f17066c.f16675f != Integer.MIN_VALUE) {
            yk.g.H(f0Var, null, null, new q2(t2Var, null), 3);
        }
        yk.g.H(f0Var, null, null, new r2(t2Var, null), 3);
        yk.g.H(f0Var, null, null, new s2(t2Var, null), 3);
    }

    public static String h(b1 b1Var, Object obj, v3 v3Var) {
        if (v3Var == null) {
            return "End " + b1Var + " with loadkey " + obj + ". Load CANCELLED.";
        }
        return "End " + b1Var + " with loadKey " + obj + ". Returned " + v3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(yt.a r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof g7.d2
            if (r0 == 0) goto L13
            r0 = r6
            g7.d2 r0 = (g7.d2) r0
            int r1 = r0.f16713f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16713f = r1
            goto L18
        L13:
            g7.d2 r0 = new g7.d2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f16711d
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f16713f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            yu.d r1 = r0.f16710c
            g7.u2 r2 = r0.f16709b
            g7.t2 r0 = r0.f16708a
            ut.n.b(r6)
            goto L4e
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            ut.n.b(r6)
            g7.u2 r2 = r5.f17073j
            yu.d r6 = r2.f17084a
            r0.f16708a = r5
            r0.f16709b = r2
            r0.f16710c = r6
            r0.f16713f = r4
            java.lang.Object r0 = r6.b(r3, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            g7.y2 r6 = r2.f17085b     // Catch: java.lang.Throwable -> L62
            hr.c r0 = r0.f17070g     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r0.f18690b     // Catch: java.lang.Throwable -> L62
            q.h r0 = (q.h) r0     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r0.f31452d     // Catch: java.lang.Throwable -> L62
            g7.u4 r0 = (g7.u4) r0     // Catch: java.lang.Throwable -> L62
            g7.y3 r6 = r6.a(r0)     // Catch: java.lang.Throwable -> L62
            r1.a(r3)
            return r6
        L62:
            r6 = move-exception
            r1.a(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.t2.e(yt.a):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x026e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0198 A[Catch: all -> 0x019c, TRY_ENTER, TryCatch #4 {all -> 0x019c, blocks: (B:62:0x017e, B:64:0x018a, B:67:0x0198, B:68:0x019f, B:70:0x01a6), top: B:61:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a6 A[Catch: all -> 0x019c, TRY_LEAVE, TryCatch #4 {all -> 0x019c, blocks: (B:62:0x017e, B:64:0x018a, B:67:0x0198, B:68:0x019f, B:70:0x01a6), top: B:61:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [yu.a] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v8, types: [yu.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(yt.a r17) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.t2.f(yt.a):java.lang.Object");
    }

    public final s3 g(b1 loadType, Object obj) {
        int i10;
        b1 b1Var = b1.f16663a;
        b3 b3Var = this.f17066c;
        if (loadType == b1Var) {
            i10 = b3Var.f16673d;
        } else {
            i10 = b3Var.f16670a;
        }
        boolean z10 = b3Var.f16672c;
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int ordinal = loadType.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (obj != null) {
                        return new p3(obj, z10, i10);
                    }
                    throw new IllegalArgumentException("key cannot be null for append".toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            if (obj != null) {
                return new q3(obj, z10, i10);
            }
            throw new IllegalArgumentException("key cannot be null for prepend".toString());
        }
        return new r3(obj, z10, i10);
    }

    public final Object i(y2 y2Var, b1 loadType, int i10, int i11) {
        int i12;
        y2Var.getClass();
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int ordinal = loadType.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i12 = y2Var.f17143h;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i12 = y2Var.f17142g;
            }
            if (i10 != i12 || (y2Var.f17147l.p(loadType) instanceof w0) || i11 >= this.f17066c.f16671b) {
                return null;
            }
            b1 b1Var = b1.f16664b;
            ArrayList arrayList = y2Var.f17138c;
            if (loadType == b1Var) {
                return ((u3) vt.g0.u(arrayList)).f17087b;
            }
            return ((u3) vt.g0.C(arrayList)).f17088c;
        }
        throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
    }

    public final Object j(y2 y2Var, b1 b1Var, w0 w0Var, au.c cVar) {
        if (!Intrinsics.a(y2Var.f17147l.p(b1Var), w0Var)) {
            h.c cVar2 = y2Var.f17147l;
            cVar2.V(b1Var, w0Var);
            Object h10 = this.f17072i.h(new h1(cVar2.X(), null), cVar);
            if (h10 == zt.a.f42823a) {
                return h10;
            }
            return Unit.f23355a;
        }
        return Unit.f23355a;
    }

    public final Object k(y2 y2Var, b1 b1Var, au.c cVar) {
        z0 p10 = y2Var.f17147l.p(b1Var);
        x0 x0Var = x0.f17118b;
        if (!Intrinsics.a(p10, x0Var)) {
            h.c cVar2 = y2Var.f17147l;
            cVar2.V(b1Var, x0Var);
            Object h10 = this.f17072i.h(new h1(cVar2.X(), null), cVar);
            if (h10 == zt.a.f42823a) {
                return h10;
            }
            return Unit.f23355a;
        }
        return Unit.f23355a;
    }
}
