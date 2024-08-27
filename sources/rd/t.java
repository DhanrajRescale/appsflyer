package rd;

import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class t extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f33649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatViewModel f33650b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33651c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f33652d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(GroupChatViewModel groupChatViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f33650b = groupChatViewModel;
        this.f33651c = str;
        this.f33652d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new t(this.f33650b, this.f33651c, this.f33652d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f33649a;
        String str2 = this.f33652d;
        GroupChatViewModel groupChatViewModel = this.f33650b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            ChatRepository chatRepository = groupChatViewModel.f9176n;
            this.f33649a = 1;
            obj = chatRepository.changeMemberActiveStatus(this.f33651c, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((v0) obj).f29302a.isSuccessful()) {
            groupChatViewModel.f9084g.postValue(Boolean.FALSE);
            if (Intrinsics.a(str2, "Rogue")) {
                str = "User Deactivated";
            } else {
                str = "User Activated";
            }
            groupChatViewModel.V.postValue(str);
        }
        return Unit.f23355a;
    }
}
