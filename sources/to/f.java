package to;

/* loaded from: classes2.dex */
public final class f extends e {

    /* renamed from: b, reason: collision with root package name */
    public final float f36230b;

    public f(float f10) {
        super(0);
        this.f36230b = f10 - 0.001f;
    }

    @Override // to.e
    public final void d(float f10, float f11, float f12, v vVar) {
        double d10 = this.f36230b;
        float sqrt = (float) ((Math.sqrt(2.0d) * d10) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(d10, 2.0d) - Math.pow(sqrt, 2.0d));
        vVar.d(f11 - sqrt, ((float) (-((Math.sqrt(2.0d) * d10) - d10))) + sqrt2, 270.0f, s0.g.f34069a);
        vVar.c(f11, (float) (-((Math.sqrt(2.0d) * d10) - d10)));
        vVar.c(f11 + sqrt, ((float) (-((Math.sqrt(2.0d) * d10) - d10))) + sqrt2);
    }
}
