package k7;

/* loaded from: classes.dex */
public final class e extends w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f22330b;

    public e(f fVar) {
        this.f22330b = fVar;
    }

    @Override // k7.w
    public final boolean a(int i10, int i11) {
        f fVar = this.f22330b;
        Object obj = fVar.f22341a.get(i10);
        Object obj2 = fVar.f22342b.get(i11);
        if (obj != null && obj2 != null) {
            return ((w) fVar.f22345e.f22370b.f17585d).b(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // k7.w
    public final boolean c(int i10, int i11) {
        f fVar = this.f22330b;
        Object obj = fVar.f22341a.get(i10);
        Object obj2 = fVar.f22342b.get(i11);
        if (obj != null && obj2 != null) {
            return ((w) fVar.f22345e.f22370b.f17585d).d(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        return false;
    }

    @Override // k7.w
    public final Object f(int i10, int i11) {
        f fVar = this.f22330b;
        Object obj = fVar.f22341a.get(i10);
        Object obj2 = fVar.f22342b.get(i11);
        if (obj != null && obj2 != null) {
            ((w) fVar.f22345e.f22370b.f17585d).getClass();
            return null;
        }
        throw new AssertionError();
    }

    @Override // k7.w
    public final int g() {
        return this.f22330b.f22342b.size();
    }

    @Override // k7.w
    public final int h() {
        return this.f22330b.f22341a.size();
    }
}
