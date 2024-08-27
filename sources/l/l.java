package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final o f23629a;

    /* renamed from: b, reason: collision with root package name */
    public int f23630b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23631c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23632d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f23633e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23634f;

    public l(o oVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f23632d = z10;
        this.f23633e = layoutInflater;
        this.f23629a = oVar;
        this.f23634f = i10;
        a();
    }

    public final void a() {
        o oVar = this.f23629a;
        q qVar = oVar.f23657v;
        if (qVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f23645j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((q) arrayList.get(i10)) == qVar) {
                    this.f23630b = i10;
                    return;
                }
            }
        }
        this.f23630b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q getItem(int i10) {
        ArrayList l10;
        boolean z10 = this.f23632d;
        o oVar = this.f23629a;
        if (z10) {
            oVar.i();
            l10 = oVar.f23645j;
        } else {
            l10 = oVar.l();
        }
        int i11 = this.f23630b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (q) l10.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l10;
        boolean z10 = this.f23632d;
        o oVar = this.f23629a;
        if (z10) {
            oVar.i();
            l10 = oVar.f23645j;
        } else {
            l10 = oVar.l();
        }
        if (this.f23630b < 0) {
            return l10.size();
        }
        return l10.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        boolean z10 = false;
        if (view == null) {
            view = this.f23633e.inflate(this.f23634f, viewGroup, false);
        }
        int i12 = getItem(i10).f23664b;
        int i13 = i10 - 1;
        if (i13 >= 0) {
            i11 = getItem(i13).f23664b;
        } else {
            i11 = i12;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f23629a.m() && i12 != i11) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        d0 d0Var = (d0) view;
        if (this.f23631c) {
            listMenuItemView.setForceShowIcon(true);
        }
        d0Var.b(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
