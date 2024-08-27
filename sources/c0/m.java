package c0;

import a2.a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public d0.w f7523b;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f7522a = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f7524c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7525d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f7526e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f7527f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f7528g = new ArrayList();

    public final void a(int i10, int i11, int i12, ArrayList arrayList, v vVar, boolean z10, boolean z11, boolean z12) {
        int i13;
        boolean z13;
        int i14;
        int i15;
        int i16;
        int i17;
        d0.w wVar = this.f7523b;
        d0.w wVar2 = vVar.f7593a.f7562d;
        this.f7523b = wVar2;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            b0 b0Var = (b0) arrayList.get(i18);
            int size2 = b0Var.f7465b.size();
            for (int i19 = 0; i19 < size2; i19++) {
                ((a1) b0Var.f7465b.get(i19)).a();
            }
        }
        LinkedHashMap linkedHashMap = this.f7522a;
        if (linkedHashMap.isEmpty()) {
            linkedHashMap.clear();
            this.f7523b = d0.e.f13156b;
            return;
        }
        b0 b0Var2 = (b0) vt.g0.w(arrayList);
        if (b0Var2 != null) {
            int i20 = b0Var2.f7464a;
        }
        if (z10) {
            i13 = i12;
        } else {
            i13 = i11;
        }
        if (z10) {
            hl.f.j(0, i10);
        } else {
            hl.f.j(i10, 0);
        }
        if (!z11 && z12) {
            z13 = false;
        } else {
            z13 = true;
        }
        LinkedHashSet linkedHashSet = this.f7524c;
        linkedHashSet.addAll(linkedHashMap.keySet());
        int size3 = arrayList.size();
        int i21 = 0;
        while (i21 < size3) {
            b0 b0Var3 = (b0) arrayList.get(i21);
            linkedHashSet.remove(b0Var3.f7473j);
            List list = b0Var3.f7465b;
            int size4 = list.size();
            int i22 = size3;
            for (int i23 = 0; i23 < size4; i23++) {
                ((a1) list.get(i23)).a();
            }
            linkedHashMap.remove(b0Var3.f7473j);
            i21++;
            size3 = i22;
        }
        ArrayList arrayList2 = this.f7526e;
        ArrayList arrayList3 = this.f7525d;
        if (z13 && wVar != null) {
            if (arrayList3.size() > 1) {
                vt.c0.l(arrayList3, new l(wVar, 2));
            }
            if (arrayList3.size() > 0) {
                b0 b0Var4 = (b0) arrayList3.get(0);
                int i24 = 0 - b0Var4.f7478o;
                k kVar = (k) vt.p0.e(b0Var4.f7473j, linkedHashMap);
                long a10 = b0Var4.a(0);
                if (b0Var4.f7466c) {
                    int i25 = w2.h.f38792c;
                    hl.f.j((int) (a10 >> 32), i24);
                } else {
                    int i26 = w2.h.f38792c;
                    hl.f.j(i24, (int) (a10 & 4294967295L));
                }
                kVar.getClass();
                throw null;
            }
            if (arrayList2.size() > 1) {
                i17 = 0;
                vt.c0.l(arrayList2, new l(wVar, i17));
            } else {
                i17 = 0;
            }
            if (arrayList2.size() > 0) {
                b0 b0Var5 = (b0) arrayList2.get(i17);
                int i27 = b0Var5.f7478o;
                k kVar2 = (k) vt.p0.e(b0Var5.f7473j, linkedHashMap);
                long a11 = b0Var5.a(i17);
                if (b0Var5.f7466c) {
                    int i28 = w2.h.f38792c;
                    hl.f.j((int) (a11 >> 32), i13);
                } else {
                    int i29 = w2.h.f38792c;
                    hl.f.j(i13, (int) (a11 & 4294967295L));
                }
                kVar2.getClass();
                throw null;
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList4 = this.f7528g;
            ArrayList arrayList5 = this.f7527f;
            if (hasNext) {
                Object next = it.next();
                int b10 = wVar2.b(next);
                if (b10 == -1) {
                    linkedHashMap.remove(next);
                } else {
                    vVar.a(b10).f7480q = true;
                    ((k) vt.p0.e(next, linkedHashMap)).getClass();
                    throw null;
                }
            } else {
                if (arrayList5.size() > 1) {
                    vt.c0.l(arrayList5, new l(wVar2, 3));
                }
                int size5 = arrayList5.size();
                int i30 = 0;
                int i31 = 0;
                while (i30 < size5) {
                    b0 b0Var6 = (b0) arrayList5.get(i30);
                    int i32 = size5;
                    i31 += b0Var6.f7478o;
                    if (z11) {
                        i16 = ((b0) vt.g0.u(arrayList)).f7476m - i31;
                    } else {
                        i16 = 0 - i31;
                    }
                    b0Var6.c(i16, i11, i12);
                    if (!z13) {
                        i30++;
                        size5 = i32;
                    } else {
                        b(b0Var6);
                        throw null;
                    }
                }
                int i33 = 1;
                if (arrayList4.size() > 1) {
                    vt.c0.l(arrayList4, new l(wVar2, i33));
                }
                int size6 = arrayList4.size();
                int i34 = 0;
                int i35 = 0;
                while (i34 < size6) {
                    b0 b0Var7 = (b0) arrayList4.get(i34);
                    if (z11) {
                        b0 b0Var8 = (b0) vt.g0.C(arrayList);
                        i14 = size6;
                        i15 = b0Var8.f7476m + b0Var8.f7478o + i35;
                    } else {
                        i14 = size6;
                        i15 = i13 + i35;
                    }
                    i35 += b0Var7.f7478o;
                    b0Var7.c(i15, i11, i12);
                    if (!z13) {
                        i34++;
                        size6 = i14;
                    } else {
                        b(b0Var7);
                        throw null;
                    }
                }
                Intrinsics.checkNotNullParameter(arrayList5, "<this>");
                Collections.reverse(arrayList5);
                Unit unit = Unit.f23355a;
                arrayList.addAll(0, arrayList5);
                arrayList.addAll(arrayList4);
                arrayList3.clear();
                arrayList2.clear();
                arrayList5.clear();
                arrayList4.clear();
                linkedHashSet.clear();
                return;
            }
        }
    }

    public final void b(b0 b0Var) {
        ((k) vt.p0.e(b0Var.f7473j, this.f7522a)).getClass();
        throw null;
    }
}
