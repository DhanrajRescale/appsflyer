package zc;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.LeagueLeaderBoardViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class p extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f42403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeagueLeaderBoardViewModel f42404b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(LeagueLeaderBoardViewModel leagueLeaderBoardViewModel, yt.a aVar) {
        super(2, aVar);
        this.f42404b = leagueLeaderBoardViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new p(this.f42404b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f42403a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            this.f42403a = 1;
            if (kp.j.K(500L, this) == aVar) {
                return aVar;
            }
        }
        e0 e0Var = this.f42404b.U;
        Unit unit = Unit.f23355a;
        e0Var.postValue(unit);
        return unit;
    }
}
