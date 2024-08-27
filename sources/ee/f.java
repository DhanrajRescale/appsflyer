package ee;

import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.ui.chat.discover.info.GroupDetailViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupDetailViewModel f15398b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(GroupDetailViewModel groupDetailViewModel, int i10) {
        super(1);
        this.f15397a = i10;
        this.f15398b = groupDetailViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Group group;
        int i10 = this.f15397a;
        GroupDetailViewModel groupDetailViewModel = this.f15398b;
        switch (i10) {
            case 0:
                BaseResponseDto baseResponseDto = (BaseResponseDto) obj;
                groupDetailViewModel.f9084g.postValue(Boolean.FALSE);
                if (baseResponseDto != null && (group = (Group) baseResponseDto.getData()) != null) {
                    groupDetailViewModel.f9331q.postValue(group);
                }
                return Unit.f23355a;
            default:
                groupDetailViewModel.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
        }
    }
}
