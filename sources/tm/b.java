package tm;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f36180a = true;

    /* renamed from: b, reason: collision with root package name */
    public float f36181b = 5.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f36182c = 5.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f36183d = cn.h.c(10.0f);

    /* renamed from: e, reason: collision with root package name */
    public int f36184e = -16777216;

    public final void a(float f10) {
        if (f10 > 24.0f) {
            f10 = 24.0f;
        }
        if (f10 < 6.0f) {
            f10 = 6.0f;
        }
        this.f36183d = cn.h.c(f10);
    }
}
