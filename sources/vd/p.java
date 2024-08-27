package vd;

import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.HttpUrl;
import qu.f0;

/* loaded from: classes.dex */
public final class p extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f37998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupMemberListViewModel f37999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f38000c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f38001d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(GroupMemberListViewModel groupMemberListViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f37999b = groupMemberListViewModel;
        this.f38000c = str;
        this.f38001d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new p(this.f37999b, this.f38000c, this.f38001d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f37998a;
        String str2 = this.f38001d;
        GroupMemberListViewModel groupMemberListViewModel = this.f37999b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            ChatRepository chatRepository = groupMemberListViewModel.f9286n;
            this.f37998a = 1;
            obj = chatRepository.changeMemberActiveStatus(this.f38000c, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((v0) obj).f29302a.isSuccessful()) {
            groupMemberListViewModel.f9084g.postValue(Boolean.FALSE);
            if (str2.equals("Rogue")) {
                str = "User Deactivated";
            } else {
                str = "User Activated";
            }
            groupMemberListViewModel.f9292t.postValue(str);
            groupMemberListViewModel.F = HttpUrl.FRAGMENT_ENCODE_SET;
            groupMemberListViewModel.H = 0;
            groupMemberListViewModel.m();
        }
        return Unit.f23355a;
    }
}
