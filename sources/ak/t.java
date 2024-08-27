package ak;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final nk.f f572a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f573b;

    public t(nk.f fVar, Executor executor) {
        this.f572a = fVar;
        this.f573b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f572a.equals(((t) obj).f572a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f572a.hashCode();
    }
}
