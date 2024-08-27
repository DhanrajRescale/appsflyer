package yo;

import android.view.View;

/* loaded from: classes2.dex */
public final class i implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f41763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f41764b;

    public i(j jVar, View view) {
        this.f41764b = jVar;
        this.f41763a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        View view2 = this.f41763a;
        if (view2.getVisibility() == 0) {
            this.f41764b.c(view2);
        }
    }
}
