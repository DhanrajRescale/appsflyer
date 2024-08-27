package vf;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.ui.payments.filter.PinRetryBottomSheetViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinRetryBottomSheetViewModel f38032b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(PinRetryBottomSheetViewModel pinRetryBottomSheetViewModel, int i10) {
        super(1);
        this.f38031a = i10;
        this.f38032b = pinRetryBottomSheetViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f38031a;
        PinRetryBottomSheetViewModel pinRetryBottomSheetViewModel = this.f38032b;
        switch (i10) {
            case 0:
                pinRetryBottomSheetViewModel.f9070f.postValue(Boolean.TRUE);
                return Unit.f23355a;
            case 1:
                BaseResponseDto baseResponseDto = (BaseResponseDto) obj;
                switch (i10) {
                    case 1:
                        pinRetryBottomSheetViewModel.f9070f.postValue(Boolean.FALSE);
                        break;
                    default:
                        pinRetryBottomSheetViewModel.f9637h.postValue(baseResponseDto);
                        break;
                }
                return Unit.f23355a;
            case 2:
                pinRetryBottomSheetViewModel.f9070f.postValue(Boolean.FALSE);
                return Unit.f23355a;
            default:
                BaseResponseDto baseResponseDto2 = (BaseResponseDto) obj;
                switch (i10) {
                    case 1:
                        pinRetryBottomSheetViewModel.f9070f.postValue(Boolean.FALSE);
                        break;
                    default:
                        pinRetryBottomSheetViewModel.f9637h.postValue(baseResponseDto2);
                        break;
                }
                return Unit.f23355a;
        }
    }
}
