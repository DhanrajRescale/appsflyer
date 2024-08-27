package h7;

import au.i;
import g7.c3;
import g7.m3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ut.n;

/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18019a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18020b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f18021c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, yt.a aVar) {
        super(2, aVar);
        this.f18021c = bVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        a aVar2 = new a(this.f18021c, aVar);
        aVar2.f18020b = obj;
        return aVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((c3) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18019a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            c3 c3Var = (c3) this.f18020b;
            g7.i iVar = this.f18021c.f18024c;
            this.f18019a = 1;
            iVar.getClass();
            Object a10 = iVar.f16987g.a(0, new m3(iVar, c3Var, null), this);
            if (a10 != aVar) {
                a10 = Unit.f23355a;
            }
            if (a10 == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
