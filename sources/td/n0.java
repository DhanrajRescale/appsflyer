package td;

import com.assetgro.stockgro.data.model.OpenForAudienceDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoViewModel f35920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OpenForAudienceDto f35921c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(GroupInfoViewModel groupInfoViewModel, OpenForAudienceDto openForAudienceDto, yt.a aVar) {
        super(2, aVar);
        this.f35920b = groupInfoViewModel;
        this.f35921c = openForAudienceDto;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new n0(this.f35920b, this.f35921c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35919a;
        GroupInfoViewModel groupInfoViewModel = this.f35920b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            ChatRepository chatRepository = groupInfoViewModel.f9241n;
            this.f35919a = 1;
            if (chatRepository.editIsOpenForAudience(this.f35921c, this) == aVar) {
                return aVar;
            }
        }
        groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
        return Unit.f23355a;
    }
}
