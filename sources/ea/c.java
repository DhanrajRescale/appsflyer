package ea;

import androidx.lifecycle.LiveData;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseBottomSheetViewModel;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.assetgro.stockgro.ui.drawer.invite.InviteViewModel;
import com.assetgro.stockgro.ui.drawer.rate.RateAppViewModel;
import com.assetgro.stockgro.ui.payments.kyc.KycVerificationPendingViewModel;
import com.assetgro.stockgro.ui.profile.followers.FollowerFollowingViewModel;
import com.assetgro.stockgro.ui.profile.self.DeleteAccountViewModel;
import com.assetgro.stockgro.ui.profile.self.ImageCropViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockSharedViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15122b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15123c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15124d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(pj.a aVar, ct.a aVar2, UserRepository userRepository, int i10) {
        super(0);
        this.f15121a = i10;
        this.f15122b = aVar;
        this.f15123c = aVar2;
        this.f15124d = userRepository;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.assetgro.stockgro.ui.base.BaseViewModel, com.assetgro.stockgro.feature_market.presentation.fno.OptionPendingOrderViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f15121a;
        ct.a compositeDisposable = this.f15123c;
        pj.a schedulerProvider = this.f15122b;
        UserRepository userRepository = this.f15124d;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 1:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 2:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 3:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 4:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 5:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 6:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 7:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 8:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                ?? baseViewModel = new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
                ?? liveData = new LiveData();
                baseViewModel.f8579n = liveData;
                baseViewModel.f8580o = liveData;
                return baseViewModel;
            case 9:
                return new FollowerFollowingViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 10:
                return new ImageCropViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 11:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 12:
                return new InviteViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 13:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 14:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 15:
                return new RateAppViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 16:
                return new StockSharedViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 17:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 18:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 19:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 20:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 21:
                return new DeleteAccountViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 22:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseBottomSheetViewModel(schedulerProvider, compositeDisposable);
            case 23:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 24:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 25:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 26:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 27:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 28:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            default:
                return new KycVerificationPendingViewModel(schedulerProvider, compositeDisposable, userRepository);
        }
    }
}
