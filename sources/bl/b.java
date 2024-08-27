package bl;

import android.view.View;
import android.widget.AdapterView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final cl.c f7079a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f7080b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f7081c;

    /* renamed from: d, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f7082d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7083e;

    public b(cl.c mapping, View rootView, AdapterView hostView) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.f7079a = mapping;
        this.f7080b = new WeakReference(hostView);
        this.f7081c = new WeakReference(rootView);
        this.f7082d = hostView.getOnItemClickListener();
        this.f7083e = true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        Intrinsics.checkNotNullParameter(view, "view");
        AdapterView.OnItemClickListener onItemClickListener = this.f7082d;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, i10, j10);
        }
        View view2 = (View) this.f7081c.get();
        AdapterView adapterView2 = (AdapterView) this.f7080b.get();
        if (view2 != null && adapterView2 != null) {
            c.a(this.f7079a, view2, adapterView2);
        }
    }
}
