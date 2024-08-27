package sb;

/* loaded from: classes.dex */
public final class w extends yk.o {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34541d;

    public w(boolean z10) {
        this.f34541d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.f34541d == ((w) obj).f34541d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34541d);
    }

    public final String toString() {
        return "ShowNoMoreItemRemainingToView(isEndOfTheResponse=" + this.f34541d + ")";
    }
}
