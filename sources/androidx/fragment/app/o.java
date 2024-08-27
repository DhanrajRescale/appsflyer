package androidx.fragment.app;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1783b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f1782a = i10;
        this.f1783b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1782a;
        Object obj = this.f1783b;
        switch (i10) {
            case 0:
                t tVar = (t) obj;
                t.access$100(tVar).onDismiss(t.access$000(tVar));
                return;
            default:
                ((d1) obj).x(true);
                return;
        }
    }
}
