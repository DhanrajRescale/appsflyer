package to;

/* loaded from: classes2.dex */
public final class i extends e {

    /* renamed from: b, reason: collision with root package name */
    public final e f36275b;

    /* renamed from: c, reason: collision with root package name */
    public final float f36276c;

    public i(f fVar, float f10) {
        super(0);
        this.f36275b = fVar;
        this.f36276c = f10;
    }

    @Override // to.e
    public final boolean a() {
        return this.f36275b.a();
    }

    @Override // to.e
    public final void d(float f10, float f11, float f12, v vVar) {
        this.f36275b.d(f10, f11 - this.f36276c, f12, vVar);
    }
}
