package p004if;

import ah.d;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.e0;
import androidx.lifecycle.t;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.NotificationDto;
import com.assetgro.stockgro.data.model.ShowInfoData;
import com.assetgro.stockgro.data.model.StockGyanIndex;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.remote.response.ExpiryOption;
import com.assetgro.stockgro.data.remote.response.UnlockPortfolioData;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.drawer.stockgyan.StockGyanGroupsActivity;
import com.assetgro.stockgro.ui.home.portfolio.list.TopPortfolioItemViewModel;
import com.assetgro.stockgro.ui.home.portfolio.list.TopPortfolioListActivity;
import com.assetgro.stockgro.ui.home.stockgyan.index.StockGyanIndexItemViewModel;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.assetgro.stockgro.ui.maintenance.MaintenanceWindowActivity;
import com.assetgro.stockgro.ui.notifications.NotificationItemViewModel;
import com.assetgro.stockgro.ui.notifications.NotificationsActivity;
import com.assetgro.stockgro.ui.payments.WithdrawableLimitActivity;
import com.assetgro.stockgro.ui.payments.home.WalletHomeActivity;
import com.assetgro.stockgro.ui.payments.home.WalletHomeViewModel;
import com.assetgro.stockgro.ui.payments.kyc.KycCompletedFragment;
import com.assetgro.stockgro.ui.payments.kyc.KycFAQFragment;
import com.assetgro.stockgro.ui.payments.kyc.KycFAQViewModel;
import com.assetgro.stockgro.ui.payments.kyc.KycHostActivity;
import com.assetgro.stockgro.ui.payments.kyc.KycMaintenanceFragment;
import com.assetgro.stockgro.ui.payments.kyc.KycPermissionFragment;
import com.assetgro.stockgro.ui.payments.kyc.KycQuerySubmittedFragment;
import com.assetgro.stockgro.ui.payments.withdrawal.DefaultWebViewActivity;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailActivity;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import com.assetgro.stockgro.ui.portfolio.unlock.expiry_option.UnlockPortfolioExpiryOptionItemViewModel;
import com.assetgro.stockgro.ui.portfolio.unlock.list.UnlockPortfolioItemViewModel;
import com.assetgro.stockgro.ui.portfolio.unlock.list.UnlockPortfolioListFragment;
import com.assetgro.stockgro.ui.profile.followers.FollowerFollowingActivity;
import com.assetgro.stockgro.ui.profile.portfolio.LeaguePortfolioHoldingActivity;
import com.assetgro.stockgro.ui.profile.report.ReportEntityActivity;
import com.assetgro.stockgro.ui.profile.self.EditProfileActivity;
import com.assetgro.stockgro.ui.profile.self.MyProfileActivity;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import com.assetgro.stockgro.ui.redemption.home.RedemptionHostActivity;
import el.l;
import hl.f;
import java.util.ArrayList;
import kf.b;
import kh.a0;
import kh.o;
import kh.p;
import kh.y;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.i0;
import m0.o0;
import okhttp3.HttpUrl;
import r3.k;
import tf.a;
import xf.j;
import yf.e;
import yk.g;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19953a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f19954b;

    public /* synthetic */ c(t tVar, int i10) {
        this.f19953a = i10;
        this.f19954b = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArenaGame arenaGame;
        int i10 = this.f19953a;
        t tVar = this.f19954b;
        switch (i10) {
            case 0:
                e this$0 = (e) tVar;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1 function1 = this$0.f19957x;
                Object value = ((TopPortfolioItemViewModel) this$0.v()).f9075c.getValue();
                Intrinsics.c(value);
                function1.invoke(value);
                return;
            case 1:
                TopPortfolioListActivity this$02 = (TopPortfolioListActivity) tVar;
                int i11 = TopPortfolioListActivity.f9561l;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                this$02.onBackPressed();
                return;
            case 2:
                b this$03 = (b) tVar;
                int i12 = b.f23091y;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                StockGyanIndex stockGyanIndex = (StockGyanIndex) ((StockGyanIndexItemViewModel) this$03.v()).f9075c.getValue();
                if (stockGyanIndex != null) {
                    this$03.f23092x.invoke(stockGyanIndex);
                    return;
                }
                return;
            case 3:
                qf.c this$04 = (qf.c) tVar;
                int i13 = qf.c.f31944h;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                MainSharedViewModel mainSharedViewModel = this$04.f31945g;
                if (mainSharedViewModel != null) {
                    mainSharedViewModel.f9587r.postValue(Boolean.TRUE);
                    return;
                } else {
                    Intrinsics.k("mainSharedViewModel");
                    throw null;
                }
            case 4:
                MaintenanceWindowActivity this$05 = (MaintenanceWindowActivity) tVar;
                int i14 = MaintenanceWindowActivity.f9611k;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                this$05.onBackPressed();
                return;
            case 5:
                rf.c this$06 = (rf.c) tVar;
                int i15 = rf.c.f33690y;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                NotificationDto notificationDto = (NotificationDto) ((NotificationItemViewModel) this$06.v()).f9075c.getValue();
                if (notificationDto != null) {
                    this$06.f33691x.invoke(notificationDto);
                    return;
                }
                return;
            case 6:
                NotificationsActivity this$07 = (NotificationsActivity) tVar;
                int i16 = NotificationsActivity.f9619m;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                this$07.onBackPressed();
                return;
            case 7:
                a this$08 = (a) tVar;
                int i17 = a.f36006c;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                this$08.dismiss();
                this$08.startActivity(new Intent(this$08.requireContext(), (Class<?>) WithdrawableLimitActivity.class));
                return;
            case 8:
                wf.a this$09 = (wf.a) tVar;
                int i18 = wf.a.f39037c;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                this$09.dismiss();
                return;
            case 9:
                KycCompletedFragment this$010 = (KycCompletedFragment) tVar;
                int i19 = KycCompletedFragment.f9661h;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                this$010.requireActivity().finish();
                return;
            case 10:
                KycFAQFragment this$011 = (KycFAQFragment) tVar;
                int i20 = KycFAQFragment.f9663h;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                KycFAQViewModel kycFAQViewModel = (KycFAQViewModel) this$011.r();
                kycFAQViewModel.f9084g.postValue(Boolean.TRUE);
                g.H(u0.f(kycFAQViewModel), null, null, new j(kycFAQViewModel, null), 3);
                return;
            case 11:
                KycHostActivity this$012 = (KycHostActivity) tVar;
                int i21 = KycHostActivity.f9673m;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                this$012.onBackPressed();
                return;
            case 12:
                KycMaintenanceFragment this$013 = (KycMaintenanceFragment) tVar;
                int i22 = KycMaintenanceFragment.f9686g;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                this$013.A(new AnalyticEvent("app_redirect_kycmaint_to_gyaan", null, 2, null));
                this$013.z(new AnalyticEvent("app_redirect_kycmaint_to_gyaan", null, 2, null));
                this$013.startActivity(new Intent(this$013.requireActivity(), (Class<?>) StockGyanGroupsActivity.class));
                this$013.requireActivity().finish();
                return;
            case 13:
                KycPermissionFragment this$014 = (KycPermissionFragment) tVar;
                int i23 = KycPermissionFragment.f9687h;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                this$014.getClass();
                ArrayList arrayList = new ArrayList();
                if (k.checkSelfPermission(this$014.requireContext(), "android.permission.CAMERA") != 0) {
                    arrayList.add("android.permission.CAMERA");
                    arrayList.add("android.permission.RECORD_AUDIO");
                    arrayList.add("android.permission.ACCESS_FINE_LOCATION");
                }
                if (k.checkSelfPermission(this$014.requireActivity(), "android.permission.CAMERA") == 0) {
                    this$014.H();
                    return;
                }
                if (this$014.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                    int i24 = e.f41618i;
                    Bundle bundle = new Bundle();
                    e eVar = new e();
                    eVar.setArguments(bundle);
                    eVar.show(this$014.getChildFragmentManager(), "KycPermissionBottomSheetDialogFragment");
                    return;
                }
                this$014.requestPermissions((String[]) arrayList.toArray(new String[0]), 112);
                return;
            case 14:
                KycQuerySubmittedFragment this$015 = (KycQuerySubmittedFragment) tVar;
                int i25 = KycQuerySubmittedFragment.f9689h;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                this$015.startActivity(new Intent(this$015.requireActivity(), (Class<?>) WalletHomeActivity.class));
                this$015.requireActivity().finish();
                return;
            case 15:
                yf.c this$016 = (yf.c) tVar;
                int i26 = yf.c.f41615j;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                ((WalletHomeViewModel) this$016.f41616i.getValue()).i();
                this$016.dismiss();
                return;
            case 16:
                e this$017 = (e) tVar;
                int i27 = e.f41618i;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", this$017.requireActivity().getPackageName(), null));
                this$017.startActivity(intent);
                this$017.dismiss();
                return;
            case 17:
                DefaultWebViewActivity this$018 = (DefaultWebViewActivity) tVar;
                int i28 = DefaultWebViewActivity.f9735l;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                this$018.f9736k.handleOnBackPressed();
                return;
            case 18:
                PortfolioDetailActivity this$019 = (PortfolioDetailActivity) tVar;
                int i29 = PortfolioDetailActivity.f9774m;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                PortfolioDetailViewModel portfolioDetailViewModel = (PortfolioDetailViewModel) this$019.x();
                Portfolio portfolio = (Portfolio) portfolioDetailViewModel.I.getValue();
                if (portfolio != null) {
                    e0 e0Var = portfolioDetailViewModel.R;
                    String assetClass = portfolio.getAssetClass();
                    if (assetClass == null) {
                        assetClass = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    e0Var.setValue(assetClass);
                    if (portfolio.isPortfolioLinkedToPrepZone() && (arenaGame = (ArenaGame) portfolioDetailViewModel.B.getValue()) != null) {
                        l.o0(arenaGame);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                zg.c this$020 = (zg.c) tVar;
                int i30 = zg.c.f42447y;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                ExpiryOption expiryOption = (ExpiryOption) ((UnlockPortfolioExpiryOptionItemViewModel) this$020.v()).f9075c.getValue();
                if (expiryOption != null) {
                    expiryOption.setSelected(true);
                    this$020.f42448x.invoke(expiryOption);
                    return;
                }
                return;
            case 20:
                d this$021 = (d) tVar;
                int i31 = d.f424z;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                UnlockPortfolioData unlockPortfolioData = (UnlockPortfolioData) ((UnlockPortfolioItemViewModel) this$021.v()).f9075c.getValue();
                if (unlockPortfolioData != null) {
                    this$021.f425x.invoke(unlockPortfolioData);
                    return;
                }
                return;
            case 21:
                UnlockPortfolioListFragment this$022 = (UnlockPortfolioListFragment) tVar;
                int i32 = UnlockPortfolioListFragment.f9968h;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                this$022.requireActivity().finish();
                return;
            case 22:
                bh.c this$023 = (bh.c) tVar;
                int i33 = bh.c.f6974g;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                int i34 = i0.f24733j;
                kq.e.L(new ShowInfoData(this$023.getString(R.string.what_is_modeled_data_question), this$023.getString(R.string.what_is_modeled_data_answer), this$023.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$023.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                return;
            case 23:
                FollowerFollowingActivity this$024 = (FollowerFollowingActivity) tVar;
                int i35 = FollowerFollowingActivity.f9977n;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                this$024.finish();
                return;
            case 24:
                fh.b this$025 = (fh.b) tVar;
                int i36 = fh.b.f16100j;
                Intrinsics.checkNotNullParameter(this$025, "this$0");
                Intent intent2 = new Intent(this$025.getContext(), (Class<?>) MainActivity.class);
                intent2.putExtra("is_deep_link_flag", true);
                intent2.putExtra("path", "social");
                this$025.startActivity(intent2);
                return;
            case 25:
                LeaguePortfolioHoldingActivity this$026 = (LeaguePortfolioHoldingActivity) tVar;
                int i37 = LeaguePortfolioHoldingActivity.f9988m;
                Intrinsics.checkNotNullParameter(this$026, "this$0");
                this$026.onBackPressed();
                return;
            case 26:
                ReportEntityActivity this$027 = (ReportEntityActivity) tVar;
                int i38 = ReportEntityActivity.f10008l;
                Intrinsics.checkNotNullParameter(this$027, "this$0");
                this$027.onBackPressed();
                return;
            case 27:
                MyProfileActivity this$028 = (MyProfileActivity) tVar;
                int i39 = MyProfileActivity.f10050k;
                Intrinsics.checkNotNullParameter(this$028, "this$0");
                this$028.onBackPressed();
                return;
            case 28:
                y this$029 = (y) tVar;
                int i40 = y.f23187n;
                Intrinsics.checkNotNullParameter(this$029, "this$0");
                yk.j jVar = this$029.f23191j;
                if (Intrinsics.a(jVar, p.f23164a)) {
                    Intent intent3 = new Intent(this$029.requireContext(), (Class<?>) EditProfileActivity.class);
                    intent3.putExtra("BIO_VALUE", this$029.f23189h);
                    this$029.f23192k.a(intent3);
                    return;
                }
                if (Intrinsics.a(jVar, p.f23165b)) {
                    UserStatisticsViewModel userStatisticsViewModel = (UserStatisticsViewModel) this$029.r();
                    String userId = ((UserStatisticsViewModel) this$029.r()).f10054q;
                    Intrinsics.checkNotNullParameter(userId, "userId");
                    if (!WifiService.INSTANCE.getInstance().isOnline()) {
                        userStatisticsViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
                        return;
                    } else {
                        userStatisticsViewModel.f10057t.postValue(Boolean.TRUE);
                        g.H(u0.f(userStatisticsViewModel), null, null, new a0(userStatisticsViewModel, userId, null), 3);
                        return;
                    }
                }
                if (Intrinsics.a(jVar, p.f23166c)) {
                    String userName = this$029.f23188g;
                    if (userName != null) {
                        Intrinsics.checkNotNullParameter(userName, "userName");
                        o oVar = new o();
                        oVar.setArguments(f.y(new Pair("USER_NAME", userName)));
                        oVar.show(this$029.getChildFragmentManager(), "UnfollowBottomSheetFragment");
                        return;
                    }
                    Intrinsics.k("userName");
                    throw null;
                }
                if (Intrinsics.a(jVar, p.f23167d)) {
                    View findViewById = this$029.requireActivity().findViewById(android.R.id.content);
                    Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup = (ViewGroup) findViewById;
                    Context context = viewGroup.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    ComposeView composeView = new ComposeView(context, null, 6);
                    o0 o0Var = new o0(18, composeView, this$029, viewGroup);
                    Object obj = b1.d.f3079a;
                    composeView.setContent(new b1.c(o0Var, true, -441603916));
                    viewGroup.addView(composeView);
                    return;
                }
                return;
            default:
                RedemptionHostActivity this$030 = (RedemptionHostActivity) tVar;
                int i41 = RedemptionHostActivity.f10080k;
                Intrinsics.checkNotNullParameter(this$030, "this$0");
                this$030.finish();
                return;
        }
    }
}
