package ha;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.navigation.c0;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverview;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverviewAdditionalInfoData;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailFragment;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailViewModel;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OptionDetailFragment f18091a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(OptionDetailFragment optionDetailFragment) {
        super(1);
        this.f18091a = optionDetailFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double premium;
        OptionContract optionContract;
        View it = (View) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        AnalyticEvent analyticEvent = new AnalyticEvent("app_market_opt_buysell_cta_click", null, 2, null);
        OptionDetailFragment optionDetailFragment = this.f18091a;
        optionDetailFragment.z(analyticEvent);
        optionDetailFragment.B(analyticEvent);
        OptionContract optionContract2 = (OptionContract) ((OptionDetailViewModel) optionDetailFragment.r()).E.getValue();
        if (optionContract2 != null) {
            OptionOverviewAdditionalInfoData optionOverviewAdditionalInfoData = (OptionOverviewAdditionalInfoData) ((OptionDetailViewModel) optionDetailFragment.r()).G.getValue();
            if (optionOverviewAdditionalInfoData != null) {
                if (optionOverviewAdditionalInfoData.getPrice() == 0.0d) {
                    premium = optionOverviewAdditionalInfoData.getPrice();
                } else {
                    premium = optionContract2.getPremium();
                }
            } else {
                premium = optionContract2.getPremium();
            }
            double d10 = premium;
            OptionOverview optionOverview = (OptionOverview) ((OptionDetailViewModel) optionDetailFragment.r()).f8596q.getValue();
            if (optionOverview != null) {
                if (!WifiService.INSTANCE.getInstance().isOnline()) {
                    Context context = optionDetailFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter("Not connected to internet", "text");
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c("Not connected to internet", (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                } else {
                    c0 f10 = q6.l.h(optionDetailFragment).f();
                    if (f10 != null && f10.f2181h == R.id.fnoOptionDetailFragment) {
                        androidx.navigation.t h10 = q6.l.h(optionDetailFragment);
                        optionContract = optionContract2.copy((r32 & 1) != 0 ? optionContract2.optionType : null, (r32 & 2) != 0 ? optionContract2.name : null, (r32 & 4) != 0 ? optionContract2.identifier : null, (r32 & 8) != 0 ? optionContract2.strikePrice : 0.0d, (r32 & 16) != 0 ? optionContract2.change : null, (r32 & 32) != 0 ? optionContract2.premium : d10, (r32 & 64) != 0 ? optionContract2.breakEven : 0.0d, (r32 & 128) != 0 ? optionContract2.breakEvenPercentage : null, (r32 & 256) != 0 ? optionContract2.marginPrice : 0.0d, (r32 & 512) != 0 ? optionContract2.marker : false, (r32 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? optionContract2.positionItem : null);
                        Boolean bool = (Boolean) ((OptionDetailViewModel) optionDetailFragment.r()).f8604y.getValue();
                        if (bool == null) {
                            bool = Boolean.FALSE;
                        }
                        Intrinsics.c(bool);
                        boolean booleanValue = bool.booleanValue();
                        boolean z10 = ((m) optionDetailFragment.f8592g.getValue()).f18094c;
                        Intrinsics.checkNotNullParameter(optionContract, "optionContract");
                        Intrinsics.checkNotNullParameter(optionOverview, "optionOverview");
                        h10.o(new n(optionContract, optionOverview, booleanValue, z10, false));
                    }
                }
            }
        }
        return Unit.f23355a;
    }
}
