package z2;

import a2.a1;
import a2.l0;
import a2.m0;
import a2.n0;
import a2.o0;
import java.util.ArrayList;
import java.util.List;
import vt.p0;
import vt.y;

/* loaded from: classes.dex */
public final class d implements m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f41918b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f41919c = new d(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41920a;

    public /* synthetic */ d(int i10) {
        this.f41920a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // a2.m0
    public final n0 a(o0 o0Var, List list, long j10) {
        Object obj;
        int j11;
        int i10;
        n0 n0;
        n0 n02;
        n0 n03;
        int i11;
        n0 n04;
        int i12 = 0;
        int i13 = 1;
        switch (this.f41920a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i14 = 0;
                while (i14 < size) {
                    i14 = nn.d.d((l0) list.get(i14), j10, arrayList, i14, 1);
                }
                a1 a1Var = null;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList.get(0);
                    int i15 = ((a1) obj).f29a;
                    int f10 = y.f(arrayList);
                    if (1 <= f10) {
                        int i16 = 1;
                        while (true) {
                            Object obj2 = arrayList.get(i16);
                            int i17 = ((a1) obj2).f29a;
                            if (i15 < i17) {
                                obj = obj2;
                                i15 = i17;
                            }
                            if (i16 != f10) {
                                i16++;
                            }
                        }
                    }
                }
                a1 a1Var2 = (a1) obj;
                if (a1Var2 != null) {
                    j11 = a1Var2.f29a;
                } else {
                    j11 = w2.a.j(j10);
                }
                if (!arrayList.isEmpty()) {
                    ?? r12 = arrayList.get(0);
                    int i18 = ((a1) r12).f30b;
                    int f11 = y.f(arrayList);
                    boolean z10 = r12;
                    if (1 <= f11) {
                        while (true) {
                            Object obj3 = arrayList.get(i13);
                            int i19 = ((a1) obj3).f30b;
                            r12 = z10;
                            if (i18 < i19) {
                                r12 = obj3;
                                i18 = i19;
                            }
                            if (i13 != f11) {
                                i13++;
                                z10 = r12;
                            }
                        }
                    }
                    a1Var = r12;
                }
                a1 a1Var3 = a1Var;
                if (a1Var3 != null) {
                    i10 = a1Var3.f30b;
                } else {
                    i10 = w2.a.i(j10);
                }
                n0 = o0Var.n0(j11, i10, p0.d(), new v.c(6, arrayList));
                return n0;
            default:
                int size2 = list.size();
                if (size2 == 0) {
                    n02 = o0Var.n0(0, 0, p0.d(), b.f41911f);
                    return n02;
                }
                if (size2 != 1) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    int size3 = list.size();
                    int i20 = 0;
                    while (i20 < size3) {
                        i20 = nn.d.d((l0) list.get(i20), j10, arrayList2, i20, 1);
                    }
                    int f12 = y.f(arrayList2);
                    if (f12 >= 0) {
                        int i21 = 0;
                        i11 = 0;
                        while (true) {
                            a1 a1Var4 = (a1) arrayList2.get(i12);
                            i21 = Math.max(i21, a1Var4.f29a);
                            i11 = Math.max(i11, a1Var4.f30b);
                            if (i12 != f12) {
                                i12++;
                            } else {
                                i12 = i21;
                            }
                        }
                    } else {
                        i11 = 0;
                    }
                    n04 = o0Var.n0(i12, i11, p0.d(), new v.c(7, arrayList2));
                    return n04;
                }
                a1 E = ((l0) list.get(0)).E(j10);
                n03 = o0Var.n0(E.f29a, E.f30b, p0.d(), new v.f(16, E));
                return n03;
        }
    }
}
