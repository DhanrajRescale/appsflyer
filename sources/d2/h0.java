package d2;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class h0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f13426a = new Object();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        m1.d f10 = ((h2.o) obj).f();
        m1.d f11 = ((h2.o) obj2).f();
        int compare = Float.compare(f10.f27239a, f11.f27239a);
        if (compare == 0) {
            int compare2 = Float.compare(f10.f27240b, f11.f27240b);
            if (compare2 == 0) {
                int compare3 = Float.compare(f10.f27242d, f11.f27242d);
                if (compare3 == 0) {
                    return Float.compare(f10.f27241c, f11.f27241c);
                }
                return compare3;
            }
            return compare2;
        }
        return compare;
    }
}
