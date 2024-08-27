package ll;

import h.o0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f24901b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final int f24902c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f24903d;

    /* renamed from: a, reason: collision with root package name */
    public final o0 f24904a = new o0(3);

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f24902c = availableProcessors + 1;
        f24903d = (availableProcessors * 2) + 1;
    }
}
