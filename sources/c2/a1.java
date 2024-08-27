package c2;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public g1.n f7647a;

    /* renamed from: b, reason: collision with root package name */
    public int f7648b;

    /* renamed from: c, reason: collision with root package name */
    public v0.h f7649c;

    /* renamed from: d, reason: collision with root package name */
    public v0.h f7650d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f7652f;

    public a1(b1 b1Var, g1.n nVar, int i10, v0.h hVar, v0.h hVar2, boolean z10) {
        this.f7652f = b1Var;
        this.f7647a = nVar;
        this.f7648b = i10;
        this.f7649c = hVar;
        this.f7650d = hVar2;
        this.f7651e = z10;
    }

    public final boolean a(int i10, int i11) {
        v0.h hVar = this.f7649c;
        int i12 = this.f7648b;
        if (androidx.compose.ui.node.b.a((g1.m) hVar.f37653a[i10 + i12], (g1.m) this.f7650d.f37653a[i12 + i11]) != 0) {
            return true;
        }
        return false;
    }
}
