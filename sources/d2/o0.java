package d2;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class o0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f13558a;

    public o0(Comparator comparator) {
        this.f13558a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare = this.f13558a.compare(obj, obj2);
        if (compare == 0) {
            return androidx.compose.ui.node.a.X.compare(((h2.o) obj).f17861c, ((h2.o) obj2).f17861c);
        }
        return compare;
    }
}
