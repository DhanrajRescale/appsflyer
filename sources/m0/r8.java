package m0;

import com.google.android.gms.common.api.Api;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r8 implements a2.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26748a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26749b;

    /* renamed from: c, reason: collision with root package name */
    public final b0.h1 f26750c;

    public r8(boolean z10, float f10, b0.h1 h1Var) {
        this.f26748a = z10;
        this.f26749b = f10;
        this.f26750c = h1Var;
    }

    public static int g(int i10, List list, z0 z0Var) {
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
                long j10 = m8.f26505a;
                float f10 = p8.f26655a;
                return Math.max(Math.max(intValue, Math.max(i11, i14)) + i13 + i12, w2.a.j(j10));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // a2.m0
    public final a2.n0 a(a2.o0 o0Var, List list, long j10) {
        Object obj;
        a2.a1 a1Var;
        Object obj2;
        a2.a1 a1Var2;
        Object obj3;
        a2.a1 a1Var3;
        int i10;
        int i11;
        Object obj4;
        a2.a1 a1Var4;
        boolean z10;
        a2.n0 n0;
        r8 r8Var = this;
        List list2 = list;
        b0.h1 h1Var = r8Var.f26750c;
        int m02 = o0Var.m0(h1Var.c());
        int m03 = o0Var.m0(h1Var.a());
        int m04 = o0Var.m0(p8.f26657c);
        long a10 = w2.a.a(j10, 0, 0, 0, 0, 10);
        int size = list.size();
        int i12 = 0;
        while (true) {
            if (i12 < size) {
                obj = list2.get(i12);
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
                obj2 = list2.get(i13);
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
        int i14 = -m03;
        int i15 = -e11;
        long F0 = hl.f.F0(i15, i14, a10);
        int size3 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 < size3) {
                obj3 = list2.get(i16);
                int i17 = size3;
                if (Intrinsics.a(androidx.compose.ui.layout.a.f((a2.l0) obj3), "Label")) {
                    break;
                }
                i16++;
                size3 = i17;
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
            i10 = a1Var3.f(a2.d.f48b);
            if (i10 == Integer.MIN_VALUE) {
                i10 = a1Var3.f30b;
            }
        } else {
            i10 = 0;
        }
        int max = Math.max(i10, m02);
        if (a1Var3 != null) {
            i11 = (i14 - m04) - max;
        } else {
            i11 = (-m02) - m03;
        }
        long F02 = hl.f.F0(i15, i11, w2.a.a(j10, 0, 0, 0, 0, 11));
        int size4 = list.size();
        int i18 = 0;
        while (i18 < size4) {
            a2.l0 l0Var4 = (a2.l0) list2.get(i18);
            if (Intrinsics.a(androidx.compose.ui.layout.a.f(l0Var4), "TextField")) {
                a2.a1 E = l0Var4.E(F02);
                long a11 = w2.a.a(F02, 0, 0, 0, 0, 14);
                int size5 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 < size5) {
                        obj4 = list2.get(i19);
                        if (Intrinsics.a(androidx.compose.ui.layout.a.f((a2.l0) obj4), "Hint")) {
                            break;
                        }
                        i19++;
                        list2 = list;
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                a2.l0 l0Var5 = (a2.l0) obj4;
                if (l0Var5 != null) {
                    a1Var4 = l0Var5.E(a11);
                } else {
                    a1Var4 = null;
                }
                int max2 = Math.max(Math.max(E.f29a, Math.max(m8.e(a1Var3), m8.e(a1Var4))) + m8.e(a1Var) + m8.e(a1Var2), w2.a.j(j10));
                int i20 = E.f30b;
                if (a1Var3 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int c10 = p8.c(i20, z10, max, m8.d(a1Var), m8.d(a1Var2), m8.d(a1Var4), j10, o0Var.b(), r8Var.f26750c);
                n0 = o0Var.n0(max2, c10, vt.p0.d(), new q8(a1Var3, m02, i10, max2, c10, E, a1Var4, a1Var, a1Var2, this, max, m04, o0Var));
                return n0;
            }
            i18++;
            r8Var = this;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // a2.m0
    public final int b(c2.i1 i1Var, List list, int i10) {
        return f(i1Var, list, i10, z0.f27202p);
    }

    @Override // a2.m0
    public final int c(c2.i1 i1Var, List list, int i10) {
        return g(i10, list, z0.f27205s);
    }

    @Override // a2.m0
    public final int d(c2.i1 i1Var, List list, int i10) {
        return g(i10, list, z0.f27203q);
    }

    @Override // a2.m0
    public final int e(c2.i1 i1Var, List list, int i10) {
        return f(i1Var, list, i10, z0.f27204r);
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
        int i15;
        int size = list.size();
        boolean z10 = false;
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
            i14 = ((Number) z0Var.invoke(obj5, Integer.valueOf(i11))).intValue();
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
                } else {
                    i15 = 0;
                }
                if (i14 > 0) {
                    z10 = true;
                }
                return p8.c(intValue, z10, i14, i12, i13, i15, m8.f26505a, i1Var.b(), this.f26750c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
