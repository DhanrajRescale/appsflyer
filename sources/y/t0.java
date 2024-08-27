package y;

import androidx.compose.foundation.gestures.DraggableElement;

/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f40956a = new o0(0, null);

    /* renamed from: b, reason: collision with root package name */
    public static final o0 f40957b = new o0(1, null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0278 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ad  */
    /* JADX WARN: Type inference failed for: r11v3, types: [iu.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r13v10, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [y.p0, yt.a] */
    /* JADX WARN: Type inference failed for: r4v9, types: [iu.y, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x01ef -> B:24:0x0164). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0238 -> B:13:0x0240). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x027a -> B:23:0x024d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable a(x1.m0 r18, y.a r19, x.a r20, y1.d r21, y.d0 r22, yt.a r23) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.t0.a(x1.m0, y.a, x.a, y1.d, y.d0, yt.a):java.io.Serializable");
    }

    public static final Object b(x1.m0 m0Var, x1.t tVar, long j10, y1.d dVar, su.c cVar, boolean z10, a aVar, b bVar) {
        float signum = Math.signum(m1.c.d(tVar.f39911c));
        long j11 = tVar.f39911c;
        cVar.o(new b0(m1.c.g(j11, t0.t.g(m1.c.d(j10) * signum, m1.c.e(j10) * Math.signum(m1.c.e(j11))))));
        if (z10) {
            j10 = m1.c.i(j10, -1.0f);
        }
        cVar.o(new a0(j10));
        return d(m0Var, aVar, tVar.f39909a, new r0(dVar, cVar, z10, 0), bVar);
    }

    public static g1.o c(g1.o oVar, w0 w0Var, g1 g1Var, boolean z10, a0.l lVar, boolean z11, hu.c cVar, boolean z12, int i10) {
        boolean z13;
        a0.l lVar2;
        boolean z14;
        o0 o0Var;
        hu.c cVar2;
        boolean z15;
        if ((i10 & 4) != 0) {
            z13 = true;
        } else {
            z13 = z10;
        }
        if ((i10 & 8) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if ((i10 & 16) != 0) {
            z14 = false;
        } else {
            z14 = z11;
        }
        if ((i10 & 32) != 0) {
            o0Var = f40956a;
        } else {
            o0Var = null;
        }
        if ((i10 & 64) != 0) {
            cVar2 = f40957b;
        } else {
            cVar2 = cVar;
        }
        if ((i10 & 128) != 0) {
            z15 = false;
        } else {
            z15 = z12;
        }
        return oVar.g(new DraggableElement(w0Var, g1Var, z13, lVar2, z14, o0Var, cVar2, z15));
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        if (((java.lang.Boolean) r1.invoke(r14)).booleanValue() != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:54:0x00db, B:42:0x00b8], limit reached: 65 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r10v1, types: [iu.y, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x007f -> B:10:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(x1.m0 r18, y.a r19, long r20, y.r0 r22, yt.a r23) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.t0.d(x1.m0, y.a, long, y.r0, yt.a):java.lang.Object");
    }
}
