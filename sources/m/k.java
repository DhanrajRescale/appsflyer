package m;

import android.view.View;

/* loaded from: classes.dex */
public final class k extends z1 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f25612j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f25613k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f25614l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, View view, View view2, Object obj) {
        super(view2);
        this.f25612j = i10;
        this.f25614l = view;
        this.f25613k = obj;
    }

    @Override // m.z1
    public final l.g0 b() {
        switch (this.f25612j) {
            case 0:
                h hVar = ((l) this.f25614l).f25616d.f25650t;
                if (hVar == null) {
                    return null;
                }
                return hVar.a();
            default:
                return (o0) this.f25613k;
        }
    }

    @Override // m.z1
    public final boolean c() {
        int i10 = this.f25612j;
        View view = this.f25614l;
        switch (i10) {
            case 0:
                ((l) view).f25616d.n();
                return true;
            default:
                r0 r0Var = (r0) view;
                if (!r0Var.getInternalPopup().a()) {
                    r0Var.f25696f.l(j0.b(r0Var), j0.a(r0Var));
                }
                return true;
        }
    }

    @Override // m.z1
    public final boolean d() {
        switch (this.f25612j) {
            case 0:
                n nVar = ((l) this.f25614l).f25616d;
                if (nVar.f25652v != null) {
                    return false;
                }
                nVar.f();
                return true;
            default:
                super.d();
                return true;
        }
    }
}
