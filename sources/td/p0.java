package td;

import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.remote.request.ExitData;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoViewModel f35929b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f35930c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ExitData f35931d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(GroupInfoViewModel groupInfoViewModel, String str, ExitData exitData, yt.a aVar) {
        super(2, aVar);
        this.f35929b = groupInfoViewModel;
        this.f35930c = str;
        this.f35931d = exitData;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new p0(this.f35929b, this.f35930c, this.f35931d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35928a;
        ExitData exitData = this.f35931d;
        GroupInfoViewModel groupInfoViewModel = this.f35929b;
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
                String str2 = this.f35930c;
                this.f35928a = 1;
                obj = chatRepository.exitChatGroup(str2, exitData, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((nv.v0) obj).f29302a.isSuccessful()) {
                groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
                Group group = (Group) groupInfoViewModel.f9246q.getValue();
                if (group != null) {
                    androidx.lifecycle.e0 e0Var = groupInfoViewModel.B;
                    String groupId = group.getGroupId();
                    String groupName = group.getGroupName();
                    if (exitData != null) {
                        str = exitData.getReasonString();
                    } else {
                        str = null;
                    }
                    e0Var.postValue(dp.b.P0(groupId, groupName, str, "group_info"));
                }
                groupInfoViewModel.f9252t.postValue(Boolean.TRUE);
            } else {
                groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
