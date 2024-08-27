package mo;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.internal.NavigationMenuItemView;
import d4.n1;
import d4.v0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k7.y1;
import k7.z0;
import l.i0;

/* loaded from: classes2.dex */
public final class k extends z0 {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f27920d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public l.q f27921e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27922f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f27923g;

    public k(s sVar) {
        this.f27923g = sVar;
        p();
    }

    @Override // k7.z0
    public final int a() {
        return this.f27920d.size();
    }

    @Override // k7.z0
    public final long b(int i10) {
        return i10;
    }

    @Override // k7.z0
    public final int c(int i10) {
        m mVar = (m) this.f27920d.get(i10);
        if (mVar instanceof n) {
            return 2;
        }
        if (mVar instanceof l) {
            return 3;
        }
        if (mVar instanceof o) {
            if (((o) mVar).f27926a.hasSubMenu()) {
                return 1;
            }
            return 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    @Override // k7.z0
    public final void h(y1 y1Var, int i10) {
        Drawable drawable;
        int c10 = c(i10);
        ArrayList arrayList = this.f27920d;
        View view = ((r) y1Var).f22629a;
        s sVar = this.f27923g;
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 == 3) {
                        n1.n(view, new j(this, i10, true));
                        return;
                    }
                    return;
                } else {
                    n nVar = (n) arrayList.get(i10);
                    view.setPadding(sVar.f27946r, nVar.f27924a, sVar.f27947s, nVar.f27925b);
                    return;
                }
            }
            TextView textView = (TextView) view;
            textView.setText(((o) arrayList.get(i10)).f27926a.f23667e);
            int i11 = sVar.f27935g;
            if (i11 != 0) {
                textView.setTextAppearance(i11);
            }
            textView.setPadding(sVar.f27948t, textView.getPaddingTop(), sVar.f27949u, textView.getPaddingBottom());
            ColorStateList colorStateList = sVar.f27936h;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            n1.n(textView, new j(this, i10, true));
            return;
        }
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
        navigationMenuItemView.setIconTintList(sVar.f27939k);
        int i12 = sVar.f27937i;
        if (i12 != 0) {
            navigationMenuItemView.setTextAppearance(i12);
        }
        ColorStateList colorStateList2 = sVar.f27938j;
        if (colorStateList2 != null) {
            navigationMenuItemView.setTextColor(colorStateList2);
        }
        Drawable drawable2 = sVar.f27940l;
        if (drawable2 != null) {
            drawable = drawable2.getConstantState().newDrawable();
        } else {
            drawable = null;
        }
        WeakHashMap weakHashMap = n1.f13788a;
        v0.q(navigationMenuItemView, drawable);
        RippleDrawable rippleDrawable = sVar.f27941m;
        if (rippleDrawable != null) {
            navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
        }
        o oVar = (o) arrayList.get(i10);
        navigationMenuItemView.setNeedsEmptyIcon(oVar.f27927b);
        int i13 = sVar.f27942n;
        int i14 = sVar.f27943o;
        navigationMenuItemView.setPadding(i13, i14, i13, i14);
        navigationMenuItemView.setIconPadding(sVar.f27944p);
        if (sVar.f27950v) {
            navigationMenuItemView.setIconSize(sVar.f27945q);
        }
        navigationMenuItemView.setMaxLines(sVar.f27952x);
        navigationMenuItemView.b(oVar.f27926a);
        n1.n(navigationMenuItemView, new j(this, i10, false));
    }

    @Override // k7.z0
    public final y1 i(int i10, RecyclerView recyclerView) {
        s sVar = this.f27923g;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return new y1(sVar.f27930b);
                }
                return new i(1, sVar.f27934f, recyclerView);
            }
            return new i(2, sVar.f27934f, recyclerView);
        }
        View inflate = sVar.f27934f.inflate(R.layout.design_navigation_item, (ViewGroup) recyclerView, false);
        y1 y1Var = new y1(inflate);
        inflate.setOnClickListener(sVar.B);
        return y1Var;
    }

    @Override // k7.z0
    public final void n(y1 y1Var) {
        r rVar = (r) y1Var;
        if (rVar instanceof q) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) rVar.f22629a;
            FrameLayout frameLayout = navigationMenuItemView.f11393z;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.f11392y.setCompoundDrawables(null, null, null, null);
        }
    }

    public final void p() {
        boolean z10;
        if (this.f27922f) {
            return;
        }
        this.f27922f = true;
        ArrayList arrayList = this.f27920d;
        arrayList.clear();
        arrayList.add(new Object());
        s sVar = this.f27923g;
        int size = sVar.f27931c.l().size();
        boolean z11 = false;
        int i10 = -1;
        int i11 = 0;
        boolean z12 = false;
        int i12 = 0;
        while (i11 < size) {
            l.q qVar = (l.q) sVar.f27931c.l().get(i11);
            if (qVar.isChecked()) {
                q(qVar);
            }
            if (qVar.isCheckable()) {
                qVar.g(z11);
            }
            if (qVar.hasSubMenu()) {
                i0 i0Var = qVar.f23677o;
                if (i0Var.hasVisibleItems()) {
                    if (i11 != 0) {
                        arrayList.add(new n(sVar.f27954z, z11 ? 1 : 0));
                    }
                    arrayList.add(new o(qVar));
                    int size2 = i0Var.f23641f.size();
                    int i13 = z11 ? 1 : 0;
                    int i14 = i13;
                    while (i13 < size2) {
                        l.q qVar2 = (l.q) i0Var.getItem(i13);
                        if (qVar2.isVisible()) {
                            if (i14 == 0 && qVar2.getIcon() != null) {
                                i14 = 1;
                            }
                            if (qVar2.isCheckable()) {
                                qVar2.g(z11);
                            }
                            if (qVar.isChecked()) {
                                q(qVar);
                            }
                            arrayList.add(new o(qVar2));
                        }
                        i13++;
                        z11 = false;
                    }
                    if (i14 != 0) {
                        int size3 = arrayList.size();
                        for (int size4 = arrayList.size(); size4 < size3; size4++) {
                            ((o) arrayList.get(size4)).f27927b = true;
                        }
                    }
                }
                z10 = true;
            } else {
                int i15 = qVar.f23664b;
                if (i15 != i10) {
                    i12 = arrayList.size();
                    if (qVar.getIcon() != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (i11 != 0) {
                        i12++;
                        int i16 = sVar.f27954z;
                        arrayList.add(new n(i16, i16));
                    }
                } else if (!z12 && qVar.getIcon() != null) {
                    int size5 = arrayList.size();
                    for (int i17 = i12; i17 < size5; i17++) {
                        ((o) arrayList.get(i17)).f27927b = true;
                    }
                    z10 = true;
                    z12 = true;
                    o oVar = new o(qVar);
                    oVar.f27927b = z12;
                    arrayList.add(oVar);
                    i10 = i15;
                }
                z10 = true;
                o oVar2 = new o(qVar);
                oVar2.f27927b = z12;
                arrayList.add(oVar2);
                i10 = i15;
            }
            i11++;
            z11 = false;
        }
        this.f27922f = z11 ? 1 : 0;
    }

    public final void q(l.q qVar) {
        if (this.f27921e != qVar && qVar.isCheckable()) {
            l.q qVar2 = this.f27921e;
            if (qVar2 != null) {
                qVar2.setChecked(false);
            }
            this.f27921e = qVar;
            qVar.setChecked(true);
        }
    }
}
