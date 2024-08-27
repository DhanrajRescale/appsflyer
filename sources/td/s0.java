package td;

import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.b2;

/* loaded from: classes.dex */
public final class s0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoViewModel f35949b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(GroupInfoViewModel groupInfoViewModel, yt.a aVar) {
        super(2, aVar);
        this.f35949b = groupInfoViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new s0(this.f35949b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35948a;
        GroupInfoViewModel groupInfoViewModel = this.f35949b;
        try {
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ut.n.b(obj);
                    return Unit.f23355a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            ArenaRepository arenaRepository = groupInfoViewModel.f9242o;
            String str = groupInfoViewModel.F;
            this.f35948a = 1;
            obj = arenaRepository.getLeagueInfo(str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        xu.e eVar = qu.r0.f32255a;
        b2 b2Var = vu.u.f38408a;
        r0 r0Var = new r0((nv.v0) obj, groupInfoViewModel, null);
        this.f35948a = 2;
        if (yk.g.e0(b2Var, r0Var, this) == aVar) {
            return aVar;
        }
        return Unit.f23355a;
    }
}
