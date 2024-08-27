package p0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m extends au.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f30474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f30475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f30476c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, float f10, yt.a aVar) {
        super(1, aVar);
        this.f30475b = oVar;
        this.f30476c = f10;
    }

    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new m(this.f30475b, this.f30476c, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((m) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f30474a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            o oVar = this.f30475b;
            float i11 = oVar.f30484e.i();
            float f10 = this.f30476c;
            androidx.compose.foundation.layout.e eVar = new androidx.compose.foundation.layout.e(oVar, 3);
            this.f30474a = 1;
            if (w.e.e(i11, f10, null, eVar, this, 12) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
