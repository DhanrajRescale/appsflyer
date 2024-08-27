package j2;

import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f20709a = new e(HttpUrl.FRAGMENT_ENCODE_SET, null, 6);

    public static final ArrayList a(int i10, int i11, List list) {
        if (i10 <= i11) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                d dVar = (d) obj;
                if (c(i10, i11, dVar.f20686b, dVar.f20687c)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                d dVar2 = (d) arrayList.get(i13);
                arrayList2.add(new d(dVar2.f20688d, Math.max(i10, dVar2.f20686b) - i10, Math.min(i11, dVar2.f20687c) - i10, dVar2.f20685a));
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("start (" + i10 + ") should be less than or equal to end (" + i11 + ')').toString());
    }

    public static final List b(e eVar, int i10, int i11) {
        List list;
        if (i10 == i11 || (list = eVar.f20700b) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= eVar.f20699a.length()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            d dVar = (d) obj;
            if (c(i10, i11, dVar.f20686b, dVar.f20687c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            d dVar2 = (d) arrayList.get(i13);
            arrayList2.add(new d(kotlin.ranges.d.f(dVar2.f20686b, i10, i11) - i10, kotlin.ranges.d.f(dVar2.f20687c, i10, i11) - i10, dVar2.f20685a));
        }
        return arrayList2;
    }

    public static final boolean c(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (Math.max(i10, i12) < Math.min(i11, i13)) {
            return true;
        }
        if (i10 <= i12 && i13 <= i11) {
            if (i11 != i13) {
                return true;
            }
            if (i12 == i13) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i10 == i11) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z12 == z13) {
                return true;
            }
        }
        if (i12 <= i10 && i11 <= i13) {
            if (i13 != i11) {
                return true;
            }
            if (i10 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i12 == i13) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 == z11) {
                return true;
            }
        }
        return false;
    }
}
