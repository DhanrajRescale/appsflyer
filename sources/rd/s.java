package rd;

import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class s extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f33645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatViewModel f33646b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f33647c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f33648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(GroupChatViewModel groupChatViewModel, boolean z10, String str, yt.a aVar) {
        super(2, aVar);
        this.f33646b = groupChatViewModel;
        this.f33647c = z10;
        this.f33648d = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new s(this.f33646b, this.f33647c, this.f33648d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f33645a;
        String str = this.f33648d;
        GroupChatViewModel groupChatViewModel = this.f33646b;
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
                boolean z10 = this.f33647c;
                this.f33645a = 1;
                obj = chatRepository.blockUserOnPrivateChatV2(z10, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && v0Var.f29302a.code() == 200) {
                groupChatViewModel.v(str);
                groupChatViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception e10) {
            groupChatViewModel.f9084g.postValue(Boolean.FALSE);
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
