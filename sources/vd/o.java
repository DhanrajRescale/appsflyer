package vd;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.HttpUrl;
import qu.f0;

/* loaded from: classes.dex */
public final class o extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f37994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupMemberListViewModel f37995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f37996c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f37997d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(GroupMemberListViewModel groupMemberListViewModel, boolean z10, String str, yt.a aVar) {
        super(2, aVar);
        this.f37995b = groupMemberListViewModel;
        this.f37996c = z10;
        this.f37997d = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new o(this.f37995b, this.f37996c, this.f37997d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f37994a;
        boolean z10 = this.f37996c;
        GroupMemberListViewModel groupMemberListViewModel = this.f37995b;
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
                String str = this.f37997d;
                this.f37994a = 1;
                obj = chatRepository.blockUserOnPrivateChatV2(z10, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((v0) obj).f29302a.isSuccessful()) {
                groupMemberListViewModel.f9084g.postValue(Boolean.FALSE);
                e0 e0Var = groupMemberListViewModel.f9082e;
                if (z10) {
                    e0Var.postValue(ni.j.r(new Integer(R.string.text_user_blocked)));
                } else {
                    e0Var.postValue(ni.j.r(new Integer(R.string.text_user_unblocked)));
                }
                groupMemberListViewModel.F = HttpUrl.FRAGMENT_ENCODE_SET;
                groupMemberListViewModel.H = 0;
                groupMemberListViewModel.m();
            } else {
                groupMemberListViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            groupMemberListViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
