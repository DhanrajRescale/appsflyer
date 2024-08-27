package t7;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class f0 extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f35461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f35462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f35463c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f35464d;

    public f0(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f35464d = hVar;
        this.f35461a = viewGroup;
        this.f35462b = view;
        this.f35463c = view2;
    }

    @Override // t7.q, t7.o
    public final void a() {
        ((ViewGroupOverlay) new e.l(this.f35461a).f14641b).remove(this.f35462b);
    }

    @Override // t7.o
    public final void c(p pVar) {
        this.f35463c.setTag(R.id.save_overlay_view, null);
        ((ViewGroupOverlay) new e.l(this.f35461a).f14641b).remove(this.f35462b);
        pVar.w(this);
    }

    @Override // t7.q, t7.o
    public final void d() {
        View view = this.f35462b;
        if (view.getParent() == null) {
            ((ViewGroupOverlay) new e.l(this.f35461a).f14641b).add(view);
        } else {
            this.f35464d.cancel();
        }
    }
}
