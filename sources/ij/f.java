package ij;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import qu.f0;

/* loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnWindowAttachListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f20062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f20063b;

    public f(vu.f fVar, LinearLayout linearLayout) {
        this.f20062a = fVar;
        this.f20063b = linearLayout;
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowAttached() {
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowDetached() {
        hl.f.A(this.f20062a, null);
        this.f20063b.getViewTreeObserver().removeOnWindowAttachListener(this);
    }
}
