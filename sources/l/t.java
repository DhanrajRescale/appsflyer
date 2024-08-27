package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class t extends FrameLayout implements k.c {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f23692a;

    /* JADX WARN: Multi-variable type inference failed */
    public t(View view) {
        super(view.getContext());
        this.f23692a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // k.c
    public final void c() {
        this.f23692a.onActionViewExpanded();
    }

    @Override // k.c
    public final void e() {
        this.f23692a.onActionViewCollapsed();
    }
}
