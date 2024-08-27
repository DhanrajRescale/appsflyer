package td;

import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoViewModel f35908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f35909c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(GroupInfoViewModel groupInfoViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f35908b = groupInfoViewModel;
        this.f35909c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new l0(this.f35908b, this.f35909c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35907a;
        GroupInfoViewModel groupInfoViewModel = this.f35908b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                ChatRepository chatRepository = groupInfoViewModel.f9241n;
                String str = groupInfoViewModel.F;
                String str2 = this.f35909c;
                this.f35907a = 1;
                obj = chatRepository.editGroupCoverImage(str, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((nv.v0) obj).f29302a.isSuccessful()) {
                groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
            } else {
                groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, groupInfoViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
