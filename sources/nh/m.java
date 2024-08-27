package nh;

import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.ProfileStatsDto;
import com.assetgro.stockgro.data.model.UserReportStatusDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.ui.profile.user.UserProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserProfileViewModel f28720b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(UserProfileViewModel userProfileViewModel, int i10) {
        super(1);
        this.f28719a = i10;
        this.f28720b = userProfileViewModel;
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f28719a;
        UserProfileViewModel userProfileViewModel = this.f28720b;
        switch (i10) {
            case 0:
                userProfileViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 1:
            default:
                userProfileViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 2:
                userProfileViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f28719a;
        UserProfileViewModel userProfileViewModel = this.f28720b;
        switch (i10) {
            case 0:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 1:
                Group group = (Group) obj;
                userProfileViewModel.f9084g.postValue(Boolean.FALSE);
                if (group != null) {
                    userProfileViewModel.f10077u.postValue(group);
                }
                return Unit.f23355a;
            case 2:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 3:
                UserReportStatusDto userReportStatusDto = (UserReportStatusDto) obj;
                if (userReportStatusDto != null && !Intrinsics.a(userProfileViewModel.f10079w, userProfileViewModel.h())) {
                    userProfileViewModel.f10074r.postValue(userReportStatusDto);
                }
                return Unit.f23355a;
            case 4:
                userProfileViewModel.f9084g.postValue(Boolean.FALSE);
                ProfileStatsDto profileStatsDto = (ProfileStatsDto) ((BaseResponseDto) obj).getData();
                if (profileStatsDto != null) {
                    userProfileViewModel.f10078v.postValue(profileStatsDto);
                }
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }
}
