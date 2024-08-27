package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.google.android.gms.common.api.Api;
import e.l;
import l.b0;
import l.e0;
import l.m;
import l.n;
import l.o;
import m.a2;
import m.d4;
import m.h;
import m.p;
import m.q;
import s0.g;
import to.e;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements n, e0 {
    public q A;

    /* renamed from: p, reason: collision with root package name */
    public o f977p;

    /* renamed from: q, reason: collision with root package name */
    public Context f978q;

    /* renamed from: r, reason: collision with root package name */
    public int f979r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f980s;

    /* renamed from: t, reason: collision with root package name */
    public m.n f981t;

    /* renamed from: u, reason: collision with root package name */
    public b0 f982u;

    /* renamed from: v, reason: collision with root package name */
    public m f983v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f984w;

    /* renamed from: x, reason: collision with root package name */
    public int f985x;

    /* renamed from: y, reason: collision with root package name */
    public final int f986y;

    /* renamed from: z, reason: collision with root package name */
    public final int f987z;

    public ActionMenuView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f986y = (int) (56.0f * f10);
        this.f987z = (int) (f10 * 4.0f);
        this.f978q = context;
        this.f979r = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, m.p] */
    public static p l() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f25674a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, m.p] */
    public static p m(ViewGroup.LayoutParams layoutParams) {
        p pVar;
        if (layoutParams != null) {
            if (layoutParams instanceof p) {
                p pVar2 = (p) layoutParams;
                ?? layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) pVar2);
                layoutParams2.f25674a = pVar2.f25674a;
                pVar = layoutParams2;
            } else {
                pVar = new LinearLayout.LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) pVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) pVar).gravity = 16;
            }
            return pVar;
        }
        return l();
    }

    @Override // l.n
    public final boolean a(l.q qVar) {
        return this.f977p.q(qVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p;
    }

    @Override // l.e0
    public final void d(o oVar) {
        this.f977p = oVar;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return l();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public Menu getMenu() {
        if (this.f977p == null) {
            Context context = getContext();
            o oVar = new o(context);
            this.f977p = oVar;
            oVar.f23640e = new l(this, 5);
            m.n nVar = new m.n(context);
            this.f981t = nVar;
            nVar.f25643m = true;
            nVar.f25644n = true;
            b0 b0Var = this.f982u;
            if (b0Var == null) {
                b0Var = new e(3);
            }
            nVar.f25635e = b0Var;
            this.f977p.b(nVar, this.f978q);
            m.n nVar2 = this.f981t;
            nVar2.f25638h = this;
            this.f977p = nVar2.f25633c;
        }
        return this.f977p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        m.n nVar = this.f981t;
        m.l lVar = nVar.f25640j;
        if (lVar != null) {
            return lVar.getDrawable();
        }
        if (nVar.f25642l) {
            return nVar.f25641k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f979r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ a2 generateDefaultLayoutParams() {
        return l();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m.a2, android.widget.LinearLayout$LayoutParams] */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: i */
    public final a2 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ a2 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public final boolean n(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof m.o)) {
            z10 = ((m.o) childAt).a();
        }
        if (i10 > 0 && (childAt2 instanceof m.o)) {
            return z10 | ((m.o) childAt2).c();
        }
        return z10;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m.n nVar = this.f981t;
        if (nVar != null) {
            nVar.d(false);
            if (this.f981t.h()) {
                this.f981t.f();
                this.f981t.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m.n nVar = this.f981t;
        if (nVar != null) {
            nVar.f();
            h hVar = nVar.f25651u;
            if (hVar != null && hVar.b()) {
                hVar.f23555j.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int width;
        int i15;
        if (!this.f984w) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i12 - i10;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        boolean a10 = d4.a(this);
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                p pVar = (p) childAt.getLayoutParams();
                if (pVar.f25674a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i20)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a10) {
                        i15 = getPaddingLeft() + ((LinearLayout.LayoutParams) pVar).leftMargin;
                        width = i15 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) pVar).rightMargin;
                        i15 = width - measuredWidth;
                    }
                    int i21 = i16 - (measuredHeight / 2);
                    childAt.layout(i15, i21, width, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i18 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) pVar).leftMargin) + ((LinearLayout.LayoutParams) pVar).rightMargin;
                    n(i20);
                    i19++;
                }
            }
        }
        if (childCount == 1 && i18 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i17 / 2) - (measuredWidth2 / 2);
            int i23 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i19 - (i18 ^ 1);
        if (i24 > 0) {
            i14 = paddingRight / i24;
        } else {
            i14 = 0;
        }
        int max = Math.max(0, i14);
        if (a10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt3 = getChildAt(i25);
                p pVar2 = (p) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !pVar2.f25674a) {
                    int i26 = width2 - ((LinearLayout.LayoutParams) pVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width2 = i26 - ((measuredWidth3 + ((LinearLayout.LayoutParams) pVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt4 = getChildAt(i28);
            p pVar3 = (p) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !pVar3.f25674a) {
                int i29 = paddingLeft + ((LinearLayout.LayoutParams) pVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i30 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i29, i30, i29 + measuredWidth4, measuredHeight4 + i30);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) pVar3).rightMargin + max + i29;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        boolean z12;
        boolean z13;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ?? r12;
        boolean z14;
        int i20;
        int i21;
        int i22;
        ActionMenuItemView actionMenuItemView;
        boolean z15;
        int i23;
        boolean z16;
        o oVar;
        boolean z17 = this.f984w;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f984w = z10;
        if (z17 != z10) {
            this.f985x = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f984w && (oVar = this.f977p) != null && size != this.f985x) {
            this.f985x = size;
            oVar.p(true);
        }
        int childCount = getChildCount();
        if (this.f984w && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i10);
            int size3 = View.MeasureSpec.getSize(i11);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
            int i24 = size2 - paddingRight;
            int i25 = this.f986y;
            int i26 = i24 / i25;
            int i27 = i24 % i25;
            if (i26 == 0) {
                setMeasuredDimension(i24, 0);
                return;
            }
            int i28 = (i27 / i26) + i25;
            int childCount2 = getChildCount();
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            boolean z18 = false;
            int i32 = 0;
            int i33 = 0;
            long j10 = 0;
            while (true) {
                i12 = this.f987z;
                if (i31 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i31);
                int i34 = size3;
                if (childAt.getVisibility() == 8) {
                    i21 = i24;
                    i22 = paddingBottom;
                } else {
                    boolean z19 = childAt instanceof ActionMenuItemView;
                    int i35 = i29 + 1;
                    if (z19) {
                        childAt.setPadding(i12, 0, i12, 0);
                    }
                    p pVar = (p) childAt.getLayoutParams();
                    pVar.f25679f = false;
                    pVar.f25676c = 0;
                    pVar.f25675b = 0;
                    pVar.f25677d = false;
                    ((LinearLayout.LayoutParams) pVar).leftMargin = 0;
                    ((LinearLayout.LayoutParams) pVar).rightMargin = 0;
                    if (z19 && (!TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()))) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    pVar.f25678e = z14;
                    if (pVar.f25674a) {
                        i20 = 1;
                    } else {
                        i20 = i26;
                    }
                    p pVar2 = (p) childAt.getLayoutParams();
                    i21 = i24;
                    i22 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z19) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && (!TextUtils.isEmpty(actionMenuItemView.getText()))) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (i20 > 0 && (!z15 || i20 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20 * i28, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i23 = measuredWidth / i28;
                        if (measuredWidth % i28 != 0) {
                            i23++;
                        }
                        if (z15 && i23 < 2) {
                            i23 = 2;
                        }
                    } else {
                        i23 = 0;
                    }
                    if (!pVar2.f25674a && z15) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    pVar2.f25677d = z16;
                    pVar2.f25675b = i23;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23 * i28, 1073741824), makeMeasureSpec);
                    i30 = Math.max(i30, i23);
                    if (pVar.f25677d) {
                        i32++;
                    }
                    if (pVar.f25674a) {
                        z18 = true;
                    }
                    i26 -= i23;
                    i33 = Math.max(i33, childAt.getMeasuredHeight());
                    if (i23 == 1) {
                        j10 |= 1 << i31;
                    }
                    i29 = i35;
                }
                i31++;
                size3 = i34;
                paddingBottom = i22;
                i24 = i21;
            }
            int i36 = i24;
            int i37 = size3;
            int i38 = i33;
            if (z18 && i29 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z20 = false;
            while (i32 > 0 && i26 > 0) {
                int i39 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                int i40 = 0;
                int i41 = 0;
                long j11 = 0;
                while (i41 < childCount2) {
                    int i42 = i38;
                    p pVar3 = (p) getChildAt(i41).getLayoutParams();
                    boolean z21 = z20;
                    if (pVar3.f25677d) {
                        int i43 = pVar3.f25675b;
                        if (i43 < i39) {
                            j11 = 1 << i41;
                            i39 = i43;
                            i40 = 1;
                        } else if (i43 == i39) {
                            i40++;
                            j11 |= 1 << i41;
                        }
                    }
                    i41++;
                    z20 = z21;
                    i38 = i42;
                }
                i14 = i38;
                z12 = z20;
                j10 |= j11;
                if (i40 > i26) {
                    i13 = mode;
                    break;
                }
                int i44 = i39 + 1;
                int i45 = 0;
                while (i45 < childCount2) {
                    View childAt2 = getChildAt(i45);
                    p pVar4 = (p) childAt2.getLayoutParams();
                    int i46 = mode;
                    int i47 = childMeasureSpec;
                    int i48 = childCount2;
                    long j12 = 1 << i45;
                    if ((j11 & j12) == 0) {
                        if (pVar4.f25675b == i44) {
                            j10 |= j12;
                        }
                    } else {
                        if (z11 && pVar4.f25678e) {
                            r12 = 1;
                            r12 = 1;
                            if (i26 == 1) {
                                childAt2.setPadding(i12 + i28, 0, i12, 0);
                            }
                        } else {
                            r12 = 1;
                        }
                        pVar4.f25675b += r12;
                        pVar4.f25679f = r12;
                        i26--;
                    }
                    i45++;
                    childMeasureSpec = i47;
                    mode = i46;
                    childCount2 = i48;
                }
                i38 = i14;
                z20 = true;
            }
            i13 = mode;
            i14 = i38;
            z12 = z20;
            int i49 = childMeasureSpec;
            int i50 = childCount2;
            if (!z18 && i29 == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i26 <= 0 || j10 == 0 || (i26 >= i29 - 1 && !z13 && i30 <= 1)) {
                i15 = i50;
            } else {
                float bitCount = Long.bitCount(j10);
                if (!z13) {
                    if ((j10 & 1) != 0 && !((p) getChildAt(0).getLayoutParams()).f25678e) {
                        bitCount -= 0.5f;
                    }
                    int i51 = i50 - 1;
                    if ((j10 & (1 << i51)) != 0 && !((p) getChildAt(i51).getLayoutParams()).f25678e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > g.f34069a) {
                    i19 = (int) ((i26 * i28) / bitCount);
                } else {
                    i19 = 0;
                }
                i15 = i50;
                for (int i52 = 0; i52 < i15; i52++) {
                    if ((j10 & (1 << i52)) != 0) {
                        View childAt3 = getChildAt(i52);
                        p pVar5 = (p) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            pVar5.f25676c = i19;
                            pVar5.f25679f = true;
                            if (i52 == 0 && !pVar5.f25678e) {
                                ((LinearLayout.LayoutParams) pVar5).leftMargin = (-i19) / 2;
                            }
                            z12 = true;
                        } else if (pVar5.f25674a) {
                            pVar5.f25676c = i19;
                            pVar5.f25679f = true;
                            ((LinearLayout.LayoutParams) pVar5).rightMargin = (-i19) / 2;
                            z12 = true;
                        } else {
                            if (i52 != 0) {
                                ((LinearLayout.LayoutParams) pVar5).leftMargin = i19 / 2;
                            }
                            if (i52 != i15 - 1) {
                                ((LinearLayout.LayoutParams) pVar5).rightMargin = i19 / 2;
                            }
                        }
                    }
                }
            }
            if (z12) {
                int i53 = 0;
                while (i53 < i15) {
                    View childAt4 = getChildAt(i53);
                    p pVar6 = (p) childAt4.getLayoutParams();
                    if (!pVar6.f25679f) {
                        i18 = i49;
                    } else {
                        i18 = i49;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((pVar6.f25675b * i28) + pVar6.f25676c, 1073741824), i18);
                    }
                    i53++;
                    i49 = i18;
                }
            }
            if (i13 != 1073741824) {
                i17 = i36;
                i16 = i14;
            } else {
                i16 = i37;
                i17 = i36;
            }
            setMeasuredDimension(i17, i16);
            return;
        }
        for (int i54 = 0; i54 < childCount; i54++) {
            p pVar7 = (p) getChildAt(i54).getLayoutParams();
            ((LinearLayout.LayoutParams) pVar7).rightMargin = 0;
            ((LinearLayout.LayoutParams) pVar7).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f981t.f25648r = z10;
    }

    public void setOnMenuItemClickListener(q qVar) {
        this.A = qVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        m.n nVar = this.f981t;
        m.l lVar = nVar.f25640j;
        if (lVar != null) {
            lVar.setImageDrawable(drawable);
        } else {
            nVar.f25642l = true;
            nVar.f25641k = drawable;
        }
    }

    public void setOverflowReserved(boolean z10) {
        this.f980s = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f979r != i10) {
            this.f979r = i10;
            if (i10 == 0) {
                this.f978q = getContext();
            } else {
                this.f978q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(m.n nVar) {
        this.f981t = nVar;
        nVar.f25638h = this;
        this.f977p = nVar.f25633c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}
