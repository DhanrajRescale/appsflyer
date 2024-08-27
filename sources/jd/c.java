package jd;

import au.i;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.chat.activation.DeactivatedMembersListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f21303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeactivatedMembersListViewModel f21304b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21305c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f21306d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DeactivatedMembersListViewModel deactivatedMembersListViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f21304b = deactivatedMembersListViewModel;
        this.f21305c = str;
        this.f21306d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c(this.f21304b, this.f21305c, this.f21306d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f21303a;
        String str2 = this.f21306d;
        String str3 = this.f21305c;
        DeactivatedMembersListViewModel deactivatedMembersListViewModel = this.f21304b;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            ChatRepository chatRepository = deactivatedMembersListViewModel.f9106n;
            this.f21303a = 1;
            obj = chatRepository.changeMemberActiveStatus(str3, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((v0) obj).f29302a.isSuccessful()) {
            deactivatedMembersListViewModel.f9084g.postValue(Boolean.FALSE);
            if (Intrinsics.a(str2, "Rogue")) {
                str = "User Deactivated";
            } else {
                str = "User Activated";
            }
            deactivatedMembersListViewModel.f9110r.postValue(str);
            deactivatedMembersListViewModel.f9108p.postValue(str3);
        }
        return Unit.f23355a;
    }
}
