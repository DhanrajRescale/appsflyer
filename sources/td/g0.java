package td;

import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class g0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoViewModel f35877b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f35878c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f35879d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(GroupInfoViewModel groupInfoViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f35877b = groupInfoViewModel;
        this.f35878c = str;
        this.f35879d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g0(this.f35877b, this.f35878c, this.f35879d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35876a;
        String str2 = this.f35879d;
        GroupInfoViewModel groupInfoViewModel = this.f35877b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            ChatRepository chatRepository = groupInfoViewModel.f9241n;
            this.f35876a = 1;
            obj = chatRepository.changeMemberActiveStatus(this.f35878c, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((nv.v0) obj).f29302a.isSuccessful()) {
            groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
            if (str2.equals("Rogue")) {
                str = "User Deactivated";
            } else {
                str = "User Activated";
            }
            groupInfoViewModel.f9262y.postValue(str);
            groupInfoViewModel.m();
        }
        return Unit.f23355a;
    }
}
