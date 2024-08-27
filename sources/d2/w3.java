package d2;

import android.view.View;

/* loaded from: classes.dex */
public final class w3 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0.f2 f13674b;

    public w3(View view, t0.f2 f2Var) {
        this.f13673a = view;
        this.f13674b = f2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f13673a.removeOnAttachStateChangeListener(this);
        this.f13674b.u();
    }
}
