package hv;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class a extends b implements Serializable {
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: a, reason: collision with root package name */
    public final q f18706a;

    public a(q qVar) {
        this.f18706a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f18706a.equals(((a) obj).f18706a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18706a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f18706a + "]";
    }
}
