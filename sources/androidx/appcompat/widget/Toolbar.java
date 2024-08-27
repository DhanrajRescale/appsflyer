package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.fragment.app.t0;
import com.assetgro.stockgro.prod.R;
import d4.n1;
import d4.q;
import d4.r;
import d4.v;
import d4.w0;
import d4.x;
import d4.y0;
import e.l;
import h.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k.j;
import l.m;
import l.o;
import m.b0;
import m.d4;
import m.m1;
import m.n;
import m.q3;
import m.r3;
import m.s3;
import m.t2;
import m.t3;
import m.u3;
import m.v3;
import m.w3;
import qu.i0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements r {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final int[] F;
    public final v G;
    public ArrayList H;
    public u3 I;
    public final l J;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f1107a;

    /* renamed from: b, reason: collision with root package name */
    public AppCompatTextView f1108b;

    /* renamed from: c, reason: collision with root package name */
    public AppCompatTextView f1109c;

    /* renamed from: d, reason: collision with root package name */
    public b0 f1110d;

    /* renamed from: e, reason: collision with root package name */
    public AppCompatImageView f1111e;

    /* renamed from: e0, reason: collision with root package name */
    public w3 f1112e0;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f1113f;

    /* renamed from: f0, reason: collision with root package name */
    public n f1114f0;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f1115g;

    /* renamed from: g0, reason: collision with root package name */
    public s3 f1116g0;

    /* renamed from: h, reason: collision with root package name */
    public b0 f1117h;

    /* renamed from: h0, reason: collision with root package name */
    public l.b0 f1118h0;

    /* renamed from: i, reason: collision with root package name */
    public View f1119i;

    /* renamed from: i0, reason: collision with root package name */
    public m f1120i0;

    /* renamed from: j, reason: collision with root package name */
    public Context f1121j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f1122j0;

    /* renamed from: k, reason: collision with root package name */
    public int f1123k;

    /* renamed from: k0, reason: collision with root package name */
    public OnBackInvokedCallback f1124k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1125l;

    /* renamed from: l0, reason: collision with root package name */
    public OnBackInvokedDispatcher f1126l0;

    /* renamed from: m, reason: collision with root package name */
    public int f1127m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f1128m0;

    /* renamed from: n, reason: collision with root package name */
    public final int f1129n;
    public final q0 n0;

    /* renamed from: o, reason: collision with root package name */
    public final int f1130o;

    /* renamed from: p, reason: collision with root package name */
    public int f1131p;

    /* renamed from: q, reason: collision with root package name */
    public int f1132q;

    /* renamed from: r, reason: collision with root package name */
    public int f1133r;

    /* renamed from: s, reason: collision with root package name */
    public int f1134s;

    /* renamed from: t, reason: collision with root package name */
    public t2 f1135t;

    /* renamed from: u, reason: collision with root package name */
    public int f1136u;

    /* renamed from: v, reason: collision with root package name */
    public int f1137v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1138w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1139x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f1140y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1141z;

    public Toolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new j(getContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m.t3, android.view.ViewGroup$MarginLayoutParams, h.a] */
    public static t3 h() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f25736b = 0;
        marginLayoutParams.f17573a = 8388627;
        return marginLayoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [m.t3, h.a] */
    /* JADX WARN: Type inference failed for: r0v4, types: [m.t3, android.view.ViewGroup$MarginLayoutParams, h.a] */
    /* JADX WARN: Type inference failed for: r0v5, types: [m.t3, h.a] */
    /* JADX WARN: Type inference failed for: r0v6, types: [m.t3, h.a] */
    public static t3 i(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof t3) {
            t3 t3Var = (t3) layoutParams;
            ?? aVar = new h.a((h.a) t3Var);
            aVar.f25736b = 0;
            aVar.f25736b = t3Var.f25736b;
            return aVar;
        }
        if (layoutParams instanceof h.a) {
            ?? aVar2 = new h.a((h.a) layoutParams);
            aVar2.f25736b = 0;
            return aVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ?? aVar3 = new h.a(marginLayoutParams);
            aVar3.f25736b = 0;
            ((ViewGroup.MarginLayoutParams) aVar3).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) aVar3).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) aVar3).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin = marginLayoutParams.bottomMargin;
            return aVar3;
        }
        ?? aVar4 = new h.a(layoutParams);
        aVar4.f25736b = 0;
        return aVar4;
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return q.b(marginLayoutParams) + q.c(marginLayoutParams);
    }

    public static int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        boolean z10;
        WeakHashMap weakHashMap = n1.f13788a;
        if (w0.d(this) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, w0.d(this));
        arrayList.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                t3 t3Var = (t3) childAt.getLayoutParams();
                if (t3Var.f25736b == 0 && v(childAt) && j(t3Var.f17573a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            t3 t3Var2 = (t3) childAt2.getLayoutParams();
            if (t3Var2.f25736b == 0 && v(childAt2) && j(t3Var2.f17573a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    @Override // d4.r
    public final void addMenuProvider(x xVar) {
        v vVar = this.G;
        vVar.f13845b.add(xVar);
        vVar.f13844a.run();
    }

    public final void b(View view, boolean z10) {
        t3 t3Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            t3Var = h();
        } else if (!checkLayoutParams(layoutParams)) {
            t3Var = i(layoutParams);
        } else {
            t3Var = (t3) layoutParams;
        }
        t3Var.f25736b = 1;
        if (z10 && this.f1119i != null) {
            view.setLayoutParams(t3Var);
            this.E.add(view);
        } else {
            addView(view, t3Var);
        }
    }

    public final void c() {
        if (this.f1117h == null) {
            b0 b0Var = new b0(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1117h = b0Var;
            b0Var.setImageDrawable(this.f1113f);
            this.f1117h.setContentDescription(this.f1115g);
            t3 h10 = h();
            h10.f17573a = (this.f1129n & 112) | 8388611;
            h10.f25736b = 2;
            this.f1117h.setLayoutParams(h10);
            this.f1117h.setOnClickListener(new h.b(this, 1));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof t3)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, m.t2] */
    public final void d() {
        if (this.f1135t == null) {
            ?? obj = new Object();
            obj.f25728a = 0;
            obj.f25729b = 0;
            obj.f25730c = Integer.MIN_VALUE;
            obj.f25731d = Integer.MIN_VALUE;
            obj.f25732e = 0;
            obj.f25733f = 0;
            obj.f25734g = false;
            obj.f25735h = false;
            this.f1135t = obj;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f1107a;
        if (actionMenuView.f977p == null) {
            o oVar = (o) actionMenuView.getMenu();
            if (this.f1116g0 == null) {
                this.f1116g0 = new s3(this);
            }
            this.f1107a.setExpandedActionViewsExclusive(true);
            oVar.b(this.f1116g0, this.f1121j);
            x();
        }
    }

    public final void f() {
        if (this.f1107a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1107a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1123k);
            this.f1107a.setOnMenuItemClickListener(this.J);
            ActionMenuView actionMenuView2 = this.f1107a;
            l.b0 b0Var = this.f1118h0;
            t9.c cVar = new t9.c(this, 7);
            actionMenuView2.f982u = b0Var;
            actionMenuView2.f983v = cVar;
            t3 h10 = h();
            h10.f17573a = (this.f1129n & 112) | 8388613;
            this.f1107a.setLayoutParams(h10);
            b(this.f1107a, false);
        }
    }

    public final void g() {
        if (this.f1110d == null) {
            this.f1110d = new b0(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            t3 h10 = h();
            h10.f17573a = (this.f1129n & 112) | 8388611;
            this.f1110d.setLayoutParams(h10);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        b0 b0Var = this.f1117h;
        if (b0Var != null) {
            return b0Var.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        b0 b0Var = this.f1117h;
        if (b0Var != null) {
            return b0Var.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        t2 t2Var = this.f1135t;
        if (t2Var != null) {
            if (t2Var.f25734g) {
                return t2Var.f25728a;
            }
            return t2Var.f25729b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1137v;
        if (i10 == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i10;
    }

    public int getContentInsetLeft() {
        t2 t2Var = this.f1135t;
        if (t2Var != null) {
            return t2Var.f25728a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        t2 t2Var = this.f1135t;
        if (t2Var != null) {
            return t2Var.f25729b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        t2 t2Var = this.f1135t;
        if (t2Var != null) {
            if (t2Var.f25734g) {
                return t2Var.f25729b;
            }
            return t2Var.f25728a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1136u;
        if (i10 == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i10;
    }

    public int getCurrentContentInsetEnd() {
        o oVar;
        ActionMenuView actionMenuView = this.f1107a;
        if (actionMenuView != null && (oVar = actionMenuView.f977p) != null && oVar.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.f1137v, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = n1.f13788a;
        if (w0.d(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = n1.f13788a;
        if (w0.d(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1136u, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f1111e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f1111e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1107a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1110d;
    }

    public CharSequence getNavigationContentDescription() {
        b0 b0Var = this.f1110d;
        if (b0Var != null) {
            return b0Var.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        b0 b0Var = this.f1110d;
        if (b0Var != null) {
            return b0Var.getDrawable();
        }
        return null;
    }

    public n getOuterActionMenuPresenter() {
        return this.f1114f0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1107a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1121j;
    }

    public int getPopupTheme() {
        return this.f1123k;
    }

    public CharSequence getSubtitle() {
        return this.f1140y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1109c;
    }

    public CharSequence getTitle() {
        return this.f1139x;
    }

    public int getTitleMarginBottom() {
        return this.f1134s;
    }

    public int getTitleMarginEnd() {
        return this.f1132q;
    }

    public int getTitleMarginStart() {
        return this.f1131p;
    }

    public int getTitleMarginTop() {
        return this.f1133r;
    }

    public final TextView getTitleTextView() {
        return this.f1108b;
    }

    public m1 getWrapper() {
        if (this.f1112e0 == null) {
            this.f1112e0 = new w3(this, true);
        }
        return this.f1112e0;
    }

    public final int j(int i10) {
        WeakHashMap weakHashMap = n1.f13788a;
        int d10 = w0.d(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, d10) & 7;
        if (absoluteGravity != 1 && absoluteGravity != 3 && absoluteGravity != 5) {
            if (d10 != 1) {
                return 3;
            }
            return 5;
        }
        return absoluteGravity;
    }

    public final int k(View view, int i10) {
        int i11;
        t3 t3Var = (t3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i10 > 0) {
            i11 = (measuredHeight - i10) / 2;
        } else {
            i11 = 0;
        }
        int i12 = t3Var.f17573a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.f1138w & 112;
        }
        if (i12 != 48) {
            if (i12 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i14 = ((ViewGroup.MarginLayoutParams) t3Var).topMargin;
                if (i13 < i14) {
                    i13 = i14;
                } else {
                    int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
                    int i16 = ((ViewGroup.MarginLayoutParams) t3Var).bottomMargin;
                    if (i15 < i16) {
                        i13 = Math.max(0, i13 - (i16 - i15));
                    }
                }
                return paddingTop + i13;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) t3Var).bottomMargin) - i11;
        }
        return getPaddingTop() - i11;
    }

    public void n(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public final void o() {
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = this.G.f13845b.iterator();
        while (it2.hasNext()) {
            ((t0) ((x) it2.next())).f1831a.j(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.n0);
        x();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0293 A[LOOP:0: B:40:0x0291->B:41:0x0293, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02af A[LOOP:1: B:44:0x02ad->B:45:0x02af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02ce A[LOOP:2: B:48:0x02cc->B:49:0x02ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x031c A[LOOP:3: B:57:0x031a->B:58:0x031c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean a10 = d4.a(this);
        int i19 = !a10 ? 1 : 0;
        int i20 = 0;
        if (v(this.f1110d)) {
            u(this.f1110d, i10, 0, i11, this.f1130o);
            i12 = l(this.f1110d) + this.f1110d.getMeasuredWidth();
            i13 = Math.max(0, m(this.f1110d) + this.f1110d.getMeasuredHeight());
            i14 = View.combineMeasuredStates(0, this.f1110d.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (v(this.f1117h)) {
            u(this.f1117h, i10, 0, i11, this.f1130o);
            i12 = l(this.f1117h) + this.f1117h.getMeasuredWidth();
            i13 = Math.max(i13, m(this.f1117h) + this.f1117h.getMeasuredHeight());
            i14 = View.combineMeasuredStates(i14, this.f1117h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i12);
        int max2 = Math.max(0, currentContentInsetStart - i12);
        int[] iArr = this.F;
        iArr[a10 ? 1 : 0] = max2;
        if (v(this.f1107a)) {
            u(this.f1107a, i10, max, i11, this.f1130o);
            i15 = l(this.f1107a) + this.f1107a.getMeasuredWidth();
            i13 = Math.max(i13, m(this.f1107a) + this.f1107a.getMeasuredHeight());
            i14 = View.combineMeasuredStates(i14, this.f1107a.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = Math.max(currentContentInsetEnd, i15) + max;
        iArr[i19] = Math.max(0, currentContentInsetEnd - i15);
        if (v(this.f1119i)) {
            max3 += t(this.f1119i, i10, max3, i11, 0, iArr);
            i13 = Math.max(i13, m(this.f1119i) + this.f1119i.getMeasuredHeight());
            i14 = View.combineMeasuredStates(i14, this.f1119i.getMeasuredState());
        }
        if (v(this.f1111e)) {
            max3 += t(this.f1111e, i10, max3, i11, 0, iArr);
            i13 = Math.max(i13, m(this.f1111e) + this.f1111e.getMeasuredHeight());
            i14 = View.combineMeasuredStates(i14, this.f1111e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (((t3) childAt.getLayoutParams()).f25736b == 0 && v(childAt)) {
                max3 += t(childAt, i10, max3, i11, 0, iArr);
                i13 = Math.max(i13, m(childAt) + childAt.getMeasuredHeight());
                i14 = View.combineMeasuredStates(i14, childAt.getMeasuredState());
            }
        }
        int i22 = this.f1133r + this.f1134s;
        int i23 = this.f1131p + this.f1132q;
        if (v(this.f1108b)) {
            t(this.f1108b, i10, max3 + i23, i11, i22, iArr);
            int l10 = l(this.f1108b) + this.f1108b.getMeasuredWidth();
            i16 = m(this.f1108b) + this.f1108b.getMeasuredHeight();
            i17 = View.combineMeasuredStates(i14, this.f1108b.getMeasuredState());
            i18 = l10;
        } else {
            i16 = 0;
            i17 = i14;
            i18 = 0;
        }
        if (v(this.f1109c)) {
            i18 = Math.max(i18, t(this.f1109c, i10, max3 + i23, i11, i16 + i22, iArr));
            i16 += m(this.f1109c) + this.f1109c.getMeasuredHeight();
            i17 = View.combineMeasuredStates(i17, this.f1109c.getMeasuredState());
        }
        int max4 = Math.max(i13, i16);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i18, getSuggestedMinimumWidth()), i10, (-16777216) & i17);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, i17 << 16);
        if (this.f1122j0) {
            int childCount2 = getChildCount();
            for (int i24 = 0; i24 < childCount2; i24++) {
                View childAt2 = getChildAt(i24);
                if (!v(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i20);
        }
        i20 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i20);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        o oVar;
        MenuItem findItem;
        if (!(parcelable instanceof v3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v3 v3Var = (v3) parcelable;
        super.onRestoreInstanceState(v3Var.f22040a);
        ActionMenuView actionMenuView = this.f1107a;
        if (actionMenuView != null) {
            oVar = actionMenuView.f977p;
        } else {
            oVar = null;
        }
        int i10 = v3Var.f25758c;
        if (i10 != 0 && this.f1116g0 != null && oVar != null && (findItem = oVar.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (v3Var.f25759d) {
            q0 q0Var = this.n0;
            removeCallbacks(q0Var);
            post(q0Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        d();
        t2 t2Var = this.f1135t;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != t2Var.f25734g) {
            t2Var.f25734g = z10;
            if (t2Var.f25735h) {
                if (z10) {
                    int i11 = t2Var.f25731d;
                    if (i11 == Integer.MIN_VALUE) {
                        i11 = t2Var.f25732e;
                    }
                    t2Var.f25728a = i11;
                    int i12 = t2Var.f25730c;
                    if (i12 == Integer.MIN_VALUE) {
                        i12 = t2Var.f25733f;
                    }
                    t2Var.f25729b = i12;
                    return;
                }
                int i13 = t2Var.f25730c;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = t2Var.f25732e;
                }
                t2Var.f25728a = i13;
                int i14 = t2Var.f25731d;
                if (i14 == Integer.MIN_VALUE) {
                    i14 = t2Var.f25733f;
                }
                t2Var.f25729b = i14;
                return;
            }
            t2Var.f25728a = t2Var.f25732e;
            t2Var.f25729b = t2Var.f25733f;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, k4.b, m.v3] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        l.q qVar;
        ?? bVar = new k4.b(super.onSaveInstanceState());
        s3 s3Var = this.f1116g0;
        if (s3Var != null && (qVar = s3Var.f25719b) != null) {
            bVar.f25758c = qVar.f23663a;
        }
        bVar.f25759d = q();
        return bVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public final boolean p(View view) {
        if (view.getParent() != this && !this.E.contains(view)) {
            return false;
        }
        return true;
    }

    public final boolean q() {
        n nVar;
        ActionMenuView actionMenuView = this.f1107a;
        if (actionMenuView != null && (nVar = actionMenuView.f981t) != null && nVar.h()) {
            return true;
        }
        return false;
    }

    public final int r(View view, int i10, int i11, int[] iArr) {
        t3 t3Var = (t3) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) t3Var).leftMargin - iArr[0];
        int max = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int k10 = k(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k10, max + measuredWidth, view.getMeasuredHeight() + k10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) t3Var).rightMargin + max;
    }

    @Override // d4.r
    public final void removeMenuProvider(x xVar) {
        this.G.b(xVar);
    }

    public final int s(View view, int i10, int i11, int[] iArr) {
        t3 t3Var = (t3) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) t3Var).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int k10 = k(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k10, max, view.getMeasuredHeight() + k10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) t3Var).leftMargin);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f1128m0 != z10) {
            this.f1128m0 = z10;
            x();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(iu.j.m(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.f1122j0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1137v) {
            this.f1137v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1136u) {
            this.f1136u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(iu.j.m(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(iu.j.m(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f1110d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(u3 u3Var) {
        this.I = u3Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1107a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1123k != i10) {
            this.f1123k = i10;
            if (i10 == 0) {
                this.f1121j = getContext();
            } else {
                this.f1121j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f1134s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1132q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1131p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1133r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public final int t(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void u(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean v(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        n nVar;
        ActionMenuView actionMenuView = this.f1107a;
        if (actionMenuView != null && (nVar = actionMenuView.f981t) != null && nVar.n()) {
            return true;
        }
        return false;
    }

    public final void x() {
        boolean z10;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = r3.a(this);
            s3 s3Var = this.f1116g0;
            boolean z11 = false;
            int i10 = 1;
            if (s3Var != null && s3Var.f25719b != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && a10 != null) {
                WeakHashMap weakHashMap = n1.f13788a;
                if (y0.b(this) && this.f1128m0) {
                    z11 = true;
                }
            }
            if (z11 && this.f1126l0 == null) {
                if (this.f1124k0 == null) {
                    this.f1124k0 = r3.b(new q3(this, i10));
                }
                r3.c(a10, this.f1124k0);
                this.f1126l0 = a10;
                return;
            }
            if (!z11 && (onBackInvokedDispatcher = this.f1126l0) != null) {
                r3.d(onBackInvokedDispatcher, this.f1124k0);
                this.f1126l0 = null;
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1138w = 8388627;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new v(new q3(this, 0));
        this.H = new ArrayList();
        this.J = new l(this, 6);
        this.n0 = new q0(this, 3);
        Context context2 = getContext();
        int[] iArr = g.a.f16373y;
        h.c N = h.c.N(context2, attributeSet, iArr, R.attr.toolbarStyle);
        n1.m(this, context, iArr, attributeSet, (TypedArray) N.f17584c, R.attr.toolbarStyle);
        this.f1125l = N.C(28, 0);
        this.f1127m = N.C(19, 0);
        this.f1138w = ((TypedArray) N.f17584c).getInteger(0, 8388627);
        this.f1129n = ((TypedArray) N.f17584c).getInteger(2, 48);
        int t10 = N.t(22, 0);
        t10 = N.H(27) ? N.t(27, t10) : t10;
        this.f1134s = t10;
        this.f1133r = t10;
        this.f1132q = t10;
        this.f1131p = t10;
        int t11 = N.t(25, -1);
        if (t11 >= 0) {
            this.f1131p = t11;
        }
        int t12 = N.t(24, -1);
        if (t12 >= 0) {
            this.f1132q = t12;
        }
        int t13 = N.t(26, -1);
        if (t13 >= 0) {
            this.f1133r = t13;
        }
        int t14 = N.t(23, -1);
        if (t14 >= 0) {
            this.f1134s = t14;
        }
        this.f1130o = N.u(13, -1);
        int t15 = N.t(9, Integer.MIN_VALUE);
        int t16 = N.t(5, Integer.MIN_VALUE);
        int u10 = N.u(7, 0);
        int u11 = N.u(8, 0);
        d();
        t2 t2Var = this.f1135t;
        t2Var.f25735h = false;
        if (u10 != Integer.MIN_VALUE) {
            t2Var.f25732e = u10;
            t2Var.f25728a = u10;
        }
        if (u11 != Integer.MIN_VALUE) {
            t2Var.f25733f = u11;
            t2Var.f25729b = u11;
        }
        if (t15 != Integer.MIN_VALUE || t16 != Integer.MIN_VALUE) {
            t2Var.a(t15, t16);
        }
        this.f1136u = N.t(10, Integer.MIN_VALUE);
        this.f1137v = N.t(6, Integer.MIN_VALUE);
        this.f1113f = N.v(4);
        this.f1115g = N.F(3);
        CharSequence F = N.F(21);
        if (!TextUtils.isEmpty(F)) {
            setTitle(F);
        }
        CharSequence F2 = N.F(18);
        if (!TextUtils.isEmpty(F2)) {
            setSubtitle(F2);
        }
        this.f1121j = getContext();
        setPopupTheme(N.C(17, 0));
        Drawable v10 = N.v(16);
        if (v10 != null) {
            setNavigationIcon(v10);
        }
        CharSequence F3 = N.F(15);
        if (!TextUtils.isEmpty(F3)) {
            setNavigationContentDescription(F3);
        }
        Drawable v11 = N.v(11);
        if (v11 != null) {
            setLogo(v11);
        }
        CharSequence F4 = N.F(12);
        if (!TextUtils.isEmpty(F4)) {
            setLogoDescription(F4);
        }
        if (N.H(29)) {
            setTitleTextColor(N.r(29));
        }
        if (N.H(20)) {
            setSubtitleTextColor(N.r(20));
        }
        if (N.H(14)) {
            n(N.C(14, 0));
        }
        N.R();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m.t3, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, h.a] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f17573a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.a.f16350b);
        marginLayoutParams.f17573a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f25736b = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        b0 b0Var = this.f1117h;
        if (b0Var != null) {
            b0Var.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1117h.setImageDrawable(drawable);
        } else {
            b0 b0Var = this.f1117h;
            if (b0Var != null) {
                b0Var.setImageDrawable(this.f1113f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1111e == null) {
                this.f1111e = new AppCompatImageView(getContext(), null);
            }
            if (!p(this.f1111e)) {
                b(this.f1111e, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f1111e;
            if (appCompatImageView != null && p(appCompatImageView)) {
                removeView(this.f1111e);
                this.E.remove(this.f1111e);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f1111e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1111e == null) {
            this.f1111e = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.f1111e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        b0 b0Var = this.f1110d;
        if (b0Var != null) {
            b0Var.setContentDescription(charSequence);
            i0.L(this.f1110d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!p(this.f1110d)) {
                b(this.f1110d, true);
            }
        } else {
            b0 b0Var = this.f1110d;
            if (b0Var != null && p(b0Var)) {
                removeView(this.f1110d);
                this.E.remove(this.f1110d);
            }
        }
        b0 b0Var2 = this.f1110d;
        if (b0Var2 != null) {
            b0Var2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1109c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.f1109c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1109c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1127m;
                if (i10 != 0) {
                    this.f1109c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f1109c.setTextColor(colorStateList);
                }
            }
            if (!p(this.f1109c)) {
                b(this.f1109c, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f1109c;
            if (appCompatTextView2 != null && p(appCompatTextView2)) {
                removeView(this.f1109c);
                this.E.remove(this.f1109c);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f1109c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f1140y = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.A = colorStateList;
        AppCompatTextView appCompatTextView = this.f1109c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1108b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.f1108b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1108b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1125l;
                if (i10 != 0) {
                    this.f1108b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1141z;
                if (colorStateList != null) {
                    this.f1108b.setTextColor(colorStateList);
                }
            }
            if (!p(this.f1108b)) {
                b(this.f1108b, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f1108b;
            if (appCompatTextView2 != null && p(appCompatTextView2)) {
                removeView(this.f1108b);
                this.E.remove(this.f1108b);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f1108b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f1139x = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f1141z = colorStateList;
        AppCompatTextView appCompatTextView = this.f1108b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }
}
