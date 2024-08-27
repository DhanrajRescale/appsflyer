package l;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* loaded from: classes.dex */
public final class k implements c0, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f23623a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f23624b;

    /* renamed from: c, reason: collision with root package name */
    public o f23625c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f23626d;

    /* renamed from: e, reason: collision with root package name */
    public b0 f23627e;

    /* renamed from: f, reason: collision with root package name */
    public j f23628f;

    public k(Context context) {
        this.f23623a = context;
        this.f23624b = LayoutInflater.from(context);
    }

    @Override // l.c0
    public final void b(o oVar, boolean z10) {
        b0 b0Var = this.f23627e;
        if (b0Var != null) {
            b0Var.b(oVar, z10);
        }
    }

    @Override // l.c0
    public final boolean c(q qVar) {
        return false;
    }

    @Override // l.c0
    public final void d(boolean z10) {
        j jVar = this.f23628f;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // l.c0
    public final boolean e() {
        return false;
    }

    @Override // l.c0
    public final void g(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f23626d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // l.c0
    public final int getId() {
        return 0;
    }

    @Override // l.c0
    public final void i(b0 b0Var) {
        this.f23627e = b0Var;
    }

    @Override // l.c0
    public final void j(Context context, o oVar) {
        if (this.f23623a != null) {
            this.f23623a = context;
            if (this.f23624b == null) {
                this.f23624b = LayoutInflater.from(context);
            }
        }
        this.f23625c = oVar;
        j jVar = this.f23628f;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // l.c0
    public final Parcelable k() {
        if (this.f23626d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f23626d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.b0, android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnKeyListener, java.lang.Object, android.content.DialogInterface$OnDismissListener, l.p] */
    @Override // l.c0
    public final boolean l(i0 i0Var) {
        if (!i0Var.hasVisibleItems()) {
            return false;
        }
        ?? obj = new Object();
        obj.f23660a = i0Var;
        Context context = i0Var.f23636a;
        h.i iVar = new h.i(context);
        k kVar = new k(iVar.getContext());
        obj.f23662c = kVar;
        kVar.f23627e = obj;
        i0Var.b(kVar, context);
        k kVar2 = obj.f23662c;
        if (kVar2.f23628f == null) {
            kVar2.f23628f = new j(kVar2);
        }
        j jVar = kVar2.f23628f;
        h.e eVar = iVar.f17693a;
        eVar.f17619n = jVar;
        eVar.f17620o = obj;
        View view = i0Var.f23650o;
        if (view != null) {
            eVar.f17610e = view;
        } else {
            eVar.f17608c = i0Var.f23649n;
            iVar.setTitle(i0Var.f23648m);
        }
        eVar.f17618m = obj;
        h.j create = iVar.create();
        obj.f23661b = create;
        create.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f23661b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f23661b.show();
        b0 b0Var = this.f23627e;
        if (b0Var != null) {
            b0Var.e(i0Var);
            return true;
        }
        return true;
    }

    @Override // l.c0
    public final boolean m(q qVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f23625c.q(this.f23628f.getItem(i10), this, 0);
    }
}
