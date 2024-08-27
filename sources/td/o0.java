package td;

import com.assetgro.stockgro.data.model.OpenForAudienceDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoViewModel f35925b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OpenForAudienceDto f35926c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(GroupInfoViewModel groupInfoViewModel, OpenForAudienceDto openForAudienceDto, yt.a aVar) {
        super(2, aVar);
        this.f35925b = groupInfoViewModel;
        this.f35926c = openForAudienceDto;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new o0(this.f35925b, this.f35926c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35924a;
        GroupInfoViewModel groupInfoViewModel = this.f35925b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                xu.d dVar = qu.r0.f32256b;
                n0 n0Var = new n0(groupInfoViewModel, this.f35926c, null);
                this.f35924a = 1;
                if (yk.g.e0(dVar, n0Var, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, groupInfoViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
