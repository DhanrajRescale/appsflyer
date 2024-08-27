package ie;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.remote.request.ExitData;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatHostViewModel f19906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19907c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ExitData f19908d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(GroupChatHostViewModel groupChatHostViewModel, String str, ExitData exitData, yt.a aVar) {
        super(2, aVar);
        this.f19906b = groupChatHostViewModel;
        this.f19907c = str;
        this.f19908d = exitData;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f19906b, this.f19907c, this.f19908d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19905a;
        ExitData exitData = this.f19908d;
        GroupChatHostViewModel groupChatHostViewModel = this.f19906b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                ChatRepository chatRepository = groupChatHostViewModel.f9369n;
                String str2 = this.f19907c;
                this.f19905a = 1;
                obj = chatRepository.exitChatGroup(str2, exitData, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((v0) obj).f29302a.isSuccessful()) {
                groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
                Group group = (Group) groupChatHostViewModel.f9372q.getValue();
                if (group != null) {
                    e0 e0Var = groupChatHostViewModel.f9381z;
                    String groupId = group.getGroupId();
                    String groupName = group.getGroupName();
                    if (exitData != null) {
                        str = exitData.getReasonString();
                    } else {
                        str = null;
                    }
                    e0Var.postValue(dp.b.P0(groupId, groupName, str, "groupview_threedots"));
                }
                groupChatHostViewModel.f9379x.postValue(Boolean.TRUE);
            } else {
                groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
