package k7;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public final x0 f22276d;

    /* renamed from: a, reason: collision with root package name */
    public final c3.e f22273a = new c3.e(30, 1);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22274b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f22275c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f22278f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final e4.k f22277e = new e4.k(this);

    public b(x0 x0Var) {
        this.f22276d = x0Var;
    }

    public final boolean a(int i10) {
        ArrayList arrayList = this.f22275c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.f22265a;
            if (i12 == 8) {
                if (f(aVar.f22268d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = aVar.f22266b;
                int i14 = aVar.f22268d + i13;
                while (i13 < i14) {
                    if (f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f22275c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f22276d.a((a) arrayList.get(i10));
        }
        l(arrayList);
        this.f22278f = 0;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f22274b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.f22265a;
            x0 x0Var = this.f22276d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            x0Var.a(aVar);
                            x0Var.f(aVar.f22266b, aVar.f22268d);
                        }
                    } else {
                        x0Var.a(aVar);
                        x0Var.c(aVar.f22266b, aVar.f22268d, aVar.f22267c);
                    }
                } else {
                    x0Var.a(aVar);
                    int i12 = aVar.f22266b;
                    int i13 = aVar.f22268d;
                    RecyclerView recyclerView = x0Var.f22614a;
                    recyclerView.T(i12, i13, true);
                    recyclerView.B0 = true;
                    recyclerView.f2424y0.f22588c += i13;
                }
            } else {
                x0Var.a(aVar);
                x0Var.e(aVar.f22266b, aVar.f22268d);
            }
        }
        l(arrayList);
        this.f22278f = 0;
    }

    public final void d(a aVar) {
        int i10;
        int i11 = aVar.f22265a;
        if (i11 != 1 && i11 != 8) {
            int m10 = m(aVar.f22266b, i11);
            int i12 = aVar.f22266b;
            int i13 = aVar.f22265a;
            if (i13 != 2) {
                if (i13 == 4) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + aVar);
                }
            } else {
                i10 = 0;
            }
            int i14 = 1;
            for (int i15 = 1; i15 < aVar.f22268d; i15++) {
                int m11 = m((i10 * i15) + aVar.f22266b, aVar.f22265a);
                int i16 = aVar.f22265a;
                if (i16 == 2 ? m11 == m10 : !(i16 != 4 || m11 != m10 + 1)) {
                    i14++;
                } else {
                    a h10 = h(aVar.f22267c, i16, m10, i14);
                    e(h10, i12);
                    h10.f22267c = null;
                    this.f22273a.b(h10);
                    if (aVar.f22265a == 4) {
                        i12 += i14;
                    }
                    i14 = 1;
                    m10 = m11;
                }
            }
            Object obj = aVar.f22267c;
            aVar.f22267c = null;
            this.f22273a.b(aVar);
            if (i14 > 0) {
                a h11 = h(obj, aVar.f22265a, m10, i14);
                e(h11, i12);
                h11.f22267c = null;
                this.f22273a.b(h11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public final void e(a aVar, int i10) {
        x0 x0Var = this.f22276d;
        x0Var.a(aVar);
        int i11 = aVar.f22265a;
        if (i11 != 2) {
            if (i11 == 4) {
                x0Var.c(i10, aVar.f22268d, aVar.f22267c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i12 = aVar.f22268d;
        RecyclerView recyclerView = x0Var.f22614a;
        recyclerView.T(i10, i12, true);
        recyclerView.B0 = true;
        recyclerView.f2424y0.f22588c += i12;
    }

    public final int f(int i10, int i11) {
        ArrayList arrayList = this.f22275c;
        int size = arrayList.size();
        while (i11 < size) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.f22265a;
            if (i12 == 8) {
                int i13 = aVar.f22266b;
                if (i13 == i10) {
                    i10 = aVar.f22268d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (aVar.f22268d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = aVar.f22266b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = aVar.f22268d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += aVar.f22268d;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean g() {
        if (this.f22274b.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, k7.a] */
    public final a h(Object obj, int i10, int i11, int i12) {
        a aVar = (a) this.f22273a.c();
        if (aVar == null) {
            ?? obj2 = new Object();
            obj2.f22265a = i10;
            obj2.f22266b = i11;
            obj2.f22268d = i12;
            obj2.f22267c = obj;
            return obj2;
        }
        aVar.f22265a = i10;
        aVar.f22266b = i11;
        aVar.f22268d = i12;
        aVar.f22267c = obj;
        return aVar;
    }

    public final void i(a aVar) {
        this.f22275c.add(aVar);
        int i10 = aVar.f22265a;
        x0 x0Var = this.f22276d;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        x0Var.f(aVar.f22266b, aVar.f22268d);
                        return;
                    } else {
                        throw new IllegalArgumentException("Unknown update op type for " + aVar);
                    }
                }
                x0Var.c(aVar.f22266b, aVar.f22268d, aVar.f22267c);
                return;
            }
            int i11 = aVar.f22266b;
            int i12 = aVar.f22268d;
            RecyclerView recyclerView = x0Var.f22614a;
            recyclerView.T(i11, i12, false);
            recyclerView.B0 = true;
            return;
        }
        x0Var.e(aVar.f22266b, aVar.f22268d);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0124 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.b.j():void");
    }

    public final void k(a aVar) {
        aVar.f22267c = null;
        this.f22273a.b(aVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k((a) arrayList.get(i10));
        }
        arrayList.clear();
    }

    public final int m(int i10, int i11) {
        int i12;
        int i13;
        ArrayList arrayList = this.f22275c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i14 = aVar.f22265a;
            if (i14 == 8) {
                int i15 = aVar.f22266b;
                int i16 = aVar.f22268d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 >= i13 && i10 <= i12) {
                    if (i13 == i15) {
                        if (i11 == 1) {
                            aVar.f22268d = i16 + 1;
                        } else if (i11 == 2) {
                            aVar.f22268d = i16 - 1;
                        }
                        i10++;
                    } else {
                        if (i11 == 1) {
                            aVar.f22266b = i15 + 1;
                        } else if (i11 == 2) {
                            aVar.f22266b = i15 - 1;
                        }
                        i10--;
                    }
                } else if (i10 < i15) {
                    if (i11 == 1) {
                        aVar.f22266b = i15 + 1;
                        aVar.f22268d = i16 + 1;
                    } else if (i11 == 2) {
                        aVar.f22266b = i15 - 1;
                        aVar.f22268d = i16 - 1;
                    }
                }
            } else {
                int i17 = aVar.f22266b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= aVar.f22268d;
                    } else if (i14 == 2) {
                        i10 += aVar.f22268d;
                    }
                } else if (i11 == 1) {
                    aVar.f22266b = i17 + 1;
                } else if (i11 == 2) {
                    aVar.f22266b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            if (aVar2.f22265a == 8) {
                int i18 = aVar2.f22268d;
                if (i18 == aVar2.f22266b || i18 < 0) {
                    arrayList.remove(size2);
                    k(aVar2);
                }
            } else if (aVar2.f22268d <= 0) {
                arrayList.remove(size2);
                k(aVar2);
            }
        }
        return i10;
    }
}
