package mt;

/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final et.c f28002b;

    /* renamed from: c, reason: collision with root package name */
    public final et.c f28003c;

    /* renamed from: d, reason: collision with root package name */
    public final et.a f28004d;

    /* renamed from: e, reason: collision with root package name */
    public final et.a f28005e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(at.f fVar, et.c cVar) {
        super(fVar);
        ll.f fVar2 = gt.e.f17571c;
        ll.e eVar = gt.e.f17570b;
        this.f28002b = cVar;
        this.f28003c = fVar2;
        this.f28004d = eVar;
        this.f28005e = eVar;
    }

    @Override // at.e
    public final void f(at.g gVar) {
        ((at.e) this.f27994a).e(new b(gVar, this.f28002b, this.f28003c, this.f28004d, this.f28005e));
    }
}
