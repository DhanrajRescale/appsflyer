package at;

import android.os.Handler;

/* loaded from: classes2.dex */
public final class i implements ct.b, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2783a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f2784b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f2785c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2786d;

    public i(Handler handler, Runnable runnable) {
        this.f2786d = handler;
        this.f2784b = runnable;
    }

    @Override // ct.b
    public final void a() {
        switch (this.f2783a) {
            case 0:
                this.f2785c = true;
                ((k) this.f2786d).a();
                return;
            default:
                ((Handler) this.f2786d).removeCallbacks(this);
                this.f2785c = true;
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2783a) {
            case 0:
                if (!this.f2785c) {
                    try {
                        this.f2784b.run();
                        return;
                    } catch (Throwable th2) {
                        zq.f.l0(th2);
                        ((k) this.f2786d).a();
                        throw rt.b.b(th2);
                    }
                }
                return;
            default:
                try {
                    this.f2784b.run();
                    return;
                } catch (Throwable th3) {
                    yk.g.M(th3);
                    return;
                }
        }
    }

    public i(mt.i iVar, k kVar) {
        this.f2784b = iVar;
        this.f2786d = kVar;
    }
}
