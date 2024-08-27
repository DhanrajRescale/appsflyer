package sc;

import com.assetgro.stockgro.ui.arena.asset.v2.upcoming.viewmodel.ArenaUpcomingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class f extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f34556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f34557b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, yt.a aVar) {
        super(2, aVar);
        this.f34557b = iVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f34557b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f34556a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            i iVar = this.f34557b;
            tu.f fVar = ((ArenaUpcomingViewModel) iVar.r()).f8966w;
            e eVar = new e(iVar);
            this.f34556a = 1;
            if (fVar.c(eVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
