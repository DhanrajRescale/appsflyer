package m;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n implements l.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25631a;

    /* renamed from: b, reason: collision with root package name */
    public Context f25632b;

    /* renamed from: c, reason: collision with root package name */
    public l.o f25633c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f25634d;

    /* renamed from: e, reason: collision with root package name */
    public l.b0 f25635e;

    /* renamed from: h, reason: collision with root package name */
    public l.e0 f25638h;

    /* renamed from: i, reason: collision with root package name */
    public int f25639i;

    /* renamed from: j, reason: collision with root package name */
    public l f25640j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f25641k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f25642l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25643m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25644n;

    /* renamed from: o, reason: collision with root package name */
    public int f25645o;

    /* renamed from: p, reason: collision with root package name */
    public int f25646p;

    /* renamed from: q, reason: collision with root package name */
    public int f25647q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f25648r;

    /* renamed from: t, reason: collision with root package name */
    public h f25650t;

    /* renamed from: u, reason: collision with root package name */
    public h f25651u;

    /* renamed from: v, reason: collision with root package name */
    public j f25652v;

    /* renamed from: w, reason: collision with root package name */
    public i f25653w;

    /* renamed from: y, reason: collision with root package name */
    public int f25655y;

    /* renamed from: f, reason: collision with root package name */
    public final int f25636f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f25637g = R.layout.abc_action_menu_item_layout;

    /* renamed from: s, reason: collision with root package name */
    public final SparseBooleanArray f25649s = new SparseBooleanArray();

    /* renamed from: x, reason: collision with root package name */
    public final hr.c f25654x = new hr.c(this, 2);

    public n(Context context) {
        this.f25631a = context;
        this.f25634d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.d0] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(l.q qVar, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView;
        View actionView = qVar.getActionView();
        int i10 = 0;
        if (actionView == null || qVar.e()) {
            if (view instanceof l.d0) {
                actionMenuItemView = (l.d0) view;
            } else {
                actionMenuItemView = (l.d0) this.f25634d.inflate(this.f25637g, viewGroup, false);
            }
            actionMenuItemView.b(qVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f25638h);
            if (this.f25653w == null) {
                this.f25653w = new i(this);
            }
            actionMenuItemView2.setPopupCallback(this.f25653w);
            actionView = actionMenuItemView;
        }
        if (qVar.C) {
            i10 = 8;
        }
        actionView.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    @Override // l.c0
    public final void b(l.o oVar, boolean z10) {
        f();
        h hVar = this.f25651u;
        if (hVar != null && hVar.b()) {
            hVar.f23555j.dismiss();
        }
        l.b0 b0Var = this.f25635e;
        if (b0Var != null) {
            b0Var.b(oVar, z10);
        }
    }

    @Override // l.c0
    public final /* bridge */ /* synthetic */ boolean c(l.q qVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.c0
    public final void d(boolean z10) {
        int size;
        int i10;
        l.q qVar;
        ViewGroup viewGroup = (ViewGroup) this.f25638h;
        ArrayList arrayList = null;
        if (viewGroup != null) {
            l.o oVar = this.f25633c;
            if (oVar != null) {
                oVar.i();
                ArrayList l10 = this.f25633c.l();
                int size2 = l10.size();
                i10 = 0;
                for (int i11 = 0; i11 < size2; i11++) {
                    l.q qVar2 = (l.q) l10.get(i11);
                    if (qVar2.f()) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt instanceof l.d0) {
                            qVar = ((l.d0) childAt).getItemData();
                        } else {
                            qVar = null;
                        }
                        View a10 = a(qVar2, childAt, viewGroup);
                        if (qVar2 != qVar) {
                            a10.setPressed(false);
                            a10.jumpDrawablesToCurrentState();
                        }
                        if (a10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a10);
                            }
                            ((ViewGroup) this.f25638h).addView(a10, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f25640j) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.f25638h).requestLayout();
        l.o oVar2 = this.f25633c;
        if (oVar2 != null) {
            oVar2.i();
            ArrayList arrayList2 = oVar2.f23644i;
            int size3 = arrayList2.size();
            for (int i12 = 0; i12 < size3; i12++) {
                l.r rVar = ((l.q) arrayList2.get(i12)).A;
            }
        }
        l.o oVar3 = this.f25633c;
        if (oVar3 != null) {
            oVar3.i();
            arrayList = oVar3.f23645j;
        }
        if (this.f25643m && arrayList != null && ((size = arrayList.size()) != 1 ? size > 0 : (!((l.q) arrayList.get(0)).C))) {
            if (this.f25640j == null) {
                this.f25640j = new l(this, this.f25631a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f25640j.getParent();
            if (viewGroup3 != this.f25638h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f25640j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f25638h;
                l lVar = this.f25640j;
                actionMenuView.getClass();
                p l11 = ActionMenuView.l();
                l11.f25674a = true;
                actionMenuView.addView(lVar, l11);
            }
        } else {
            l lVar2 = this.f25640j;
            if (lVar2 != null) {
                Object parent = lVar2.getParent();
                Object obj = this.f25638h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f25640j);
                }
            }
        }
        ((ActionMenuView) this.f25638h).setOverflowReserved(this.f25643m);
    }

    @Override // l.c0
    public final boolean e() {
        int i10;
        ArrayList arrayList;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        l.o oVar = this.f25633c;
        if (oVar != null) {
            arrayList = oVar.l();
            i10 = arrayList.size();
        } else {
            i10 = 0;
            arrayList = null;
        }
        int i12 = this.f25647q;
        int i13 = this.f25646p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f25638h;
        int i14 = 0;
        boolean z14 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z10 = true;
            if (i14 >= i10) {
                break;
            }
            l.q qVar = (l.q) arrayList.get(i14);
            int i17 = qVar.f23687y;
            if ((i17 & 2) == 2) {
                i15++;
            } else if ((i17 & 1) == 1) {
                i16++;
            } else {
                z14 = true;
            }
            if (this.f25648r && qVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (this.f25643m && (z14 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = this.f25649s;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            l.q qVar2 = (l.q) arrayList.get(i19);
            int i21 = qVar2.f23687y;
            if ((i21 & 2) == i11) {
                z11 = z10;
            } else {
                z11 = false;
            }
            int i22 = qVar2.f23664b;
            if (z11) {
                View a10 = a(qVar2, null, viewGroup);
                a10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a10.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z10);
                }
                qVar2.h(z10);
            } else if ((i21 & 1) == z10) {
                boolean z15 = sparseBooleanArray.get(i22);
                if ((i18 > 0 || z15) && i13 > 0) {
                    z12 = z10;
                } else {
                    z12 = false;
                }
                if (z12) {
                    View a11 = a(qVar2, null, viewGroup);
                    a11.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a11.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    if (i13 + i20 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z12 &= z13;
                }
                if (z12 && i22 != 0) {
                    sparseBooleanArray.put(i22, true);
                } else if (z15) {
                    sparseBooleanArray.put(i22, false);
                    for (int i23 = 0; i23 < i19; i23++) {
                        l.q qVar3 = (l.q) arrayList.get(i23);
                        if (qVar3.f23664b == i22) {
                            if (qVar3.f()) {
                                i18++;
                            }
                            qVar3.h(false);
                        }
                    }
                }
                if (z12) {
                    i18--;
                }
                qVar2.h(z12);
            } else {
                qVar2.h(false);
                i19++;
                i11 = 2;
                z10 = true;
            }
            i19++;
            i11 = 2;
            z10 = true;
        }
        return z10;
    }

    public final boolean f() {
        Object obj;
        j jVar = this.f25652v;
        if (jVar != null && (obj = this.f25638h) != null) {
            ((View) obj).removeCallbacks(jVar);
            this.f25652v = null;
            return true;
        }
        h hVar = this.f25650t;
        if (hVar != null) {
            if (hVar.b()) {
                hVar.f23555j.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // l.c0
    public final void g(Parcelable parcelable) {
        int i10;
        MenuItem findItem;
        if ((parcelable instanceof m) && (i10 = ((m) parcelable).f25621a) > 0 && (findItem = this.f25633c.findItem(i10)) != null) {
            l((l.i0) findItem.getSubMenu());
        }
    }

    @Override // l.c0
    public final int getId() {
        return this.f25639i;
    }

    public final boolean h() {
        h hVar = this.f25650t;
        if (hVar != null && hVar.b()) {
            return true;
        }
        return false;
    }

    @Override // l.c0
    public final void i(l.b0 b0Var) {
        this.f25635e = b0Var;
    }

    @Override // l.c0
    public final void j(Context context, l.o oVar) {
        this.f25632b = context;
        LayoutInflater.from(context);
        this.f25633c = oVar;
        Resources resources = context.getResources();
        b8.f fVar = new b8.f(context);
        if (!this.f25644n) {
            this.f25643m = true;
        }
        this.f25645o = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.f25647q = fVar.b();
        int i10 = this.f25645o;
        if (this.f25643m) {
            if (this.f25640j == null) {
                l lVar = new l(this, this.f25631a);
                this.f25640j = lVar;
                if (this.f25642l) {
                    lVar.setImageDrawable(this.f25641k);
                    this.f25641k = null;
                    this.f25642l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f25640j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f25640j.getMeasuredWidth();
        } else {
            this.f25640j = null;
        }
        this.f25646p = i10;
        float f10 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, java.lang.Object, m.m] */
    @Override // l.c0
    public final Parcelable k() {
        ?? obj = new Object();
        obj.f25621a = this.f25655y;
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.c0
    public final boolean l(l.i0 i0Var) {
        boolean z10;
        if (!i0Var.hasVisibleItems()) {
            return false;
        }
        l.i0 i0Var2 = i0Var;
        while (true) {
            l.o oVar = i0Var2.f23620z;
            if (oVar == this.f25633c) {
                break;
            }
            i0Var2 = (l.i0) oVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.f25638h;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i10);
                if ((childAt instanceof l.d0) && ((l.d0) childAt).getItemData() == i0Var2.A) {
                    view = childAt;
                    break;
                }
                i10++;
            }
        }
        if (view == null) {
            return false;
        }
        this.f25655y = i0Var.A.f23663a;
        int size = i0Var.f23641f.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                MenuItem item = i0Var.getItem(i11);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i11++;
            } else {
                z10 = false;
                break;
            }
        }
        h hVar = new h(this, this.f25632b, i0Var, view);
        this.f25651u = hVar;
        hVar.f23553h = z10;
        l.x xVar = hVar.f23555j;
        if (xVar != null) {
            xVar.q(z10);
        }
        h hVar2 = this.f25651u;
        if (!hVar2.b()) {
            if (hVar2.f23551f != null) {
                hVar2.d(0, 0, false, false);
            } else {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
        }
        l.b0 b0Var = this.f25635e;
        if (b0Var != null) {
            b0Var.e(i0Var);
        }
        return true;
    }

    @Override // l.c0
    public final /* bridge */ /* synthetic */ boolean m(l.q qVar) {
        return false;
    }

    public final boolean n() {
        l.o oVar;
        int i10 = 0;
        if (this.f25643m && !h() && (oVar = this.f25633c) != null && this.f25638h != null && this.f25652v == null) {
            oVar.i();
            if (!oVar.f23645j.isEmpty()) {
                j jVar = new j(i10, this, new h(this, this.f25632b, this.f25633c, this.f25640j));
                this.f25652v = jVar;
                ((View) this.f25638h).post(jVar);
                return true;
            }
        }
        return false;
    }
}
