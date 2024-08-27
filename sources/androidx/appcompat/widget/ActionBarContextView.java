package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import b8.f;
import com.assetgro.stockgro.prod.R;
import d4.b2;
import d4.n1;
import d4.v0;
import java.util.WeakHashMap;
import l.e0;
import l.o;
import m.d4;
import m.h;
import m.n;
import s0.g;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final m.a f931a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f932b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f933c;

    /* renamed from: d, reason: collision with root package name */
    public n f934d;

    /* renamed from: e, reason: collision with root package name */
    public int f935e;

    /* renamed from: f, reason: collision with root package name */
    public b2 f936f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f937g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f938h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f939i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f940j;

    /* renamed from: k, reason: collision with root package name */
    public View f941k;

    /* renamed from: l, reason: collision with root package name */
    public View f942l;

    /* renamed from: m, reason: collision with root package name */
    public View f943m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f944n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f945o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f946p;

    /* renamed from: q, reason: collision with root package name */
    public final int f947q;

    /* renamed from: r, reason: collision with root package name */
    public final int f948r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f949s;

    /* renamed from: t, reason: collision with root package name */
    public final int f950t;

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f931a = new m.a(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f932b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f932b = context;
        }
        h.c cVar = new h.c(context, context.obtainStyledAttributes(attributeSet, g.a.f16352d, R.attr.actionModeStyle, 0));
        Drawable v10 = cVar.v(0);
        WeakHashMap weakHashMap = n1.f13788a;
        v0.q(this, v10);
        this.f947q = cVar.C(5, 0);
        this.f948r = cVar.C(4, 0);
        this.f935e = ((TypedArray) cVar.f17584c).getLayoutDimension(3, 0);
        this.f950t = cVar.C(2, R.layout.abc_action_mode_close_item_material);
        cVar.R();
    }

    public static int f(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, i10 - view.getMeasuredWidth());
    }

    public static int j(int i10, int i11, int i12, View view, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        if (z10) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void c(k.b bVar) {
        View view = this.f941k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f950t, (ViewGroup) this, false);
            this.f941k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f941k);
        }
        View findViewById = this.f941k.findViewById(R.id.action_mode_close_button);
        this.f942l = findViewById;
        findViewById.setOnClickListener(new m.c(this, bVar));
        o oVar = (o) bVar.c();
        n nVar = this.f934d;
        if (nVar != null) {
            nVar.f();
            h hVar = nVar.f25651u;
            if (hVar != null && hVar.b()) {
                hVar.f23555j.dismiss();
            }
        }
        n nVar2 = new n(getContext());
        this.f934d = nVar2;
        nVar2.f25643m = true;
        nVar2.f25644n = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        oVar.b(this.f934d, this.f932b);
        n nVar3 = this.f934d;
        e0 e0Var = nVar3.f25638h;
        if (e0Var == null) {
            e0 e0Var2 = (e0) nVar3.f25634d.inflate(nVar3.f25636f, (ViewGroup) this, false);
            nVar3.f25638h = e0Var2;
            e0Var2.d(nVar3.f25633c);
            nVar3.d(true);
        }
        e0 e0Var3 = nVar3.f25638h;
        if (e0Var != e0Var3) {
            ((ActionMenuView) e0Var3).setPresenter(nVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) e0Var3;
        this.f933c = actionMenuView;
        WeakHashMap weakHashMap = n1.f13788a;
        v0.q(actionMenuView, null);
        addView(this.f933c, layoutParams);
    }

    public final void d() {
        int i10;
        if (this.f944n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f944n = linearLayout;
            this.f945o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f946p = (TextView) this.f944n.findViewById(R.id.action_bar_subtitle);
            int i11 = this.f947q;
            if (i11 != 0) {
                this.f945o.setTextAppearance(getContext(), i11);
            }
            int i12 = this.f948r;
            if (i12 != 0) {
                this.f946p.setTextAppearance(getContext(), i12);
            }
        }
        this.f945o.setText(this.f939i);
        this.f946p.setText(this.f940j);
        boolean z10 = !TextUtils.isEmpty(this.f939i);
        boolean z11 = !TextUtils.isEmpty(this.f940j);
        TextView textView = this.f946p;
        int i13 = 8;
        if (z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        LinearLayout linearLayout2 = this.f944n;
        if (z10 || z11) {
            i13 = 0;
        }
        linearLayout2.setVisibility(i13);
        if (this.f944n.getParent() == null) {
            addView(this.f944n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f943m = null;
        this.f933c = null;
        this.f934d = null;
        View view = this.f942l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.View
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, g.a.f16349a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        n nVar = this.f934d;
        if (nVar != null) {
            nVar.f25647q = new f(nVar.f25632b).b();
            o oVar = nVar.f25633c;
            if (oVar != null) {
                oVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        if (this.f936f != null) {
            return this.f931a.f25474b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f935e;
    }

    public CharSequence getSubtitle() {
        return this.f940j;
    }

    public CharSequence getTitle() {
        return this.f939i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f938h = false;
        }
        if (!this.f938h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f938h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f938h = false;
        }
        return true;
    }

    @Override // android.view.View
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f937g = false;
        }
        if (!this.f937g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f937g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f937g = false;
        }
        return true;
    }

    @Override // android.view.View
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            b2 b2Var = this.f936f;
            if (b2Var != null) {
                b2Var.b();
            }
            super.setVisibility(i10);
        }
    }

    public final b2 l(int i10, long j10) {
        b2 b2Var = this.f936f;
        if (b2Var != null) {
            b2Var.b();
        }
        m.a aVar = this.f931a;
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(g.f34069a);
            }
            b2 a10 = n1.a(this);
            a10.a(1.0f);
            a10.c(j10);
            aVar.f25475c.f936f = a10;
            aVar.f25474b = i10;
            a10.d(aVar);
            return a10;
        }
        b2 a11 = n1.a(this);
        a11.a(g.f34069a);
        a11.c(j10);
        aVar.f25475c.f936f = a11;
        aVar.f25474b = i10;
        a11.d(aVar);
        return a11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n nVar = this.f934d;
        if (nVar != null) {
            nVar.f();
            h hVar = this.f934d.f25651u;
            if (hVar != null && hVar.b()) {
                hVar.f23555j.dismiss();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int paddingRight;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean a10 = d4.a(this);
        if (a10) {
            paddingLeft = (i12 - i10) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f941k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f941k.getLayoutParams();
            if (a10) {
                i14 = marginLayoutParams.rightMargin;
            } else {
                i14 = marginLayoutParams.leftMargin;
            }
            if (a10) {
                i15 = marginLayoutParams.leftMargin;
            } else {
                i15 = marginLayoutParams.rightMargin;
            }
            if (a10) {
                i16 = paddingLeft - i14;
            } else {
                i16 = paddingLeft + i14;
            }
            int j10 = j(i16, paddingTop, paddingTop2, this.f941k, a10) + i16;
            if (a10) {
                i17 = j10 - i15;
            } else {
                i17 = j10 + i15;
            }
            paddingLeft = i17;
        }
        LinearLayout linearLayout = this.f944n;
        if (linearLayout != null && this.f943m == null && linearLayout.getVisibility() != 8) {
            paddingLeft += j(paddingLeft, paddingTop, paddingTop2, this.f944n, a10);
        }
        View view2 = this.f943m;
        if (view2 != null) {
            j(paddingLeft, paddingTop, paddingTop2, view2, a10);
        }
        if (a10) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i12 - i10) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f933c;
        if (actionMenuView != null) {
            j(paddingRight, paddingTop, paddingTop2, actionMenuView, !a10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14 = 1073741824;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            if (View.MeasureSpec.getMode(i11) != 0) {
                int size = View.MeasureSpec.getSize(i10);
                int i15 = this.f935e;
                if (i15 <= 0) {
                    i15 = View.MeasureSpec.getSize(i11);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i16 = i15 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE);
                View view = this.f941k;
                if (view != null) {
                    int f10 = f(view, paddingLeft, makeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f941k.getLayoutParams();
                    paddingLeft = f10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f933c;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = f(this.f933c, paddingLeft, makeMeasureSpec);
                }
                LinearLayout linearLayout = this.f944n;
                if (linearLayout != null && this.f943m == null) {
                    if (this.f949s) {
                        this.f944n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f944n.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f944n;
                        if (z10) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        linearLayout2.setVisibility(i13);
                    } else {
                        paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                    }
                }
                View view2 = this.f943m;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i17 = layoutParams.width;
                    if (i17 != -2) {
                        i12 = 1073741824;
                    } else {
                        i12 = Integer.MIN_VALUE;
                    }
                    if (i17 >= 0) {
                        paddingLeft = Math.min(i17, paddingLeft);
                    }
                    int i18 = layoutParams.height;
                    if (i18 == -2) {
                        i14 = Integer.MIN_VALUE;
                    }
                    if (i18 >= 0) {
                        i16 = Math.min(i18, i16);
                    }
                    this.f943m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i16, i14));
                }
                if (this.f935e <= 0) {
                    int childCount = getChildCount();
                    int i19 = 0;
                    for (int i20 = 0; i20 < childCount; i20++) {
                        int measuredHeight = getChildAt(i20).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i19) {
                            i19 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i19);
                    return;
                }
                setMeasuredDimension(size, i15);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    public void setContentHeight(int i10) {
        this.f935e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f943m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f943m = view;
        if (view != null && (linearLayout = this.f944n) != null) {
            removeView(linearLayout);
            this.f944n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f940j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f939i = charSequence;
        d();
        n1.o(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f949s) {
            requestLayout();
        }
        this.f949s = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
