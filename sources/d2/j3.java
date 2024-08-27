package d2;

/* loaded from: classes.dex */
public interface j3 {
    long a();

    void b();

    long c();

    default long d() {
        float f10 = 48;
        return hl.f.g(f10, f10);
    }

    default float e() {
        return Float.MAX_VALUE;
    }

    float f();
}
