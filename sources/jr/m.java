package jr;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f21630a;

    public m(n nVar) {
        this.f21630a = nVar;
    }

    public final void a() {
        n nVar = this.f21630a;
        synchronized (nVar) {
            nVar.f21636d = true;
        }
        this.f21630a.g();
    }
}
