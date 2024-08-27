package y2;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.r;
import t0.r1;
import t0.t;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final l f41114a = new Object();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(kotlin.jvm.functions.Function1 r18, g1.o r19, kotlin.jvm.functions.Function1 r20, kotlin.jvm.functions.Function1 r21, kotlin.jvm.functions.Function1 r22, t0.n r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.m.a(kotlin.jvm.functions.Function1, g1.o, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(kotlin.jvm.functions.Function1 r13, g1.o r14, kotlin.jvm.functions.Function1 r15, t0.n r16, int r17, int r18) {
        /*
            r1 = r17
            r0 = r16
            t0.r r0 = (t0.r) r0
            r2 = -1783766393(0xffffffff95ade287, float:-7.023154E-26)
            r0.c0(r2)
            r2 = r18 & 1
            if (r2 == 0) goto L14
            r2 = r1 | 6
            r10 = r13
            goto L25
        L14:
            r2 = r1 & 6
            r10 = r13
            if (r2 != 0) goto L24
            boolean r2 = r0.j(r13)
            if (r2 == 0) goto L21
            r2 = 4
            goto L22
        L21:
            r2 = 2
        L22:
            r2 = r2 | r1
            goto L25
        L24:
            r2 = r1
        L25:
            r3 = r18 & 2
            if (r3 == 0) goto L2d
            r2 = r2 | 48
        L2b:
            r4 = r14
            goto L3e
        L2d:
            r4 = r1 & 48
            if (r4 != 0) goto L2b
            r4 = r14
            boolean r5 = r0.h(r14)
            if (r5 == 0) goto L3b
            r5 = 32
            goto L3d
        L3b:
            r5 = 16
        L3d:
            r2 = r2 | r5
        L3e:
            r5 = r18 & 4
            if (r5 == 0) goto L46
            r2 = r2 | 384(0x180, float:5.38E-43)
        L44:
            r6 = r15
            goto L57
        L46:
            r6 = r1 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L44
            r6 = r15
            boolean r7 = r0.j(r15)
            if (r7 == 0) goto L54
            r7 = 256(0x100, float:3.59E-43)
            goto L56
        L54:
            r7 = 128(0x80, float:1.8E-43)
        L56:
            r2 = r2 | r7
        L57:
            r7 = r2 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L69
            boolean r7 = r0.G()
            if (r7 != 0) goto L64
            goto L69
        L64:
            r0.V()
            r5 = r4
            goto L92
        L69:
            if (r3 == 0) goto L6f
            g1.l r3 = g1.l.f16404b
            r11 = r3
            goto L70
        L6f:
            r11 = r4
        L70:
            y2.d r7 = y2.d.f41071e
            if (r5 == 0) goto L76
            r12 = r7
            goto L77
        L76:
            r12 = r6
        L77:
            r4 = 0
            r3 = r2 & 14
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r5 = r2 & 112(0x70, float:1.57E-43)
            r3 = r3 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            int r2 = r2 << 6
            r2 = r2 & r5
            r8 = r3 | r2
            r9 = 4
            r2 = r13
            r3 = r11
            r5 = r7
            r6 = r12
            r7 = r0
            a(r2, r3, r4, r5, r6, r7, r8, r9)
            r5 = r11
            r6 = r12
        L92:
            t0.x1 r7 = r0.w()
            if (r7 == 0) goto La7
            d0.t r8 = new d0.t
            r3 = 8
            r0 = r8
            r1 = r17
            r2 = r18
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f35245d = r8
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.m.b(kotlin.jvm.functions.Function1, g1.o, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    public static final void c(k kVar, androidx.compose.ui.node.a aVar) {
        long m10 = androidx.compose.ui.layout.a.m(aVar.f1422w.f7655b);
        int round = Math.round(m1.c.d(m10));
        int round2 = Math.round(m1.c.e(m10));
        kVar.layout(round, round2, kVar.getMeasuredWidth() + round, kVar.getMeasuredHeight() + round2);
    }

    public static final q d(androidx.compose.ui.node.a aVar) {
        k kVar = aVar.f1409j;
        if (kVar != null) {
            return (q) kVar;
        }
        t.D0("Required value was null.");
        throw null;
    }

    public static final Function0 e(Function1 function1, t0.n nVar, int i10) {
        boolean z10;
        r rVar = (r) nVar;
        rVar.b0(2030558801);
        int i11 = rVar.P;
        Context context = (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b);
        t0.p M0 = al.d.M0(rVar);
        d1.n nVar2 = (d1.n) rVar.m(d1.q.f13288a);
        View view = (View) rVar.m(AndroidCompositionLocals_androidKt.f1433g);
        rVar.b0(-1560709134);
        boolean j10 = rVar.j(context);
        if ((((i10 & 14) ^ 6) > 4 && rVar.j(function1)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean j11 = z10 | j10 | rVar.j(M0) | rVar.j(nVar2) | rVar.f(i11) | rVar.j(view);
        Object Q = rVar.Q();
        if (j11 || Q == t0.m.f35080a) {
            Q = new o(context, function1, M0, nVar2, i11, view);
            rVar.k0(Q);
        }
        Function0 function0 = (Function0) Q;
        rVar.s(false);
        rVar.s(false);
        return function0;
    }

    public static final void f(t0.n nVar, g1.o oVar, int i10, w2.b bVar, androidx.lifecycle.t tVar, o7.f fVar, w2.k kVar, r1 r1Var) {
        c2.l.M.getClass();
        t.v0(nVar, r1Var, c2.k.f7748d);
        t.v0(nVar, oVar, n.f41120g);
        t.v0(nVar, bVar, n.f41121h);
        t.v0(nVar, tVar, n.f41122i);
        t.v0(nVar, fVar, n.f41123j);
        t.v0(nVar, kVar, n.f41124k);
        c2.i iVar = c2.k.f7750f;
        r rVar = (r) nVar;
        if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i10))) {
            nn.d.s(i10, rVar, i10, iVar);
        }
    }
}
