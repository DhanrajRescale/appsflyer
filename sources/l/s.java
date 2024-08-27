package l;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public final class s extends r implements ActionProvider.VisibilityListener {

    /* renamed from: c, reason: collision with root package name */
    public t9.c f23691c;

    @Override // l.r
    public final boolean a() {
        return this.f23689a.isVisible();
    }

    @Override // l.r
    public final View b(MenuItem menuItem) {
        return this.f23689a.onCreateActionView(menuItem);
    }

    @Override // l.r
    public final boolean c() {
        return this.f23689a.overridesItemVisibility();
    }

    @Override // l.r
    public final void d(t9.c cVar) {
        this.f23691c = cVar;
        this.f23689a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        t9.c cVar = this.f23691c;
        if (cVar != null) {
            o oVar = ((q) cVar.f35633b).f23676n;
            oVar.f23643h = true;
            oVar.p(true);
        }
    }
}
