package v;

import a2.a1;
import c2.i1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements a2.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final s f37489a;

    public d(s sVar) {
        this.f37489a = sVar;
    }

    @Override // a2.m0
    public final a2.n0 a(a2.o0 o0Var, List list, long j10) {
        Object obj;
        int i10;
        int i11;
        a2.n0 n0;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i12 = 0;
        while (i12 < size) {
            i12 = nn.d.d((a2.l0) list.get(i12), j10, arrayList, i12, 1);
        }
        int i13 = 1;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i14 = ((a1) obj).f29a;
            int f10 = vt.y.f(arrayList);
            if (1 <= f10) {
                int i15 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i15);
                    int i16 = ((a1) obj3).f29a;
                    if (i14 < i16) {
                        obj = obj3;
                        i14 = i16;
                    }
                    if (i15 == f10) {
                        break;
                    }
                    i15++;
                }
            }
        }
        a1 a1Var = (a1) obj;
        if (a1Var != null) {
            i10 = a1Var.f29a;
        } else {
            i10 = 0;
        }
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i17 = ((a1) obj2).f30b;
            int f11 = vt.y.f(arrayList);
            if (1 <= f11) {
                while (true) {
                    Object obj4 = arrayList.get(i13);
                    int i18 = ((a1) obj4).f30b;
                    if (i17 < i18) {
                        obj2 = obj4;
                        i17 = i18;
                    }
                    if (i13 == f11) {
                        break;
                    }
                    i13++;
                }
            }
        }
        a1 a1Var2 = (a1) obj2;
        if (a1Var2 != null) {
            i11 = a1Var2.f30b;
        } else {
            i11 = 0;
        }
        this.f37489a.f37606a.setValue(new w2.j(hl.f.k(i10, i11)));
        n0 = o0Var.n0(i10, i11, vt.p0.d(), new c(0, arrayList));
        return n0;
    }

    @Override // a2.m0
    public final int b(i1 i1Var, List list, int i10) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((a2.q) list.get(0)).e(i10));
            int f10 = vt.y.f(list);
            int i11 = 1;
            if (1 <= f10) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((a2.q) list.get(i11)).e(i10));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i11 == f10) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // a2.m0
    public final int c(i1 i1Var, List list, int i10) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((a2.q) list.get(0)).z(i10));
            int f10 = vt.y.f(list);
            int i11 = 1;
            if (1 <= f10) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((a2.q) list.get(i11)).z(i10));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i11 == f10) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // a2.m0
    public final int d(i1 i1Var, List list, int i10) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((a2.q) list.get(0)).D(i10));
            int f10 = vt.y.f(list);
            int i11 = 1;
            if (1 <= f10) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((a2.q) list.get(i11)).D(i10));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i11 == f10) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // a2.m0
    public final int e(i1 i1Var, List list, int i10) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((a2.q) list.get(0)).W(i10));
            int f10 = vt.y.f(list);
            int i11 = 1;
            if (1 <= f10) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((a2.q) list.get(i11)).W(i10));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i11 == f10) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }
}
