package m;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class q3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f25685b;

    public /* synthetic */ q3(Toolbar toolbar, int i10) {
        this.f25684a = i10;
        this.f25685b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l.q qVar;
        int i10 = this.f25684a;
        Toolbar toolbar = this.f25685b;
        switch (i10) {
            case 0:
                toolbar.o();
                return;
            default:
                s3 s3Var = toolbar.f1116g0;
                if (s3Var == null) {
                    qVar = null;
                } else {
                    qVar = s3Var.f25719b;
                }
                if (qVar != null) {
                    qVar.collapseActionView();
                    return;
                }
                return;
        }
    }
}
