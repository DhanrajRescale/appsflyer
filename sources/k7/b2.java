package k7;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class b2 extends n1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22305a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f22306b;

    public b2(v0 v0Var) {
        this.f22306b = v0Var;
    }

    @Override // k7.n1
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0 && this.f22305a) {
            this.f22305a = false;
            this.f22306b.h();
        }
    }

    @Override // k7.n1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.f22305a = true;
    }
}
