package qu;

/* loaded from: classes2.dex */
public final class x0 extends y0 {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f32295c;

    public x0(Runnable runnable, long j10) {
        super(j10);
        this.f32295c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32295c.run();
    }

    @Override // qu.y0
    public final String toString() {
        return super.toString() + this.f32295c;
    }
}
