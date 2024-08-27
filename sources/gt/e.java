package gt;

import ll.f;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: b, reason: collision with root package name */
    public static final ll.e f17570b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f17571c;

    /* renamed from: a, reason: collision with root package name */
    public static final b f17569a = new b(0);

    /* renamed from: d, reason: collision with root package name */
    public static final d f17572d = new d(0);

    static {
        int i10 = 28;
        f17570b = new ll.e(i10);
        f17571c = new f(i10);
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static void b(int i10, String str) {
        if (i10 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i10);
    }
}
