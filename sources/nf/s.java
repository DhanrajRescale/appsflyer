package nf;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.ui.main.MainViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class s extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28669a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainViewModel f28670b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(MainViewModel mainViewModel, int i10) {
        super(1);
        this.f28669a = i10;
        this.f28670b = mainViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28669a) {
            case 0:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 1:
                ((Throwable) obj).printStackTrace();
                this.f28670b.U.setValue(new kj.j(Boolean.TRUE));
                return Unit.f23355a;
            case 2:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            default:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
        }
    }

    public final void invoke(BaseResponseDto baseResponseDto) {
        int i10 = this.f28669a;
        MainViewModel mainViewModel = this.f28670b;
        switch (i10) {
            case 0:
                boolean success = baseResponseDto.getSuccess();
                if (success || success) {
                    return;
                }
                mainViewModel.f9081d.clearUserData();
                mainViewModel.V.postValue(new kj.j(Unit.f23355a));
                return;
            case 1:
            default:
                if (baseResponseDto.getSuccess()) {
                    mainViewModel.f9081d.setNotificationIdUpdated(true);
                    return;
                }
                return;
            case 2:
                if (baseResponseDto.getSuccess()) {
                    mainViewModel.f9081d.setCloneDataUpdated(true);
                    return;
                }
                return;
        }
    }
}
