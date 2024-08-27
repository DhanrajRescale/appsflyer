package bi;

import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.ui.social.presentation.block.BlockedUserListViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BlockedUserListViewModel f6998b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(BlockedUserListViewModel blockedUserListViewModel, int i10) {
        super(1);
        this.f6997a = i10;
        this.f6998b = blockedUserListViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f6997a;
        BlockedUserListViewModel blockedUserListViewModel = this.f6998b;
        switch (i10) {
            case 0:
                Group group = (Group) obj;
                blockedUserListViewModel.f9084g.postValue(Boolean.FALSE);
                if (group != null) {
                    blockedUserListViewModel.f10125q.postValue(group);
                }
                return Unit.f23355a;
            default:
                blockedUserListViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
        }
    }
}
