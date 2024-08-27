package y;

import java.util.List;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f40854a = new d0(1);

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f40855b = new d0(2);

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f40856c = new d0(0);

    /* renamed from: d, reason: collision with root package name */
    public static final float f40857d = ((float) 0.125d) / 18;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b5, code lost:
    
        if ((!m1.c.b(t0.t.p0(r7, true), m1.c.f27233b)) != false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r15v5, types: [iu.y, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0057 -> B:10:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(long r12, x1.m0 r14, yt.a r15) {
        /*
            boolean r0 = r15 instanceof y.e0
            if (r0 == 0) goto L13
            r0 = r15
            y.e0 r0 = (y.e0) r0
            int r1 = r0.f40669d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40669d = r1
            goto L18
        L13:
            y.e0 r0 = new y.e0
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f40668c
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f40669d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            iu.y r12 = r0.f40667b
            x1.m0 r13 = r0.f40666a
            ut.n.b(r15)
            r14 = r13
            goto L5a
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            ut.n.b(r15)
            x1.o0 r15 = r14.f39891f
            x1.k r15 = r15.f39900p
            boolean r15 = d(r15, r12)
            if (r15 == 0) goto L43
            return r4
        L43:
            iu.y r15 = new iu.y
            r15.<init>()
            r15.f20559a = r12
            r12 = r15
        L4b:
            r0.f40666a = r14
            r0.f40667b = r12
            r0.f40669d = r3
            x1.l r13 = x1.l.f39878b
            java.lang.Object r15 = r14.a(r13, r0)
            if (r15 != r1) goto L5a
            return r1
        L5a:
            x1.k r15 = (x1.k) r15
            java.util.List r13 = r15.f39870a
            int r2 = r13.size()
            r5 = 0
            r6 = r5
        L64:
            if (r6 >= r2) goto L7b
            java.lang.Object r7 = r13.get(r6)
            r8 = r7
            x1.t r8 = (x1.t) r8
            long r8 = r8.f39909a
            long r10 = r12.f20559a
            boolean r8 = x1.s.a(r8, r10)
            if (r8 == 0) goto L78
            goto L7c
        L78:
            int r6 = r6 + 1
            goto L64
        L7b:
            r7 = r4
        L7c:
            x1.t r7 = (x1.t) r7
            if (r7 != 0) goto L82
            r7 = r4
            goto Lb7
        L82:
            boolean r13 = t0.t.A(r7)
            if (r13 == 0) goto Laa
            java.util.List r13 = r15.f39870a
            int r15 = r13.size()
        L8e:
            if (r5 >= r15) goto L9f
            java.lang.Object r2 = r13.get(r5)
            r6 = r2
            x1.t r6 = (x1.t) r6
            boolean r6 = r6.f39912d
            if (r6 == 0) goto L9c
            goto La0
        L9c:
            int r5 = r5 + 1
            goto L8e
        L9f:
            r2 = r4
        La0:
            x1.t r2 = (x1.t) r2
            if (r2 != 0) goto La5
            goto Lb7
        La5:
            long r5 = r2.f39909a
            r12.f20559a = r5
            goto L4b
        Laa:
            long r5 = t0.t.p0(r7, r3)
            long r8 = m1.c.f27233b
            boolean r13 = m1.c.b(r5, r8)
            r13 = r13 ^ r3
            if (r13 == 0) goto L4b
        Lb7:
            if (r7 == 0) goto Lc0
            boolean r12 = r7.b()
            if (r12 != 0) goto Lc0
            r4 = r7
        Lc0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y.m0.a(long, x1.m0, yt.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(long r9, x1.m0 r11, yt.a r12) {
        /*
            boolean r0 = r12 instanceof y.f0
            if (r0 == 0) goto L13
            r0 = r12
            y.f0 r0 = (y.f0) r0
            int r1 = r0.f40694d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40694d = r1
            goto L18
        L13:
            y.f0 r0 = new y.f0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f40693c
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f40694d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            iu.z r9 = r0.f40692b
            x1.t r10 = r0.f40691a
            ut.n.b(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L90
            goto L99
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            ut.n.b(r12)
            x1.o0 r12 = r11.f39891f
            x1.k r12 = r12.f39900p
            boolean r12 = d(r12, r9)
            if (r12 == 0) goto L43
            return r4
        L43:
            x1.o0 r12 = r11.f39891f
            x1.k r12 = r12.f39900p
            java.util.List r12 = r12.f39870a
            int r2 = r12.size()
            r5 = 0
        L4e:
            if (r5 >= r2) goto L63
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            x1.t r7 = (x1.t) r7
            long r7 = r7.f39909a
            boolean r7 = x1.s.a(r7, r9)
            if (r7 == 0) goto L60
            goto L64
        L60:
            int r5 = r5 + 1
            goto L4e
        L63:
            r6 = r4
        L64:
            r10 = r6
            x1.t r10 = (x1.t) r10
            if (r10 != 0) goto L6a
            return r4
        L6a:
            iu.z r9 = new iu.z
            r9.<init>()
            iu.z r12 = new iu.z
            r12.<init>()
            r12.f20560a = r10
            d2.j3 r2 = r11.f()
            long r5 = r2.c()
            y.g0 r2 = new y.g0     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L90
            r2.<init>(r12, r9, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L90
            r0.f40691a = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L90
            r0.f40692b = r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L90
            r0.f40694d = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L90
            java.lang.Object r9 = r11.g(r5, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L90
            if (r9 != r1) goto L99
            return r1
        L90:
            java.lang.Object r9 = r9.f20560a
            x1.t r9 = (x1.t) r9
            if (r9 != 0) goto L98
            r4 = r10
            goto L99
        L98:
            r4 = r9
        L99:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y.m0.b(long, x1.m0, yt.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0042 -> B:10:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(x1.m0 r4, long r5, kotlin.jvm.functions.Function1 r7, yt.a r8) {
        /*
            boolean r0 = r8 instanceof y.l0
            if (r0 == 0) goto L13
            r0 = r8
            y.l0 r0 = (y.l0) r0
            int r1 = r0.f40838d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40838d = r1
            goto L18
        L13:
            y.l0 r0 = new y.l0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f40837c
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f40838d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.jvm.functions.Function1 r4 = r0.f40836b
            x1.m0 r5 = r0.f40835a
            ut.n.b(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            ut.n.b(r8)
        L38:
            r0.f40835a = r4
            r0.f40836b = r7
            r0.f40838d = r3
            java.lang.Object r8 = a(r5, r4, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            x1.t r8 = (x1.t) r8
            if (r8 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            boolean r5 = t0.t.A(r8)
            if (r5 == 0) goto L55
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L55:
            r7.invoke(r8)
            long r5 = r8.f39909a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: y.m0.c(x1.m0, long, kotlin.jvm.functions.Function1, yt.a):java.lang.Object");
    }

    public static final boolean d(x1.k kVar, long j10) {
        Object obj;
        List list = kVar.f39870a;
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = list.get(i10);
                if (x1.s.a(((x1.t) obj).f39909a, j10)) {
                    break;
                }
                i10++;
            } else {
                obj = null;
                break;
            }
        }
        x1.t tVar = (x1.t) obj;
        if (tVar != null && tVar.f39912d) {
            z10 = true;
        }
        return true ^ z10;
    }
}
