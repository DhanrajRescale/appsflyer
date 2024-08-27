package h7;

import au.i;
import d2.y3;
import g7.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class e extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f18033b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, yt.a aVar) {
        super(2, aVar);
        this.f18033b = bVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new e(this.f18033b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18032a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            this.f18032a = 1;
            b bVar = this.f18033b;
            Object c10 = new x(bVar.f18024c.f16990j, 5).c(new y3(bVar, 3), this);
            if (c10 != aVar) {
                c10 = Unit.f23355a;
            }
            if (c10 == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
