package m0;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o6 implements a2.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26588c;

    public /* synthetic */ o6(int i10, Object obj, Object obj2) {
        this.f26586a = i10;
        this.f26587b = obj;
        this.f26588c = obj2;
    }

    @Override // a2.m0
    public final a2.n0 a(a2.o0 o0Var, List list, long j10) {
        int i10;
        boolean z10;
        int max;
        int i11;
        int i12;
        a2.n0 n0;
        int i13;
        a2.a1 a1Var;
        a2.a1 a1Var2;
        int i14;
        int i15;
        float f10;
        Integer num;
        Integer num2;
        a2.n0 n02;
        int i16 = this.f26586a;
        Object obj = this.f26588c;
        Object obj2 = this.f26587b;
        switch (i16) {
            case 0:
                String str = (String) obj2;
                int size = list.size();
                for (int i17 = 0; i17 < size; i17++) {
                    a2.l0 l0Var = (a2.l0) list.get(i17);
                    if (Intrinsics.a(androidx.compose.ui.layout.a.f(l0Var), str)) {
                        a2.a1 E = l0Var.E(j10);
                        int h10 = (w2.a.h(j10) - E.f29a) - o0Var.m0(t6.f26854f);
                        int j11 = w2.a.j(j10);
                        if (h10 < j11) {
                            i10 = j11;
                        } else {
                            i10 = h10;
                        }
                        String str2 = (String) obj;
                        int size2 = list.size();
                        for (int i18 = 0; i18 < size2; i18++) {
                            a2.l0 l0Var2 = (a2.l0) list.get(i18);
                            if (Intrinsics.a(androidx.compose.ui.layout.a.f(l0Var2), str2)) {
                                a2.a1 E2 = l0Var2.E(w2.a.a(j10, 0, i10, 0, 0, 9));
                                a2.p pVar = a2.d.f47a;
                                int f11 = E2.f(pVar);
                                if (f11 != Integer.MIN_VALUE) {
                                    int f12 = E2.f(a2.d.f48b);
                                    if (f12 != Integer.MIN_VALUE) {
                                        if (f11 == f12) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        int h11 = w2.a.h(j10) - E.f29a;
                                        if (z10) {
                                            max = Math.max(o0Var.m0(t6.f26856h), E.f30b);
                                            int i19 = (max - E2.f30b) / 2;
                                            int f13 = E.f(pVar);
                                            if (f13 != Integer.MIN_VALUE) {
                                                i13 = (f11 + i19) - f13;
                                            } else {
                                                i13 = 0;
                                            }
                                            i11 = i19;
                                            i12 = i13;
                                        } else {
                                            int m02 = o0Var.m0(t6.f26849a) - f11;
                                            max = Math.max(o0Var.m0(t6.f26857i), E2.f30b + m02);
                                            i11 = m02;
                                            i12 = (max - E.f30b) / 2;
                                        }
                                        n0 = o0Var.n0(w2.a.h(j10), max, vt.p0.d(), new n6(E2, i11, E, h11, i12));
                                        return n0;
                                    }
                                    throw new IllegalArgumentException("No baselines for text".toString());
                                }
                                throw new IllegalArgumentException("No baselines for text".toString());
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                if (((Function2) obj2) != null) {
                    int size3 = list.size();
                    for (int i20 = 0; i20 < size3; i20++) {
                        a2.l0 l0Var3 = (a2.l0) list.get(i20);
                        if (Intrinsics.a(androidx.compose.ui.layout.a.f(l0Var3), "text")) {
                            a1Var = l0Var3.E(w2.a.a(j10, 0, 0, 0, 0, 11));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                a1Var = null;
                if (((Function2) obj) != null) {
                    int size4 = list.size();
                    for (int i21 = 0; i21 < size4; i21++) {
                        a2.l0 l0Var4 = (a2.l0) list.get(i21);
                        if (Intrinsics.a(androidx.compose.ui.layout.a.f(l0Var4), "icon")) {
                            a1Var2 = l0Var4.E(j10);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                a1Var2 = null;
                if (a1Var != null) {
                    i14 = a1Var.f29a;
                } else {
                    i14 = 0;
                }
                if (a1Var2 != null) {
                    i15 = a1Var2.f29a;
                } else {
                    i15 = 0;
                }
                int max2 = Math.max(i14, i15);
                if (a1Var != null && a1Var2 != null) {
                    f10 = m7.f26500b;
                } else {
                    f10 = m7.f26499a;
                }
                int m03 = o0Var.m0(f10);
                if (a1Var != null) {
                    num = Integer.valueOf(a1Var.f(a2.d.f47a));
                } else {
                    num = null;
                }
                if (a1Var != null) {
                    num2 = Integer.valueOf(a1Var.f(a2.d.f48b));
                } else {
                    num2 = null;
                }
                n02 = o0Var.n0(max2, m03, vt.p0.d(), new k7(a1Var, a1Var2, o0Var, max2, m03, num, num2));
                return n02;
        }
    }
}
