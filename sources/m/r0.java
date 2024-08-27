package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* loaded from: classes.dex */
public final class r0 extends Spinner {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f25690i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final s f25691a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f25692b;

    /* renamed from: c, reason: collision with root package name */
    public final k f25693c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f25694d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25695e;

    /* renamed from: f, reason: collision with root package name */
    public final q0 f25696f;

    /* renamed from: g, reason: collision with root package name */
    public int f25697g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f25698h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (r6 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r0(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r11 = this;
            r0 = 2130969839(0x7f0404ef, float:1.7548371E38)
            r11.<init>(r12, r13, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r11.f25698h = r1
            android.content.Context r1 = r11.getContext()
            m.m3.a(r1, r11)
            int[] r1 = g.a.f16370v
            h.c r2 = new h.c
            r3 = 0
            android.content.res.TypedArray r4 = r12.obtainStyledAttributes(r13, r1, r0, r3)
            r2.<init>(r12, r4)
            m.s r4 = new m.s
            r4.<init>(r11)
            r11.f25691a = r4
            r4 = 4
            int r4 = r2.C(r4, r3)
            if (r4 == 0) goto L36
            k.e r5 = new k.e
            r5.<init>(r12, r4)
            r11.f25692b = r5
            goto L38
        L36:
            r11.f25692b = r12
        L38:
            r4 = -1
            r5 = 0
            int[] r6 = m.r0.f25690i     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            android.content.res.TypedArray r6 = r12.obtainStyledAttributes(r13, r6, r0, r3)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            boolean r7 = r6.hasValue(r3)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
            if (r7 == 0) goto L51
            int r4 = r6.getInt(r3, r3)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
            goto L51
        L4b:
            r12 = move-exception
            r5 = r6
            goto Lda
        L4f:
            r7 = move-exception
            goto L5a
        L51:
            r6.recycle()
            goto L64
        L55:
            r12 = move-exception
            goto Lda
        L58:
            r7 = move-exception
            r6 = r5
        L5a:
            java.lang.String r8 = "AppCompatSpinner"
            java.lang.String r9 = "Could not read android:spinnerMode"
            android.util.Log.i(r8, r9, r7)     // Catch: java.lang.Throwable -> L4b
            if (r6 == 0) goto L64
            goto L51
        L64:
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L9e
            if (r4 == r7) goto L6b
            goto Lab
        L6b:
            m.o0 r4 = new m.o0
            android.content.Context r8 = r11.f25692b
            r4.<init>(r11, r8, r13)
            android.content.Context r8 = r11.f25692b
            h.c r1 = h.c.N(r8, r13, r1, r0)
            java.lang.Object r8 = r1.f17584c
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            r9 = 3
            r10 = -2
            int r8 = r8.getLayoutDimension(r9, r10)
            r11.f25697g = r8
            android.graphics.drawable.Drawable r8 = r1.v(r7)
            r4.i(r8)
            java.lang.String r6 = r2.D(r6)
            r4.C = r6
            r1.R()
            r11.f25696f = r4
            m.k r1 = new m.k
            r1.<init>(r7, r11, r11, r4)
            r11.f25693c = r1
            goto Lab
        L9e:
            m.l0 r1 = new m.l0
            r1.<init>(r11)
            r11.f25696f = r1
            java.lang.String r4 = r2.D(r6)
            r1.f25619c = r4
        Lab:
            java.lang.Object r1 = r2.f17584c
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            java.lang.CharSequence[] r1 = r1.getTextArray(r3)
            if (r1 == 0) goto Lc6
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r12, r4, r1)
            r12 = 2131559107(0x7f0d02c3, float:1.8743549E38)
            r3.setDropDownViewResource(r12)
            r11.setAdapter(r3)
        Lc6:
            r2.R()
            r11.f25695e = r7
            android.widget.SpinnerAdapter r12 = r11.f25694d
            if (r12 == 0) goto Ld4
            r11.setAdapter(r12)
            r11.f25694d = r5
        Ld4:
            m.s r12 = r11.f25691a
            r12.e(r13, r0)
            return
        Lda:
            if (r5 == 0) goto Ldf
            r5.recycle()
        Ldf:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m.r0.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f25698h;
            drawable.getPadding(rect);
            return i11 + rect.left + rect.right;
        }
        return i11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        s sVar = this.f25691a;
        if (sVar != null) {
            sVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        q0 q0Var = this.f25696f;
        if (q0Var != null) {
            return q0Var.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        q0 q0Var = this.f25696f;
        if (q0Var != null) {
            return q0Var.n();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f25696f != null) {
            return this.f25697g;
        }
        return super.getDropDownWidth();
    }

    public final q0 getInternalPopup() {
        return this.f25696f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        q0 q0Var = this.f25696f;
        if (q0Var != null) {
            return q0Var.e();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f25692b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        q0 q0Var = this.f25696f;
        if (q0Var != null) {
            return q0Var.d();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        s sVar = this.f25691a;
        if (sVar != null) {
            return sVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        s sVar = this.f25691a;
        if (sVar != null) {
            return sVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q0 q0Var = this.f25696f;
        if (q0Var != null && q0Var.a()) {
            q0Var.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f25696f != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        p0 p0Var = (p0) parcelable;
        super.onRestoreInstanceState(p0Var.getSuperState());
        if (p0Var.f25680a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new l.e(this, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, m.p0, android.os.Parcelable] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        q0 q0Var = this.f25696f;
        if (q0Var != null && q0Var.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        baseSavedState.f25680a = z10;
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k kVar = this.f25693c;
        if (kVar != null && kVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        q0 q0Var = this.f25696f;
        if (q0Var != null) {
            if (!q0Var.a()) {
                this.f25696f.l(j0.b(this), j0.a(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        s sVar = this.f25691a;
        if (sVar != null) {
            sVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        s sVar = this.f25691a;
        if (sVar != null) {
            sVar.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        q0 q0Var = this.f25696f;
        if (q0Var != null) {
            q0Var.k(i10);
            q0Var.c(i10);
        } else {
            super.setDropDownHorizontalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        q0 q0Var = this.f25696f;
        if (q0Var != null) {
            q0Var.j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f25696f != null) {
            this.f25697g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        q0 q0Var = this.f25696f;
        if (q0Var != null) {
            q0Var.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(iu.j.m(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        q0 q0Var = this.f25696f;
        if (q0Var != null) {
            q0Var.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        s sVar = this.f25691a;
        if (sVar != null) {
            sVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        s sVar = this.f25691a;
        if (sVar != null) {
            sVar.j(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.widget.ListAdapter, m.m0, java.lang.Object] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f25695e) {
            this.f25694d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        q0 q0Var = this.f25696f;
        if (q0Var != 0) {
            Context context = this.f25692b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.f25622a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.f25623b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                k0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            q0Var.o(obj);
        }
    }
}
