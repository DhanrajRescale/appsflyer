package androidx.navigation;

import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class v implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final String f2330a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2331b;

    public v(String mimeType) {
        List list;
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        List d10 = new Regex("/").d(mimeType);
        if (!d10.isEmpty()) {
            ListIterator listIterator = d10.listIterator(d10.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    list = vt.g0.N(d10, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = vt.i0.f38321a;
        this.f2330a = (String) list.get(0);
        this.f2331b = (String) list.get(1);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i10;
        v other = (v) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        if (Intrinsics.a(this.f2330a, other.f2330a)) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        if (Intrinsics.a(this.f2331b, other.f2331b)) {
            return i10 + 1;
        }
        return i10;
    }
}
