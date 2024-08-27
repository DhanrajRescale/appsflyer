package tu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ut.l;

/* loaded from: classes2.dex */
public class w0 extends uu.a implements p0, f, uu.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f36573e;

    /* renamed from: f, reason: collision with root package name */
    public final int f36574f;

    /* renamed from: g, reason: collision with root package name */
    public final su.a f36575g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f36576h;

    /* renamed from: i, reason: collision with root package name */
    public long f36577i;

    /* renamed from: j, reason: collision with root package name */
    public long f36578j;

    /* renamed from: k, reason: collision with root package name */
    public int f36579k;

    /* renamed from: l, reason: collision with root package name */
    public int f36580l;

    public w0(int i10, int i11, su.a aVar) {
        this.f36573e = i10;
        this.f36574f = i11;
        this.f36575g = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:47|48))(1:49)|12|13|14|15|(3:16|(3:39|40|(2:42|43)(1:44))(4:18|(1:23)|33|(2:35|36)(1:37))|38))(4:50|51|52|53)|31|32)(5:59|60|61|(2:63|(1:65))|67)|54|55|15|(3:16|(0)(0)|38)))|70|6|(0)(0)|54|55|15|(3:16|(0)(0)|38)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        throw r2.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static zt.a n(tu.w0 r8, tu.g r9, yt.a r10) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tu.w0.n(tu.w0, tu.g, yt.a):zt.a");
    }

    @Override // tu.p0, tu.g
    public final Object a(Object obj, yt.a frame) {
        yt.a[] aVarArr;
        u0 u0Var;
        if (f(obj)) {
            return Unit.f23355a;
        }
        qu.i iVar = new qu.i(1, zt.f.b(frame));
        iVar.s();
        yt.a[] aVarArr2 = uu.b.f37418a;
        synchronized (this) {
            try {
                if (t(obj)) {
                    l.Companion companion = ut.l.INSTANCE;
                    iVar.resumeWith(Unit.f23355a);
                    aVarArr = q(aVarArr2);
                    u0Var = null;
                } else {
                    u0 u0Var2 = new u0(this, this.f36579k + this.f36580l + r(), obj, iVar);
                    p(u0Var2);
                    this.f36580l++;
                    if (this.f36574f == 0) {
                        aVarArr2 = q(aVarArr2);
                    }
                    aVarArr = aVarArr2;
                    u0Var = u0Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (u0Var != null) {
            yk.g.G(iVar, new qu.f(u0Var, 2));
        }
        for (yt.a aVar : aVarArr) {
            if (aVar != null) {
                l.Companion companion2 = ut.l.INSTANCE;
                aVar.resumeWith(Unit.f23355a);
            }
        }
        Object p10 = iVar.p();
        zt.a aVar2 = zt.a.f42823a;
        if (p10 == aVar2) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (p10 != aVar2) {
            p10 = Unit.f23355a;
        }
        if (p10 != aVar2) {
            return Unit.f23355a;
        }
        return p10;
    }

    @Override // tu.t0
    public final List b() {
        synchronized (this) {
            int r10 = (int) ((r() + this.f36579k) - this.f36577i);
            if (r10 == 0) {
                return vt.i0.f38321a;
            }
            ArrayList arrayList = new ArrayList(r10);
            Object[] objArr = this.f36576h;
            Intrinsics.c(objArr);
            for (int i10 = 0; i10 < r10; i10++) {
                arrayList.add(objArr[((int) (this.f36577i + i10)) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    @Override // tu.f
    public final Object c(g gVar, yt.a aVar) {
        return n(this, gVar, aVar);
    }

    @Override // tu.p0
    public final void d() {
        synchronized (this) {
            w(r() + this.f36579k, this.f36578j, r() + this.f36579k, r() + this.f36579k + this.f36580l);
            Unit unit = Unit.f23355a;
        }
    }

    @Override // uu.r
    public final f e(CoroutineContext coroutineContext, int i10, su.a aVar) {
        return x0.d(this, coroutineContext, i10, aVar);
    }

    @Override // tu.p0
    public final boolean f(Object obj) {
        int i10;
        boolean z10;
        yt.a[] aVarArr = uu.b.f37418a;
        synchronized (this) {
            if (t(obj)) {
                aVarArr = q(aVarArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (yt.a aVar : aVarArr) {
            if (aVar != null) {
                l.Companion companion = ut.l.INSTANCE;
                aVar.resumeWith(Unit.f23355a);
            }
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [uu.c, java.lang.Object, tu.y0] */
    @Override // uu.a
    public final uu.c h() {
        ?? obj = new Object();
        obj.f36591a = -1L;
        return obj;
    }

    @Override // uu.a
    public final uu.c[] i() {
        return new y0[2];
    }

    public final Object l(y0 y0Var, v0 frame) {
        qu.i iVar = new qu.i(1, zt.f.b(frame));
        iVar.s();
        synchronized (this) {
            if (u(y0Var) < 0) {
                y0Var.f36592b = iVar;
            } else {
                l.Companion companion = ut.l.INSTANCE;
                iVar.resumeWith(Unit.f23355a);
            }
            Unit unit = Unit.f23355a;
        }
        Object p10 = iVar.p();
        zt.a aVar = zt.a.f42823a;
        if (p10 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (p10 == aVar) {
            return p10;
        }
        return Unit.f23355a;
    }

    public final void m() {
        if (this.f36574f == 0 && this.f36580l <= 1) {
            return;
        }
        Object[] objArr = this.f36576h;
        Intrinsics.c(objArr);
        while (this.f36580l > 0) {
            long r10 = r();
            int i10 = this.f36579k;
            int i11 = this.f36580l;
            if (objArr[((int) ((r10 + (i10 + i11)) - 1)) & (objArr.length - 1)] == x0.f36585a) {
                this.f36580l = i11 - 1;
                x0.c(objArr, r() + this.f36579k + this.f36580l, null);
            } else {
                return;
            }
        }
    }

    public final void o() {
        uu.c[] cVarArr;
        Object[] objArr = this.f36576h;
        Intrinsics.c(objArr);
        x0.c(objArr, r(), null);
        this.f36579k--;
        long r10 = r() + 1;
        if (this.f36577i < r10) {
            this.f36577i = r10;
        }
        if (this.f36578j < r10) {
            if (this.f37414b != 0 && (cVarArr = this.f37413a) != null) {
                for (uu.c cVar : cVarArr) {
                    if (cVar != null) {
                        y0 y0Var = (y0) cVar;
                        long j10 = y0Var.f36591a;
                        if (j10 >= 0 && j10 < r10) {
                            y0Var.f36591a = r10;
                        }
                    }
                }
            }
            this.f36578j = r10;
        }
    }

    public final void p(Object obj) {
        int i10 = this.f36579k + this.f36580l;
        Object[] objArr = this.f36576h;
        if (objArr == null) {
            objArr = s(0, 2, null);
        } else if (i10 >= objArr.length) {
            objArr = s(i10, objArr.length * 2, objArr);
        }
        x0.c(objArr, r() + i10, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final yt.a[] q(yt.a[] aVarArr) {
        uu.c[] cVarArr;
        y0 y0Var;
        qu.i iVar;
        int length = aVarArr.length;
        if (this.f37414b != 0 && (cVarArr = this.f37413a) != null) {
            int length2 = cVarArr.length;
            int i10 = 0;
            aVarArr = aVarArr;
            while (i10 < length2) {
                uu.c cVar = cVarArr[i10];
                if (cVar != null && (iVar = (y0Var = (y0) cVar).f36592b) != null && u(y0Var) >= 0) {
                    int length3 = aVarArr.length;
                    aVarArr = aVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(aVarArr, Math.max(2, aVarArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                        aVarArr = copyOf;
                    }
                    aVarArr[length] = iVar;
                    y0Var.f36592b = null;
                    length++;
                }
                i10++;
                aVarArr = aVarArr;
            }
        }
        return aVarArr;
    }

    public final long r() {
        return Math.min(this.f36578j, this.f36577i);
    }

    public final Object[] s(int i10, int i11, Object[] objArr) {
        if (i11 > 0) {
            Object[] objArr2 = new Object[i11];
            this.f36576h = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long r10 = r();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = i12 + r10;
                x0.c(objArr2, j10, objArr[((int) j10) & (objArr.length - 1)]);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean t(Object obj) {
        int i10 = this.f37414b;
        int i11 = this.f36573e;
        if (i10 == 0) {
            if (i11 != 0) {
                p(obj);
                int i12 = this.f36579k + 1;
                this.f36579k = i12;
                if (i12 > i11) {
                    o();
                }
                this.f36578j = r() + this.f36579k;
            }
            return true;
        }
        int i13 = this.f36579k;
        int i14 = this.f36574f;
        if (i13 >= i14 && this.f36578j <= this.f36577i) {
            int ordinal = this.f36575g.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        p(obj);
        int i15 = this.f36579k + 1;
        this.f36579k = i15;
        if (i15 > i14) {
            o();
        }
        long r10 = r() + this.f36579k;
        long j10 = this.f36577i;
        if (((int) (r10 - j10)) > i11) {
            w(j10 + 1, this.f36578j, r() + this.f36579k, r() + this.f36579k + this.f36580l);
        }
        return true;
    }

    public final long u(y0 y0Var) {
        long j10 = y0Var.f36591a;
        if (j10 < r() + this.f36579k) {
            return j10;
        }
        if (this.f36574f > 0 || j10 > r() || this.f36580l == 0) {
            return -1L;
        }
        return j10;
    }

    public final Object v(y0 y0Var) {
        Object obj;
        yt.a[] aVarArr = uu.b.f37418a;
        synchronized (this) {
            long u10 = u(y0Var);
            if (u10 < 0) {
                obj = x0.f36585a;
            } else {
                long j10 = y0Var.f36591a;
                Object[] objArr = this.f36576h;
                Intrinsics.c(objArr);
                Object obj2 = objArr[((int) u10) & (objArr.length - 1)];
                if (obj2 instanceof u0) {
                    obj2 = ((u0) obj2).f36556c;
                }
                y0Var.f36591a = u10 + 1;
                Object obj3 = obj2;
                aVarArr = x(j10);
                obj = obj3;
            }
        }
        for (yt.a aVar : aVarArr) {
            if (aVar != null) {
                l.Companion companion = ut.l.INSTANCE;
                aVar.resumeWith(Unit.f23355a);
            }
        }
        return obj;
    }

    public final void w(long j10, long j11, long j12, long j13) {
        long min = Math.min(j11, j10);
        for (long r10 = r(); r10 < min; r10++) {
            Object[] objArr = this.f36576h;
            Intrinsics.c(objArr);
            x0.c(objArr, r10, null);
        }
        this.f36577i = j10;
        this.f36578j = j11;
        this.f36579k = (int) (j12 - min);
        this.f36580l = (int) (j13 - j12);
    }

    public final yt.a[] x(long j10) {
        int i10;
        long j11;
        long j12;
        yt.a[] aVarArr;
        long j13;
        boolean z10;
        long j14;
        uu.c[] cVarArr;
        long j15 = this.f36578j;
        yt.a[] aVarArr2 = uu.b.f37418a;
        if (j10 > j15) {
            return aVarArr2;
        }
        long r10 = r();
        long j16 = this.f36579k + r10;
        int i11 = this.f36574f;
        if (i11 == 0 && this.f36580l > 0) {
            j16++;
        }
        if (this.f37414b != 0 && (cVarArr = this.f37413a) != null) {
            for (uu.c cVar : cVarArr) {
                if (cVar != null) {
                    long j17 = ((y0) cVar).f36591a;
                    if (j17 >= 0 && j17 < j16) {
                        j16 = j17;
                    }
                }
            }
        }
        if (j16 <= this.f36578j) {
            return aVarArr2;
        }
        long r11 = r() + this.f36579k;
        if (this.f37414b > 0) {
            i10 = Math.min(this.f36580l, i11 - ((int) (r11 - j16)));
        } else {
            i10 = this.f36580l;
        }
        long j18 = this.f36580l + r11;
        int i12 = 1;
        if (i10 > 0) {
            yt.a[] aVarArr3 = new yt.a[i10];
            Object[] objArr = this.f36576h;
            Intrinsics.c(objArr);
            long j19 = r11;
            int i13 = 0;
            while (true) {
                if (r11 < j18) {
                    j11 = j16;
                    Object obj = objArr[((int) r11) & (objArr.length - i12)];
                    kp.g gVar = x0.f36585a;
                    if (obj != gVar) {
                        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        u0 u0Var = (u0) obj;
                        int i14 = i13 + 1;
                        j12 = j18;
                        aVarArr3[i13] = u0Var.f36557d;
                        x0.c(objArr, r11, gVar);
                        x0.c(objArr, j19, u0Var.f36556c);
                        j14 = 1;
                        j19++;
                        if (i14 >= i10) {
                            break;
                        }
                        i13 = i14;
                    } else {
                        j12 = j18;
                        j14 = 1;
                    }
                    r11 += j14;
                    j16 = j11;
                    j18 = j12;
                    i12 = 1;
                } else {
                    j11 = j16;
                    j12 = j18;
                    break;
                }
            }
            aVarArr = aVarArr3;
            r11 = j19;
        } else {
            j11 = j16;
            j12 = j18;
            aVarArr = aVarArr2;
        }
        int i15 = (int) (r11 - r10);
        if (this.f37414b == 0) {
            j13 = r11;
        } else {
            j13 = j11;
        }
        long max = Math.max(this.f36577i, r11 - Math.min(this.f36573e, i15));
        if (i11 == 0 && max < j12) {
            Object[] objArr2 = this.f36576h;
            Intrinsics.c(objArr2);
            if (Intrinsics.a(objArr2[((int) max) & (objArr2.length - 1)], x0.f36585a)) {
                r11++;
                max++;
            }
        }
        w(max, j13, r11, j12);
        m();
        if (aVarArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return q(aVarArr);
        }
        return aVarArr;
    }
}
