package ea;

import androidx.lifecycle.LiveData;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_onboarding.presentation.login.intro.IntroViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.mobile.MobileLoginViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.otp.ForgotPinOtpViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.reset.ReSetPinViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.register.MobileRegisterViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.register.RegistrationOtpVerificationViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.register.pin.SetPinViewModel;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.assetgro.stockgro.ui.drawer.tutorials.VideoTutorialViewModel;
import com.assetgro.stockgro.ui.portfolio.v2.presentation.LeaguePortfolioCardViewModel;
import com.assetgro.stockgro.ui.portfolio.v2.presentation.ModelPortfolioCardViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockSharedViewModel;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderPaymentSuccessfulViewModel;
import com.assetgro.stockgro.ui.stock.modify.common.ModifyOrderPaymentSuccessfulViewModel;
import com.assetgro.stockgro.ui.subscription.SubscriptionPaymentNonSuccessViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj.a f15198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ct.a f15199c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UserRepository f15200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(pj.a aVar, ct.a aVar2, UserRepository userRepository, int i10) {
        super(0);
        this.f15197a = i10;
        this.f15198b = aVar;
        this.f15199c = aVar2;
        this.f15200d = userRepository;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [com.assetgro.stockgro.ui.base.BaseViewModel, com.assetgro.stockgro.ui.stock.common.StockTransactionPendingViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.assetgro.stockgro.ui.base.BaseViewModel, java.lang.Object, com.assetgro.stockgro.feature_market.presentation.market.asset.MarketSharedViewModel] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.assetgro.stockgro.ui.base.BaseViewModel, com.assetgro.stockgro.ui.stock.modify.common.ModifyTransactionPendingViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f15197a;
        ct.a compositeDisposable = this.f15199c;
        pj.a schedulerProvider = this.f15198b;
        UserRepository userRepository = this.f15200d;
        switch (i10) {
            case 0:
                return new LeaguePortfolioCardViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 1:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 2:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                ?? baseViewModel = new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
                baseViewModel.f8654n = new LiveData();
                return baseViewModel;
            case 3:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                BaseViewModel baseViewModel2 = new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
                new LiveData();
                return baseViewModel2;
            case 4:
                return new MobileLoginViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 5:
                return new ModelPortfolioCardViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 6:
                return new ModifyOrderPaymentSuccessfulViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 7:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                ?? baseViewModel3 = new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
                baseViewModel3.f10311n = new LiveData();
                new LiveData();
                return baseViewModel3;
            case 8:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 9:
                return new ReSetPinViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 10:
                return new RegistrationOtpVerificationViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 11:
                return new StockOrderPaymentSuccessfulViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 12:
                return new StockSharedViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 13:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                ?? baseViewModel4 = new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
                baseViewModel4.f10169n = new LiveData();
                return baseViewModel4;
            case 14:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 15:
                return new SubscriptionPaymentNonSuccessViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 16:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 17:
                return new VideoTutorialViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 18:
                return new IntroViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 19:
                return new MobileRegisterViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 20:
                return new ForgotPinOtpViewModel(schedulerProvider, compositeDisposable, userRepository);
            case 21:
                Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
                Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new BaseViewModel(schedulerProvider, compositeDisposable, userRepository);
            default:
                return new SetPinViewModel(schedulerProvider, compositeDisposable, userRepository);
        }
    }
}
