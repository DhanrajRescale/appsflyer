package w;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z f38470a = new z(0.4f, 0.2f);

    /* renamed from: b, reason: collision with root package name */
    public static final z f38471b = new z(s0.g.f34069a, 0.2f);

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.firebase.messaging.m f38472c;

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.google.firebase.messaging.m] */
    static {
        if (!Float.isNaN(0.4f) && !Float.isNaN(s0.g.f34069a) && !Float.isNaN(1.0f) && !Float.isNaN(1.0f)) {
            f38472c = new Object();
        } else {
            e.w("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.4, 0.0, 1.0, 1.0.");
            throw null;
        }
    }
}
