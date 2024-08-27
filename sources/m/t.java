package m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.NonNull;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public class t extends Button {

    /* renamed from: a, reason: collision with root package name */
    public final s f25721a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f25722b;

    /* renamed from: c, reason: collision with root package name */
    public a0 f25723c;

    public t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    @NonNull
    private a0 getEmojiTextViewHelper() {
        if (this.f25723c == null) {
            this.f25723c = new a0(this);
        }
        return this.f25723c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        s sVar = this.f25721a;
        if (sVar != null) {
            sVar.a();
        }
        z0 z0Var = this.f25722b;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (d4.f25514b) {
            return super.getAutoSizeMaxTextSize();
        }
        z0 z0Var = this.f25722b;
        if (z0Var != null) {
            return Math.round(z0Var.f25820i.f25551e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (d4.f25514b) {
            return super.getAutoSizeMinTextSize();
        }
        z0 z0Var = this.f25722b;
        if (z0Var != null) {
            return Math.round(z0Var.f25820i.f25550d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (d4.f25514b) {
            return super.getAutoSizeStepGranularity();
        }
        z0 z0Var = this.f25722b;
        if (z0Var != null) {
            return Math.round(z0Var.f25820i.f25549c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (d4.f25514b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        z0 z0Var = this.f25722b;
        if (z0Var != null) {
            return z0Var.f25820i.f25552f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (d4.f25514b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        z0 z0Var = this.f25722b;
        if (z0Var == null) {
            return 0;
        }
        return z0Var.f25820i.f25547a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return qu.i0.P(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        s sVar = this.f25721a;
        if (sVar != null) {
            return sVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        s sVar = this.f25721a;
        if (sVar != null) {
            return sVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f25722b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f25722b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        z0 z0Var = this.f25722b;
        if (z0Var != null && !d4.f25514b) {
            z0Var.f25820i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        z0 z0Var = this.f25722b;
        if (z0Var != null && !d4.f25514b) {
            i1 i1Var = z0Var.f25820i;
            if (i1Var.f()) {
                i1Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (d4.f25514b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        z0 z0Var = this.f25722b;
        if (z0Var != null) {
            z0Var.h(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (d4.f25514b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        z0 z0Var = this.f25722b;
        if (z0Var != null) {
            z0Var.i(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (d4.f25514b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        z0 z0Var = this.f25722b;
        if (z0Var != null) {
            z0Var.j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        s sVar = this.f25721a;
        if (sVar != null) {
            sVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        s sVar = this.f25721a;
        if (sVar != null) {
            sVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(qu.i0.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        z0 z0Var = this.f25722b;
        if (z0Var != null) {
            z0Var.f25812a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        s sVar = this.f25721a;
        if (sVar != null) {
            sVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        s sVar = this.f25721a;
        if (sVar != null) {
            sVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        z0 z0Var = this.f25722b;
        z0Var.k(colorStateList);
        z0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        z0 z0Var = this.f25722b;
        z0Var.l(mode);
        z0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        z0 z0Var = this.f25722b;
        if (z0Var != null) {
            z0Var.g(i10, context);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z10 = d4.f25514b;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        z0 z0Var = this.f25722b;
        if (z0Var != null && !z10) {
            i1 i1Var = z0Var.f25820i;
            if (!i1Var.f()) {
                i1Var.g(i10, f10);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n3.a(context);
        m3.a(getContext(), this);
        s sVar = new s(this);
        this.f25721a = sVar;
        sVar.e(attributeSet, i10);
        z0 z0Var = new z0(this);
        this.f25722b = z0Var;
        z0Var.f(attributeSet, i10);
        z0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i10);
    }
}
