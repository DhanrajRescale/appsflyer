package n1;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f28120b = androidx.compose.ui.graphics.a.i(0.5f, 0.5f);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f28121c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f28122a;

    public static String a(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b1)) {
            return false;
        }
        if (this.f28122a != ((b1) obj).f28122a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28122a);
    }

    public final String toString() {
        return a(this.f28122a);
    }
}
