package h0;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final g f17801a;

    /* JADX WARN: Type inference failed for: r1v0, types: [h0.g, h0.a] */
    static {
        f a10 = d.a(50);
        f17801a = new a(a10, a10, a10, a10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h0.g, h0.a] */
    public static g a(int i10, int i11) {
        return new a(d.a(i10), d.a(i11), d.a(0), d.a(0));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h0.g, h0.a] */
    public static final g b(float f10) {
        e eVar = new e(f10);
        return new a(eVar, eVar, eVar, eVar);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [h0.g, h0.a] */
    public static g c(float f10, float f11, float f12, float f13, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        return new a(new e(f10), new e(f11), new e(f12), new e(f13));
    }

    public static final g d() {
        return f17801a;
    }
}
