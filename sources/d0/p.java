package d0;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public abstract class p {
    public static final List a(u uVar, d0 d0Var, k kVar) {
        kotlin.ranges.c cVar;
        if (!kVar.f13174a.l() && d0Var.f13154a.isEmpty()) {
            return vt.i0.f38321a;
        }
        ArrayList arrayList = new ArrayList();
        v0.h hVar = kVar.f13174a;
        if (hVar.l()) {
            if (!hVar.k()) {
                Object[] objArr = hVar.f37653a;
                int i10 = ((j) objArr[0]).f13169a;
                int i11 = hVar.f37655c;
                if (i11 > 0) {
                    int i12 = 0;
                    do {
                        int i13 = ((j) objArr[i12]).f13169a;
                        if (i13 < i10) {
                            i10 = i13;
                        }
                        i12++;
                    } while (i12 < i11);
                }
                if (i10 >= 0) {
                    if (!hVar.k()) {
                        Object[] objArr2 = hVar.f37653a;
                        int i14 = ((j) objArr2[0]).f13170b;
                        int i15 = hVar.f37655c;
                        if (i15 > 0) {
                            int i16 = 0;
                            do {
                                int i17 = ((j) objArr2[i16]).f13170b;
                                if (i17 > i14) {
                                    i14 = i17;
                                }
                                i16++;
                            } while (i16 < i15);
                        }
                        cVar = new kotlin.ranges.c(i10, Math.min(i14, uVar.c() - 1), 1);
                    } else {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                } else {
                    throw new IllegalArgumentException("negative minIndex".toString());
                }
            } else {
                throw new NoSuchElementException("MutableVector is empty.");
            }
        } else {
            IntRange.INSTANCE.getClass();
            cVar = IntRange.f23374f;
        }
        int size = d0Var.f13154a.size();
        for (int i18 = 0; i18 < size; i18++) {
            c0 c0Var = (c0) d0Var.get(i18);
            int l10 = iu.j.l(c0Var.f13149c.i(), uVar, c0Var.f13147a);
            int i19 = cVar.f23381a;
            if ((l10 > cVar.f23382b || i19 > l10) && l10 >= 0 && l10 < uVar.c()) {
                arrayList.add(Integer.valueOf(l10));
            }
        }
        int i20 = cVar.f23381a;
        int i21 = cVar.f23382b;
        if (i20 <= i21) {
            while (true) {
                arrayList.add(Integer.valueOf(i20));
                if (i20 == i21) {
                    break;
                }
                i20++;
            }
        }
        return arrayList;
    }
}
