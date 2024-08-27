package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f23621a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f23622b;

    public j(k kVar) {
        this.f23622b = kVar;
        a();
    }

    public final void a() {
        o oVar = this.f23622b.f23625c;
        q qVar = oVar.f23657v;
        if (qVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f23645j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((q) arrayList.get(i10)) == qVar) {
                    this.f23621a = i10;
                    return;
                }
            }
        }
        this.f23621a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q getItem(int i10) {
        k kVar = this.f23622b;
        o oVar = kVar.f23625c;
        oVar.i();
        ArrayList arrayList = oVar.f23645j;
        kVar.getClass();
        int i11 = this.f23621a;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (q) arrayList.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        k kVar = this.f23622b;
        o oVar = kVar.f23625c;
        oVar.i();
        int size = oVar.f23645j.size();
        kVar.getClass();
        if (this.f23621a < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f23622b.f23624b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((d0) view).b(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
