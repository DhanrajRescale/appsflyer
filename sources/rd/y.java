package rd;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.UserBlockStatusDao;
import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class y extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f33664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatViewModel f33665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33666c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(GroupChatViewModel groupChatViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f33665b = groupChatViewModel;
        this.f33666c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new y(this.f33665b, this.f33666c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        UserBlockStatusDao userBlockStatusDao;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f33664a;
        GroupChatViewModel groupChatViewModel = this.f33665b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            UserRepository userRepository = groupChatViewModel.f9081d;
            this.f33664a = 1;
            obj = userRepository.getUserBlockedStatus(this.f33666c, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful()) {
            e0 e0Var = groupChatViewModel.X;
            BaseResponseV2Dto baseResponseV2Dto = (BaseResponseV2Dto) v0Var.f29303b;
            if (baseResponseV2Dto != null) {
                userBlockStatusDao = (UserBlockStatusDao) baseResponseV2Dto.getData();
            } else {
                userBlockStatusDao = null;
            }
            e0Var.postValue(userBlockStatusDao);
        }
        return Unit.f23355a;
    }
}
