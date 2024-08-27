package ie;

import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class a extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatHostViewModel f19897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f19898c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f19899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(GroupChatHostViewModel groupChatHostViewModel, boolean z10, String str, yt.a aVar) {
        super(2, aVar);
        this.f19897b = groupChatHostViewModel;
        this.f19898c = z10;
        this.f19899d = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new a(this.f19897b, this.f19898c, this.f19899d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19896a;
        boolean z10 = this.f19898c;
        GroupChatHostViewModel groupChatHostViewModel = this.f19897b;
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
                String str = this.f19899d;
                this.f19896a = 1;
                obj = chatRepository.blockUserOnPrivateChatV2(z10, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && v0Var.f29302a.code() == 200) {
                groupChatHostViewModel.T.setValue(Boolean.valueOf(z10));
                groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception e10) {
            groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
