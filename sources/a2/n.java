package a2;

/* loaded from: classes.dex */
public final class n implements l {
    @Override // a2.l
    public final long b(long j10, long j11) {
        return androidx.compose.ui.layout.a.b(1.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        ((n) obj).getClass();
        return Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
