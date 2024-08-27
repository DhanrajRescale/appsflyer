package vd;

import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.HttpUrl;
import qu.f0;

/* loaded from: classes.dex */
public final class u extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f38015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupMemberListViewModel f38016b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f38017c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(GroupMemberListViewModel groupMemberListViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f38016b = groupMemberListViewModel;
        this.f38017c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new u(this.f38016b, this.f38017c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f38015a;
        GroupMemberListViewModel groupMemberListViewModel = this.f38016b;
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
                String str = this.f38017c;
                String str2 = groupMemberListViewModel.E;
                this.f38015a = 1;
                obj = chatRepository.removeGroupMember(str, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((v0) obj).f29302a.isSuccessful()) {
                groupMemberListViewModel.f9084g.postValue(Boolean.FALSE);
                groupMemberListViewModel.f9292t.postValue("User Removed");
                groupMemberListViewModel.F = HttpUrl.FRAGMENT_ENCODE_SET;
                groupMemberListViewModel.H = 0;
                groupMemberListViewModel.m();
            } else {
                groupMemberListViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, groupMemberListViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
