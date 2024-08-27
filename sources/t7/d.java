package t7;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class d extends q {

    /* renamed from: a, reason: collision with root package name */
    public boolean f35448a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f35449b;

    public d(ViewGroup viewGroup) {
        this.f35449b = viewGroup;
    }

    @Override // t7.q, t7.o
    public final void a() {
        zq.f.j0(this.f35449b, false);
    }

    @Override // t7.q, t7.o
    public final void b() {
        zq.f.j0(this.f35449b, false);
        this.f35448a = true;
    }

    @Override // t7.o
    public final void c(p pVar) {
        if (!this.f35448a) {
            zq.f.j0(this.f35449b, false);
        }
        pVar.w(this);
    }

    @Override // t7.q, t7.o
    public final void d() {
        zq.f.j0(this.f35449b, true);
    }
}
