package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import d4.n1;
import d4.v0;
import java.util.WeakHashMap;
import l.d0;
import l.q;
import m.a2;
import mo.e;
import qu.i0;
import t3.i;
import t3.p;
import v3.b;

/* loaded from: classes2.dex */
public class NavigationMenuItemView extends e implements d0 {
    public static final int[] F = {R.attr.state_checked};
    public q A;
    public ColorStateList B;
    public boolean C;
    public Drawable D;
    public final x7.e E;

    /* renamed from: v, reason: collision with root package name */
    public int f11389v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f11390w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11391x;

    /* renamed from: y, reason: collision with root package name */
    public final CheckedTextView f11392y;

    /* renamed from: z, reason: collision with root package name */
    public FrameLayout f11393z;

    public NavigationMenuItemView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x7.e eVar = new x7.e(this, 4);
        this.E = eVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.assetgro.stockgro.prod.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.assetgro.stockgro.prod.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.assetgro.stockgro.prod.R.id.design_menu_item_text);
        this.f11392y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        n1.n(checkedTextView, eVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f11393z == null) {
                this.f11393z = (FrameLayout) ((ViewStub) findViewById(com.assetgro.stockgro.prod.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f11393z.removeAllViews();
            this.f11393z.addView(view);
        }
    }

    @Override // l.d0
    public final void b(q qVar) {
        int i10;
        StateListDrawable stateListDrawable;
        this.A = qVar;
        int i11 = qVar.f23663a;
        if (i11 > 0) {
            setId(i11);
        }
        if (qVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.assetgro.stockgro.prod.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(F, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = n1.f13788a;
            v0.q(this, stateListDrawable);
        }
        setCheckable(qVar.isCheckable());
        setChecked(qVar.isChecked());
        setEnabled(qVar.isEnabled());
        setTitle(qVar.f23667e);
        setIcon(qVar.getIcon());
        setActionView(qVar.getActionView());
        setContentDescription(qVar.f23679q);
        i0.L(this, qVar.f23680r);
        q qVar2 = this.A;
        CharSequence charSequence = qVar2.f23667e;
        CheckedTextView checkedTextView = this.f11392y;
        if (charSequence == null && qVar2.getIcon() == null && this.A.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f11393z;
            if (frameLayout != null) {
                a2 a2Var = (a2) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) a2Var).width = -1;
                this.f11393z.setLayoutParams(a2Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f11393z;
        if (frameLayout2 != null) {
            a2 a2Var2 = (a2) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) a2Var2).width = -2;
            this.f11393z.setLayoutParams(a2Var2);
        }
    }

    @Override // l.d0
    public q getItemData() {
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        q qVar = this.A;
        if (qVar != null && qVar.isCheckable() && this.A.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, F);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f11391x != z10) {
            this.f11391x = z10;
            this.E.h(this.f11392y, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f11392y;
        checkedTextView.setChecked(z10);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z10 ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.C) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                b.h(drawable, this.B);
            }
            int i10 = this.f11389v;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f11390w) {
            if (this.D == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = p.f35324a;
                Drawable a10 = i.a(resources, com.assetgro.stockgro.prod.R.drawable.navigation_empty_icon, theme);
                this.D = a10;
                if (a10 != null) {
                    int i11 = this.f11389v;
                    a10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.D;
        }
        h4.q.e(this.f11392y, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f11392y.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f11389v = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z10;
        this.B = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z10;
        q qVar = this.A;
        if (qVar != null) {
            setIcon(qVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f11392y.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f11390w = z10;
    }

    public void setTextAppearance(int i10) {
        this.f11392y.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f11392y.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f11392y.setText(charSequence);
    }
}
