package mo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.internal.NavigationMenuView;
import java.util.ArrayList;
import l.i0;

/* loaded from: classes2.dex */
public final class s implements l.c0 {

    /* renamed from: a, reason: collision with root package name */
    public NavigationMenuView f27929a;

    /* renamed from: b, reason: collision with root package name */
    public LinearLayout f27930b;

    /* renamed from: c, reason: collision with root package name */
    public l.o f27931c;

    /* renamed from: d, reason: collision with root package name */
    public int f27932d;

    /* renamed from: e, reason: collision with root package name */
    public k f27933e;

    /* renamed from: f, reason: collision with root package name */
    public LayoutInflater f27934f;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f27936h;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f27938j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f27939k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f27940l;

    /* renamed from: m, reason: collision with root package name */
    public RippleDrawable f27941m;

    /* renamed from: n, reason: collision with root package name */
    public int f27942n;

    /* renamed from: o, reason: collision with root package name */
    public int f27943o;

    /* renamed from: p, reason: collision with root package name */
    public int f27944p;

    /* renamed from: q, reason: collision with root package name */
    public int f27945q;

    /* renamed from: r, reason: collision with root package name */
    public int f27946r;

    /* renamed from: s, reason: collision with root package name */
    public int f27947s;

    /* renamed from: t, reason: collision with root package name */
    public int f27948t;

    /* renamed from: u, reason: collision with root package name */
    public int f27949u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f27950v;

    /* renamed from: x, reason: collision with root package name */
    public int f27952x;

    /* renamed from: y, reason: collision with root package name */
    public int f27953y;

    /* renamed from: z, reason: collision with root package name */
    public int f27954z;

    /* renamed from: g, reason: collision with root package name */
    public int f27935g = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f27937i = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f27951w = true;
    public int A = -1;
    public final h.b B = new h.b(this, 7);

    @Override // l.c0
    public final void b(l.o oVar, boolean z10) {
    }

    @Override // l.c0
    public final boolean c(l.q qVar) {
        return false;
    }

    @Override // l.c0
    public final void d(boolean z10) {
        k kVar = this.f27933e;
        if (kVar != null) {
            kVar.p();
            kVar.d();
        }
    }

    @Override // l.c0
    public final boolean e() {
        return false;
    }

    @Override // l.c0
    public final void g(Parcelable parcelable) {
        l.q qVar;
        View actionView;
        u uVar;
        l.q qVar2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f27929a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                k kVar = this.f27933e;
                kVar.getClass();
                int i10 = bundle2.getInt("android:menu:checked", 0);
                ArrayList arrayList = kVar.f27920d;
                if (i10 != 0) {
                    kVar.f27922f = true;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        m mVar = (m) arrayList.get(i11);
                        if ((mVar instanceof o) && (qVar2 = ((o) mVar).f27926a) != null && qVar2.f23663a == i10) {
                            kVar.q(qVar2);
                            break;
                        }
                        i11++;
                    }
                    kVar.f27922f = false;
                    kVar.p();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        m mVar2 = (m) arrayList.get(i12);
                        if ((mVar2 instanceof o) && (qVar = ((o) mVar2).f27926a) != null && (actionView = qVar.getActionView()) != null && (uVar = (u) sparseParcelableArray2.get(qVar.f23663a)) != null) {
                            actionView.restoreHierarchyState(uVar);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f27930b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // l.c0
    public final int getId() {
        return this.f27932d;
    }

    @Override // l.c0
    public final void j(Context context, l.o oVar) {
        this.f27934f = LayoutInflater.from(context);
        this.f27931c = oVar;
        this.f27954z = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // l.c0
    public final Parcelable k() {
        View view;
        Bundle bundle = new Bundle();
        if (this.f27929a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f27929a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        k kVar = this.f27933e;
        if (kVar != null) {
            kVar.getClass();
            Bundle bundle2 = new Bundle();
            l.q qVar = kVar.f27921e;
            if (qVar != null) {
                bundle2.putInt("android:menu:checked", qVar.f23663a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            ArrayList arrayList = kVar.f27920d;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                m mVar = (m) arrayList.get(i10);
                if (mVar instanceof o) {
                    l.q qVar2 = ((o) mVar).f27926a;
                    if (qVar2 != null) {
                        view = qVar2.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
                        view.saveHierarchyState(sparseArray3);
                        sparseArray2.put(qVar2.f23663a, sparseArray3);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f27930b != null) {
            SparseArray<Parcelable> sparseArray4 = new SparseArray<>();
            this.f27930b.saveHierarchyState(sparseArray4);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray4);
        }
        return bundle;
    }

    @Override // l.c0
    public final boolean l(i0 i0Var) {
        return false;
    }

    @Override // l.c0
    public final boolean m(l.q qVar) {
        return false;
    }
}
