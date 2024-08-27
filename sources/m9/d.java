package m9;

import java.util.List;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public float f27637a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27638b;

    public d(List list) {
        this.f27637a = -1.0f;
        this.f27638b = (x9.a) list.get(0);
    }

    public final to.c a(to.c cVar) {
        if (!(cVar instanceof to.j)) {
            return new to.b(this.f27637a, cVar);
        }
        return cVar;
    }

    @Override // m9.b
    public final boolean g(float f10) {
        if (this.f27637a == f10) {
            return true;
        }
        this.f27637a = f10;
        return false;
    }

    @Override // m9.b
    public final x9.a h() {
        return (x9.a) this.f27638b;
    }

    @Override // m9.b
    public final boolean i(float f10) {
        return !((x9.a) this.f27638b).c();
    }

    @Override // m9.b
    public final boolean isEmpty() {
        return false;
    }

    @Override // m9.b
    public final float t() {
        return ((x9.a) this.f27638b).a();
    }

    @Override // m9.b
    public final float w() {
        return ((x9.a) this.f27638b).b();
    }

    public d(to.h hVar, float f10) {
        this.f27638b = hVar;
        this.f27637a = f10;
    }
}
