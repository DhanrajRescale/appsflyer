package aq;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* loaded from: classes2.dex */
public final class r implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f2755a;

    public r(s sVar) {
        this.f2755a = sVar;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z10) {
        s sVar = this.f2755a;
        if (z10) {
            sVar.getClass();
            f fVar = sVar.f2756a;
            fVar.f2714c.removeCallbacks(fVar.f2715d);
        } else {
            sVar.getClass();
            sVar.getClass();
        }
    }
}
