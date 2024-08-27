package h4;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f17950a;

    /* renamed from: b, reason: collision with root package name */
    public int f17951b;

    /* renamed from: c, reason: collision with root package name */
    public float f17952c;

    /* renamed from: d, reason: collision with root package name */
    public float f17953d;

    /* renamed from: e, reason: collision with root package name */
    public long f17954e;

    /* renamed from: f, reason: collision with root package name */
    public long f17955f;

    /* renamed from: g, reason: collision with root package name */
    public long f17956g;

    /* renamed from: h, reason: collision with root package name */
    public float f17957h;

    /* renamed from: i, reason: collision with root package name */
    public int f17958i;

    public final float a(long j10) {
        long j11 = this.f17954e;
        if (j10 < j11) {
            return s0.g.f34069a;
        }
        long j12 = this.f17956g;
        if (j12 >= 0 && j10 >= j12) {
            float f10 = this.f17957h;
            return (h.b(((float) (j10 - j12)) / this.f17958i, s0.g.f34069a, 1.0f) * f10) + (1.0f - f10);
        }
        return h.b(((float) (j10 - j11)) / this.f17950a, s0.g.f34069a, 1.0f) * 0.5f;
    }
}
