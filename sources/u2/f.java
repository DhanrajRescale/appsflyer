package u2;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final float f36674a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f36675b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f36676c;

    static {
        a(s0.g.f34069a);
        a(0.5f);
        f36674a = 0.5f;
        a(-1.0f);
        f36675b = -1.0f;
        a(1.0f);
        f36676c = 1.0f;
    }

    public static void a(float f10) {
        if ((s0.g.f34069a <= f10 && f10 <= 1.0f) || f10 == -1.0f) {
        } else {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }
}
