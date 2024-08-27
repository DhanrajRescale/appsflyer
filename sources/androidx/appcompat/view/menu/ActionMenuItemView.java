package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import g.a;
import l.b;
import l.c;
import l.d0;
import l.n;
import l.q;
import m.o;
import qu.i0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements d0, View.OnClickListener, o {

    /* renamed from: h, reason: collision with root package name */
    public q f892h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f893i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f894j;

    /* renamed from: k, reason: collision with root package name */
    public n f895k;

    /* renamed from: l, reason: collision with root package name */
    public b f896l;

    /* renamed from: m, reason: collision with root package name */
    public c f897m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f898n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f899o;

    /* renamed from: p, reason: collision with root package name */
    public final int f900p;

    /* renamed from: q, reason: collision with root package name */
    public int f901q;

    /* renamed from: r, reason: collision with root package name */
    public final int f902r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f898n = m();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f16351c, 0, 0);
        this.f900p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f902r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f901q = -1;
        setSaveEnabled(false);
    }

    @Override // m.o
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.d0
    public final void b(q qVar) {
        int i10;
        this.f892h = qVar;
        setIcon(qVar.getIcon());
        setTitle(qVar.getTitleCondensed());
        setId(qVar.f23663a);
        if (qVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        setEnabled(qVar.isEnabled());
        if (qVar.hasSubMenu() && this.f896l == null) {
            this.f896l = new b(this);
        }
    }

    @Override // m.o
    public final boolean c() {
        if ((!TextUtils.isEmpty(getText())) && this.f892h.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // l.d0
    public q getItemData() {
        return this.f892h;
    }

    public final boolean m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480 && ((i10 < 640 || i11 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    public final void n() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f893i);
        if (this.f894j != null && ((this.f892h.f23687y & 4) != 4 || (!this.f898n && !this.f899o))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence3 = null;
        if (z12) {
            charSequence = this.f893i;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f892h.f23679q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z12) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f892h.f23667e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f892h.f23680r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z12) {
                charSequence3 = this.f892h.f23667e;
            }
            i0.L(this, charSequence3);
            return;
        }
        i0.L(this, charSequence5);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n nVar = this.f895k;
        if (nVar != null) {
            nVar.a(this.f892h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f898n = m();
        n();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean z10 = !TextUtils.isEmpty(getText());
        if (z10 && (i13 = this.f901q) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i14 = this.f900p;
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(size, i14);
        } else {
            i12 = i14;
        }
        if (mode != 1073741824 && i14 > 0 && measuredWidth < i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
        if (!z10 && this.f894j != null) {
            super.setPadding((getMeasuredWidth() - this.f894j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f892h.hasSubMenu() && (bVar = this.f896l) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f899o != z10) {
            this.f899o = z10;
            q qVar = this.f892h;
            if (qVar != null) {
                l.o oVar = qVar.f23676n;
                oVar.f23646k = true;
                oVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f894j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f902r;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        n();
    }

    public void setItemInvoker(n nVar) {
        this.f895k = nVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f901q = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(c cVar) {
        this.f897m = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f893i = charSequence;
        n();
    }
}
