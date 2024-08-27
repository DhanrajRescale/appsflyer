package l;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class u implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f23693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f23694b;

    public u(w wVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f23694b = wVar;
        this.f23693a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f23693a.onMenuItemActionCollapse(this.f23694b.e(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f23693a.onMenuItemActionExpand(this.f23694b.e(menuItem));
    }
}
