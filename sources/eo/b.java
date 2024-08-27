package eo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.assetgro.stockgro.prod.R;
import in.juspay.hyper.constants.LogSubCategory;
import iu.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m.d;
import mo.c0;
import oo.c;
import s0.g;
import t3.i;
import t3.p;
import u7.e;
import u7.f;

/* loaded from: classes2.dex */
public final class b extends AppCompatCheckBox {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f15763e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f15764f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f15765g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15766h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15767i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f15768j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f15769k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f15770l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f15771m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15772n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f15773o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f15774p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f15775q;

    /* renamed from: r, reason: collision with root package name */
    public int f15776r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f15777s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15778t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f15779u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f15780v;

    /* renamed from: w, reason: collision with root package name */
    public final f f15781w;

    /* renamed from: x, reason: collision with root package name */
    public final c f15782x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f15761y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f15762z = {R.attr.state_error};
    public static final int[][] A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", LogSubCategory.LifeCycle.ANDROID);

    public b(Context context, AttributeSet attributeSet) {
        super(ap.a.a(context, attributeSet, R.attr.checkboxStyle, 2132083910), attributeSet, R.attr.checkboxStyle);
        this.f15763e = new LinkedHashSet();
        this.f15764f = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = p.f35324a;
        Drawable a10 = i.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.f36914a = a10;
        a10.setCallback(fVar.f36913f);
        new e(fVar.f36914a.getConstantState());
        this.f15781w = fVar;
        this.f15782x = new c(this, 2);
        Context context3 = getContext();
        this.f15770l = h4.c.a(this);
        this.f15773o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        h.c g10 = c0.g(context3, attributeSet, un.a.B, R.attr.checkboxStyle, 2132083910, new int[0]);
        this.f15771m = g10.v(2);
        if (this.f15770l != null && pn.e.v(context3, R.attr.isMaterial3Theme, false)) {
            int C = g10.C(0, 0);
            int C2 = g10.C(1, 0);
            if (C == B && C2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f15770l = j.m(context3, R.drawable.mtrl_checkbox_button);
                this.f15772n = true;
                if (this.f15771m == null) {
                    this.f15771m = j.m(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f15774p = dp.b.m1(context3, g10, 3);
        this.f15775q = pn.e.s(g10.z(4, -1), PorterDuff.Mode.SRC_IN);
        this.f15766h = g10.q(10, false);
        this.f15767i = g10.q(6, true);
        this.f15768j = g10.q(9, false);
        this.f15769k = g10.F(8);
        if (g10.H(7)) {
            setCheckedState(g10.z(7, 0));
        }
        g10.R();
        a();
    }

    @NonNull
    private String getButtonStateDescription() {
        int i10 = this.f15776r;
        if (i10 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i10 == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f15765g == null) {
            int k10 = pn.e.k(this, R.attr.colorControlActivated);
            int k11 = pn.e.k(this, R.attr.colorError);
            int k12 = pn.e.k(this, R.attr.colorSurface);
            int k13 = pn.e.k(this, R.attr.colorOnSurface);
            this.f15765g = new ColorStateList(A, new int[]{pn.e.p(k12, 1.0f, k11), pn.e.p(k12, 1.0f, k10), pn.e.p(k12, 0.54f, k13), pn.e.p(k12, 0.38f, k13), pn.e.p(k12, 0.38f, k13)});
        }
        return this.f15765g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f15773o;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void a() {
        int intrinsicWidth;
        int intrinsicHeight;
        int i10;
        int i11;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        d dVar;
        Drawable drawable = this.f15770l;
        ColorStateList colorStateList3 = this.f15773o;
        PorterDuff.Mode b10 = h4.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b10 != null) {
                v3.b.i(drawable, b10);
            }
        }
        this.f15770l = drawable;
        Drawable drawable2 = this.f15771m;
        ColorStateList colorStateList4 = this.f15774p;
        PorterDuff.Mode mode = this.f15775q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                v3.b.i(drawable2, mode);
            }
        }
        this.f15771m = drawable2;
        if (this.f15772n) {
            f fVar = this.f15781w;
            if (fVar != null) {
                Drawable drawable3 = fVar.f36914a;
                c cVar = this.f15782x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (cVar.f36902a == null) {
                        cVar.f36902a = new u7.b(cVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(cVar.f36902a);
                }
                ArrayList arrayList = fVar.f36912e;
                u7.d dVar2 = fVar.f36909b;
                if (arrayList != null && cVar != null) {
                    arrayList.remove(cVar);
                    if (fVar.f36912e.size() == 0 && (dVar = fVar.f36911d) != null) {
                        dVar2.f36904b.removeListener(dVar);
                        fVar.f36911d = null;
                    }
                }
                Drawable drawable4 = fVar.f36914a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (cVar.f36902a == null) {
                        cVar.f36902a = new u7.b(cVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(cVar.f36902a);
                } else if (cVar != null) {
                    if (fVar.f36912e == null) {
                        fVar.f36912e = new ArrayList();
                    }
                    if (!fVar.f36912e.contains(cVar)) {
                        fVar.f36912e.add(cVar);
                        if (fVar.f36911d == null) {
                            fVar.f36911d = new d(fVar, 2);
                        }
                        dVar2.f36904b.addListener(fVar.f36911d);
                    }
                }
            }
            Drawable drawable5 = this.f15770l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f15770l).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable6 = this.f15770l;
        if (drawable6 != null && (colorStateList2 = this.f15773o) != null) {
            v3.b.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f15771m;
        if (drawable7 != null && (colorStateList = this.f15774p) != null) {
            v3.b.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f15770l;
        Drawable drawable9 = this.f15771m;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            if (drawable9.getIntrinsicWidth() != -1 && drawable9.getIntrinsicHeight() != -1) {
                if (drawable9.getIntrinsicWidth() <= drawable8.getIntrinsicWidth() && drawable9.getIntrinsicHeight() <= drawable8.getIntrinsicHeight()) {
                    i11 = drawable9.getIntrinsicWidth();
                    i10 = drawable9.getIntrinsicHeight();
                } else {
                    float intrinsicWidth2 = drawable9.getIntrinsicWidth() / drawable9.getIntrinsicHeight();
                    if (intrinsicWidth2 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                        i11 = drawable8.getIntrinsicWidth();
                        i10 = (int) (i11 / intrinsicWidth2);
                    } else {
                        intrinsicHeight = drawable8.getIntrinsicHeight();
                        intrinsicWidth = (int) (intrinsicWidth2 * intrinsicHeight);
                    }
                }
                layerDrawable.setLayerSize(1, i11, i10);
                layerDrawable.setLayerGravity(1, 17);
                drawable8 = layerDrawable;
            } else {
                intrinsicWidth = drawable8.getIntrinsicWidth();
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            int i12 = intrinsicWidth;
            i10 = intrinsicHeight;
            i11 = i12;
            layerDrawable.setLayerSize(1, i11, i10);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f15770l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f15771m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f15774p;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f15775q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f15773o;
    }

    public int getCheckedState() {
        return this.f15776r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f15769k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f15776r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15766h && this.f15773o == null && this.f15774p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f15761y);
        }
        if (this.f15768j) {
            View.mergeDrawableStates(onCreateDrawableState, f15762z);
        }
        int i11 = 0;
        while (true) {
            if (i11 < onCreateDrawableState.length) {
                int i12 = onCreateDrawableState[i11];
                if (i12 == 16842912) {
                    copyOf = onCreateDrawableState;
                    break;
                }
                if (i12 == 0) {
                    copyOf = (int[]) onCreateDrawableState.clone();
                    copyOf[i11] = 16842912;
                    break;
                }
                i11++;
            } else {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
        }
        this.f15777s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a10;
        int i10;
        if (this.f15767i && TextUtils.isEmpty(getText()) && (a10 = h4.c.a(this)) != null) {
            if (pn.e.o(this)) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * i10;
            int save = canvas.save();
            canvas.translate(width, g.f34069a);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = a10.getBounds();
                v3.b.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f15768j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f15769k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        setCheckedState(aVar.f15760a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, eo.a, android.os.Parcelable] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f15760a = getCheckedState();
        return baseSavedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(j.m(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f15771m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(j.m(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f15774p == colorStateList) {
            return;
        }
        this.f15774p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f15775q == mode) {
            return;
        }
        this.f15775q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f15773o == colorStateList) {
            return;
        }
        this.f15773o = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f15767i = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        boolean z10;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f15776r != i10) {
            this.f15776r = i10;
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            super.setChecked(z10);
            refreshDrawableState();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30 && this.f15779u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f15778t) {
                return;
            }
            this.f15778t = true;
            LinkedHashSet linkedHashSet = this.f15764f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    a3.a.u(it.next());
                    throw null;
                }
            }
            if (this.f15776r != 2 && (onCheckedChangeListener = this.f15780v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i11 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f15778t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f15769k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        CharSequence charSequence;
        if (i10 != 0) {
            charSequence = getResources().getText(i10);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z10) {
        if (this.f15768j == z10) {
            return;
        }
        this.f15768j = z10;
        refreshDrawableState();
        Iterator it = this.f15763e.iterator();
        if (!it.hasNext()) {
            return;
        }
        a3.a.u(it.next());
        throw null;
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f15780v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f15779u = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f15766h = z10;
        if (z10) {
            h4.b.c(this, getMaterialThemeColorsTintList());
        } else {
            h4.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f15770l = drawable;
        this.f15772n = false;
        a();
    }
}
