package vd;

import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class r extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f38006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupMemberListViewModel f38007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f38008c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f38009d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(GroupMemberListViewModel groupMemberListViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f38007b = groupMemberListViewModel;
        this.f38008c = str;
        this.f38009d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new r(this.f38007b, this.f38008c, this.f38009d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f38006a;
        String str = this.f38009d;
        GroupMemberListViewModel groupMemberListViewModel = this.f38007b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                ChatRepository chatRepository = groupMemberListViewModel.f9286n;
                String str2 = this.f38008c;
                String str3 = groupMemberListViewModel.E;
                this.f38006a = 1;
                obj = chatRepository.changeMemberGroupRole(str2, str3, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((v0) obj).f29302a.isSuccessful()) {
                groupMemberListViewModel.f9084g.postValue(Boolean.FALSE);
                groupMemberListViewModel.f9297y.postValue(str);
            } else {
                groupMemberListViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, groupMemberListViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
