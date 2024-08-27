package at;

import pt.r;

/* loaded from: classes2.dex */
public final class h implements ct.b, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f2780a;

    /* renamed from: b, reason: collision with root package name */
    public final k f2781b;

    /* renamed from: c, reason: collision with root package name */
    public Thread f2782c;

    public h(Runnable runnable, k kVar) {
        this.f2780a = runnable;
        this.f2781b = kVar;
    }

    @Override // ct.b
    public final void a() {
        if (this.f2782c == Thread.currentThread()) {
            k kVar = this.f2781b;
            if (kVar instanceof r) {
                r rVar = (r) kVar;
                if (!rVar.f31394b) {
                    rVar.f31394b = true;
                    rVar.f31393a.shutdown();
                    return;
                }
                return;
            }
        }
        this.f2781b.a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2782c = Thread.currentThread();
        try {
            this.f2780a.run();
        } finally {
            a();
            this.f2782c = null;
        }
    }
}
