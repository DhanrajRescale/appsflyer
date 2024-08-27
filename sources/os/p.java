package os;

/* loaded from: classes2.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f30363a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f30364b;

    public p(u uVar) {
        this.f30364b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f30363a) {
            this.f30364b.f30399h.sendMessage(this.f30364b.f30399h.obtainMessage(1));
        }
        this.f30364b.f30399h.postDelayed(this, 30000L);
    }
}
