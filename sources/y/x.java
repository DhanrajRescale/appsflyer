package y;

/* loaded from: classes.dex */
public final class x implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f40987a;

    public x(y yVar) {
        this.f40987a = yVar;
    }

    @Override // y.q1
    public final float a(float f10) {
        if (Float.isNaN(f10)) {
            return s0.g.f34069a;
        }
        return ((Number) this.f40987a.f40992a.invoke(Float.valueOf(f10))).floatValue();
    }
}
