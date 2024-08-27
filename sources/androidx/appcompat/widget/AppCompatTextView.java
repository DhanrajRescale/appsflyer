package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import b4.h;
import b4.i;
import h4.q;
import h4.r;
import iu.j;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import m.a0;
import m.a1;
import m.b1;
import m.d4;
import m.i1;
import m.m3;
import m.n3;
import m.s;
import m.s0;
import m.z0;
import qu.i0;
import tr.e;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public final s f1002a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f1003b;

    /* renamed from: c, reason: collision with root package name */
    public final e f1004c;

    /* renamed from: d, reason: collision with root package name */
    public a0 f1005d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1006e;

    /* renamed from: f, reason: collision with root package name */
    public t9.c f1007f;

    /* renamed from: g, reason: collision with root package name */
    public Future f1008g;

    public AppCompatTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @NonNull
    private a0 getEmojiTextViewHelper() {
        if (this.f1005d == null) {
            this.f1005d = new a0(this);
        }
        return this.f1005d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        s sVar = this.f1002a;
        if (sVar != null) {
            sVar.a();
        }
        z0 z0Var = this.f1003b;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (d4.f25514b) {
            return super.getAutoSizeMaxTextSize();
        }
        z0 z0Var = this.f1003b;
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
        z0 z0Var = this.f1003b;
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
        z0 z0Var = this.f1003b;
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
        z0 z0Var = this.f1003b;
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
        z0 z0Var = this.f1003b;
        if (z0Var == null) {
            return 0;
        }
        return z0Var.f25820i.f25547a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i0.P(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a1 getSuperCaller() {
        if (this.f1007f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                this.f1007f = new b1(this);
            } else if (i10 >= 26) {
                this.f1007f = new t9.c(this, 6);
            }
        }
        return this.f1007f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        s sVar = this.f1002a;
        if (sVar != null) {
            return sVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        s sVar = this.f1002a;
        if (sVar != null) {
            return sVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1003b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1003b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        l();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        e eVar;
        if (Build.VERSION.SDK_INT < 28 && (eVar = this.f1004c) != null) {
            TextClassifier textClassifier = (TextClassifier) eVar.f36362c;
            if (textClassifier == null) {
                return s0.a((TextView) eVar.f36361b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    @NonNull
    public h getTextMetricsParamsCompat() {
        return i0.x(this);
    }

    public final void l() {
        Future future = this.f1008g;
        if (future != null) {
            try {
                this.f1008g = null;
                a3.a.u(future.get());
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                i0.x(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1003b.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            g4.c.a(editorInfo, getText());
        }
        j.o(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        z0 z0Var = this.f1003b;
        if (z0Var != null && !d4.f25514b) {
            z0Var.f25820i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        l();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        z0 z0Var = this.f1003b;
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
        z0 z0Var = this.f1003b;
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
        z0 z0Var = this.f1003b;
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
        z0 z0Var = this.f1003b;
        if (z0Var != null) {
            z0Var.j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        s sVar = this.f1002a;
        if (sVar != null) {
            sVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        s sVar = this.f1002a;
        if (sVar != null) {
            sVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.f1003b;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.f1003b;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.f1003b;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.f1003b;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i0.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().o(i10);
        } else {
            i0.I(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().i(i10);
        } else {
            i0.J(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        i0.k(i10);
        if (i10 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i10 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(@NonNull i iVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        i0.x(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        s sVar = this.f1002a;
        if (sVar != null) {
            sVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        s sVar = this.f1002a;
        if (sVar != null) {
            sVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        z0 z0Var = this.f1003b;
        z0Var.k(colorStateList);
        z0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        z0 z0Var = this.f1003b;
        z0Var.l(mode);
        z0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        z0 z0Var = this.f1003b;
        if (z0Var != null) {
            z0Var.g(i10, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        e eVar;
        if (Build.VERSION.SDK_INT >= 28 || (eVar = this.f1004c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            eVar.f36362c = textClassifier;
        }
    }

    public void setTextFuture(Future<i> future) {
        this.f1008g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull h hVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = hVar.f3173b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i10 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i10 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i10 = 7;
            }
        }
        q.h(this, i10);
        getPaint().set(hVar.f3172a);
        r.e(this, hVar.f3174c);
        r.h(this, hVar.f3175d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z10 = d4.f25514b;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        z0 z0Var = this.f1003b;
        if (z0Var != null && !z10) {
            i1 i1Var = z0Var.f25820i;
            if (!i1Var.f()) {
                i1Var.g(i10, f10);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typeface2;
        if (this.f1006e) {
            return;
        }
        if (typeface != null && i10 > 0) {
            Context context = getContext();
            hr.c cVar = u3.e.f36710a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i10);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f1006e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f1006e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n3.a(context);
        this.f1006e = false;
        this.f1007f = null;
        m3.a(getContext(), this);
        s sVar = new s(this);
        this.f1002a = sVar;
        sVar.e(attributeSet, i10);
        z0 z0Var = new z0(this);
        this.f1003b = z0Var;
        z0Var.f(attributeSet, i10);
        z0Var.b();
        this.f1004c = new e((TextView) this);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? j.m(context, i10) : null, i11 != 0 ? j.m(context, i11) : null, i12 != 0 ? j.m(context, i12) : null, i13 != 0 ? j.m(context, i13) : null);
        z0 z0Var = this.f1003b;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? j.m(context, i10) : null, i11 != 0 ? j.m(context, i11) : null, i12 != 0 ? j.m(context, i12) : null, i13 != 0 ? j.m(context, i13) : null);
        z0 z0Var = this.f1003b;
        if (z0Var != null) {
            z0Var.b();
        }
    }
}
