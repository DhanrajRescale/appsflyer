package g3;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public float f16472a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16473b;

    /* renamed from: c, reason: collision with root package name */
    public String f16474c;

    /* renamed from: d, reason: collision with root package name */
    public String f16475d;

    /* renamed from: e, reason: collision with root package name */
    public float f16476e;

    /* renamed from: f, reason: collision with root package name */
    public float f16477f;

    @Override // g3.d
    public final float value() {
        float f10 = this.f16476e;
        if (f10 >= this.f16477f) {
            this.f16473b = true;
        }
        if (!this.f16473b) {
            this.f16476e = f10 + this.f16472a;
        }
        return this.f16476e;
    }
}
