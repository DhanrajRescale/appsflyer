package j0;

import d2.o2;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class j extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f20593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f20594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f20595c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Function2 function2, yt.a aVar) {
        super(2, aVar);
        this.f20594b = kVar;
        this.f20595c = function2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j(this.f20594b, this.f20595c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((j) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
        return zt.a.f42823a;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f20593a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.n.b(obj);
            throw new KotlinNothingValueException();
        }
        ut.n.b(obj);
        i iVar = new i(this.f20595c, null);
        this.f20593a = 1;
        o2.a(this.f20594b, iVar, this);
        return aVar;
    }
}
