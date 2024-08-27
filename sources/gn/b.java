package gn;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f17524a;

    public b(String str) {
        if (str != null) {
            this.f17524a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f17524a.equals(((b) obj).f17524a);
    }

    public final int hashCode() {
        return this.f17524a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("Encoding{name=\""), this.f17524a, "\"}");
    }
}
