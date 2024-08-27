package androidx.work;

/* loaded from: classes.dex */
public final class y extends vl.b {

    /* renamed from: g, reason: collision with root package name */
    public final Throwable f2645g;

    public y(Throwable th2) {
        this.f2645g = th2;
    }

    public final String toString() {
        return String.format("FAILURE (%s)", this.f2645g.getMessage());
    }
}
