package i5;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements kp.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19580b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f19579a = i10;
        this.f19580b = obj;
    }

    @Override // kp.n
    public final Object get() {
        int i10 = this.f19579a;
        Object obj = this.f19580b;
        switch (i10) {
            case 0:
                return (i1) obj;
            case 1:
                return (u5.v) obj;
            case 2:
                return Boolean.valueOf(((m0) obj).f19575y);
            default:
                try {
                    return (r5.v) ((Class) obj).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
