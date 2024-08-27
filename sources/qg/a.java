package qg;

import android.content.Intent;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import ba.ah;
import ba.b9;
import ba.bc;
import ba.gd;
import ba.h3;
import ba.hg;
import ba.id;
import ba.lc;
import ba.r9;
import ba.w2;
import ba.w7;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.BottomSheetItem;
import com.assetgro.stockgro.data.model.RedemptionOffer;
import com.assetgro.stockgro.data.model.SubscriptionPackages;
import com.assetgro.stockgro.data.model.UserFollowerFollowing;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.assetgro.stockgro.data.model.socialgroups.Admin;
import com.assetgro.stockgro.data.model.socialgroups.SocialGroupsItem;
import com.assetgro.stockgro.data.remote.response.BulletInDto;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.maintenance.MaintenanceWindowActivity;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioHoldingsViewModel;
import com.assetgro.stockgro.ui.portfolio.orders.OrderItemViewModel;
import com.assetgro.stockgro.ui.profile.self.EditProfileViewModel;
import com.assetgro.stockgro.ui.redemption.home.RedemptionHostActivity;
import com.assetgro.stockgro.ui.redemption.offers.tnc.OfferTNCActivity;
import com.assetgro.stockgro.ui.social.auth.SocialActivityViewModel;
import com.assetgro.stockgro.ui.social.auth.util.linkedin.helpers.LinkedInAuthenticationActivity;
import com.assetgro.stockgro.ui.stock.list.StockListHostActivity;
import com.assetgro.stockgro.ui.stock.list.StockListViewModel;
import com.assetgro.stockgro.ui.stock.modify.common.ModifyTransactionPendingFragment;
import com.assetgro.stockgro.ui.stock.modify.common.ModifyTransactionPendingViewModel;
import com.assetgro.stockgro.ui.stock.search.MarketAssetSearchActivity;
import com.assetgro.stockgro.ui.stock.v2.presentation.overview.StockOverviewSectionItemViewModel;
import com.assetgro.stockgro.ui.subscription.ManageSubscriptionActivity;
import com.assetgro.stockgro.ui.subscription.ManageSubscriptionViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import ek.u;
import fh.i;
import hk.w;
import iu.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import m4.m;
import ni.s;
import ph.e;
import vt.d0;
import xj.h;
import yk.g;
import zi.f;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31949b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i10) {
        super(1);
        this.f31948a = i10;
        this.f31949b = obj;
    }

    public final void a(Boolean bool) {
        int i10 = this.f31948a;
        Object obj = this.f31949b;
        switch (i10) {
            case 3:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((hg) ((wg.b) obj).r()).f4937t.setVisibility(0);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((hg) ((wg.b) obj).r()).f4937t.setVisibility(8);
                        return;
                    }
                    return;
                }
            default:
                ((MarketAssetSearchActivity) obj).K();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(String id2) {
        int i10 = this.f31948a;
        int i11 = 0;
        Object obj = this.f31949b;
        switch (i10) {
            case 10:
                ImageView imageView = ((bc) ((e) obj).f17291u).f4283s;
                nk.a t10 = new nk.a().t(new h(new Object(), new w(24)), true);
                Intrinsics.checkNotNullExpressionValue(t10, "transforms(...)");
                com.bumptech.glide.b.f(imageView).m(id2).w((nk.e) t10).z(imageView);
                return;
            case 11:
            default:
                bi.c cVar = (bi.c) obj;
                ImageView imageView2 = ((w7) cVar.f17291u).f6512v;
                if (Intrinsics.a(id2, cVar.f6983x)) {
                    i11 = 8;
                }
                imageView2.setVisibility(i11);
                return;
            case 12:
                Intrinsics.checkNotNullParameter(id2, "id");
                ((MissionsHomeViewModel) obj).j(new uh.e(id2));
                return;
        }
    }

    public final void e(j jVar) {
        int i10 = this.f31948a;
        Object obj = this.f31949b;
        switch (i10) {
            case 16:
                Boolean bool = (Boolean) jVar.a();
                if (bool != null) {
                    StockListHostActivity stockListHostActivity = (StockListHostActivity) obj;
                    if (bool.booleanValue()) {
                        int i11 = StockListHostActivity.f10250k;
                        stockListHostActivity.getClass();
                        Intent intent = new Intent(stockListHostActivity, (Class<?>) MaintenanceWindowActivity.class);
                        intent.putExtra("DATA", qf.b.f31939n);
                        intent.putExtra("SHOW_TOOLBAR", true);
                        intent.putExtra("TOOLBAR_TITLE", stockListHostActivity.getString(R.string.stocks));
                        stockListHostActivity.startActivity(intent);
                        stockListHostActivity.finish();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                if (((Unit) jVar.a()) != null) {
                    ManageSubscriptionActivity manageSubscriptionActivity = (ManageSubscriptionActivity) obj;
                    int i12 = ManageSubscriptionActivity.f10494k;
                    manageSubscriptionActivity.getClass();
                    Intent intent2 = new Intent(manageSubscriptionActivity, (Class<?>) MaintenanceWindowActivity.class);
                    intent2.putExtra("DATA", qf.b.f31937l);
                    intent2.putExtra("SHOW_TOOLBAR", true);
                    intent2.putExtra("TOOLBAR_TITLE", manageSubscriptionActivity.getString(R.string.stockgro_plus));
                    manageSubscriptionActivity.startActivity(intent2);
                    manageSubscriptionActivity.finish();
                    return;
                }
                return;
            default:
                if (jVar != null && ((Unit) jVar.a()) != null) {
                    ((ManageSubscriptionViewModel) obj).h();
                    return;
                }
                return;
        }
    }

    public final void f(s stockSortItem) {
        int i10;
        int i11 = this.f31948a;
        Object obj = this.f31949b;
        switch (i11) {
            case 19:
                Intrinsics.checkNotNullParameter(stockSortItem, "sortOption");
                yi.b bVar = (yi.b) obj;
                int i12 = yi.b.f41644k;
                StockListViewModel stockListViewModel = (StockListViewModel) bVar.f41646j.getValue();
                stockListViewModel.getClass();
                Intrinsics.checkNotNullParameter(stockSortItem, "stockSortItem");
                stockListViewModel.B = stockSortItem;
                stockListViewModel.f10260u = 1;
                stockListViewModel.f10261v = 1;
                stockListViewModel.f10258s.clear();
                stockListViewModel.i();
                bVar.dismiss();
                return;
            default:
                yi.c cVar = (yi.c) obj;
                ((gd) cVar.f17291u).f4797t.setText(stockSortItem.f28764c);
                ImageView imageView = ((gd) cVar.f17291u).f4796s;
                if (stockSortItem.f28765d) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Admin admin;
        String displayName;
        List list;
        int i10 = this.f31948a;
        int i11 = 1;
        Object obj2 = this.f31949b;
        switch (i10) {
            case 0:
                pg.c it = (pg.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                b bVar = (b) obj2;
                ((PortfolioFnoHoldingsViewModel) bVar.f31951i.getValue()).f9829r.setValue(it);
                bVar.dismiss();
                return Unit.f23355a;
            case 1:
                BottomSheetItem bottomSheetItem = (BottomSheetItem) obj;
                Intrinsics.checkNotNullParameter(bottomSheetItem, "sortOption");
                c cVar = (c) obj2;
                int i12 = c.f31952k;
                PortfolioHoldingsViewModel portfolioHoldingsViewModel = (PortfolioHoldingsViewModel) cVar.f31954j.getValue();
                String str = ((PortfolioHoldingsViewModel) cVar.f31954j.getValue()).f9839s;
                portfolioHoldingsViewModel.getClass();
                Intrinsics.checkNotNullParameter(bottomSheetItem, "bottomSheetItem");
                portfolioHoldingsViewModel.f9841u = bottomSheetItem;
                if (!WifiService.INSTANCE.getInstance().isOnline()) {
                    portfolioHoldingsViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
                } else if (str != null && str.length() != 0) {
                    portfolioHoldingsViewModel.f9084g.postValue(Boolean.TRUE);
                    try {
                        g.H(u0.f(portfolioHoldingsViewModel), null, null, new og.g(portfolioHoldingsViewModel, str, null), 3);
                    } catch (Exception e10) {
                        portfolioHoldingsViewModel.f9082e.postValue(ni.j.i(Integer.valueOf(R.string.error_stock_list)));
                        e10.printStackTrace();
                    }
                } else {
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    Intrinsics.checkNotNullParameter("portfolio Id not received in PortfolioHoldingsViewModel::getUnifiedLeaguePortfolioData", "message");
                    firebaseCrashlytics.recordException(new Exception("portfolio Id not received in PortfolioHoldingsViewModel::getUnifiedLeaguePortfolioData"));
                    Object[] objArr = new Object[0];
                    Intrinsics.checkNotNullParameter("PortfolioHoldingsViewModel", "tag");
                    com.google.android.gms.internal.p002firebaseauthapi.a.g("portfolio Id not received in PortfolioHoldingsViewModel::getUnifiedLeaguePortfolioData", "s", objArr, "params", "PortfolioHoldingsViewModel").getClass();
                    u.k(objArr);
                }
                cVar.dismiss();
                return Unit.f23355a;
            case 2:
                OrderItemViewModel orderItemViewModel = (OrderItemViewModel) obj2;
                int i13 = orderItemViewModel.f9890h;
                e0 e0Var = orderItemViewModel.f9891i;
                if (i13 == 3) {
                    e0Var.postValue(Boolean.FALSE);
                } else if (i13 == 1) {
                    e0Var.postValue(Boolean.TRUE);
                }
                int i14 = orderItemViewModel.f9890h + 1;
                orderItemViewModel.f9890h = i14;
                if (i14 == 4) {
                    orderItemViewModel.f9890h = 1;
                }
                return Unit.f23355a;
            case 3:
                a((Boolean) obj);
                return Unit.f23355a;
            case 4:
                Portfolio portfolio = (Portfolio) obj;
                switch (i10) {
                    case 4:
                        int i15 = bh.e.f6976g;
                        ((bh.e) obj2).H(portfolio);
                        break;
                    default:
                        ((ModifyTransactionPendingViewModel) ((ModifyTransactionPendingFragment) obj2).r()).f10311n.postValue(portfolio);
                        break;
                }
                return Unit.f23355a;
            case 5:
                UserFollowerFollowing userFollowerFollowing = (UserFollowerFollowing) obj;
                ch.b bVar2 = (ch.b) obj2;
                ((b9) bVar2.f17291u).f4272u.setText(userFollowerFollowing.getDisplayName());
                String username = userFollowerFollowing.getUsername();
                m mVar = bVar2.f17291u;
                if (username != null) {
                    ((b9) mVar).f4271t.setText("@".concat(username));
                }
                bb.a aVar = new bb.a(18, bVar2, userFollowerFollowing);
                View view = bVar2.f22629a;
                view.setOnClickListener(aVar);
                ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.e(view.getContext()).m(userFollowerFollowing.getUserImageUrl()).b()).l(R.drawable.ic_placeholder_user)).z(((b9) mVar).f4270s);
                return Unit.f23355a;
            case 6:
                View View = (View) obj;
                Intrinsics.checkNotNullParameter(View, "View");
                ah ahVar = (ah) obj2;
                ahVar.f4202t.setText(ahVar.f4201s.getTextInput(), TextView.BufferType.EDITABLE);
                return Unit.f23355a;
            case 7:
                SocialGroupsItem socialGroupsItem = (SocialGroupsItem) obj;
                i iVar = (i) obj2;
                ((lc) iVar.f17291u).f5353u.setText(socialGroupsItem.getGroupInfo().getName());
                List<Admin> admins = socialGroupsItem.getGroupInfo().getAdmins();
                m mVar2 = iVar.f17291u;
                if (admins != null && (admin = admins.get(0)) != null && (displayName = admin.getDisplayName()) != null) {
                    ((lc) mVar2).f5352t.setText("by ".concat(displayName));
                    r7 = Unit.f23355a;
                }
                if (r7 == null) {
                    ((lc) mVar2).f5352t.setText("by Member");
                }
                bb.a aVar2 = new bb.a(19, iVar, socialGroupsItem);
                View view2 = iVar.f22629a;
                view2.setOnClickListener(aVar2);
                ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.e(view2.getContext()).m(socialGroupsItem.getGroupInfo().getImageUrl()).b()).l(R.drawable.ic_placeholder_user)).z(((lc) mVar2).f5351s);
                return Unit.f23355a;
            case 8:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 9:
                Integer num = (Integer) obj;
                h3 h3Var = (h3) ((RedemptionHostActivity) obj2).w();
                Intrinsics.c(num);
                h3Var.f4889u.setCurrentItem(num.intValue());
                return Unit.f23355a;
            case 10:
                d((String) obj);
                return Unit.f23355a;
            case 11:
                OfferTNCActivity offerTNCActivity = (OfferTNCActivity) obj2;
                ArrayList<String> tnc = ((RedemptionOffer) obj).getTnc();
                int i16 = OfferTNCActivity.f10096k;
                if (tnc != null) {
                    ((w2) offerTNCActivity.w()).f6501s.setVisibility(0);
                    int i17 = 0;
                    for (String str2 : tnc) {
                        i17++;
                        LayoutInflater layoutInflater = offerTNCActivity.getLayoutInflater();
                        int i18 = r9.f5940u;
                        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
                        r9 r9Var = (r9) m.g(layoutInflater, R.layout.cell_league_rule, null, false, null);
                        Intrinsics.checkNotNullExpressionValue(r9Var, "inflate(...)");
                        r9Var.f5941s.setText(String.valueOf(i17));
                        Spanned fromHtml = Html.fromHtml(str2);
                        TextView textView = r9Var.f5942t;
                        textView.setText(fromHtml);
                        ((w2) offerTNCActivity.w()).f6502t.addView(textView);
                    }
                } else {
                    offerTNCActivity.getClass();
                }
                return Unit.f23355a;
            case 12:
                d((String) obj);
                return Unit.f23355a;
            case 13:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 14:
                LinkedInAuthenticationActivity linkedInAuthenticationActivity = (LinkedInAuthenticationActivity) obj2;
                int i19 = LinkedInAuthenticationActivity.f10115k;
                linkedInAuthenticationActivity.isFinishing();
                Intent intent = new Intent();
                intent.putExtra("social_login", (yh.a) obj);
                linkedInAuthenticationActivity.setResult(-1, intent);
                linkedInAuthenticationActivity.finish();
                return Unit.f23355a;
            case 15:
                d((String) obj);
                return Unit.f23355a;
            case 16:
                e((j) obj);
                return Unit.f23355a;
            case 17:
                Portfolio portfolio2 = (Portfolio) obj;
                switch (i10) {
                    case 4:
                        int i20 = bh.e.f6976g;
                        ((bh.e) obj2).H(portfolio2);
                        break;
                    default:
                        ((ModifyTransactionPendingViewModel) ((ModifyTransactionPendingFragment) obj2).r()).f10311n.postValue(portfolio2);
                        break;
                }
                return Unit.f23355a;
            case 18:
                a((Boolean) obj);
                return Unit.f23355a;
            case 19:
                f((s) obj);
                return Unit.f23355a;
            case 20:
                f((s) obj);
                return Unit.f23355a;
            case 21:
                f fVar = (f) obj;
                zi.g gVar = fVar.f42475d;
                if (gVar != null) {
                    StockOverviewSectionItemViewModel stockOverviewSectionItemViewModel = (StockOverviewSectionItemViewModel) obj2;
                    String str3 = gVar.f42477b;
                    if (Intrinsics.a(str3, "PIE_CHART")) {
                        e0 e0Var2 = stockOverviewSectionItemViewModel.f10482j;
                        Boolean bool = Boolean.FALSE;
                        e0Var2.postValue(bool);
                        stockOverviewSectionItemViewModel.f10484l.postValue(Boolean.TRUE);
                        stockOverviewSectionItemViewModel.f10486n.postValue(bool);
                    } else if (Intrinsics.a(str3, "DATA_CHART")) {
                        e0 e0Var3 = stockOverviewSectionItemViewModel.f10482j;
                        Boolean bool2 = Boolean.FALSE;
                        e0Var3.postValue(bool2);
                        stockOverviewSectionItemViewModel.f10484l.postValue(bool2);
                        stockOverviewSectionItemViewModel.f10486n.postValue(Boolean.TRUE);
                    } else {
                        e0 e0Var4 = stockOverviewSectionItemViewModel.f10482j;
                        Boolean bool3 = Boolean.FALSE;
                        e0Var4.postValue(bool3);
                        stockOverviewSectionItemViewModel.f10484l.postValue(bool3);
                        stockOverviewSectionItemViewModel.f10486n.postValue(Boolean.TRUE);
                    }
                }
                zi.g gVar2 = fVar.f42475d;
                return Boolean.valueOf(Intrinsics.a(gVar2 != null ? gVar2.f42477b : null, "DATA_CHART"));
            case 22:
                e((j) obj);
                return Unit.f23355a;
            case 23:
                e((j) obj);
                return Unit.f23355a;
            case 24:
                fj.e eVar = (fj.e) obj2;
                ComposeView composeView = ((id) eVar.f17291u).f5029s;
                fj.d dVar = new fj.d(eVar, (BulletInDto) obj, i11);
                Object obj3 = b1.d.f3079a;
                composeView.setContent(new b1.c(dVar, true, -1343318669));
                return Unit.f23355a;
            case 25:
                SubscriptionPackages subscriptionPackages = (SubscriptionPackages) obj;
                gj.c cVar2 = (gj.c) obj2;
                Function2 function2 = cVar2.f17441x;
                Integer valueOf = Integer.valueOf(cVar2.c());
                Intrinsics.c(subscriptionPackages);
                function2.invoke(valueOf, subscriptionPackages);
                return Unit.f23355a;
            case 26:
                qs.e it2 = (qs.e) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                rs.a listener = (rs.a) obj2;
                us.g gVar3 = (us.g) it2;
                gVar3.getClass();
                Intrinsics.checkNotNullParameter(listener, "listener");
                gVar3.f37380c.add(listener);
                return Unit.f23355a;
            case 27:
                invoke((Throwable) obj);
                return Unit.f23355a;
            default:
                fv.f message = (fv.f) obj;
                Intrinsics.e(message, "message");
                fv.g gVar4 = (fv.g) obj2;
                String str4 = gVar4.f16299e;
                if (str4 != null) {
                    fv.e eVar2 = gVar4.f16300f;
                    eVar2.getClass();
                    ConcurrentLinkedQueue concurrentLinkedQueue = eVar2.f16281b;
                    zd.g predicate = new zd.g(str4, 24, r7);
                    Intrinsics.checkNotNullParameter(concurrentLinkedQueue, "<this>");
                    Intrinsics.checkNotNullParameter(predicate, "predicate");
                    d0.o(concurrentLinkedQueue, predicate, true);
                }
                fv.i iVar2 = gVar4.f16296b;
                if (iVar2 != null) {
                    iVar2.f16305a.cancel(true);
                }
                gVar4.f16296b = null;
                gVar4.f16295a = message;
                String e11 = message.e();
                if (e11 != null && (list = (List) gVar4.f16297c.get(e11)) != null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        ((Function1) it3.next()).invoke(message);
                    }
                }
                return Unit.f23355a;
        }
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f31948a;
        Object obj = this.f31949b;
        switch (i10) {
            case 8:
                EditProfileViewModel editProfileViewModel = (EditProfileViewModel) obj;
                editProfileViewModel.getClass();
                EditProfileViewModel.j();
                editProfileViewModel.f9084g.postValue(Boolean.FALSE);
                return;
            case 13:
                ((SocialActivityViewModel) obj).f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            default:
                ((yu.i) obj).d();
                return;
        }
    }
}
