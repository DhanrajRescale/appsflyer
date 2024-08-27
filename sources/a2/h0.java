package a2;

/* loaded from: classes.dex */
public final class h0 implements h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f67a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f68b;

    public h0(i0 i0Var, Object obj) {
        this.f67a = i0Var;
        this.f68b = obj;
    }

    @Override // a2.h1
    public final void a() {
        i0 i0Var = this.f67a;
        i0Var.d();
        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) i0Var.f79j.remove(this.f68b);
        if (aVar != null) {
            if (i0Var.f84o > 0) {
                androidx.compose.ui.node.a aVar2 = i0Var.f70a;
                int indexOf = aVar2.o().indexOf(aVar);
                int size = aVar2.o().size();
                int i10 = i0Var.f84o;
                if (indexOf >= size - i10) {
                    i0Var.f83n++;
                    i0Var.f84o = i10 - 1;
                    int size2 = (aVar2.o().size() - i0Var.f84o) - i0Var.f83n;
                    aVar2.f1411l = true;
                    aVar2.G(indexOf, size2, 1);
                    aVar2.f1411l = false;
                    i0Var.c(size2);
                    return;
                }
                throw new IllegalStateException("Item is not in pre-composed item range".toString());
            }
            throw new IllegalStateException("No pre-composed items to dispose".toString());
        }
    }

    @Override // a2.h1
    public final int b() {
        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) this.f67a.f79j.get(this.f68b);
        if (aVar != null) {
            return aVar.m().size();
        }
        return 0;
    }

    @Override // a2.h1
    public final void c(int i10, long j10) {
        i0 i0Var = this.f67a;
        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) i0Var.f79j.get(this.f68b);
        if (aVar != null && aVar.C()) {
            int size = aVar.m().size();
            if (i10 >= 0 && i10 < size) {
                if (!aVar.D()) {
                    androidx.compose.ui.node.a aVar2 = i0Var.f70a;
                    aVar2.f1411l = true;
                    ((d2.a0) c2.k0.a(aVar)).v((androidx.compose.ui.node.a) aVar.m().get(i10), j10);
                    aVar2.f1411l = false;
                    return;
                }
                throw new IllegalArgumentException("Pre-measure called on node that is not placed".toString());
            }
            throw new IndexOutOfBoundsException("Index (" + i10 + ") is out of bound of [0, " + size + ')');
        }
    }
}
