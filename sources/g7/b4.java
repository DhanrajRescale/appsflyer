package g7;

/* loaded from: classes.dex */
public final class b4 extends k7.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a4 f16676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a4 f16677c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k7.w f16678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16679e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16680f;

    public b4(a4 a4Var, a4 a4Var2, k7.w wVar, int i10, int i11) {
        this.f16676b = a4Var;
        this.f16677c = a4Var2;
        this.f16678d = wVar;
        this.f16679e = i10;
        this.f16680f = i11;
    }

    @Override // k7.w
    public final boolean a(int i10, int i11) {
        Object b10 = ((z2) this.f16676b).b(i10);
        Object b11 = ((z2) this.f16677c).b(i11);
        if (b10 == b11) {
            return true;
        }
        return this.f16678d.b(b10, b11);
    }

    @Override // k7.w
    public final boolean c(int i10, int i11) {
        Object b10 = ((z2) this.f16676b).b(i10);
        Object b11 = ((z2) this.f16677c).b(i11);
        if (b10 == b11) {
            return true;
        }
        return this.f16678d.d(b10, b11);
    }

    @Override // k7.w
    public final Object f(int i10, int i11) {
        if (((z2) this.f16676b).b(i10) == ((z2) this.f16677c).b(i11)) {
            return Boolean.TRUE;
        }
        this.f16678d.getClass();
        return null;
    }

    @Override // k7.w
    public final int g() {
        return this.f16680f;
    }

    @Override // k7.w
    public final int h() {
        return this.f16679e;
    }
}
