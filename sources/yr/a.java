package yr;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import zr.b;
import zr.c;

/* loaded from: classes2.dex */
public final class a extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final LayoutInflater f41806b;

    /* renamed from: c, reason: collision with root package name */
    public c f41807c;

    /* renamed from: d, reason: collision with root package name */
    public b f41808d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f41809e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f41805a = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f41810f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f41811g = new HashMap();

    public a(Context context, c cVar, ll.a aVar) {
        context.getResources();
        this.f41806b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f41807c = cVar;
        this.f41808d = aVar;
        this.f41809e = new ArrayList();
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f41809e;
            if (i10 < arrayList.size()) {
                a3.a.u(arrayList.get(i10));
            }
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f41809e.size();
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i10) {
        a(i10);
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        a(i10);
        if (this.f41807c == null) {
            return null;
        }
        ((ll.a) this.f41808d).getClass();
        if (view == null) {
            view = this.f41806b.inflate(R.layout.simple_list_item_1, viewGroup, false);
        }
        if (!(view instanceof TextView)) {
            return view;
        }
        throw null;
    }
}
