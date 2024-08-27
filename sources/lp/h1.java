package lp;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class h1 extends i1 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final h1 f24991a = new i1();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f24991a;
    }

    @Override // lp.i1
    public final i1 a() {
        return q1.f25045a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
