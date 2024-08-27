package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import com.assetgro.stockgro.prod.R;
import h4.w;
import iu.j;
import m.a0;
import m.m3;
import m.n3;
import m.s;
import m.v;
import m.z0;

/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements w {

    /* renamed from: a, reason: collision with root package name */
    public final v f989a;

    /* renamed from: b, reason: collision with root package name */
    public final s f990b;

    /* renamed from: c, reason: collision with root package name */
    public final z0 f991c;

    /* renamed from: d, reason: collision with root package name */
    public a0 f992d;

    public AppCompatCheckBox(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @NonNull
    private a0 getEmojiTextViewHelper() {
        if (this.f992d == null) {
            this.f992d = new a0(this);
        }
        return this.f992d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        s sVar = this.f990b;
        if (sVar != null) {
            sVar.a();
        }
        z0 z0Var = this.f991c;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        v vVar = this.f989a;
        if (vVar != null) {
            vVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        s sVar = this.f990b;
        if (sVar != null) {
            return sVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        s sVar = this.f990b;
        if (sVar != null) {
            return sVar.d();
        }
        return null;
    }

    @Override // h4.w
    public ColorStateList getSupportButtonTintList() {
        v vVar = this.f989a;
        if (vVar != null) {
            return vVar.f25749b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        v vVar = this.f989a;
        if (vVar != null) {
            return vVar.f25750c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f991c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f991c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        s sVar = this.f990b;
        if (sVar != null) {
            sVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        s sVar = this.f990b;
        if (sVar != null) {
            sVar.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        v vVar = this.f989a;
        if (vVar != null) {
            if (vVar.f25753f) {
                vVar.f25753f = false;
            } else {
                vVar.f25753f = true;
                vVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.f991c;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.f991c;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        s sVar = this.f990b;
        if (sVar != null) {
            sVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        s sVar = this.f990b;
        if (sVar != null) {
            sVar.j(mode);
        }
    }

    @Override // h4.w
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        v vVar = this.f989a;
        if (vVar != null) {
            vVar.f25749b = colorStateList;
            vVar.f25751d = true;
            vVar.a();
        }
    }

    @Override // h4.w
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        v vVar = this.f989a;
        if (vVar != null) {
            vVar.f25750c = mode;
            vVar.f25752e = true;
            vVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        z0 z0Var = this.f991c;
        z0Var.k(colorStateList);
        z0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        z0 z0Var = this.f991c;
        z0Var.l(mode);
        z0Var.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n3.a(context);
        m3.a(getContext(), this);
        v vVar = new v(this, 1);
        this.f989a = vVar;
        vVar.c(attributeSet, i10);
        s sVar = new s(this);
        this.f990b = sVar;
        sVar.e(attributeSet, i10);
        z0 z0Var = new z0(this);
        this.f991c = z0Var;
        z0Var.f(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(j.m(getContext(), i10));
    }
}
