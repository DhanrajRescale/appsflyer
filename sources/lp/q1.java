package lp;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class q1 extends i1 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final q1 f25045a = new i1();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f25045a;
    }

    @Override // lp.i1
    public final i1 a() {
        return h1.f24991a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
