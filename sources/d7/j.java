package d7;

import android.content.Intent;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.u0;
import b5.a1;
import ba.an;
import ba.pu;
import ba.qm;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.AssetInsightData;
import com.assetgro.stockgro.data.model.BottomSheetItem;
import com.assetgro.stockgro.data.model.CountrySelectDto;
import com.assetgro.stockgro.data.model.LeaderBoardUserDto;
import com.assetgro.stockgro.data.model.OtpChannel;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.model.arenaV2.ArenaSortOptions;
import com.assetgro.stockgro.feature_arena.widget.PrepZoneWhatsNewWidget;
import com.assetgro.stockgro.feature_market.data.remote.FnoOptionDto;
import com.assetgro.stockgro.feature_market.domain.model.FnoOption;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.domain.model.StockOptionPendingDto;
import com.assetgro.stockgro.feature_market.presentation.fno.OptionPendingOrderViewModel;
import com.assetgro.stockgro.feature_market.presentation.fno.chain.OptionChainItemViewModel;
import com.assetgro.stockgro.feature_market.presentation.fno.option.MarketOptionListItemViewModel;
import com.assetgro.stockgro.feature_market.presentation.fno.order.OptionOrderPendingActivity;
import com.assetgro.stockgro.feature_market.presentation.market.asset.insights.InsightListItemViewModel;
import com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.insights.AssetInsightItemViewModel;
import com.assetgro.stockgro.feature_market.presentation.market.search.adapter.AdvancedSearchOptionsItemViewModel;
import com.assetgro.stockgro.feature_market.presentation.market.search.adapter.AdvancedSearchStocksItemViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.deletion.DeleteConfirmationActivity;
import com.assetgro.stockgro.feature_onboarding.presentation.login.mobile.CountrySelectItemViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.pin.PinLoginFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.login.pin.PinLoginViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.reset.PinUpdatedFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.login.reset.ReSetPin2Fragment;
import com.assetgro.stockgro.feature_onboarding.presentation.login.reset.ReSetPinViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.register.pin.SetPinFragment;
import com.assetgro.stockgro.missions.domain.model.UserTask;
import com.assetgro.stockgro.missions.presentation.history.MissionHistoryTaskItemViewModel;
import com.assetgro.stockgro.missions.presentation.history.MissionStatusDetailFragment;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.asset.v2.upcoming.viewmodel.ArenaUpcomingViewModel;
import com.assetgro.stockgro.ui.arena.detail.post.LeagueDetailPostJoiningActivity;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.LeagueLeaderBoardItemViewModel;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.winner.LeagueDeclaredWinnerItemViewModel;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.winner.LeagueWinnersActivity;
import com.assetgro.stockgro.ui.bottomsheet.CustomBottomSheetListItemViewModel;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailActivity;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14052a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14053b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f14052a = i10;
        this.f14053b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RotateAnimation rotateAnimation;
        String countryCode;
        OtpChannel otpChannel;
        String countryCode2;
        int i10 = this.f14052a;
        String str = null;
        Object obj = this.f14053b;
        switch (i10) {
            case 0:
                x xVar = ((k) obj).f14061h;
                a1 a1Var = xVar.f14174y0;
                if (a1Var != null && ((b5.i) a1Var).b(29)) {
                    u5.i D = ((i5.g0) xVar.f14174y0).D();
                    a1 a1Var2 = xVar.f14174y0;
                    int i11 = e5.x.f15050a;
                    D.getClass();
                    u5.h hVar = new u5.h(D);
                    hVar.a(1);
                    hVar.g(1);
                    ((i5.g0) a1Var2).Q(new u5.i(hVar));
                    xVar.f14136f.f14107e[1] = xVar.getResources().getString(R.string.exo_track_selection_auto);
                    xVar.f14146k.dismiss();
                    return;
                }
                return;
            case 1:
                q qVar = (q) obj;
                int i12 = q.f14099y;
                int d10 = qVar.d();
                x xVar2 = qVar.f14103x;
                View view2 = xVar2.f14175z;
                if (d10 == 0) {
                    view2.getClass();
                    xVar2.e(xVar2.f14138g, view2);
                    return;
                } else if (d10 == 1) {
                    view2.getClass();
                    xVar2.e(xVar2.f14142i, view2);
                    return;
                } else {
                    xVar2.f14146k.dismiss();
                    return;
                }
            case 2:
                x xVar3 = ((k) obj).f14061h;
                a1 a1Var3 = xVar3.f14174y0;
                if (a1Var3 != null && ((b5.i) a1Var3).b(29)) {
                    u5.i D2 = ((i5.g0) xVar3.f14174y0).D();
                    a1 a1Var4 = xVar3.f14174y0;
                    D2.getClass();
                    u5.h hVar2 = new u5.h(D2);
                    hVar2.a(3);
                    hVar2.f3426u = -3;
                    ((i5.g0) a1Var4).Q(new u5.i(hVar2));
                    xVar3.f14146k.dismiss();
                    return;
                }
                return;
            case 3:
                PrepZoneWhatsNewWidget this$0 = (PrepZoneWhatsNewWidget) obj;
                int i13 = PrepZoneWhatsNewWidget.f8576u;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                boolean z10 = this$0.f8577s;
                pu puVar = this$0.f8578t;
                if (z10) {
                    puVar.f5807s.setVisibility(0);
                    rotateAnimation = new RotateAnimation(s0.g.f34069a, 90.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setInterpolator(new DecelerateInterpolator());
                    rotateAnimation.setRepeatCount(0);
                    rotateAnimation.setFillAfter(true);
                    rotateAnimation.setDuration(300L);
                } else {
                    rotateAnimation = new RotateAnimation(90.0f, s0.g.f34069a, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setInterpolator(new DecelerateInterpolator());
                    rotateAnimation.setRepeatCount(0);
                    rotateAnimation.setFillAfter(true);
                    rotateAnimation.setDuration(300L);
                    puVar.f5807s.setVisibility(8);
                }
                puVar.f5809u.startAnimation(rotateAnimation);
                this$0.f8577s = !this$0.f8577s;
                return;
            case 4:
                ga.f this$02 = (ga.f) obj;
                int i14 = ga.f.f17185y;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                OptionContract optionContract = (OptionContract) ((OptionChainItemViewModel) this$02.v()).f9075c.getValue();
                if (optionContract != null) {
                    this$02.f17186x.invoke(optionContract);
                    return;
                }
                return;
            case 5:
                ja.e this$03 = (ja.e) obj;
                int i15 = ja.e.f21259y;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                FnoOption fnoOption = (FnoOption) ((MarketOptionListItemViewModel) this$03.v()).f9075c.getValue();
                if (fnoOption != null) {
                    this$03.f21260x.invoke(fnoOption);
                    return;
                }
                return;
            case 6:
                OptionOrderPendingActivity context = (OptionOrderPendingActivity) obj;
                int i16 = OptionOrderPendingActivity.f8646k;
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (!WifiService.INSTANCE.getInstance().isOnline()) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter("Not connected to internet", "text");
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c("Not connected to internet", (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                    return;
                }
                Intent intent = new Intent(context, (Class<?>) PortfolioDetailActivity.class);
                StockOptionPendingDto stockOptionPendingDto = (StockOptionPendingDto) ((OptionPendingOrderViewModel) context.x()).f8580o.getValue();
                if (stockOptionPendingDto != null) {
                    str = stockOptionPendingDto.getPortfolioId();
                }
                intent.putExtra("PORTFOLIO_ID", str);
                intent.addFlags(67108864);
                intent.addFlags(536870912);
                intent.putExtra("REFRESH", true);
                context.startActivity(intent);
                context.finish();
                return;
            case 7:
                la.d this$04 = (la.d) obj;
                int i17 = la.d.f24382h;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                return;
            case 8:
                oa.c this$05 = (oa.c) obj;
                int i18 = oa.c.f29870z;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                StockDto stockDto = (StockDto) ((InsightListItemViewModel) this$05.v()).f9075c.getValue();
                if (stockDto != null) {
                    this$05.f29872y.invoke(stockDto.getCode());
                    return;
                }
                return;
            case 9:
                pa.c this$06 = (pa.c) obj;
                int i19 = pa.c.f30804j;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                this$06.requireActivity().finish();
                return;
            case 10:
                sa.d this$07 = (sa.d) obj;
                int i20 = sa.d.B;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                AssetInsightData assetInsightData = (AssetInsightData) ((AssetInsightItemViewModel) this$07.v()).f9075c.getValue();
                if (assetInsightData != null) {
                    this$07.f34409y.invoke(assetInsightData);
                    return;
                }
                return;
            case 11:
                wa.d this$08 = (wa.d) obj;
                int i21 = wa.d.f38900y;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                FnoOptionDto fnoOptionDto = (FnoOptionDto) ((AdvancedSearchOptionsItemViewModel) this$08.v()).f9075c.getValue();
                if (fnoOptionDto != null) {
                    this$08.f38901x.invoke(fnoOptionDto);
                    return;
                }
                return;
            case 12:
                wa.i this$09 = (wa.i) obj;
                int i22 = wa.i.f38910y;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                FnoOptionDto fnoOptionDto2 = (FnoOptionDto) ((AdvancedSearchStocksItemViewModel) this$09.v()).f9075c.getValue();
                if (fnoOptionDto2 != null) {
                    this$09.f38911x.invoke(fnoOptionDto2);
                    return;
                }
                return;
            case 13:
                DeleteConfirmationActivity this$010 = (DeleteConfirmationActivity) obj;
                int i23 = DeleteConfirmationActivity.f8713k;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                this$010.startActivity(new Intent(this$010, (Class<?>) LoginActivity.class));
                return;
            case 14:
                ab.e this$011 = (ab.e) obj;
                int i24 = ab.e.f288y;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                CountrySelectDto countrySelectDto = (CountrySelectDto) ((CountrySelectItemViewModel) this$011.v()).f9075c.getValue();
                if (countrySelectDto != null) {
                    this$011.f289x.invoke(countrySelectDto);
                    return;
                }
                return;
            case 15:
                PinLoginFragment this$012 = (PinLoginFragment) obj;
                int i25 = PinLoginFragment.f8744i;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                ((PinLoginViewModel) this$012.r()).f9086i.setValue(new kj.j(new AnalyticEvent("forgot_pin", null, 2, null)));
                PinLoginViewModel pinLoginViewModel = (PinLoginViewModel) this$012.r();
                String phoneNumber = ((cb.b) this$012.f8745g.getValue()).f8078a;
                ut.g gVar = this$012.f8746h;
                CountrySelectDto countrySelectDto2 = (CountrySelectDto) ((LoginViewModel) gVar.getValue()).f8708t.getValue();
                if (countrySelectDto2 == null || (countryCode = countrySelectDto2.getCode()) == null) {
                    countryCode = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                CountrySelectDto countrySelectDto3 = (CountrySelectDto) ((LoginViewModel) gVar.getValue()).f8708t.getValue();
                if (countrySelectDto3 != null) {
                    otpChannel = countrySelectDto3.getDefaultOtpChannel();
                } else {
                    otpChannel = null;
                }
                Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                if (!WifiService.INSTANCE.getInstance().isOnline()) {
                    pinLoginViewModel.f8751r.setValue("Not connected to internet");
                    return;
                } else {
                    yk.g.H(u0.f(pinLoginViewModel), null, null, new cb.f(pinLoginViewModel, phoneNumber, countryCode, otpChannel, null), 3);
                    return;
                }
            case 16:
                PinUpdatedFragment this$013 = (PinUpdatedFragment) obj;
                int i26 = PinUpdatedFragment.f8752g;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                q6.l.h(this$013).o(new androidx.navigation.a(R.id.login));
                return;
            case 17:
                ReSetPin2Fragment this$014 = (ReSetPin2Fragment) obj;
                int i27 = ReSetPin2Fragment.f8753i;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                Editable text = ((qm) this$014.q()).f5879t.getText();
                if (text != null && !kotlin.text.w.C(text) && text.length() == 4) {
                    ReSetPinViewModel reSetPinViewModel = (ReSetPinViewModel) this$014.r();
                    androidx.navigation.i iVar = this$014.f8754g;
                    String phoneNumber2 = ((db.b) iVar.getValue()).f14283a;
                    String pin = text.toString();
                    String otp = ((db.b) iVar.getValue()).f14284b;
                    String sessionId = ((db.b) iVar.getValue()).f14285c;
                    CountrySelectDto countrySelectDto4 = (CountrySelectDto) ((LoginViewModel) this$014.f8755h.getValue()).f8708t.getValue();
                    if (countrySelectDto4 == null || (countryCode2 = countrySelectDto4.getCode()) == null) {
                        countryCode2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    Intrinsics.checkNotNullParameter(phoneNumber2, "phoneNumber");
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    Intrinsics.checkNotNullParameter(otp, "otp");
                    Intrinsics.checkNotNullParameter(sessionId, "sessionId");
                    Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                    reSetPinViewModel.f9084g.setValue(Boolean.TRUE);
                    yk.g.H(u0.f(reSetPinViewModel), null, null, new db.c(reSetPinViewModel, phoneNumber2, pin, otp, sessionId, countryCode2, null), 3);
                    return;
                }
                return;
            case 18:
                SetPinFragment this$015 = (SetPinFragment) obj;
                int i28 = SetPinFragment.f8787h;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                String valueOf = String.valueOf(((an) this$015.q()).f4212t.getText());
                if ((!kotlin.text.w.C(valueOf)) && valueOf.length() == 4) {
                    androidx.navigation.i iVar2 = this$015.f8788g;
                    String phoneNumber3 = ((fb.b) iVar2.getValue()).f15992a;
                    String pin2 = String.valueOf(((an) this$015.q()).f4212t.getText());
                    String invitationCode = ((fb.b) iVar2.getValue()).f15993b;
                    String sessionId2 = ((fb.b) iVar2.getValue()).f15994c;
                    String otp2 = ((fb.b) iVar2.getValue()).f15995d;
                    boolean z11 = ((fb.b) iVar2.getValue()).f15996e;
                    Intrinsics.checkNotNullParameter(phoneNumber3, "phoneNumber");
                    Intrinsics.checkNotNullParameter(invitationCode, "invitationCode");
                    Intrinsics.checkNotNullParameter(pin2, "pin");
                    Intrinsics.checkNotNullParameter(sessionId2, "sessionId");
                    Intrinsics.checkNotNullParameter(otp2, "otp");
                    fb.c cVar = new fb.c(phoneNumber3, invitationCode, pin2, sessionId2, otp2, z11);
                    this$015.x(new AnalyticEvent("app_mpin_submitted", new HashMap()));
                    this$015.A(new AnalyticEvent("app_mpin_submitted", new HashMap()));
                    q6.l.h(this$015).o(cVar);
                    return;
                }
                return;
            case 19:
                gc.f this$016 = (gc.f) obj;
                int i29 = gc.f.f17226y;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                UserTask userTask = (UserTask) ((MissionHistoryTaskItemViewModel) this$016.v()).f9075c.getValue();
                if (userTask != null) {
                    this$016.f17227x.invoke(userTask);
                    return;
                }
                return;
            case 20:
                MissionStatusDetailFragment this$017 = (MissionStatusDetailFragment) obj;
                int i30 = MissionStatusDetailFragment.f8887j;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                q6.l.h(this$017).q();
                return;
            case 21:
                rc.l this$018 = (rc.l) obj;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                sc.i iVar3 = (sc.i) this$018.f33601j;
                iVar3.getClass();
                AnalyticEvent analyticEvent = new AnalyticEvent("app_arena_upcoming_sort", null, 2, null);
                iVar3.z(analyticEvent);
                iVar3.B(analyticEvent);
                ArenaSortOptions listOfOptions = ((ArenaUpcomingViewModel) iVar3.r()).f8958o;
                if (listOfOptions != null) {
                    String str2 = sc.k.f34569j;
                    Intrinsics.checkNotNullParameter(listOfOptions, "listOfOptions");
                    String assetClass = iVar3.f34566i;
                    Intrinsics.checkNotNullParameter(assetClass, "assetClass");
                    sc.k kVar = new sc.k();
                    kVar.setArguments(hl.f.y(new Pair("LIST_OF_OPTIONS", listOfOptions), new Pair("ASSET_CLASS_TYPE", assetClass)));
                    kVar.show(iVar3.getChildFragmentManager(), "SortByBottomSheetDialogFragment");
                    return;
                }
                return;
            case 22:
                sc.i this$019 = (sc.i) obj;
                boolean z12 = sc.i.f34563j;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                this$019.y(new AnalyticEvent("app_arena_upcoming_empty_state_cta", vt.p0.f(new Pair("cta_label", this$019.getString(R.string.go_to_portfolio)), new Pair("cta_redirection", "portfolio_analytics"))));
                kj.f.k(this$019, "app.stockgro://stockgro.com/portfolio");
                return;
            case 23:
                LeagueDetailPostJoiningActivity this$020 = (LeagueDetailPostJoiningActivity) obj;
                int i31 = LeagueDetailPostJoiningActivity.f8982n;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                this$020.onBackPressed();
                return;
            case 24:
                zc.k this$021 = (zc.k) obj;
                int i32 = zc.k.f42393y;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                LeaderBoardUserDto leaderBoardUserDto = (LeaderBoardUserDto) ((LeagueLeaderBoardItemViewModel) this$021.v()).f9075c.getValue();
                if (leaderBoardUserDto != null) {
                    this$021.f42394x.invoke(leaderBoardUserDto);
                    return;
                }
                return;
            case 25:
                ad.d this$022 = (ad.d) obj;
                int i33 = ad.d.f357z;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                Function1 function1 = this$022.f359y;
                Object value = ((LeagueDeclaredWinnerItemViewModel) this$022.v()).f9075c.getValue();
                Intrinsics.c(value);
                function1.invoke(value);
                return;
            case 26:
                LeagueWinnersActivity this$023 = (LeagueWinnersActivity) obj;
                int i34 = LeagueWinnersActivity.f9043l;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                this$023.onBackPressed();
                return;
            case 27:
                ad.h this$024 = (ad.h) obj;
                int i35 = ad.h.f370i;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                this$024.dismiss();
                return;
            case 28:
                ad.i this$025 = (ad.i) obj;
                int i36 = ad.i.f371c;
                Intrinsics.checkNotNullParameter(this$025, "this$0");
                this$025.dismiss();
                return;
            default:
                hd.c this$026 = (hd.c) obj;
                int i37 = hd.c.f18290y;
                Intrinsics.checkNotNullParameter(this$026, "this$0");
                Object value2 = ((CustomBottomSheetListItemViewModel) this$026.v()).f9075c.getValue();
                Intrinsics.c(value2);
                this$026.f18291x.invoke((BottomSheetItem) value2);
                return;
        }
    }
}
