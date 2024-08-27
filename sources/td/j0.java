package td;

import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoViewModel f35896b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Group f35897c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f35898d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(GroupInfoViewModel groupInfoViewModel, Group group, boolean z10, yt.a aVar) {
        super(2, aVar);
        this.f35896b = groupInfoViewModel;
        this.f35897c = group;
        this.f35898d = z10;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j0(this.f35896b, this.f35897c, this.f35898d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35895a;
        GroupInfoViewModel groupInfoViewModel = this.f35896b;
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
                String currentUserId = groupInfoViewModel.f9081d.getCurrentUserId();
                String groupId = this.f35897c.getGroupId();
                boolean z10 = this.f35898d;
                this.f35895a = 1;
                obj = chatRepository.changeChatMuteStatus(currentUserId, groupId, z10, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((nv.v0) obj).f29302a.isSuccessful()) {
                groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
                groupInfoViewModel.m();
            } else {
                groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, groupInfoViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
