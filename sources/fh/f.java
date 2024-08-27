package fh;

import com.assetgro.stockgro.data.model.DiscoverDto;
import com.assetgro.stockgro.ui.profile.group.GroupMyProfileViewModel;
import iu.k;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupMyProfileViewModel f16112b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(GroupMyProfileViewModel groupMyProfileViewModel, int i10) {
        super(1);
        this.f16111a = i10;
        this.f16112b = groupMyProfileViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f16111a;
        GroupMyProfileViewModel groupMyProfileViewModel = this.f16112b;
        switch (i10) {
            case 0:
                groupMyProfileViewModel.f9084g.postValue(Boolean.FALSE);
                Map<String, String> groupJoinStatus = ((DiscoverDto) obj).getGroupJoinStatus();
                if (groupJoinStatus != null) {
                    Intrinsics.checkNotNullParameter(groupJoinStatus, "<set-?>");
                    groupMyProfileViewModel.f9985p = groupJoinStatus;
                }
                return Unit.f23355a;
            default:
                groupMyProfileViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
        }
    }
}
