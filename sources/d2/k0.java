package d2;

import java.util.Comparator;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class k0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f13471a = new Object();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        int compare = Float.compare(((m1.d) pair.f23353a).f27240b, ((m1.d) pair2.f23353a).f27240b);
        if (compare == 0) {
            return Float.compare(((m1.d) pair.f23353a).f27242d, ((m1.d) pair2.f23353a).f27242d);
        }
        return compare;
    }
}
