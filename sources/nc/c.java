package nc;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.e0;
import androidx.viewpager.widget.ViewPager;
import ba.b3;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.StockGyanGroup;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.asset.v2.upcoming.viewmodel.ArenaUpcomingViewModel;
import com.assetgro.stockgro.ui.arena.completed.CompletedLeagueDetailActivity;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.assetgro.stockgro.ui.chat.home.SocialSharedViewModel;
import com.assetgro.stockgro.ui.drawer.stockgyan.StockGyanGroupsViewModel;
import com.assetgro.stockgro.ui.drawer.stockgyan.StockGyanIndexActivity;
import com.assetgro.stockgro.ui.payments.transactions.list.WalletTransactionListFragment;
import com.assetgro.stockgro.ui.payments.transactions.list.WalletTransactionListViewModel;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailActivity;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioHoldingsViewModel;
import com.assetgro.stockgro.ui.redemption.home.RedemptionHostActivity;
import com.assetgro.stockgro.ui.stock.detail.StockDetailFragment;
import com.assetgro.stockgro.ui.stock.search.MarketAssetSearchActivity;
import com.assetgro.stockgro.ui.subscription.OtherSubscriptionPlansFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import oc.j;
import og.o;
import okhttp3.HttpUrl;
import r3.k;
import sc.i;
import vt.p0;
import yo.g;

