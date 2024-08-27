package mt;

/* loaded from: classes2.dex */
public final class e extends jt.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f28007e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f28008f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(at.g gVar, Object obj, int i10) {
        super(gVar);
        this.f28007e = i10;
        this.f28008f = obj;
    }

    @Override // at.g
    public final void b(Object obj) {
        int i10 = this.f28007e;
        Object obj2 = this.f28008f;
        at.g gVar = this.f21658a;
        switch (i10) {
            case 0:
                try {
                    if (((et.e) obj2).d(obj)) {
                        gVar.b(obj);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    zq.f.l0(th2);
                    this.f21659b.a();
                    onError(th2);
                    return;
                }
            default:
                if (!this.f21661d) {
                    try {
                        Object apply = ((et.d) obj2).apply(obj);
                        gt.e.a(apply, "The mapper function returned a null value.");
                        gVar.b(apply);
                        return;
                    } catch (Throwable th3) {
                        zq.f.l0(th3);
                        this.f21659b.a();
                        onError(th3);
                        return;
                    }
                }
                return;
        }
    }

    @Override // ht.b
    public final int d() {
        int i10 = this.f28007e;
        return 0;
    }

    @Override // ht.c
    public final Object i() {
        Object i10;
        int i11 = this.f28007e;
        Object obj = this.f28008f;
        switch (i11) {
            case 0:
                break;
            default:
                Object i12 = this.f21660c.i();
                if (i12 != null) {
                    Object apply = ((et.d) obj).apply(i12);
                    gt.e.a(apply, "The mapper function returned a null value.");
                    return apply;
                }
                return null;
        }
        do {
            i10 = this.f21660c.i();
            if (i10 != null) {
            }
            return i10;
        } while (!((et.e) obj).d(i10));
        return i10;
    }
}
