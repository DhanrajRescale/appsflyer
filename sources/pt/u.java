package pt;

/* loaded from: classes2.dex */
public final class u extends a implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    @Override // java.lang.Runnable
    public final void run() {
        this.f31337b = Thread.currentThread();
        try {
            this.f31336a.run();
            this.f31337b = null;
        } catch (Throwable th2) {
            this.f31337b = null;
            lazySet(a.f31334c);
            yk.g.M(th2);
        }
    }
}
