package z;

import kotlin.jvm.internal.Intrinsics;
import w.b0;
import y.j3;
import y.u1;

/* loaded from: classes.dex */
public final class h implements j3 {

    /* renamed from: a, reason: collision with root package name */
    public final b f41868a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f41869b;

    /* renamed from: c, reason: collision with root package name */
    public final w.n f41870c;

    /* renamed from: d, reason: collision with root package name */
    public final u1 f41871d = androidx.compose.foundation.gestures.a.f1241d;

    public h(b bVar, b0 b0Var, w.n nVar) {
        this.f41868a = bVar;
        this.f41869b = b0Var;
        this.f41870c = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(z.h r7, y.q1 r8, float r9, float r10, z.d r11, yt.a r12) {
        /*
            r7.getClass()
            boolean r0 = r12 instanceof z.g
            if (r0 == 0) goto L17
            r0 = r12
            z.g r0 = (z.g) r0
            int r1 = r0.f41867c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f41867c = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            z.g r0 = new z.g
            r0.<init>(r7, r12)
            goto L15
        L1d:
            java.lang.Object r12 = r6.f41865a
            zt.a r0 = zt.a.f42823a
            int r1 = r6.f41867c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            ut.n.b(r12)
            goto La7
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            ut.n.b(r12)
            float r12 = java.lang.Math.abs(r9)
            r1 = 0
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L42
            goto L4a
        L42:
            float r12 = java.lang.Math.abs(r10)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L50
        L4a:
            w.o r7 = w.e.b(r9, r10)
        L4e:
            r0 = r7
            goto Lac
        L50:
            r6.f41867c = r2
            w.b0 r12 = r7.f41869b
            float r1 = w.e.k(r12, r10)
            float r1 = java.lang.Math.abs(r1)
            float r3 = java.lang.Math.abs(r9)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L6c
            eb.f r7 = new eb.f
            r1 = 0
            r7.<init>(r12, r1)
            r1 = r7
            goto L74
        L6c:
            eb.f r12 = new eb.f
            w.n r7 = r7.f41870c
            r12.<init>(r7, r2)
            r1 = r12
        L74:
            float r7 = z.l.f41888a
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r9)
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r10)
            int r10 = r1.f15308a
            switch(r10) {
                case 0: goto L95;
                default: goto L85;
            }
        L85:
            float r3 = r7.floatValue()
            float r4 = r9.floatValue()
            r2 = r8
            r5 = r11
            java.lang.Object r7 = r1.n(r2, r3, r4, r5, r6)
        L93:
            r12 = r7
            goto La4
        L95:
            float r3 = r7.floatValue()
            float r4 = r9.floatValue()
            r2 = r8
            r5 = r11
            java.lang.Object r7 = r1.n(r2, r3, r4, r5, r6)
            goto L93
        La4:
            if (r12 != r0) goto La7
            goto Lac
        La7:
            z.a r12 = (z.a) r12
            w.o r7 = r12.f41844b
            goto L4e
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.h.b(z.h, y.q1, float, float, z.d, yt.a):java.lang.Object");
    }

    public static boolean d(float f10) {
        return (f10 == Float.NEGATIVE_INFINITY || f10 == Float.POSITIVE_INFINITY) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(y.f2 r11, float r12, kotlin.jvm.functions.Function1 r13, yt.a r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof z.c
            if (r0 == 0) goto L13
            r0 = r14
            z.c r0 = (z.c) r0
            int r1 = r0.f41852d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41852d = r1
            goto L18
        L13:
            z.c r0 = new z.c
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f41850b
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f41852d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.functions.Function1 r13 = r0.f41849a
            ut.n.b(r14)
            goto L4c
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            ut.n.b(r14)
            y.u1 r14 = r10.f41871d
            z.e r2 = new z.e
            r8 = 0
            r4 = r2
            r5 = r12
            r6 = r11
            r7 = r10
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f41849a = r13
            r0.f41852d = r3
            java.lang.Object r14 = yk.g.e0(r14, r2, r0)
            if (r14 != r1) goto L4c
            return r1
        L4c:
            z.a r14 = (z.a) r14
            java.lang.Float r11 = new java.lang.Float
            r12 = 0
            r11.<init>(r12)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: z.h.c(y.f2, float, kotlin.jvm.functions.Function1, yt.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(y.f2 r5, float r6, kotlin.jvm.functions.Function1 r7, yt.a r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof z.f
            if (r0 == 0) goto L13
            r0 = r8
            z.f r0 = (z.f) r0
            int r1 = r0.f41864c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41864c = r1
            goto L18
        L13:
            z.f r0 = new z.f
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f41862a
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f41864c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ut.n.b(r8)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            ut.n.b(r8)
            r0.f41864c = r3
            java.lang.Object r8 = r4.c(r5, r6, r7, r0)
            if (r8 != r1) goto L3b
            return r1
        L3b:
            z.a r8 = (z.a) r8
            java.lang.Object r5 = r8.f41843a
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L4b
            goto L57
        L4b:
            w.o r5 = r8.f41844b
            java.lang.Object r5 = r5.b()
            java.lang.Number r5 = (java.lang.Number) r5
            float r6 = r5.floatValue()
        L57:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z.h.e(y.f2, float, kotlin.jvm.functions.Function1, yt.a):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!Intrinsics.a(hVar.f41870c, this.f41870c) || !Intrinsics.a(hVar.f41869b, this.f41869b) || !Intrinsics.a(hVar.f41868a, this.f41868a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f41868a.hashCode() + ((this.f41869b.hashCode() + (this.f41870c.hashCode() * 31)) * 31);
    }
}