/* loaded from: classes.dex */
public final class c implements yo.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28613a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28614b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f28613a = i10;
        this.f28614b = obj;
    }

    @Override // yo.c
    public final void a(g gVar) {
        ImageView imageView;
        TextView textView;
        ImageView imageView2;
        TextView textView2;
        int i10 = this.f28613a;
        ConstraintLayout constraintLayout = null;
        Object obj = this.f28614b;
        switch (i10) {
            case 1:
                Context context = ((j) obj).getContext();
                if (context != null) {
                    View view = gVar.f41756e;
                    if (view != null) {
                        constraintLayout = (ConstraintLayout) view.findViewById(R.id.cv_tabcontainer);
                    }
                    if (constraintLayout != null) {
                        constraintLayout.setBackground(k.getDrawable(context, R.drawable.ic_custom_tab_background_purple));
                    }
                    View view2 = gVar.f41756e;
                    if (view2 != null && (textView = (TextView) view2.findViewById(R.id.tv_tabtext)) != null) {
                        textView.setTextColor(k.getColor(context, R.color.purple_text));
                    }
                    View view3 = gVar.f41756e;
                    if (view3 != null && (imageView = (ImageView) view3.findViewById(R.id.iv_tabicon)) != null) {
                        imageView.setColorFilter(k.getColor(context, R.color.purple_text), PorterDuff.Mode.SRC_IN);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                Context context2 = ((i) obj).getContext();
                if (context2 != null) {
                    View view4 = gVar.f41756e;
                    if (view4 != null) {
                        constraintLayout = (ConstraintLayout) view4.findViewById(R.id.cv_tabcontainer);
                    }
                    if (constraintLayout != null) {
                        constraintLayout.setBackground(k.getDrawable(context2, R.drawable.ic_custom_tab_background_purple));
                    }
                    View view5 = gVar.f41756e;
                    if (view5 != null && (textView2 = (TextView) view5.findViewById(R.id.tv_tabtext)) != null) {
                        textView2.setTextColor(k.getColor(context2, R.color.purple_text));
                    }
                    View view6 = gVar.f41756e;
                    if (view6 != null && (imageView2 = (ImageView) view6.findViewById(R.id.iv_tabicon)) != null) {
                        imageView2.setColorFilter(k.getColor(context2, R.color.purple_text), PorterDuff.Mode.SRC_IN);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // yo.c
    public final void b(g gVar) {
        String tagName;
        String str;
        HashMap f10;
        View view;
        TextView textView;
        ConstraintLayout constraintLayout;
        View view2;
        ImageView imageView;
        View view3;
        TextView textView2;
        View view4;
        Integer num;
        Integer num2;
        View view5;
        ImageView imageView2;
        View view6;
        TextView textView3;
        View view7;
        CharSequence charSequence;
        String str2;
        int i10 = this.f28613a;
        CharSequence charSequence2 = null;
        CharSequence charSequence3 = null;
        CharSequence charSequence4 = null;
        r15 = null;
        ConstraintLayout constraintLayout2 = null;
        charSequence2 = null;
        charSequence2 = null;
        Object obj = this.f28614b;
        switch (i10) {
            case 0:
                if (gVar != null) {
                    d dVar = (d) obj;
                    if (Intrinsics.a(gVar.f41753b, dVar.getString(R.string.upcoming))) {
                        tagName = "arena-upcoming-leagues";
                        dVar.s().screenNavigated("arena-upcoming-leagues");
                    } else {
                        tagName = "arena-my-leagues";
                        dVar.s().screenNavigated("arena-my-leagues");
                    }
                    Intrinsics.checkNotNullParameter(tagName, "tagName");
                    if (tagName.length() > 0) {
                        dVar.s().screenNavigated(tagName);
                    }
                    if (Intrinsics.a(gVar.f41753b, dVar.getString(R.string.upcoming))) {
                        str = "app_arena_upcoming_page";
                    } else {
                        str = "app_arena_my_leagues_page";
                    }
                    AnalyticEvent analyticEvent = new AnalyticEvent(str, new HashMap());
                    dVar.z(analyticEvent);
                    dVar.x(analyticEvent);
                    dVar.A(analyticEvent);
                    return;
                }
                return;
            case 1:
                j jVar = (j) obj;
                Context context = jVar.getContext();
                if (context != null) {
                    if (gVar != null && (view4 = gVar.f41756e) != null) {
                        constraintLayout = (ConstraintLayout) view4.findViewById(R.id.cv_tabcontainer);
                    } else {
                        constraintLayout = null;
                    }
                    if (constraintLayout != null) {
                        constraintLayout.setBackground(k.getDrawable(context, R.drawable.ic_custom_tab_background_selected));
                    }
                    if (gVar != null && (view3 = gVar.f41756e) != null && (textView2 = (TextView) view3.findViewById(R.id.tv_tabtext)) != null) {
                        textView2.setTextColor(k.getColor(context, R.color.white));
                    }
                    if (gVar != null && (view2 = gVar.f41756e) != null && (imageView = (ImageView) view2.findViewById(R.id.iv_tabicon)) != null) {
                        imageView.setColorFilter(k.getColor(context, R.color.white), PorterDuff.Mode.SRC_IN);
                    }
                }
                if (gVar != null && (view = gVar.f41756e) != null && (textView = (TextView) view.findViewById(R.id.tv_tabtext)) != null) {
                    charSequence2 = textView.getText();
                }
                if (Intrinsics.a(String.valueOf(charSequence2), jVar.getString(R.string.text_all))) {
                    String string = jVar.getString(R.string.text_all);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String lowerCase = string.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    f10 = p0.f(new Pair("selected", lowerCase));
                } else if (Intrinsics.a(String.valueOf(charSequence2), jVar.getString(R.string.stocks))) {
                    String string2 = jVar.getString(R.string.stocks);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    String lowerCase2 = string2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    f10 = p0.f(new Pair("selected", lowerCase2));
                } else {
                    String string3 = jVar.getString(R.string.stocks);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    String lowerCase3 = string3.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                    f10 = p0.f(new Pair("selected", lowerCase3));
                }
                AnalyticEvent analyticEvent2 = new AnalyticEvent("app_arena_my_leagues_asset_filter", f10);
                jVar.z(analyticEvent2);
                jVar.B(analyticEvent2);
                return;
            case 2:
                if (gVar != null) {
                    num = Integer.valueOf(gVar.f41755d);
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == 0) {
                    i iVar = (i) obj;
                    ArenaUpcomingViewModel arenaUpcomingViewModel = (ArenaUpcomingViewModel) iVar.r();
                    Intrinsics.checkNotNullParameter("ALL", "<set-?>");
                    arenaUpcomingViewModel.f8961r = "ALL";
                    String string4 = iVar.getString(R.string.text_all);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    String lowerCase4 = string4.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                    iVar.I(lowerCase4);
                } else if (num != null && num.intValue() == 1) {
                    i iVar2 = (i) obj;
                    ArenaUpcomingViewModel arenaUpcomingViewModel2 = (ArenaUpcomingViewModel) iVar2.r();
                    Intrinsics.checkNotNullParameter("EQUITY", "<set-?>");
                    arenaUpcomingViewModel2.f8961r = "EQUITY";
                    String string5 = iVar2.getString(R.string.stocks);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    String lowerCase5 = string5.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
                    iVar2.I(lowerCase5);
                } else if (num != null && num.intValue() == 2) {
                    i iVar3 = (i) obj;
                    ArenaUpcomingViewModel arenaUpcomingViewModel3 = (ArenaUpcomingViewModel) iVar3.r();
                    Intrinsics.checkNotNullParameter("OPTIONS", "<set-?>");
                    arenaUpcomingViewModel3.f8961r = "OPTIONS";
                    String string6 = iVar3.getString(R.string.text_fno);
                    Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                    String lowerCase6 = string6.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase6, "toLowerCase(...)");
                    iVar3.I(lowerCase6);
                }
                i iVar4 = (i) obj;
                e0 e0Var = ((ArenaUpcomingViewModel) iVar4.r()).f8959p;
                if (gVar != null) {
                    num2 = Integer.valueOf(gVar.f41755d);
                } else {
                    num2 = null;
                }
                e0Var.setValue(num2);
                Context context2 = iVar4.getContext();
                if (context2 != null) {
                    if (gVar != null && (view7 = gVar.f41756e) != null) {
                        constraintLayout2 = (ConstraintLayout) view7.findViewById(R.id.cv_tabcontainer);
                    }
                    if (constraintLayout2 != null) {
                        constraintLayout2.setBackground(k.getDrawable(context2, R.drawable.ic_custom_tab_background_selected));
                    }
                    if (gVar != null && (view6 = gVar.f41756e) != null && (textView3 = (TextView) view6.findViewById(R.id.tv_tabtext)) != null) {
                        textView3.setTextColor(k.getColor(context2, R.color.white));
                    }
                    if (gVar != null && (view5 = gVar.f41756e) != null && (imageView2 = (ImageView) view5.findViewById(R.id.iv_tabicon)) != null) {
                        imageView2.setColorFilter(k.getColor(context2, R.color.white), PorterDuff.Mode.SRC_IN);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (gVar != null) {
                    charSequence = gVar.f41753b;
                } else {
                    charSequence = null;
                }
                CompletedLeagueDetailActivity completedLeagueDetailActivity = (CompletedLeagueDetailActivity) obj;
                if (Intrinsics.a(charSequence, completedLeagueDetailActivity.getString(R.string.ranks))) {
                    completedLeagueDetailActivity.C(new AnalyticEvent("app_completed_league_rank_view", null, 2, null));
                    return;
                }
                return;
            case 4:
                if (gVar != null) {
                    int i11 = gVar.f41755d;
                    he.e eVar = (he.e) obj;
                    SocialSharedViewModel L = eVar.L();
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                            } else {
                                str2 = "SocialChatListFragment";
                            }
                        } else {
                            str2 = "DiscoverFragment";
                        }
                    } else {
                        str2 = "SocialHomeFeedComposeFragment";
                    }
                    L.f9368p.postValue(str2);
                    he.e.H(eVar, i11, ((SocialChatListViewModel) eVar.r()).F);
                    he.e.I(eVar, i11, ((SocialChatListViewModel) eVar.r()).F);
                    return;
                }
                return;
            case 5:
                StockGyanIndexActivity stockGyanIndexActivity = (StockGyanIndexActivity) obj;
                List list = (List) ((StockGyanGroupsViewModel) stockGyanIndexActivity.x()).f9503p.getValue();
                if (list != null) {
                    Intrinsics.c(gVar);
                    StockGyanGroup stockGyanGroup = (StockGyanGroup) list.get(gVar.f41755d);
                    if (stockGyanGroup != null) {
                        ((StockGyanGroupsViewModel) stockGyanIndexActivity.x()).f9506s.postValue(stockGyanGroup);
                        kf.a aVar = stockGyanIndexActivity.f9510k;
                        if (aVar != null) {
                            aVar.u(stockGyanGroup.getStockGyanIndices());
                            return;
                        } else {
                            Intrinsics.k("stockGyanIndexAdapter");
                            throw null;
                        }
                    }
                    return;
                }
                return;
            case 6:
                if (gVar != null) {
                    charSequence4 = gVar.f41753b;
                }
                WalletTransactionListFragment walletTransactionListFragment = (WalletTransactionListFragment) obj;
                String upperCase = String.valueOf(charSequence4).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                int i12 = WalletTransactionListFragment.f9726h;
                if (upperCase != null) {
                    walletTransactionListFragment.getClass();
                    walletTransactionListFragment.x(new AnalyticEvent("app_txn_subwallet_filter", p0.f(new Pair("selected", upperCase))));
                }
                WalletTransactionListViewModel walletTransactionListViewModel = (WalletTransactionListViewModel) walletTransactionListFragment.r();
                walletTransactionListViewModel.f9731q = upperCase;
                walletTransactionListViewModel.h();
                return;
            case 7:
                if (gVar != null && gVar.f41755d == 0) {
                    PortfolioDetailActivity portfolioDetailActivity = (PortfolioDetailActivity) obj;
                    ((b3) portfolioDetailActivity.w()).f4246s.setVisibility(0);
                    Integer num3 = (Integer) ((PortfolioDetailViewModel) portfolioDetailActivity.x()).M.getValue();
                    if (num3 != null) {
                        ((b3) portfolioDetailActivity.w()).f4246s.setVisibility(num3.intValue());
                        return;
                    }
                    return;
                }
                ((b3) ((PortfolioDetailActivity) obj).w()).f4246s.setVisibility(8);
                return;
            case 8:
                o oVar = (o) obj;
                PortfolioHoldingsViewModel portfolioHoldingsViewModel = (PortfolioHoldingsViewModel) oVar.r();
                Intrinsics.c(gVar);
                portfolioHoldingsViewModel.h(String.valueOf(gVar.f41753b));
                ((PortfolioHoldingsViewModel) oVar.r()).B.setValue(((PortfolioHoldingsViewModel) oVar.r()).f9844x);
                return;
            case 9:
                if (gVar != null && gVar.f41755d == 0) {
                    ((RedemptionHostActivity) obj).y().screenNavigated("exchange-offers");
                    return;
                } else {
                    ((RedemptionHostActivity) obj).y().screenNavigated("exchange-redeemed");
                    return;
                }
            case 10:
                if (gVar != null) {
                    StockDetailFragment stockDetailFragment = (StockDetailFragment) obj;
                    CharSequence charSequence5 = gVar.f41753b;
                    if (Intrinsics.a(charSequence5, stockDetailFragment.getString(R.string.overview))) {
                        stockDetailFragment.z(new AnalyticEvent("stock_overview", null, 2, null));
                        stockDetailFragment.s().screenNavigated("stock-overview");
                        return;
                    } else if (Intrinsics.a(charSequence5, stockDetailFragment.getString(R.string.charts))) {
                        stockDetailFragment.z(new AnalyticEvent("stock_charts", null, 2, null));
                        stockDetailFragment.s().screenNavigated("stock-charts");
                        return;
                    } else {
                        if (Intrinsics.a(charSequence5, stockDetailFragment.getString(R.string.analysis))) {
                            stockDetailFragment.z(new AnalyticEvent("stock_analysis", null, 2, null));
                            stockDetailFragment.s().screenNavigated("stock-analysis");
                            return;
                        }
                        return;
                    }
                }
                return;
            case 11:
                if (gVar != null) {
                    ((MarketAssetSearchActivity) obj).K();
                    return;
                }
                return;
            case 12:
                OtherSubscriptionPlansFragment otherSubscriptionPlansFragment = (OtherSubscriptionPlansFragment) obj;
                ej.a aVar2 = otherSubscriptionPlansFragment.f10521i;
                ej.a aVar3 = ej.a.f15445a;
                if (aVar2 == aVar3) {
                    otherSubscriptionPlansFragment.f10521i = ej.a.f15447c;
                    if (gVar != null) {
                        charSequence3 = gVar.f41753b;
                    }
                    OtherSubscriptionPlansFragment.H(otherSubscriptionPlansFragment, true, String.valueOf(charSequence3));
                    return;
                }
                otherSubscriptionPlansFragment.f10521i = aVar3;
                return;
            default:
                ((ViewPager) obj).setCurrentItem(gVar.f41755d);
                return;
        }
    }

    @Override // yo.c
    public final void c(g gVar) {
        View view;
        ImageView imageView;
        View view2;
        TextView textView;
        View view3;
        View view4;
        ImageView imageView2;
        View view5;
        TextView textView2;
        View view6;
        String str;
        int i10 = this.f28613a;
        ConstraintLayout constraintLayout = null;
        CharSequence charSequence = null;
        r6 = null;
        ConstraintLayout constraintLayout2 = null;
        constraintLayout = null;
        Object obj = this.f28614b;
        switch (i10) {
            case 1:
                Context context = ((j) obj).getContext();
                if (context != null) {
                    if (gVar != null && (view3 = gVar.f41756e) != null) {
                        constraintLayout = (ConstraintLayout) view3.findViewById(R.id.cv_tabcontainer);
                    }
                    if (constraintLayout != null) {
                        constraintLayout.setBackground(k.getDrawable(context, R.drawable.ic_custom_tab_background_selected));
                    }
                    if (gVar != null && (view2 = gVar.f41756e) != null && (textView = (TextView) view2.findViewById(R.id.tv_tabtext)) != null) {
                        textView.setTextColor(k.getColor(context, R.color.white));
                    }
                    if (gVar != null && (view = gVar.f41756e) != null && (imageView = (ImageView) view.findViewById(R.id.iv_tabicon)) != null) {
                        imageView.setColorFilter(k.getColor(context, R.color.white), PorterDuff.Mode.SRC_IN);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                Context context2 = ((i) obj).getContext();
                if (context2 != null) {
                    if (gVar != null && (view6 = gVar.f41756e) != null) {
                        constraintLayout2 = (ConstraintLayout) view6.findViewById(R.id.cv_tabcontainer);
                    }
                    if (constraintLayout2 != null) {
                        constraintLayout2.setBackground(k.getDrawable(context2, R.drawable.ic_custom_tab_background_selected));
                    }
                    if (gVar != null && (view5 = gVar.f41756e) != null && (textView2 = (TextView) view5.findViewById(R.id.tv_tabtext)) != null) {
                        textView2.setTextColor(k.getColor(context2, R.color.white));
                    }
                    if (gVar != null && (view4 = gVar.f41756e) != null && (imageView2 = (ImageView) view4.findViewById(R.id.iv_tabicon)) != null) {
                        imageView2.setColorFilter(k.getColor(context2, R.color.white), PorterDuff.Mode.SRC_IN);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (gVar != null) {
                    int i11 = gVar.f41755d;
                    he.e eVar = (he.e) obj;
                    SocialSharedViewModel L = eVar.L();
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                str = HttpUrl.FRAGMENT_ENCODE_SET;
                            } else {
                                str = "SocialChatListFragment";
                            }
                        } else {
                            str = "DiscoverFragment";
                        }
                    } else {
                        str = "SocialHomeFeedComposeFragment";
                    }
                    L.f9368p.postValue(str);
                    he.e.H(eVar, i11, ((SocialChatListViewModel) eVar.r()).F);
                    he.e.I(eVar, i11, ((SocialChatListViewModel) eVar.r()).F);
                    return;
                }
                return;
            case 9:
                if (gVar != null && gVar.f41755d == 0) {
                    ((RedemptionHostActivity) obj).y().screenNavigated("exchange-offers");
                    return;
                } else {
                    ((RedemptionHostActivity) obj).y().screenNavigated("exchange-redeemed");
                    return;
                }
            case 10:
                if (gVar != null) {
                    charSequence = gVar.f41753b;
                }
                StockDetailFragment stockDetailFragment = (StockDetailFragment) obj;
                if (Intrinsics.a(charSequence, stockDetailFragment.getString(R.string.overview))) {
                    stockDetailFragment.s().screenNavigated("stock-overview");
                    return;
                } else if (Intrinsics.a(charSequence, stockDetailFragment.getString(R.string.charts))) {
                    stockDetailFragment.s().screenNavigated("stock-charts");
                    return;
                } else {
                    if (Intrinsics.a(charSequence, stockDetailFragment.getString(R.string.analysis))) {
                        stockDetailFragment.s().screenNavigated("stock-analysis");
                        return;
                    }
                    return;
                }
            default:
                return;
        }
    }
}
