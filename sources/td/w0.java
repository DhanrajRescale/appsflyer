package td;

import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.remote.request.ReportChatGroupRequestDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public GroupInfoViewModel f35980a;

    /* renamed from: b, reason: collision with root package name */
    public int f35981b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GroupInfoViewModel f35982c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(GroupInfoViewModel groupInfoViewModel, yt.a aVar) {
        super(2, aVar);
        this.f35982c = groupInfoViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new w0(this.f35982c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String groupId;
        GroupInfoViewModel groupInfoViewModel;
        Boolean bool;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35981b;
        GroupInfoViewModel groupInfoViewModel2 = this.f35982c;
        try {
        } catch (Exception e10) {
            e10.printStackTrace();
            groupInfoViewModel2.f9084g.postValue(Boolean.FALSE);
        }
        if (i10 != 0) {
            if (i10 == 1) {
                groupInfoViewModel = this.f35980a;
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            Group group = (Group) groupInfoViewModel2.f9246q.getValue();
            if (group != null && (groupId = group.getGroupId()) != null) {
                ChatRepository chatRepository = groupInfoViewModel2.f9241n;
                this.f35980a = groupInfoViewModel2;
                this.f35981b = 1;
                obj = chatRepository.reportChatGroup(true, groupId, this);
                if (obj == aVar) {
                    return aVar;
                }
                groupInfoViewModel = groupInfoViewModel2;
            }
            return Unit.f23355a;
        }
        nv.v0 v0Var = (nv.v0) obj;
        if (v0Var.f29302a.isSuccessful()) {
            groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
            androidx.lifecycle.e0 e0Var = groupInfoViewModel.f9254u;
            ReportChatGroupRequestDto reportChatGroupRequestDto = (ReportChatGroupRequestDto) v0Var.f29303b;
            if (reportChatGroupRequestDto != null) {
                bool = Boolean.valueOf(reportChatGroupRequestDto.isReport());
            } else {
                bool = null;
            }
            e0Var.postValue(bool);
        } else {
            groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
