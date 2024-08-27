package fd;

import au.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ut.n;

/* loaded from: classes.dex */
public final class b extends i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f16038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f16039b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function1 function1, yt.a aVar) {
        super(1, aVar);
        this.f16039b = function1;
    }

    @Override // au.a
    public final yt.a create(yt.a aVar) {
        return new b(this.f16039b, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((b) create((yt.a) obj)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f16038a;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                Function1 function1 = this.f16039b;
                this.f16038a = 1;
                if (function1.invoke(this) == aVar) {
                    return aVar;
                }
            }
        } catch (Throwable unused) {
        }
        return Unit.f23355a;
    }
}
