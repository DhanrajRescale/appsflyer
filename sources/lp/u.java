package lp;

/* loaded from: classes2.dex */
public abstract class u implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public transient i f25060a;

    /* renamed from: b, reason: collision with root package name */
    public transient t f25061b;

    /* renamed from: c, reason: collision with root package name */
    public transient g f25062c;

    public abstract g a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a1) {
            return ((c) this).a().equals(((c) ((a1) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().f24980c.hashCode();
    }

    public final String toString() {
        return a().f24980c.toString();
    }
}
