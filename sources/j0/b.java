package j0;

import android.view.View;
import d2.c1;
import d2.p2;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f20564a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f20565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f20566c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f20567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f20568e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function1 function1, c cVar, l lVar, yt.a aVar) {
        super(2, aVar);
        this.f20566c = function1;
        this.f20567d = cVar;
        this.f20568e = lVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        b bVar = new b(this.f20566c, this.f20567d, this.f20568e, aVar);
        bVar.f20565b = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((b) create((p2) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
        return zt.a.f42823a;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f20564a;
        c cVar = this.f20567d;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.n.b(obj);
                throw new KotlinNothingValueException();
            }
            ut.n.b(obj);
            p2 p2Var = (p2) this.f20565b;
            View view = ((c1) p2Var).f13380a;
            r rVar = new r(view, new a(this.f20568e), (g) o.f20600a.invoke(view));
            Function1 function1 = this.f20566c;
            if (function1 != null) {
                function1.invoke(rVar);
            }
            cVar.f20570c = rVar;
            this.f20564a = 1;
            ((c1) p2Var).a(rVar, this);
            return aVar;
        } catch (Throwable th2) {
            cVar.f20570c = null;
            throw th2;
        }
    }
}
