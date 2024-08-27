package androidx.activity;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class h implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f854b;

    public /* synthetic */ h(m mVar, int i10) {
        this.f853a = i10;
        this.f854b = mVar;
    }

    @Override // androidx.lifecycle.r
    public final void c(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
        View view = null;
        switch (this.f853a) {
            case 0:
                if (mVar == androidx.lifecycle.m.ON_DESTROY) {
                    this.f854b.mContextAwareHelper.f13126b = null;
                    if (!this.f854b.isChangingConfigurations()) {
                        this.f854b.getViewModelStore().a();
                    }
                    l lVar = (l) this.f854b.mReportFullyDrawnExecutor;
                    m mVar2 = lVar.f860d;
                    mVar2.getWindow().getDecorView().removeCallbacks(lVar);
                    mVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(lVar);
                    return;
                }
                return;
            case 1:
                if (mVar == androidx.lifecycle.m.ON_STOP) {
                    Window window = this.f854b.getWindow();
                    if (window != null) {
                        view = window.peekDecorView();
                    }
                    if (view != null) {
                        view.cancelPendingInputEvents();
                        return;
                    }
                    return;
                }
                return;
            default:
                m mVar3 = this.f854b;
                mVar3.ensureViewModelStore();
                mVar3.getLifecycle().c(this);
                return;
        }
    }
}
