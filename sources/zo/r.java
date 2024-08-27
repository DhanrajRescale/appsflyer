package zo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import m.a3;
import m.i2;
import mo.c0;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class r extends m.r {

    /* renamed from: e, reason: collision with root package name */
    public final i2 f42676e;

    /* renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f42677f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f42678g;

    /* renamed from: h, reason: collision with root package name */
    public final int f42679h;

    /* renamed from: i, reason: collision with root package name */
    public final float f42680i;

    /* renamed from: j, reason: collision with root package name */
    public int f42681j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f42682k;

    public r(Context context, AttributeSet attributeSet) {
        super(ap.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f42678g = new Rect();
        Context context2 = getContext();
        TypedArray f10 = c0.f(context2, attributeSet, un.a.f37311v, R.attr.autoCompleteTextViewStyle, 2132083627, new int[0]);
        if (f10.hasValue(0) && f10.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f42679h = f10.getResourceId(2, R.layout.mtrl_auto_complete_simple_item);
        this.f42680i = f10.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.f42681j = f10.getColor(3, 0);
        this.f42682k = dp.b.l1(context2, f10, 4);
        this.f42677f = (AccessibilityManager) context2.getSystemService("accessibility");
        i2 i2Var = new i2(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f42676e = i2Var;
        i2Var.f25582y = true;
        i2Var.f25583z.setFocusable(true);
        i2Var.f25572o = this;
        i2Var.f25583z.setInputMethodMode(2);
        i2Var.o(getAdapter());
        i2Var.f25573p = new a3(this, 2);
        if (f10.hasValue(5)) {
            setSimpleItems(f10.getResourceId(5, 0));
        }
        f10.recycle();
    }

    public static void a(r rVar, Object obj) {
        rVar.setText(rVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.f42677f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f42676e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b10 = b();
        if (b10 != null && b10.C) {
            return b10.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f42680i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f42681j;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f42682k;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b10 = b();
        if (b10 != null && b10.C && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint(HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42676e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int selectedItemPosition;
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b10 = b();
            int i12 = 0;
            if (adapter != null && b10 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                i2 i2Var = this.f42676e;
                if (!i2Var.f25583z.isShowing()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = i2Var.f25560c.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i13 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i12) {
                        view = null;
                        i12 = itemViewType;
                    }
                    view = adapter.getView(max, view, b10);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 = Math.max(i13, view.getMeasuredWidth());
                }
                Drawable background = i2Var.f25583z.getBackground();
                if (background != null) {
                    Rect rect = this.f42678g;
                    background.getPadding(rect);
                    i13 += rect.left + rect.right;
                }
                i12 = b10.getEndIconView().getMeasuredWidth() + i13;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i12), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        AccessibilityManager accessibilityManager = this.f42677f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f42676e.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        i2 i2Var = this.f42676e;
        if (i2Var != null) {
            i2Var.i(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f42676e.f25574q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        TextInputLayout b10 = b();
        if (b10 != null) {
            b10.r();
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f42681j = i10;
        if (getAdapter() instanceof q) {
            ((q) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f42682k = colorStateList;
        if (getAdapter() instanceof q) {
            ((q) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f42677f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f42676e.f();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new q(this, getContext(), this.f42679h, strArr));
    }
}
