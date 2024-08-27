package td;

import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoViewModel f35871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f35872c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f35873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(GroupInfoViewModel groupInfoViewModel, boolean z10, String str, yt.a aVar) {
        super(2, aVar);
        this.f35871b = groupInfoViewModel;
        this.f35872c = z10;
        this.f35873d = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f0(this.f35871b, this.f35872c, this.f35873d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35870a;
        GroupInfoViewModel groupInfoViewModel = this.f35871b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                ChatRepository chatRepository = groupInfoViewModel.f9241n;
                boolean z10 = this.f35872c;
                String str = this.f35873d;
                this.f35870a = 1;
                obj = chatRepository.blockUserOnPrivateChatV2(z10, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((nv.v0) obj).f29302a.isSuccessful()) {
                groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
                groupInfoViewModel.f9082e.postValue(ni.j.r(new Integer(R.string.text_user_blocked)));
                groupInfoViewModel.m();
            } else {
                groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, groupInfoViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
