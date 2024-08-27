package c2;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class u0 extends a2.a1 implements a2.o0 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f7851f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7852g;

    /* renamed from: h, reason: collision with root package name */
    public final a2.j0 f7853h = new a2.j0(this, 0);

    /* renamed from: i, reason: collision with root package name */
    public t.x f7854i;

    /* renamed from: j, reason: collision with root package name */
    public t.x f7855j;

    public static void I0(i1 i1Var) {
        androidx.compose.ui.node.a aVar;
        i0 i0Var;
        i1 i1Var2 = i1Var.f7722l;
        if (i1Var2 != null) {
            aVar = i1Var2.f7721k;
        } else {
            aVar = null;
        }
        androidx.compose.ui.node.a aVar2 = i1Var.f7721k;
        if (!Intrinsics.a(aVar, aVar2)) {
            aVar2.f1423x.f7827o.f7792t.g();
            return;
        }
        b l10 = aVar2.f1423x.f7827o.l();
        if (l10 != null && (i0Var = ((n0) l10).f7792t) != null) {
            i0Var.g();
        }
    }

    public abstract u0 A0();

    public abstract a2.u B0();

    public abstract boolean C0();

    public abstract androidx.compose.ui.node.a E0();

    public abstract a2.n0 F0();

    public abstract u0 G0();

    public abstract long H0();

    public abstract void J0();

    @Override // a2.r
    public boolean a0() {
        return false;
    }

    @Override // a2.p0
    public final int f(a2.a aVar) {
        int u02;
        if (!C0() || (u02 = u0(aVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        long j10 = this.f33e;
        int i10 = w2.h.f38792c;
        return u02 + ((int) (j10 & 4294967295L));
    }

    @Override // a2.o0
    public final a2.n0 u(int i10, int i11, Map map, Function1 function1) {
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return new s0(i10, i11, map, function1, this);
        }
        t0.t.C0("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    public abstract int u0(a2.a aVar);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f0, code lost:
    
        r34 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fe, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0100, code lost:
    
        r4 = r2.c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0106, code lost:
    
        if (r2.f34924f != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011b, code lost:
    
        if (((r2.f34919a[r4 >> 3] >> ((r4 & 7) << 3)) & 255) != 254) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011e, code lost:
    
        r4 = r2.f34922d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0122, code lost:
    
        if (r4 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0124, code lost:
    
        r6 = r2.f34923e;
        r14 = ut.t.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013b, code lost:
    
        if (java.lang.Long.compare((r6 * 32) ^ Long.MIN_VALUE, (r4 * 25) ^ Long.MIN_VALUE) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013d, code lost:
    
        r2.g(t.f0.b(r2.f34922d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0150, code lost:
    
        r4 = r2.c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0147, code lost:
    
        r2.g(t.f0.b(r2.f34922d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0154, code lost:
    
        r2.f34923e++;
        r6 = r2.f34924f;
        r7 = r2.f34919a;
        r8 = r4 >> 3;
        r14 = r7[r8];
        r22 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0170, code lost:
    
        if (((r14 >> r22) & 255) != 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0173, code lost:
    
        r30 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0175, code lost:
    
        r2.f34924f = r6 - r30;
        r7[r8] = ((~(255 << r22)) & r14) | (r0 << r22);
        r5 = r2.f34922d;
        r6 = ((r4 - 7) & r5) + (r5 & 7);
        r5 = r6 >> 3;
        r6 = (r6 & 7) << 3;
        r22 = r9;
        r7[r5] = (r0 << r6) | ((~(255 << r6)) & r7[r5]);
        r0 = ~r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w0(c2.v1 r38) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.u0.w0(c2.v1):void");
    }
}
