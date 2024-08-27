package i0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class y2 implements a2.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19280a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19281b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19282c;

    public /* synthetic */ y2(int i10, Object obj, Object obj2) {
        this.f19280a = i10;
        this.f19281b = obj;
        this.f19282c = obj2;
    }

    @Override // a2.m0
    public final a2.n0 a(a2.o0 o0Var, List list, long j10) {
        a2.n0 n0;
        ArrayList arrayList;
        Pair pair;
        a2.n0 n02;
        a2.n0 n03;
        int i10 = this.f19280a;
        Object obj = this.f19282c;
        Object obj2 = this.f19281b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj3 = list.get(i11);
                    if (!(((a2.l0) obj3).a() instanceof a3)) {
                        arrayList2.add(obj3);
                    }
                }
                List list2 = (List) ((Function0) obj).mo2invoke();
                ArrayList arrayList3 = null;
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        m1.d dVar = (m1.d) list2.get(i12);
                        if (dVar != null) {
                            arrayList = arrayList2;
                            pair = new Pair(((a2.l0) arrayList2.get(i12)).E(hl.f.c((int) Math.floor(dVar.c()), (int) Math.floor(dVar.b()), 5)), new w2.h(hl.f.j(Math.round(dVar.f27239a), Math.round(dVar.f27240b))));
                        } else {
                            arrayList = arrayList2;
                            pair = null;
                        }
                        if (pair != null) {
                            arrayList4.add(pair);
                        }
                        i12++;
                        arrayList2 = arrayList;
                    }
                    arrayList3 = arrayList4;
                }
                ArrayList arrayList5 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    Object obj4 = list.get(i13);
                    if (((a2.l0) obj4).a() instanceof a3) {
                        arrayList5.add(obj4);
                    }
                }
                n0 = o0Var.n0(w2.a.h(j10), w2.a.g(j10), vt.p0.d(), new x.z(17, arrayList3, l1.n(arrayList5, (Function0) obj2)));
                return n0;
            case 1:
                ((o0.k) obj2).f29360n = (w2.k) obj;
                n02 = o0Var.n0(0, 0, vt.p0.d(), o0.e.f29343b);
                return n02;
            default:
                ((z2.r) obj2).setParentLayoutDirection((w2.k) obj);
                n03 = o0Var.n0(0, 0, vt.p0.d(), z2.b.f41909d);
                return n03;
        }
    }
}
