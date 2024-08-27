package u9;

/* loaded from: classes.dex */
public final class b0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f36985a = new Object();

    @Override // u9.i0
    public final Object i(v9.c cVar, float f10) {
        boolean z10 = true;
        if (cVar.x() != 1) {
            z10 = false;
        }
        if (z10) {
            cVar.a();
        }
        float l10 = (float) cVar.l();
        float l11 = (float) cVar.l();
        while (cVar.g()) {
            cVar.J();
        }
        if (z10) {
            cVar.c();
        }
        return new x9.d((l10 / 100.0f) * f10, (l11 / 100.0f) * f10);
    }
}
