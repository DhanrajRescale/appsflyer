package a2;

/* loaded from: classes.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f61a = androidx.compose.ui.layout.a.b(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f62b = 0;

    public static final float a(long j10) {
        boolean z10;
        if (j10 != f61a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        t0.t.C0("ScaleFactor is unspecified");
        throw null;
    }

    public static final float b(long j10) {
        boolean z10;
        if (j10 != f61a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        t0.t.C0("ScaleFactor is unspecified");
        throw null;
    }
}
