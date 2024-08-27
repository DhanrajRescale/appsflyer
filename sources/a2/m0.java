package a2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface m0 {
    n0 a(o0 o0Var, List list, long j10);

    default int b(c2.i1 i1Var, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new m((q) list.get(i11), 2, 2));
        }
        return a(new t(i1Var, i1Var.f7721k.f1418s), arrayList, hl.f.c(i10, 0, 13)).a();
    }

    default int c(c2.i1 i1Var, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new m((q) list.get(i11), 1, 1));
        }
        return a(new t(i1Var, i1Var.f7721k.f1418s), arrayList, hl.f.c(0, i10, 7)).b();
    }

    default int d(c2.i1 i1Var, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new m((q) list.get(i11), 2, 1));
        }
        return a(new t(i1Var, i1Var.f7721k.f1418s), arrayList, hl.f.c(0, i10, 7)).b();
    }

    default int e(c2.i1 i1Var, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new m((q) list.get(i11), 1, 2));
        }
        return a(new t(i1Var, i1Var.f7721k.f1418s), arrayList, hl.f.c(i10, 0, 13)).a();
    }
}
