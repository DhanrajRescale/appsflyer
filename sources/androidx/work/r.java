package androidx.work;

/* loaded from: classes.dex */
public final class r extends t {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return r.class.getName().hashCode();
    }

    public final String toString() {
        return "Retry";
    }
}
