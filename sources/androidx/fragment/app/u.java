package androidx.fragment.app;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f1840b;

    public /* synthetic */ u(g0 g0Var, int i10) {
        this.f1839a = i10;
        this.f1840b = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1839a;
        g0 g0Var = this.f1840b;
        switch (i10) {
            case 0:
                g0Var.startPostponedEnterTransition();
                return;
            default:
                g0Var.callStartTransitionListener(false);
                return;
        }
    }
}
