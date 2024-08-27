package w;

/* loaded from: classes.dex */
public interface g0 extends n {
    @Override // w.n
    default a2 a(y1 y1Var) {
        return new e2(this);
    }

    float b(long j10, float f10, float f11, float f12);

    long c(float f10, float f11, float f12);

    default float d(float f10, float f11, float f12) {
        return b(c(f10, f11, f12), f10, f11, f12);
    }

    float e(long j10, float f10, float f11, float f12);
}
