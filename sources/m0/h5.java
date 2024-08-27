package m0;

import com.google.android.gms.common.api.Api;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h5 implements a2.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f26241a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26242b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26243c;

    /* renamed from: d, reason: collision with root package name */
    public final b0.h1 f26244d;

    public h5(Function1 function1, boolean z10, float f10, b0.h1 h1Var) {
        this.f26241a = function1;
        this.f26242b = z10;
        this.f26243c = f10;
        this.f26244d = h1Var;
    }

    @Override // a2.m0
    public final a2.n0 a(a2.o0 o0Var, List list, long j10) {
        Object obj;
        a2.a1 a1Var;
        Object obj2;
        a2.a1 a1Var2;
        Object obj3;
        a2.a1 a1Var3;
        Object obj4;
        a2.a1 a1Var4;
        int i10;
        int i11;
        a2.n0 n0;
        b0.h1 h1Var = this.f26244d;
        int m02 = o0Var.m0(h1Var.a());
        long a10 = w2.a.a(j10, 0, 0, 0, 0, 10);
        int size = list.size();
        int i12 = 0;
        while (true) {
            if (i12 < size) {
                obj = list.get(i12);
                if (Intrinsics.a(androidx.compose.ui.layout.a.f((a2.l0) obj), "Leading")) {
                    break;
                }
                i12++;
            } else {
                obj = null;
                break;
            }
        }
        a2.l0 l0Var = (a2.l0) obj;
        if (l0Var != null) {
            a1Var = l0Var.E(a10);
        } else {
            a1Var = null;
        }
        int e10 = m8.e(a1Var);
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 < size2) {
                obj2 = list.get(i13);
                if (Intrinsics.a(androidx.compose.ui.layout.a.f((a2.l0) obj2), "Trailing")) {
                    break;
                }
                i13++;
            } else {
                obj2 = null;
                break;
            }
        }
        a2.l0 l0Var2 = (a2.l0) obj2;
        if (l0Var2 != null) {
            a1Var2 = l0Var2.E(hl.f.F0(-e10, 0, a10));
        } else {
            a1Var2 = null;
        }
        int e11 = m8.e(a1Var2) + e10;
        int m03 = o0Var.m0(h1Var.b(o0Var.getLayoutDirection())) + o0Var.m0(h1Var.d(o0Var.getLayoutDirection()));
        int i14 = -e11;
        int i15 = -m02;
        long F0 = hl.f.F0(hl.f.A0(i14 - m03, this.f26243c, -m03), i15, a10);
        int size3 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 < size3) {
                obj3 = list.get(i16);
                if (Intrinsics.a(androidx.compose.ui.layout.a.f((a2.l0) obj3), "Label")) {
                    break;
                }
                i16++;
            } else {
                obj3 = null;
                break;
            }
        }
        a2.l0 l0Var3 = (a2.l0) obj3;
        if (l0Var3 != null) {
            a1Var3 = l0Var3.E(F0);
        } else {
            a1Var3 = null;
        }
        if (a1Var3 != null) {
            this.f26241a.invoke(new m1.f(t0.t.j(a1Var3.f29a, a1Var3.f30b)));
        }
        long a11 = w2.a.a(hl.f.F0(i14, i15 - Math.max(m8.d(a1Var3) / 2, o0Var.m0(h1Var.c())), j10), 0, 0, 0, 0, 11);
        int size4 = list.size();
        for (int i17 = 0; i17 < size4; i17++) {
            a2.l0 l0Var4 = (a2.l0) list.get(i17);
            if (Intrinsics.a(androidx.compose.ui.layout.a.f(l0Var4), "TextField")) {
                a2.a1 E = l0Var4.E(a11);
                long a12 = w2.a.a(a11, 0, 0, 0, 0, 14);
                int size5 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 < size5) {
                        obj4 = list.get(i18);
                        if (Intrinsics.a(androidx.compose.ui.layout.a.f((a2.l0) obj4), "Hint")) {
                            break;
                        }
                        i18++;
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                a2.l0 l0Var5 = (a2.l0) obj4;
                if (l0Var5 != null) {
                    a1Var4 = l0Var5.E(a12);
                } else {
                    a1Var4 = null;
                }
                int d10 = f5.d(m8.e(a1Var), m8.e(a1Var2), E.f29a, m8.e(a1Var3), m8.e(a1Var4), this.f26243c, j10, o0Var.b(), this.f26244d);
                int c10 = f5.c(m8.d(a1Var), m8.d(a1Var2), E.f30b, m8.d(a1Var3), m8.d(a1Var4), this.f26243c, j10, o0Var.b(), this.f26244d);
                int size6 = list.size();
                for (int i19 = 0; i19 < size6; i19++) {
                    a2.l0 l0Var6 = (a2.l0) list.get(i19);
                    if (Intrinsics.a(androidx.compose.ui.layout.a.f(l0Var6), "border")) {
                        if (d10 != Integer.MAX_VALUE) {
                            i10 = d10;
                        } else {
                            i10 = 0;
                        }
                        if (c10 != Integer.MAX_VALUE) {
                            i11 = c10;
                        } else {
                            i11 = 0;
                        }
                        n0 = o0Var.n0(d10, c10, vt.p0.d(), new g5(c10, d10, a1Var, a1Var2, E, a1Var3, a1Var4, l0Var6.E(hl.f.b(i10, d10, i11, c10)), this, o0Var));
                        return n0;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // a2.m0
    public final int b(c2.i1 i1Var, List list, int i10) {
        return f(i1Var, list, i10, z0.f27198l);
    }

    @Override // a2.m0
    public final int c(c2.i1 i1Var, List list, int i10) {
        return g(i1Var, list, i10, z0.f27201o);
    }

    @Override // a2.m0
    public final int d(c2.i1 i1Var, List list, int i10) {
        return g(i1Var, list, i10, z0.f27199m);
    }

    @Override // a2.m0
    public final int e(c2.i1 i1Var, List list, int i10) {
        return f(i1Var, list, i10, z0.f27200n);
    }

    public final int f(c2.i1 i1Var, List list, int i10, z0 z0Var) {
        Object obj;
        Object obj2;
        int i11;
        int i12;
        Object obj3;
        int i13;
        Object obj4;
        int i14;
        int size = list.size();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            obj = null;
            if (i16 < size) {
                obj2 = list.get(i16);
                if (Intrinsics.a(m8.c((a2.q) obj2), "Leading")) {
                    break;
                }
                i16++;
            } else {
                obj2 = null;
                break;
            }
        }
        a2.q qVar = (a2.q) obj2;
        if (qVar != null) {
            int D = qVar.D(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            if (i10 == Integer.MAX_VALUE) {
                i11 = i10;
            } else {
                i11 = i10 - D;
            }
            i12 = ((Number) z0Var.invoke(qVar, Integer.valueOf(i10))).intValue();
        } else {
            i11 = i10;
            i12 = 0;
        }
        int size2 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 < size2) {
                obj3 = list.get(i17);
                if (Intrinsics.a(m8.c((a2.q) obj3), "Trailing")) {
                    break;
                }
                i17++;
            } else {
                obj3 = null;
                break;
            }
        }
        a2.q qVar2 = (a2.q) obj3;
        if (qVar2 != null) {
            int D2 = qVar2.D(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            if (i11 != Integer.MAX_VALUE) {
                i11 -= D2;
            }
            i13 = ((Number) z0Var.invoke(qVar2, Integer.valueOf(i10))).intValue();
        } else {
            i13 = 0;
        }
        int size3 = list.size();
        int i18 = 0;
        while (true) {
            if (i18 < size3) {
                obj4 = list.get(i18);
                if (Intrinsics.a(m8.c((a2.q) obj4), "Label")) {
                    break;
                }
                i18++;
            } else {
                obj4 = null;
                break;
            }
        }
        Object obj5 = (a2.q) obj4;
        if (obj5 != null) {
            i14 = ((Number) z0Var.invoke(obj5, Integer.valueOf(hl.f.A0(i11, this.f26243c, i10)))).intValue();
        } else {
            i14 = 0;
        }
        int size4 = list.size();
        for (int i19 = 0; i19 < size4; i19++) {
            Object obj6 = list.get(i19);
            if (Intrinsics.a(m8.c((a2.q) obj6), "TextField")) {
                int intValue = ((Number) z0Var.invoke(obj6, Integer.valueOf(i11))).intValue();
                int size5 = list.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size5) {
                        break;
                    }
                    Object obj7 = list.get(i20);
                    if (Intrinsics.a(m8.c((a2.q) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                    i20++;
                }
                Object obj8 = (a2.q) obj;
                if (obj8 != null) {
                    i15 = ((Number) z0Var.invoke(obj8, Integer.valueOf(i11))).intValue();
                }
                return f5.c(i12, i13, intValue, i14, i15, this.f26243c, m8.f26505a, i1Var.b(), this.f26244d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int g(c2.i1 i1Var, List list, int i10, z0 z0Var) {
        Object obj;
        Object obj2;
        int i11;
        Object obj3;
        int i12;
        Object obj4;
        int i13;
        int size = list.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            Object obj5 = list.get(i15);
            if (Intrinsics.a(m8.c((a2.q) obj5), "TextField")) {
                int intValue = ((Number) z0Var.invoke(obj5, Integer.valueOf(i10))).intValue();
                int size2 = list.size();
                int i16 = 0;
                while (true) {
                    obj = null;
                    if (i16 < size2) {
                        obj2 = list.get(i16);
                        if (Intrinsics.a(m8.c((a2.q) obj2), "Label")) {
                            break;
                        }
                        i16++;
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                a2.q qVar = (a2.q) obj2;
                if (qVar != null) {
                    i11 = ((Number) z0Var.invoke(qVar, Integer.valueOf(i10))).intValue();
                } else {
                    i11 = 0;
                }
                int size3 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 < size3) {
                        obj3 = list.get(i17);
                        if (Intrinsics.a(m8.c((a2.q) obj3), "Trailing")) {
                            break;
                        }
                        i17++;
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                a2.q qVar2 = (a2.q) obj3;
                if (qVar2 != null) {
                    i12 = ((Number) z0Var.invoke(qVar2, Integer.valueOf(i10))).intValue();
                } else {
                    i12 = 0;
                }
                int size4 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 < size4) {
                        obj4 = list.get(i18);
                        if (Intrinsics.a(m8.c((a2.q) obj4), "Leading")) {
                            break;
                        }
                        i18++;
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                a2.q qVar3 = (a2.q) obj4;
                if (qVar3 != null) {
                    i13 = ((Number) z0Var.invoke(qVar3, Integer.valueOf(i10))).intValue();
                } else {
                    i13 = 0;
                }
                int size5 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size5) {
                        break;
                    }
                    Object obj6 = list.get(i19);
                    if (Intrinsics.a(m8.c((a2.q) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i19++;
                }
                a2.q qVar4 = (a2.q) obj;
                if (qVar4 != null) {
                    i14 = ((Number) z0Var.invoke(qVar4, Integer.valueOf(i10))).intValue();
                }
                return f5.d(i13, i12, intValue, i11, i14, this.f26243c, m8.f26505a, i1Var.b(), this.f26244d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
