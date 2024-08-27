package t0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class j0 extends e1.z implements k0 {

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f35064b;

    /* renamed from: c, reason: collision with root package name */
    public final z2 f35065c;

    /* renamed from: d, reason: collision with root package name */
    public i0 f35066d = new i0();

    public j0(z2 z2Var, Function0 function0) {
        this.f35064b = function0;
        this.f35065c = z2Var;
    }

    @Override // e1.y
    public final e1.a0 b() {
        return this.f35066d;
    }

    @Override // e1.y
    public final void e(e1.a0 a0Var) {
        this.f35066d = (i0) a0Var;
    }

    @Override // t0.l3
    public final Object getValue() {
        Function1 f10 = e1.p.i().f();
        if (f10 != null) {
            f10.invoke(this);
        }
        return i((i0) e1.p.h(this.f35066d), e1.p.i(), true, this.f35064b).f35051f;
    }

    /* JADX WARN: Finally extract failed */
    public final i0 i(i0 i0Var, e1.i iVar, boolean z10, Function0 function0) {
        int i10;
        z2 z2Var;
        int i11;
        i0 i0Var2 = i0Var;
        if (i0Var2.c(this, iVar)) {
            if (z10) {
                v0.h M = t.M();
                int i12 = M.f37655c;
                if (i12 > 0) {
                    Object[] objArr = M.f37653a;
                    int i13 = 0;
                    do {
                        ((q) ((l0) objArr[i13])).b();
                        i13++;
                    } while (i13 < i12);
                }
                try {
                    t.y yVar = i0Var2.f35050e;
                    i3 i3Var = a3.f34943a;
                    b1.e eVar = (b1.e) i3Var.a();
                    if (eVar == null) {
                        eVar = new b1.e(0);
                        i3Var.b(eVar);
                    }
                    int i14 = eVar.f3080a;
                    Object[] objArr2 = yVar.f34926b;
                    int[] iArr = yVar.f34927c;
                    long[] jArr = yVar.f34925a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j10 = jArr[i15];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i16 = 8;
                                int i17 = 8 - ((~(i15 - length)) >>> 31);
                                int i18 = 0;
                                while (i18 < i17) {
                                    if ((j10 & 255) < 128) {
                                        int i19 = (i15 << 3) + i18;
                                        e1.y yVar2 = (e1.y) objArr2[i19];
                                        eVar.f3080a = i14 + iArr[i19];
                                        Function1 f10 = iVar.f();
                                        if (f10 != null) {
                                            f10.invoke(yVar2);
                                        }
                                        i11 = 8;
                                    } else {
                                        i11 = i16;
                                    }
                                    j10 >>= i11;
                                    i18++;
                                    i16 = i11;
                                }
                                if (i17 != i16) {
                                    break;
                                }
                            }
                            if (i15 == length) {
                                break;
                            }
                            i15++;
                        }
                    }
                    eVar.f3080a = i14;
                    Unit unit = Unit.f23355a;
                    int i20 = M.f37655c;
                    if (i20 > 0) {
                        Object[] objArr3 = M.f37653a;
                        int i21 = 0;
                        do {
                            ((q) ((l0) objArr3[i21])).a();
                            i21++;
                        } while (i21 < i20);
                    }
                } catch (Throwable th2) {
                    int i22 = M.f37655c;
                    if (i22 > 0) {
                        Object[] objArr4 = M.f37653a;
                        int i23 = 0;
                        do {
                            ((q) ((l0) objArr4[i23])).a();
                            i23++;
                        } while (i23 < i22);
                    }
                    throw th2;
                }
            }
            return i0Var2;
        }
        t.y yVar3 = new t.y();
        i3 i3Var2 = a3.f34943a;
        b1.e eVar2 = (b1.e) i3Var2.a();
        if (eVar2 == null) {
            i10 = 0;
            eVar2 = new b1.e(0);
            i3Var2.b(eVar2);
        } else {
            i10 = 0;
        }
        b1.e eVar3 = eVar2;
        int i24 = eVar3.f3080a;
        v0.h M2 = t.M();
        int i25 = M2.f37655c;
        if (i25 > 0) {
            Object[] objArr5 = M2.f37653a;
            int i26 = i10;
            do {
                ((q) ((l0) objArr5[i26])).b();
                i26++;
            } while (i26 < i25);
        }
        try {
            eVar3.f3080a = i24 + 1;
            Object j11 = yq.b.j(new i0.d1(this, eVar3, yVar3, i24, 3), function0);
            eVar3.f3080a = i24;
            int i27 = M2.f37655c;
            if (i27 > 0) {
                Object[] objArr6 = M2.f37653a;
                do {
                    ((q) ((l0) objArr6[i10])).a();
                    i10++;
                } while (i10 < i27);
            }
            Object obj = e1.p.f14905b;
            synchronized (obj) {
                try {
                    e1.i i28 = e1.p.i();
                    Object obj2 = i0Var2.f35051f;
                    if (obj2 != i0.f35047h && (z2Var = this.f35065c) != null && z2Var.a(j11, obj2)) {
                        i0Var2.f35050e = yVar3;
                        i0Var2.f35052g = i0Var2.d(this, i28);
                    } else {
                        i0 i0Var3 = this.f35066d;
                        synchronized (obj) {
                            e1.a0 k10 = e1.p.k(i0Var3, this);
                            k10.a(i0Var3);
                            k10.f14841a = i28.d();
                            i0Var2 = (i0) k10;
                            i0Var2.f35050e = yVar3;
                            i0Var2.f35052g = i0Var2.d(this, i28);
                            i0Var2.f35051f = j11;
                        }
                        return i0Var2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            b1.e eVar4 = (b1.e) a3.f34943a.a();
            if (eVar4 != null && eVar4.f3080a == 0) {
                e1.p.i().m();
                synchronized (obj) {
                    e1.i i29 = e1.p.i();
                    i0Var2.f35048c = i29.d();
                    i0Var2.f35049d = i29.h();
                    Unit unit2 = Unit.f23355a;
                }
            }
            return i0Var2;
        } catch (Throwable th4) {
            int i30 = M2.f37655c;
            if (i30 > 0) {
                Object[] objArr7 = M2.f37653a;
                do {
                    ((q) ((l0) objArr7[i10])).a();
                    i10++;
                } while (i10 < i30);
            }
            throw th4;
        }
    }

    public final i0 j() {
        return i((i0) e1.p.h(this.f35066d), e1.p.i(), false, this.f35064b);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        i0 i0Var = (i0) e1.p.h(this.f35066d);
        if (i0Var.c(this, e1.p.i())) {
            str = String.valueOf(i0Var.f35051f);
        } else {
            str = "<Not calculated>";
        }
        sb2.append(str);
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }
}
