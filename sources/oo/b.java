package oo;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f30152b;

    public /* synthetic */ b(d dVar, int i10) {
        this.f30151a = i10;
        this.f30152b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f30151a;
        d dVar = this.f30152b;
        switch (i10) {
            case 0:
                if (dVar.f30159e > 0) {
                    SystemClock.uptimeMillis();
                }
                dVar.setVisibility(0);
                return;
            default:
                ((m) dVar.getCurrentDrawable()).e(false, false, true);
                if (dVar.getProgressDrawable() == null || !dVar.getProgressDrawable().isVisible()) {
                    if (dVar.getIndeterminateDrawable() == null || !dVar.getIndeterminateDrawable().isVisible()) {
                        dVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
