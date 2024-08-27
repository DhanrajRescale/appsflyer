package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q implements w3.b {
    public r A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a, reason: collision with root package name */
    public final int f23663a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23664b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23665c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23666d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f23667e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f23668f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f23669g;

    /* renamed from: h, reason: collision with root package name */
    public char f23670h;

    /* renamed from: j, reason: collision with root package name */
    public char f23672j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f23674l;

    /* renamed from: n, reason: collision with root package name */
    public final o f23676n;

    /* renamed from: o, reason: collision with root package name */
    public i0 f23677o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f23678p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f23679q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f23680r;

    /* renamed from: y, reason: collision with root package name */
    public int f23687y;

    /* renamed from: z, reason: collision with root package name */
    public View f23688z;

    /* renamed from: i, reason: collision with root package name */
    public int f23671i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f23673k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f23675m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f23681s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f23682t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f23683u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f23684v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f23685w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f23686x = 16;
    public boolean C = false;

    public q(o oVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f23676n = oVar;
        this.f23663a = i11;
        this.f23664b = i10;
        this.f23665c = i12;
        this.f23666d = i13;
        this.f23667e = charSequence;
        this.f23687y = i14;
    }

    public static void c(int i10, int i11, String str, StringBuilder sb2) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override // w3.b
    public final r a() {
        return this.A;
    }

    @Override // w3.b
    public final w3.b b(r rVar) {
        r rVar2 = this.A;
        if (rVar2 != null) {
            rVar2.getClass();
        }
        this.f23688z = null;
        this.A = rVar;
        this.f23676n.p(true);
        r rVar3 = this.A;
        if (rVar3 != null) {
            rVar3.d(new t9.c(this, 5));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f23687y & 8) == 0) {
            return false;
        }
        if (this.f23688z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f23676n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f23685w && (this.f23683u || this.f23684v)) {
            drawable = drawable.mutate();
            if (this.f23683u) {
                v3.b.h(drawable, this.f23681s);
            }
            if (this.f23684v) {
                v3.b.i(drawable, this.f23682t);
            }
            this.f23685w = false;
        }
        return drawable;
    }

    public final boolean e() {
        r rVar;
        if ((this.f23687y & 8) == 0) {
            return false;
        }
        if (this.f23688z == null && (rVar = this.A) != null) {
            this.f23688z = rVar.b(this);
        }
        if (this.f23688z == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f23676n.f(this);
    }

    public final boolean f() {
        return (this.f23686x & 32) == 32;
    }

    public final void g(boolean z10) {
        this.f23686x = (z10 ? 4 : 0) | (this.f23686x & (-5));
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f23688z;
        if (view != null) {
            return view;
        }
        r rVar = this.A;
        if (rVar != null) {
            View b10 = rVar.b(this);
            this.f23688z = b10;
            return b10;
        }
        return null;
    }

    @Override // w3.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f23673k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f23672j;
    }

    @Override // w3.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f23679q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f23664b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f23674l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f23675m;
        if (i10 != 0) {
            Drawable m10 = iu.j.m(this.f23676n.f23636a, i10);
            this.f23675m = 0;
            this.f23674l = m10;
            return d(m10);
        }
        return null;
    }

    @Override // w3.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f23681s;
    }

    @Override // w3.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f23682t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f23669g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f23663a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // w3.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f23671i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f23670h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f23665c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f23677o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f23667e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f23668f;
        return charSequence != null ? charSequence : this.f23667e;
    }

    @Override // w3.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f23680r;
    }

    public final void h(boolean z10) {
        if (z10) {
            this.f23686x |= 32;
        } else {
            this.f23686x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f23677o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f23686x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f23686x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f23686x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        r rVar = this.A;
        if (rVar != null && rVar.c()) {
            if ((this.f23686x & 8) != 0 || !this.A.a()) {
                return false;
            }
            return true;
        }
        if ((this.f23686x & 8) != 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f23688z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f23663a) > 0) {
            view.setId(i10);
        }
        o oVar = this.f23676n;
        oVar.f23646k = true;
        oVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f23672j == c10) {
            return this;
        }
        this.f23672j = Character.toLowerCase(c10);
        this.f23676n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f23686x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f23686x = i11;
        if (i10 != i11) {
            this.f23676n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f23686x;
        int i12 = 2;
        if ((i11 & 4) != 0) {
            o oVar = this.f23676n;
            oVar.getClass();
            ArrayList arrayList = oVar.f23641f;
            int size = arrayList.size();
            oVar.z();
            for (int i13 = 0; i13 < size; i13++) {
                q qVar = (q) arrayList.get(i13);
                if (qVar.f23664b == this.f23664b && (qVar.f23686x & 4) != 0 && qVar.isCheckable()) {
                    if (qVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i14 = qVar.f23686x;
                    int i15 = i14 & (-3);
                    if (z11) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    int i16 = i10 | i15;
                    qVar.f23686x = i16;
                    if (i14 != i16) {
                        qVar.f23676n.p(false);
                    }
                }
            }
            oVar.y();
        } else {
            int i17 = i11 & (-3);
            if (!z10) {
                i12 = 0;
            }
            int i18 = i17 | i12;
            this.f23686x = i18;
            if (i11 != i18) {
                this.f23676n.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f23686x |= 16;
        } else {
            this.f23686x &= -17;
        }
        this.f23676n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f23675m = 0;
        this.f23674l = drawable;
        this.f23685w = true;
        this.f23676n.p(false);
        return this;
    }

    @Override // w3.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f23681s = colorStateList;
        this.f23683u = true;
        this.f23685w = true;
        this.f23676n.p(false);
        return this;
    }

    @Override // w3.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f23682t = mode;
        this.f23684v = true;
        this.f23685w = true;
        this.f23676n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f23669g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f23670h == c10) {
            return this;
        }
        this.f23670h = c10;
        this.f23676n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f23678p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f23670h = c10;
        this.f23672j = Character.toLowerCase(c11);
        this.f23676n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f23687y = i10;
        o oVar = this.f23676n;
        oVar.f23646k = true;
        oVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f23667e = charSequence;
        this.f23676n.p(false);
        i0 i0Var = this.f23677o;
        if (i0Var != null) {
            i0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f23668f = charSequence;
        this.f23676n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10;
        int i11 = this.f23686x;
        int i12 = i11 & (-9);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f23686x = i13;
        if (i11 != i13) {
            o oVar = this.f23676n;
            oVar.f23643h = true;
            oVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f23667e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // w3.b, android.view.MenuItem
    public final w3.b setContentDescription(CharSequence charSequence) {
        this.f23679q = charSequence;
        this.f23676n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f23674l = null;
        this.f23675m = i10;
        this.f23685w = true;
        this.f23676n.p(false);
        return this;
    }

    @Override // w3.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f23670h == c10 && this.f23671i == i10) {
            return this;
        }
        this.f23670h = c10;
        this.f23671i = KeyEvent.normalizeMetaState(i10);
        this.f23676n.p(false);
        return this;
    }

    @Override // w3.b, android.view.MenuItem
    public final w3.b setTooltipText(CharSequence charSequence) {
        this.f23680r = charSequence;
        this.f23676n.p(false);
        return this;
    }

    @Override // w3.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f23672j == c10 && this.f23673k == i10) {
            return this;
        }
        this.f23672j = Character.toLowerCase(c10);
        this.f23673k = KeyEvent.normalizeMetaState(i10);
        this.f23676n.p(false);
        return this;
    }

    @Override // w3.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f23670h = c10;
        this.f23671i = KeyEvent.normalizeMetaState(i10);
        this.f23672j = Character.toLowerCase(c11);
        this.f23673k = KeyEvent.normalizeMetaState(i11);
        this.f23676n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f23676n.f23636a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        Context context = this.f23676n.f23636a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f23688z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f23663a) > 0) {
            inflate.setId(i11);
        }
        o oVar = this.f23676n;
        oVar.f23646k = true;
        oVar.p(true);
        return this;
    }
}
