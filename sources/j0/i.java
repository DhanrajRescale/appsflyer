package j0;

import d2.r2;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f20590a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f20591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f20592c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Function2 function2, yt.a aVar) {
        super(2, aVar);
        this.f20592c = function2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        i iVar = new i(this.f20592c, aVar);
        iVar.f20591b = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((i) create((r2) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
        return zt.a.f42823a;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f20590a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            r2 r2Var = (r2) this.f20591b;
            this.f20590a = 1;
            if (this.f20592c.invoke(r2Var, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
