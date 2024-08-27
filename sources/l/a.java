package l;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class a implements w3.b {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f23530a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f23531b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f23532c;

    /* renamed from: d, reason: collision with root package name */
    public char f23533d;

    /* renamed from: f, reason: collision with root package name */
    public char f23535f;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f23537h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f23538i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f23539j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f23540k;

    /* renamed from: e, reason: collision with root package name */
    public int f23534e = 4096;

    /* renamed from: g, reason: collision with root package name */
    public int f23536g = 4096;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f23541l = null;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f23542m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f23543n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f23544o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f23545p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f23538i = context;
        this.f23530a = charSequence;
    }

    @Override // w3.b
    public final r a() {
        return null;
    }

    @Override // w3.b
    public final w3.b b(r rVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f23537h;
        if (drawable != null) {
            if (this.f23543n || this.f23544o) {
                this.f23537h = drawable;
                Drawable mutate = drawable.mutate();
                this.f23537h = mutate;
                if (this.f23543n) {
                    v3.b.h(mutate, this.f23541l);
                }
                if (this.f23544o) {
                    v3.b.i(this.f23537h, this.f23542m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // w3.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f23536g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f23535f;
    }

    @Override // w3.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f23539j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f23537h;
    }

    @Override // w3.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f23541l;
    }

    @Override // w3.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f23542m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f23532c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // w3.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f23534e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f23533d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f23530a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f23531b;
        return charSequence != null ? charSequence : this.f23530a;
    }

    @Override // w3.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f23540k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f23545p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f23545p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f23545p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f23545p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f23535f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f23545p = (z10 ? 1 : 0) | (this.f23545p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f23545p = (z10 ? 2 : 0) | (this.f23545p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f23539j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f23545p = (z10 ? 16 : 0) | (this.f23545p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f23537h = drawable;
        c();
        return this;
    }

    @Override // w3.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f23541l = colorStateList;
        this.f23543n = true;
        c();
        return this;
    }

    @Override // w3.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f23542m = mode;
        this.f23544o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f23532c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f23533d = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f23533d = c10;
        this.f23535f = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f23530a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f23531b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f23540k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        this.f23545p = (this.f23545p & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // w3.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f23535f = Character.toLowerCase(c10);
        this.f23536g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // w3.b, android.view.MenuItem
    public final w3.b setContentDescription(CharSequence charSequence) {
        this.f23539j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f23537h = r3.k.getDrawable(this.f23538i, i10);
        c();
        return this;
    }

    @Override // w3.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f23533d = c10;
        this.f23534e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // w3.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f23533d = c10;
        this.f23534e = KeyEvent.normalizeMetaState(i10);
        this.f23535f = Character.toLowerCase(c11);
        this.f23536g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f23530a = this.f23538i.getResources().getString(i10);
        return this;
    }

    @Override // w3.b, android.view.MenuItem
    public final w3.b setTooltipText(CharSequence charSequence) {
        this.f23540k = charSequence;
        return this;
    }
}
