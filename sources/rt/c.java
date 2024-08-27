package rt;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class c implements Serializable {
    private static final long serialVersionUID = -8759979445933046293L;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f33994a;

    public c(Throwable th2) {
        this.f33994a = th2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f33994a;
        Throwable th2 = this.f33994a;
        if (th2 != obj2 && (th2 == null || !th2.equals(obj2))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f33994a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.f33994a + "]";
    }
}
