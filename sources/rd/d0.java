package rd;

import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class d0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f33615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatViewModel f33616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33617c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(GroupChatViewModel groupChatViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f33616b = groupChatViewModel;
        this.f33617c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d0(this.f33616b, this.f33617c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f33615a;
        GroupChatViewModel groupChatViewModel = this.f33616b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                ChatRepository chatRepository = groupChatViewModel.f9176n;
                String str = this.f33617c;
                String str2 = groupChatViewModel.f9196x0;
                this.f33615a = 1;
                obj = chatRepository.removeGroupMember(str, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((v0) obj).f29302a.isSuccessful()) {
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
                groupChatViewModel.V.postValue("User Removed");
                groupChatViewModel.A0 = 0;
                String str3 = groupChatViewModel.f9196x0;
                if (str3 != null) {
                    groupChatViewModel.o(str3);
                }
            } else {
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, groupChatViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
