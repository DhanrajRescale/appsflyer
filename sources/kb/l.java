package kb;

/* loaded from: classes.dex */
public final class l extends yk.g {

    /* renamed from: b, reason: collision with root package name */
    public final a f23043b;

    public l(a aVar) {
        this.f23043b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f23043b == ((l) obj).f23043b;
    }

    public final int hashCode() {
        a aVar = this.f23043b;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final String toString() {
        return "ShowProgressBar(progressBarType=" + this.f23043b + ")";
    }
}
