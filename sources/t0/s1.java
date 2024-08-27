package t0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f35199a = new ArrayList();

    public final void a(int i10) {
        List list = this.f35199a;
        if ((!list.isEmpty()) && (((Number) list.get(0)).intValue() == i10 || ((Number) nn.d.g(list, 1)).intValue() == i10)) {
            return;
        }
        int size = list.size();
        list.add(Integer.valueOf(i10));
        while (size > 0) {
            int i11 = ((size + 1) >>> 1) - 1;
            int intValue = ((Number) list.get(i11)).intValue();
            if (i10 <= intValue) {
                break;
            }
            list.set(size, Integer.valueOf(intValue));
            size = i11;
        }
        list.set(size, Integer.valueOf(i10));
    }

    public final int b() {
        boolean z10;
        int intValue;
        List list = this.f35199a;
        if (list.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int intValue2 = ((Number) list.get(0)).intValue();
            while ((!list.isEmpty()) && ((Number) list.get(0)).intValue() == intValue2) {
                list.set(0, vt.g0.C(list));
                list.remove(list.size() - 1);
                int size = list.size();
                int size2 = list.size() >>> 1;
                int i10 = 0;
                while (i10 < size2) {
                    int intValue3 = ((Number) list.get(i10)).intValue();
                    int i11 = (i10 + 1) * 2;
                    int i12 = i11 - 1;
                    int intValue4 = ((Number) list.get(i12)).intValue();
                    if (i11 < size && (intValue = ((Number) list.get(i11)).intValue()) > intValue4) {
                        if (intValue > intValue3) {
                            list.set(i10, Integer.valueOf(intValue));
                            list.set(i11, Integer.valueOf(intValue3));
                            i10 = i11;
                        }
                    } else if (intValue4 > intValue3) {
                        list.set(i10, Integer.valueOf(intValue4));
                        list.set(i12, Integer.valueOf(intValue3));
                        i10 = i12;
                    }
                }
            }
            return intValue2;
        }
        t.F("Set is empty");
        throw null;
    }
}
