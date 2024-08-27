package nf;

import android.content.Intent;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.missions.presentation.MissionsHostActivity;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.drawer.about.AppAboutSectionActivity;
import com.assetgro.stockgro.ui.drawer.championsChart.ChampionsChartActivity;
import com.assetgro.stockgro.ui.drawer.faq.FaqActivity;
import com.assetgro.stockgro.ui.drawer.invite.InviteActivity;
import com.assetgro.stockgro.ui.drawer.rate.RateAppActivity;
import com.assetgro.stockgro.ui.drawer.stockgyan.StockGyanGroupsActivity;
import com.assetgro.stockgro.ui.drawer.tutorials.TutorialsActivity;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.assetgro.stockgro.ui.main.MainViewModel;
import com.assetgro.stockgro.ui.payments.home.WalletHomeActivity;
import com.assetgro.stockgro.ui.payments.withdrawal.DefaultWebViewActivity;
import com.assetgro.stockgro.ui.profile.self.MyProfileActivity;
import com.assetgro.stockgro.ui.subscription.ManageSubscriptionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f28638b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(MainActivity mainActivity, int i10) {
        super(0);
        this.f28637a = i10;
        this.f28638b = mainActivity;
    }

    public final void a() {
        Class cls;
        int i10 = this.f28637a;
        MainActivity mainActivity = this.f28638b;
        switch (i10) {
            case 0:
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) AppAboutSectionActivity.class));
                return;
            case 1:
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) ChampionsChartActivity.class));
                return;
            case 2:
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) FaqActivity.class));
                return;
            case 3:
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) InviteActivity.class));
                return;
            case 4:
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) ManageSubscriptionActivity.class));
                return;
            case 5:
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) MissionsHostActivity.class));
                return;
            case 6:
                if (((MainViewModel) mainActivity.x()).f9081d.isExpertUser()) {
                    cls = RiaProfileActivity.class;
                } else {
                    cls = MyProfileActivity.class;
                }
                Intent intent = new Intent(mainActivity, (Class<?>) cls);
                intent.putExtra("USER_IDENTIFIER", ((MainViewModel) mainActivity.x()).f9081d.getUuid());
                mainActivity.startActivity(intent);
                return;
            case 7:
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) RateAppActivity.class));
                return;
            case 8:
                Intent intent2 = new Intent(mainActivity, (Class<?>) DefaultWebViewActivity.class);
                intent2.putExtra("WEB_URL", "https://shop.stockgro.club/");
                intent2.putExtra("TOOLBAR_TITLE", mainActivity.getString(R.string.shop));
                mainActivity.startActivity(intent2);
                return;
            case 9:
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) StockGyanGroupsActivity.class));
                return;
            case 10:
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) TutorialsActivity.class));
                return;
            default:
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) WalletHomeActivity.class));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f28637a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            case 2:
                a();
                return Unit.f23355a;
            case 3:
                a();
                return Unit.f23355a;
            case 4:
                a();
                return Unit.f23355a;
            case 5:
                a();
                return Unit.f23355a;
            case 6:
                a();
                return Unit.f23355a;
            case 7:
                a();
                return Unit.f23355a;
            case 8:
                a();
                return Unit.f23355a;
            case 9:
                a();
                return Unit.f23355a;
            case 10:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
