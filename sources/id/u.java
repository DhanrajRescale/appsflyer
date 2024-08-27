package id;

import com.assetgro.stockgro.data.model.UserChatGroup;
import com.assetgro.stockgro.data.model.UserChatGroupsResponse;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import tu.k1;

/* loaded from: classes.dex */
public final class u extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialChatListViewModel f19889b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(SocialChatListViewModel socialChatListViewModel, yt.a aVar) {
        super(2, aVar);
        this.f19889b = socialChatListViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new u(this.f19889b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        UserChatGroupsResponse userChatGroupsResponse;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19888a;
        boolean z10 = true;
        SocialChatListViewModel socialChatListViewModel = this.f19889b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                ChatRepository chatRepository = socialChatListViewModel.f9091n;
                k1 k1Var = socialChatListViewModel.L;
                int i11 = ((o) k1Var.getValue()).f19871d;
                int i12 = ((o) k1Var.getValue()).f19870c;
                this.f19888a = 1;
                obj = ChatRepository.getChatGroups$default(chatRepository, i11, i12, false, this, 4, null);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && (userChatGroupsResponse = (UserChatGroupsResponse) v0Var.f29303b) != null) {
                List<UserChatGroup> memberGroups = userChatGroupsResponse.getMemberGroups();
                if (memberGroups != null) {
                    socialChatListViewModel.o(new j(memberGroups));
                }
                Boolean endOfResponse = userChatGroupsResponse.getEndOfResponse();
                if (endOfResponse != null) {
                    z10 = endOfResponse.booleanValue();
                }
                socialChatListViewModel.D = z10;
            }
            socialChatListViewModel.o(new n(false));
            k1 k1Var2 = socialChatListViewModel.L;
            do {
                value2 = k1Var2.getValue();
            } while (!k1Var2.l(value2, o.a((o) value2, false, 0, 0, 0, null, false, false, 95)));
        } catch (Exception e10) {
            k1 k1Var3 = socialChatListViewModel.L;
            do {
                value = k1Var3.getValue();
            } while (!k1Var3.l(value, o.a((o) value, false, 0, 0, 0, null, false, false, 95)));
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
        return Unit.f23355a;
    }
}
