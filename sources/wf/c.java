package wf;

import android.content.Intent;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.ui.payments.home.WalletHomeActivity;
import com.assetgro.stockgro.ui.subscription.ManageSubscriptionActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vt.p0;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletHomeActivity f39042b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(WalletHomeActivity walletHomeActivity, int i10) {
        super(2);
        this.f39041a = i10;
        this.f39042b = walletHomeActivity;
    }

    public final void a(Intent intent, fj.c analyticData) {
        int i10 = this.f39041a;
        WalletHomeActivity walletHomeActivity = this.f39042b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(intent, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(analyticData, "<anonymous parameter 1>");
                walletHomeActivity.B(new AnalyticEvent("app_account_sub_card", null, 2, null));
                walletHomeActivity.startActivity(new Intent(walletHomeActivity, (Class<?>) ManageSubscriptionActivity.class));
                return;
            default:
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(analyticData, "analyticData");
                walletHomeActivity.B(new AnalyticEvent("app_wallet_banner_tap", p0.f(new Pair("banner_type", analyticData.f16136a), new Pair("index", Integer.valueOf(analyticData.f16137b)), new Pair("redirection_uri", analyticData.f16138c))));
                walletHomeActivity.startActivity(intent);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f39041a) {
            case 0:
                a((Intent) obj, (fj.c) obj2);
                return Unit.f23355a;
            default:
                a((Intent) obj, (fj.c) obj2);
                return Unit.f23355a;
        }
    }
}
