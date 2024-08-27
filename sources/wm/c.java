package wm;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f39307a;

    /* renamed from: b, reason: collision with root package name */
    public final float f39308b;

    /* renamed from: c, reason: collision with root package name */
    public final float f39309c;

    /* renamed from: d, reason: collision with root package name */
    public final float f39310d;

    /* renamed from: e, reason: collision with root package name */
    public final int f39311e;

    /* renamed from: f, reason: collision with root package name */
    public final int f39312f;

    /* renamed from: g, reason: collision with root package name */
    public final int f39313g;

    /* renamed from: h, reason: collision with root package name */
    public float f39314h;

    /* renamed from: i, reason: collision with root package name */
    public float f39315i;

    public c(float f10, float f11, float f12, float f13, int i10, int i11) {
        this.f39312f = -1;
        this.f39307a = f10;
        this.f39308b = f11;
        this.f39309c = f12;
        this.f39310d = f13;
        this.f39311e = i10;
        this.f39313g = i11;
    }

    public final boolean a(c cVar) {
        if (cVar == null || this.f39311e != cVar.f39311e || this.f39307a != cVar.f39307a || this.f39312f != cVar.f39312f) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "Highlight, x: " + this.f39307a + ", y: " + this.f39308b + ", dataSetIndex: " + this.f39311e + ", stackIndex (only stacked barentry): " + this.f39312f;
    }

    public c(float f10, float f11, float f12, float f13, int i10, int i11, int i12) {
        this(f10, f11, f12, f13, i10, i11);
        this.f39312f = -1;
    }
}
