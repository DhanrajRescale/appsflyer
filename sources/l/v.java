package l;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class v implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f23695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f23696b;

    public v(w wVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f23696b = wVar;
        this.f23695a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f23695a.onMenuItemClick(this.f23696b.e(menuItem));
    }
}
