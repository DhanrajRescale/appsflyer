package m9;

import java.util.List;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final List f27633a;

    /* renamed from: c, reason: collision with root package name */
    public x9.a f27635c = null;

    /* renamed from: d, reason: collision with root package name */
    public float f27636d = -1.0f;

    /* renamed from: b, reason: collision with root package name */
    public x9.a f27634b = a(s0.g.f34069a);

    public c(List list) {
        this.f27633a = list;
    }

    public final x9.a a(float f10) {
        List list = this.f27633a;
        x9.a aVar = (x9.a) nn.d.g(list, 1);
        if (f10 >= aVar.b()) {
            return aVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            x9.a aVar2 = (x9.a) list.get(size);
            if (this.f27634b != aVar2 && f10 >= aVar2.b() && f10 < aVar2.a()) {
                return aVar2;
            }
        }
        return (x9.a) list.get(0);
    }

    @Override // m9.b
    public final boolean g(float f10) {
        x9.a aVar = this.f27635c;
        x9.a aVar2 = this.f27634b;
        if (aVar == aVar2 && this.f27636d == f10) {
            return true;
        }
        this.f27635c = aVar2;
        this.f27636d = f10;
        return false;
    }

    @Override // m9.b
    public final x9.a h() {
        return this.f27634b;
    }

    @Override // m9.b
    public final boolean i(float f10) {
        boolean z10;
        x9.a aVar = this.f27634b;
        if (f10 >= aVar.b() && f10 < aVar.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return !this.f27634b.c();
        }
        this.f27634b = a(f10);
        return true;
    }

    @Override // m9.b
    public final boolean isEmpty() {
        return false;
    }

    @Override // m9.b
    public final float t() {
        return ((x9.a) nn.d.g(this.f27633a, 1)).a();
    }

    @Override // m9.b
    public final float w() {
        return ((x9.a) this.f27633a.get(0)).b();
    }
}
