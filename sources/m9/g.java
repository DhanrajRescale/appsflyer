package m9;

/* loaded from: classes.dex */
public final class g extends x9.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x9.c f27647e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(x9.c cVar) {
        super(0);
        this.f27647e = cVar;
    }

    @Override // x9.c
    public final Object m(x9.b bVar) {
        Float f10 = (Float) this.f27647e.m(bVar);
        if (f10 == null) {
            return null;
        }
        return Float.valueOf(f10.floatValue() * 2.55f);
    }
}
