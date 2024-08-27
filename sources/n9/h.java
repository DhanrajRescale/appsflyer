package n9;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h extends au.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f28437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j9.i f28438b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f28439c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f28441e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, j9.i iVar2, float f10, int i10, boolean z10, yt.a aVar) {
        super(1, aVar);
        this.f28437a = iVar;
        this.f28438b = iVar2;
        this.f28439c = f10;
        this.f28440d = i10;
        this.f28441e = z10;
    }

    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new h(this.f28437a, this.f28438b, this.f28439c, this.f28440d, this.f28441e, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((h) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        i iVar = this.f28437a;
        iVar.f28450i.setValue(this.f28438b);
        iVar.h(this.f28439c);
        iVar.g(this.f28440d);
        iVar.f28442a.setValue(Boolean.FALSE);
        if (this.f28441e) {
            iVar.f28453l.setValue(Long.MIN_VALUE);
        }
        return Unit.f23355a;
    }
}
