package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/* loaded from: classes.dex */
public class r extends AutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f25686d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final s f25687a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f25688b;

    /* renamed from: c, reason: collision with root package name */
    public final tr.e f25689c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.assetgro.stockgro.prod.R.attr.autoCompleteTextViewStyle);
        n3.a(context);
        m3.a(getContext(), this);
        h.c N = h.c.N(getContext(), attributeSet, f25686d, com.assetgro.stockgro.prod.R.attr.autoCompleteTextViewStyle);
        if (N.H(0)) {
            setDropDownBackgroundDrawable(N.v(0));
        }
        N.R();
        s sVar = new s(this);
        this.f25687a = sVar;
        sVar.e(attributeSet, com.assetgro.stockgro.prod.R.attr.autoCompleteTextViewStyle);
        z0 z0Var = new z0(this);
        this.f25688b = z0Var;
        z0Var.f(attributeSet, com.assetgro.stockgro.prod.R.attr.autoCompleteTextViewStyle);
        z0Var.b();
        tr.e eVar = new tr.e((EditText) this);
        this.f25689c = eVar;
        eVar.x(attributeSet, com.assetgro.stockgro.prod.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener u10 = eVar.u(keyListener);
            if (u10 != keyListener) {
                super.setKeyListener(u10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        s sVar = this.f25687a;
        if (sVar != null) {
            sVar.a();
        }
        z0 z0Var = this.f25688b;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return qu.i0.P(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        s sVar = this.f25687a;
        if (sVar != null) {
            return sVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        s sVar = this.f25687a;
        if (sVar != null) {
            return sVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f25688b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f25688b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        iu.j.o(this, editorInfo, onCreateInputConnection);
        return this.f25689c.z(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        s sVar = this.f25687a;
        if (sVar != null) {
            sVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        s sVar = this.f25687a;
        if (sVar != null) {
            sVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.f25688b;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.f25688b;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(qu.i0.R(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(iu.j.m(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        ((mt.p) ((r4.b) this.f25689c.f36362c).f33058d).D(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f25689c.u(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        s sVar = this.f25687a;
        if (sVar != null) {
            sVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        s sVar = this.f25687a;
        if (sVar != null) {
            sVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        z0 z0Var = this.f25688b;
        z0Var.k(colorStateList);
        z0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        z0 z0Var = this.f25688b;
        z0Var.l(mode);
        z0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        z0 z0Var = this.f25688b;
        if (z0Var != null) {
            z0Var.g(i10, context);
        }
    }
}
