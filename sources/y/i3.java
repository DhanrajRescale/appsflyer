package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class i3 {

    /* renamed from: a */
    public static final o0 f40778a = new o0(3, null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[LOOP:0: B:11:0x004b->B:12:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(x1.m0 r8, yt.a r9) {
        /*
            boolean r0 = r9 instanceof y.m2
            if (r0 == 0) goto L13
            r0 = r9
            y.m2 r0 = (y.m2) r0
            int r1 = r0.f40862c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40862c = r1
            goto L18
        L13:
            y.m2 r0 = new y.m2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f40861b
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f40862c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            x1.m0 r8 = r0.f40860a
            ut.n.b(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            ut.n.b(r9)
        L34:
            r0.f40860a = r8
            r0.f40862c = r3
            x1.l r9 = x1.l.f39878b
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L41
            goto L71
        L41:
            x1.k r9 = (x1.k) r9
            java.util.List r2 = r9.f39870a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4b:
            if (r6 >= r4) goto L59
            java.lang.Object r7 = r2.get(r6)
            x1.t r7 = (x1.t) r7
            r7.a()
            int r6 = r6 + 1
            goto L4b
        L59:
            java.util.List r9 = r9.f39870a
            int r2 = r9.size()
        L5f:
            if (r5 >= r2) goto L6f
            java.lang.Object r4 = r9.get(r5)
            x1.t r4 = (x1.t) r4
            boolean r4 = r4.f39912d
            if (r4 == 0) goto L6c
            goto L34
        L6c:
            int r5 = r5 + 1
            goto L5f
        L6f:
            kotlin.Unit r1 = kotlin.Unit.f23355a
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y.i3.a(x1.m0, yt.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(x1.m0 r10, boolean r11, x1.l r12, yt.a r13) {
        /*
            boolean r0 = r13 instanceof y.k2
            if (r0 == 0) goto L13
            r0 = r13
            y.k2 r0 = (y.k2) r0
            int r1 = r0.f40826e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40826e = r1
            goto L18
        L13:
            y.k2 r0 = new y.k2
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f40825d
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f40826e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r10 = r0.f40824c
            x1.l r11 = r0.f40823b
            x1.m0 r12 = r0.f40822a
            ut.n.b(r13)
            r9 = r11
            r11 = r10
            r10 = r12
            r12 = r9
            goto L4b
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            ut.n.b(r13)
        L3c:
            r0.f40822a = r10
            r0.f40823b = r12
            r0.f40824c = r11
            r0.f40826e = r3
            java.lang.Object r13 = r10.a(r12, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            x1.k r13 = (x1.k) r13
            java.util.List r2 = r13.f39870a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L55:
            if (r6 >= r4) goto L78
            java.lang.Object r7 = r2.get(r6)
            x1.t r7 = (x1.t) r7
            if (r11 == 0) goto L6e
            boolean r8 = r7.b()
            if (r8 != 0) goto L3c
            boolean r8 = r7.f39916h
            if (r8 != 0) goto L3c
            boolean r7 = r7.f39912d
            if (r7 == 0) goto L3c
            goto L75
        L6e:
            boolean r7 = t0.t.y(r7)
            if (r7 != 0) goto L75
            goto L3c
        L75:
            int r6 = r6 + 1
            goto L55
        L78:
            java.util.List r10 = r13.f39870a
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: y.i3.b(x1.m0, boolean, x1.l, yt.a):java.lang.Object");
    }

    public static /* synthetic */ Object c(x1.m0 m0Var, x1.l lVar, yt.a aVar, int i10) {
        boolean z10;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            lVar = x1.l.f39878b;
        }
        return b(m0Var, z10, lVar, aVar);
    }

    public static Object d(x1.z zVar, x.p2 p2Var, Function1 function1, yt.a aVar, int i10) {
        x.p2 p2Var2;
        o0 o0Var;
        Function1 function12;
        if ((i10 & 2) != 0) {
            p2Var2 = null;
        } else {
            p2Var2 = p2Var;
        }
        if ((i10 & 4) != 0) {
            o0Var = f40778a;
        } else {
            o0Var = null;
        }
        if ((i10 & 8) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        Object P = hl.f.P(new g3(zVar, null, p2Var2, null, function12, o0Var), aVar);
        if (P != zt.a.f42823a) {
            return Unit.f23355a;
        }
        return P;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0 = r12.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r9 >= r0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        r10 = (x1.t) r12.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        if (r10.b() != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        if (t0.t.c0(r10, r8.f39891f.f39904t, r8.c()) == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a0, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
    
        r0 = x1.l.f39879c;
        r1.f40755a = r8;
        r1.f40756b = r3;
        r1.f40758d = 2;
        r0 = r8.a(r0, r1);
        r1 = r1;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
    
        if (r0 != r2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b2 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(x1.m0 r17, x1.l r18, yt.a r19) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.i3.e(x1.m0, x1.l, yt.a):java.lang.Object");
    }
}
