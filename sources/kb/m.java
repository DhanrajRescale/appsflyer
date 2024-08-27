package kb;

/* loaded from: classes.dex */
public final class m extends yk.g {

    /* renamed from: b, reason: collision with root package name */
    public final int f23044b;

    public m(int i10) {
        this.f23044b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f23044b == ((m) obj).f23044b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23044b);
    }

    public final String toString() {
        return nn.d.m(new StringBuilder("UpdateCommentCount(count="), this.f23044b, ")");
    }
}
