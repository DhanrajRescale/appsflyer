package md;

import au.i;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.create.GroupCreateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;
import v.e;

/* loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f27715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupCreateViewModel f27716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27717c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27718d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GroupCreateViewModel groupCreateViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f27716b = groupCreateViewModel;
        this.f27717c = str;
        this.f27718d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c(this.f27716b, this.f27717c, this.f27718d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f27715a;
        GroupCreateViewModel groupCreateViewModel = this.f27716b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                ChatRepository chatRepository = groupCreateViewModel.f9116o;
                String str = this.f27717c;
                String str2 = this.f27718d;
                this.f27715a = 1;
                obj = chatRepository.joinSocialGroup(str, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((v0) obj).f29302a.isSuccessful()) {
                groupCreateViewModel.f9084g.postValue(Boolean.FALSE);
                groupCreateViewModel.f9119r.postValue(Boolean.TRUE);
            } else {
                groupCreateViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            e.r(R.string.no_internet_connection, groupCreateViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
