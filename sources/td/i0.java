package td;

import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoViewModel f35891b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f35892c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f35893d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(GroupInfoViewModel groupInfoViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f35891b = groupInfoViewModel;
        this.f35892c = str;
        this.f35893d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i0(this.f35891b, this.f35892c, this.f35893d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35890a;
        String str = this.f35893d;
        GroupInfoViewModel groupInfoViewModel = this.f35891b;
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
                String str2 = this.f35892c;
                String str3 = groupInfoViewModel.F;
                this.f35890a = 1;
                obj = chatRepository.changeMemberGroupRole(str2, str3, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((nv.v0) obj).f29302a.isSuccessful()) {
                groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
                groupInfoViewModel.f9260x.postValue(str);
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
