package e1;

import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t.g0;
import t0.i0;
import t0.j0;
import t0.k0;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f14920a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14921b;

    /* renamed from: c, reason: collision with root package name */
    public t.y f14922c;

    /* renamed from: j, reason: collision with root package name */
    public int f14929j;

    /* renamed from: d, reason: collision with root package name */
    public int f14923d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final v0.i f14924e = new v0.i();

    /* renamed from: f, reason: collision with root package name */
    public final t.z f14925f = new t.z();

    /* renamed from: g, reason: collision with root package name */
    public final t.d0 f14926g = new t.d0();

    /* renamed from: h, reason: collision with root package name */
    public final v0.h f14927h = new v0.h(new k0[16]);

    /* renamed from: i, reason: collision with root package name */
    public final t0.q f14928i = new t0.q(this, 1);

    /* renamed from: k, reason: collision with root package name */
    public final v0.i f14930k = new v0.i();

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f14931l = new HashMap();

    public u(Function1 function1) {
        this.f14920a = function1;
    }

    public final void a(Object obj, g0 g0Var, Function0 function0) {
        long[] jArr;
        long[] jArr2;
        int i10;
        boolean z10;
        Object obj2 = this.f14921b;
        t.y yVar = this.f14922c;
        int i11 = this.f14923d;
        this.f14921b = obj;
        this.f14922c = (t.y) this.f14925f.f(obj);
        if (this.f14923d == -1) {
            this.f14923d = p.i().d();
        }
        t0.q qVar = this.f14928i;
        v0.h M = t0.t.M();
        try {
            M.b(qVar);
            yq.b.j(g0Var, function0);
            M.n(M.f37655c - 1);
            Object obj3 = this.f14921b;
            Intrinsics.c(obj3);
            int i12 = this.f14923d;
            t.y yVar2 = this.f14922c;
            if (yVar2 != null) {
                long[] jArr3 = yVar2.f34925a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j10 = jArr3[i13];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8;
                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j10 & 255) < 128) {
                                    int i17 = (i13 << 3) + i16;
                                    Object obj4 = yVar2.f34926b[i17];
                                    jArr2 = jArr3;
                                    if (yVar2.f34927c[i17] != i12) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        d(obj3, obj4);
                                    }
                                    if (z10) {
                                        yVar2.g(i17);
                                    }
                                    i10 = 8;
                                } else {
                                    jArr2 = jArr3;
                                    i10 = i14;
                                }
                                j10 >>= i10;
                                i16++;
                                i14 = i10;
                                jArr3 = jArr2;
                            }
                            jArr = jArr3;
                            if (i15 != i14) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                        }
                        if (i13 == length) {
                            break;
                        }
                        i13++;
                        jArr3 = jArr;
                    }
                }
            }
            this.f14921b = obj2;
            this.f14922c = yVar;
            this.f14923d = i11;
        } catch (Throwable th2) {
            M.n(M.f37655c - 1);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02af A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.util.Set r39) {
        /*
            Method dump skipped, instructions count: 1658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.u.b(java.util.Set):boolean");
    }

    public final void c(Object obj, int i10, Object obj2, t.y yVar) {
        int i11;
        if (this.f14929j > 0) {
            return;
        }
        int c10 = yVar.c(obj);
        if (c10 < 0) {
            c10 = ~c10;
            i11 = -1;
        } else {
            i11 = yVar.f34927c[c10];
        }
        yVar.f34926b[c10] = obj;
        yVar.f34927c[c10] = i10;
        if ((obj instanceof k0) && i11 != i10) {
            i0 j10 = ((j0) ((k0) obj)).j();
            this.f14931l.put(obj, j10.f35051f);
            t.y yVar2 = j10.f35050e;
            v0.i iVar = this.f14930k;
            iVar.c(obj);
            Object[] objArr = yVar2.f34926b;
            long[] jArr = yVar2.f34925a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j11 = jArr[i12];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = 0; i14 < i13; i14++) {
                            if ((j11 & 255) < 128) {
                                y yVar3 = (y) objArr[(i12 << 3) + i14];
                                if (yVar3 instanceof z) {
                                    ((z) yVar3).f(2);
                                }
                                iVar.a(yVar3, obj);
                            }
                            j11 >>= 8;
                        }
                        if (i13 != 8) {
                            break;
                        }
                    }
                    if (i12 == length) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        if (i11 == -1) {
            if (obj instanceof z) {
                ((z) obj).f(2);
            }
            this.f14924e.a(obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        v0.i iVar = this.f14924e;
        iVar.b(obj2, obj);
        if ((obj2 instanceof k0) && !iVar.f37656a.b(obj2)) {
            this.f14930k.c(obj2);
            this.f14931l.remove(obj2);
        }
    }

    public final void e() {
        c2.f fVar;
        long[] jArr;
        int i10;
        c2.f fVar2;
        long[] jArr2;
        int i11;
        int i12;
        int i13;
        char c10;
        long j10;
        int i14;
        int i15;
        c2.f fVar3 = c2.f.f7684m;
        t.z zVar = this.f14925f;
        long[] jArr3 = zVar.f34931a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i16 = 0;
            while (true) {
                long j11 = jArr3[i16];
                char c11 = 7;
                long j12 = -9187201950435737472L;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8;
                    int i18 = 8 - ((~(i16 - length)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j11 & 255) < 128) {
                            int i20 = (i16 << 3) + i19;
                            Object obj = zVar.f34932b[i20];
                            t.y yVar = (t.y) zVar.f34933c[i20];
                            Boolean bool = (Boolean) fVar3.invoke(obj);
                            if (bool.booleanValue()) {
                                Object[] objArr = yVar.f34926b;
                                int[] iArr = yVar.f34927c;
                                long[] jArr4 = yVar.f34925a;
                                int length2 = jArr4.length - 2;
                                fVar2 = fVar3;
                                jArr2 = jArr3;
                                i11 = length;
                                if (length2 >= 0) {
                                    int i21 = 0;
                                    while (true) {
                                        long j13 = jArr4[i21];
                                        i13 = i18;
                                        long[] jArr5 = jArr4;
                                        c10 = 7;
                                        j10 = -9187201950435737472L;
                                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j13 & 255) < 128) {
                                                    int i24 = (i21 << 3) + i23;
                                                    i15 = i16;
                                                    Object obj2 = objArr[i24];
                                                    int i25 = iArr[i24];
                                                    d(obj, obj2);
                                                } else {
                                                    i15 = i16;
                                                }
                                                j13 >>= 8;
                                                i23++;
                                                i16 = i15;
                                            }
                                            i12 = i16;
                                            if (i22 != 8) {
                                                break;
                                            }
                                        } else {
                                            i12 = i16;
                                        }
                                        if (i21 == length2) {
                                            break;
                                        }
                                        i21++;
                                        i18 = i13;
                                        jArr4 = jArr5;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i16;
                                    i13 = i18;
                                    j10 = -9187201950435737472L;
                                    c10 = 7;
                                }
                            } else {
                                fVar2 = fVar3;
                                jArr2 = jArr3;
                                i11 = length;
                                i12 = i16;
                                i13 = i18;
                                c10 = c11;
                                j10 = j12;
                            }
                            if (bool.booleanValue()) {
                                zVar.j(i20);
                            }
                            i14 = 8;
                        } else {
                            fVar2 = fVar3;
                            jArr2 = jArr3;
                            i11 = length;
                            i12 = i16;
                            i13 = i18;
                            c10 = c11;
                            j10 = j12;
                            i14 = i17;
                        }
                        j11 >>= i14;
                        i19++;
                        i17 = i14;
                        j12 = j10;
                        c11 = c10;
                        fVar3 = fVar2;
                        jArr3 = jArr2;
                        length = i11;
                        i18 = i13;
                        i16 = i12;
                    }
                    fVar = fVar3;
                    jArr = jArr3;
                    int i26 = length;
                    int i27 = i16;
                    if (i18 == i17) {
                        length = i26;
                        i10 = i27;
                    } else {
                        return;
                    }
                } else {
                    fVar = fVar3;
                    jArr = jArr3;
                    i10 = i16;
                }
                if (i10 != length) {
                    i16 = i10 + 1;
                    fVar3 = fVar;
                    jArr3 = jArr;
                } else {
                    return;
                }
            }
        }
    }
}
