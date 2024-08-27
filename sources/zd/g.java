package zd;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.j0;
import androidx.lifecycle.e0;
import ba.ah;
import c0.d0;
import com.assetgro.stockgro.data.enums.TopPortfolioType;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.FTWeekTopStocksDto;
import com.assetgro.stockgro.data.model.ReportReason;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.model.portfolio.orders.Bought;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.HomePageTopDataResponse;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.chat.detail.messages.pin.GroupPinnedMessagesViewModel;
import com.assetgro.stockgro.ui.chat.detail.messages.thread.MessageThreadInfoActivity;
import com.assetgro.stockgro.ui.chat.helper.search.AssetUploadWorker;
import com.assetgro.stockgro.ui.home.homepage.data.HomeExpertViewDto;
import com.assetgro.stockgro.ui.home.homepage.data.HomeUserInfoDto;
import com.assetgro.stockgro.ui.home.homepage.data.SocialExpertGroup;
import com.assetgro.stockgro.ui.home.homepage.data.UserInfoItem;
import com.assetgro.stockgro.ui.home.portfolio.list.TopPortfolioListViewModel;
import com.assetgro.stockgro.ui.payments.WithdrawableLimitActivity;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletViewModel;
import com.assetgro.stockgro.ui.payments.withdrawal.DefaultWebViewActivity;
import com.assetgro.stockgro.ui.portfolio.orders.OrderItemViewModel;
import com.assetgro.stockgro.ui.portfolio.orders.model.FnoOrderResponseData;
import com.assetgro.stockgro.ui.profile.self.EditProfileActivity;
import com.assetgro.stockgro.ui.profile.self.EditProfileViewModel;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import com.assetgro.stockgro.ui.splash.SplashViewModel;
import com.assetgro.stockgro.ui.stock.list.StockListViewModel;
import hf.u;
import iu.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import okhttp3.HttpUrl;
import t0.g1;
import vt.g0;
import vt.i0;
import vt.p0;
import wl.w;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42420b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42421c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        super(1);
        this.f42419a = i10;
        this.f42420b = obj;
        this.f42421c = obj2;
    }

    public final void a(d0 LazyColumn) {
        int i10 = this.f42419a;
        int i11 = 11;
        int i12 = 1;
        Object obj = this.f42421c;
        Object obj2 = this.f42420b;
        switch (i10) {
            case 3:
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                h7.b bVar = (h7.b) obj2;
                int b10 = bVar.b();
                ne.c cVar = new ne.c(0, bVar, (hu.c) obj);
                Object obj3 = b1.d.f3079a;
                d0.b(LazyColumn, b10, new b1.c(cVar, true, 1265781045));
                return;
            case 4:
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                List list = ((hf.j) obj2).f18378d;
                hf.b bVar2 = hf.b.f18330c;
                hf.b bVar3 = hf.b.f18331d;
                int size = list.size();
                lb.j jVar = new lb.j(bVar2, list, 10);
                lb.j jVar2 = new lb.j(bVar3, list, i11);
                rb.e eVar = new rb.e(list, (Function1) obj, 2);
                Object obj4 = b1.d.f3079a;
                c0.j jVar3 = (c0.j) LazyColumn;
                jVar3.a0(size, jVar, jVar2, new b1.c(eVar, true, -632812321));
                d0.a(jVar3, hf.d.f18361a);
                return;
            case 5:
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyRow");
                d0.a(LazyColumn, hf.d.f18364d);
                List<SocialExpertGroup> listItems = ((HomeExpertViewDto) obj2).getListItems();
                if (listItems == null) {
                    listItems = i0.f38321a;
                }
                int size2 = listItems.size();
                v.c cVar2 = new v.c(i11, listItems);
                u uVar = new u(i12, listItems, (Function2) obj);
                Object obj5 = b1.d.f3079a;
                ((c0.j) LazyColumn).a0(size2, null, cVar2, new b1.c(uVar, true, -1091073711));
                return;
            default:
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyRow");
                d0.a(LazyColumn, hf.d.f18362b);
                List<UserInfoItem> userInfoItems = ((HomeUserInfoDto) obj2).getUserInfoItems();
                if (userInfoItems == null) {
                    userInfoItems = i0.f38321a;
                }
                int size3 = userInfoItems.size();
                v.c cVar3 = new v.c(13, userInfoItems);
                u uVar2 = new u(3, userInfoItems, (Function2) obj);
                Object obj6 = b1.d.f3079a;
                ((c0.j) LazyColumn).a0(size3, null, cVar3, new b1.c(uVar2, true, -1091073711));
                return;
        }
    }

    public final void d(String it) {
        int i10 = this.f42419a;
        Object obj = this.f42421c;
        Object obj2 = this.f42420b;
        switch (i10) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                MessageThreadInfoActivity.K((MessageThreadInfoActivity) obj2, (ChatMessage) obj);
                return;
            case 12:
                Intrinsics.checkNotNullParameter(it, "orderId");
                Function2 function2 = (Function2) obj2;
                String transactionType = ((FnoOrderResponseData) obj).getTransactionType();
                if (transactionType == null) {
                    transactionType = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                function2.invoke(transactionType, it);
                return;
            case 15:
                Intrinsics.checkNotNullParameter(it, "changedText");
                if (!Intrinsics.a(it, (String) obj)) {
                    ((EditProfileViewModel) ((EditProfileActivity) obj2).x()).f10033q.postValue(Boolean.TRUE);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                ((Function1) obj2).invoke((th.b) obj);
                return;
        }
    }

    public final void e(kh.m it) {
        int i10 = this.f42419a;
        Object obj = this.f42421c;
        Object obj2 = this.f42420b;
        switch (i10) {
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                ((g1) obj).setValue(it);
                ((UserStatisticsViewModel) ((kh.d) obj2).f23121i.getValue()).F.setValue(it);
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                ((Function1) obj2).invoke((kh.m) obj);
                return;
        }
    }

    public final void invoke(BaseResponseDto baseResponseDto) {
        FTWeekTopStocksDto ftWeekHighLow;
        List<StockDto> low;
        FTWeekTopStocksDto ftWeekHighLow2;
        List<StockDto> high;
        int i10 = this.f42419a;
        Object obj = this.f42421c;
        Object obj2 = this.f42420b;
        switch (i10) {
            case 7:
                TopPortfolioListViewModel topPortfolioListViewModel = (TopPortfolioListViewModel) obj2;
                topPortfolioListViewModel.f9084g.postValue(Boolean.FALSE);
                TopPortfolioType topPortfolioType = (TopPortfolioType) obj;
                TopPortfolioType topPortfolioType2 = TopPortfolioType.WEEKLY;
                e0 e0Var = topPortfolioListViewModel.f9564o;
                if (topPortfolioType == topPortfolioType2) {
                    HomePageTopDataResponse homePageTopDataResponse = (HomePageTopDataResponse) baseResponseDto.getData();
                    e0Var.postValue(homePageTopDataResponse != null ? homePageTopDataResponse.getWeeklyTopPortfolios() : null);
                    return;
                } else {
                    HomePageTopDataResponse homePageTopDataResponse2 = (HomePageTopDataResponse) baseResponseDto.getData();
                    e0Var.postValue(homePageTopDataResponse2 != null ? homePageTopDataResponse2.getTodayTopPortfolios() : null);
                    return;
                }
            case 8:
            default:
                StockListViewModel stockListViewModel = (StockListViewModel) obj2;
                stockListViewModel.f9084g.postValue(Boolean.FALSE);
                boolean a10 = Intrinsics.a((String) obj, "FT_WEEK_HIGH");
                e0 e0Var2 = stockListViewModel.f10255p;
                if (a10) {
                    HomePageTopDataResponse homePageTopDataResponse3 = (HomePageTopDataResponse) baseResponseDto.getData();
                    if (homePageTopDataResponse3 == null || (ftWeekHighLow2 = homePageTopDataResponse3.getFtWeekHighLow()) == null || (high = ftWeekHighLow2.getHigh()) == null) {
                        return;
                    }
                    e0Var2.postValue(high);
                    return;
                }
                HomePageTopDataResponse homePageTopDataResponse4 = (HomePageTopDataResponse) baseResponseDto.getData();
                if (homePageTopDataResponse4 == null || (ftWeekHighLow = homePageTopDataResponse4.getFtWeekHighLow()) == null || (low = ftWeekHighLow.getLow()) == null) {
                    return;
                }
                e0Var2.postValue(low);
                return;
            case 9:
                ((RechargeWalletViewModel) obj2).E.postValue(new kj.j(new Pair(baseResponseDto, (String) obj)));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, int i10, Object obj) {
        super(1);
        this.f42419a = i10;
        this.f42421c = str;
        this.f42420b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [at.e, mt.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ?? r12;
        Integer num;
        int i10 = this.f42419a;
        r2 = false;
        boolean z10 = false;
        Object obj2 = this.f42420b;
        Object obj3 = this.f42421c;
        switch (i10) {
            case 0:
                GroupPinnedMessagesViewModel groupPinnedMessagesViewModel = (GroupPinnedMessagesViewModel) obj2;
                groupPinnedMessagesViewModel.f9084g.postValue(Boolean.FALSE);
                groupPinnedMessagesViewModel.f9309t.postValue((String) obj3);
                return Unit.f23355a;
            case 1:
                d((String) obj);
                return Unit.f23355a;
            case 2:
                fv.f it = (fv.f) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((AssetUploadWorker) obj2).c((Map) obj3);
                return Unit.f23355a;
            case 3:
                a((d0) obj);
                return Unit.f23355a;
            case 4:
                a((d0) obj);
                return Unit.f23355a;
            case 5:
                a((d0) obj);
                return Unit.f23355a;
            case 6:
                a((d0) obj);
                return Unit.f23355a;
            case 7:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 8:
                int intValue = ((Number) obj).intValue();
                List list = ((j2.e) obj2).f20702d;
                if (list != null) {
                    r12 = new ArrayList(list.size());
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        Object obj4 = list.get(i11);
                        j2.d dVar = (j2.d) obj4;
                        if ((dVar.f20685a instanceof String) && j2.f.c(intValue, intValue, dVar.f20686b, dVar.f20687c)) {
                            r12.add(obj4);
                        }
                    }
                } else {
                    r12 = i0.f38321a;
                }
                Intrinsics.d(r12, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
                if (((j2.d) g0.w(r12)) != null) {
                    WithdrawableLimitActivity withdrawableLimitActivity = (WithdrawableLimitActivity) obj3;
                    Intent intent = new Intent(withdrawableLimitActivity, (Class<?>) DefaultWebViewActivity.class);
                    intent.putExtra("WEB_URL", "https://app.stockgro.club/ui/account/beneficiary");
                    intent.putExtra("TOOLBAR_TITLE", "Beneficiary Policy");
                    withdrawableLimitActivity.startActivity(intent);
                }
                return Unit.f23355a;
            case 9:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 10:
                pg.c it2 = (pg.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                ((Function1) obj2).invoke((pg.c) obj3);
                return Unit.f23355a;
            case 11:
                Bought bought = (Bought) obj;
                if (s.j(bought.getOrderStatus(), "pending", true)) {
                    OrderItemViewModel orderItemViewModel = (OrderItemViewModel) obj2;
                    if (orderItemViewModel.f9889g == null) {
                        ?? g10 = new mt.c(at.e.a(300L, TimeUnit.MILLISECONDS), new fg.g(18, tg.c.f36035l)).g(((kq.e) ((pj.a) obj3)).J());
                        jt.e eVar = new jt.e(new fg.g(19, new qg.a(orderItemViewModel, 2)), gt.e.f17572d);
                        g10.e(eVar);
                        orderItemViewModel.f9889g = eVar;
                    }
                } else {
                    ((OrderItemViewModel) obj2).f9891i.postValue(Boolean.TRUE);
                }
                return bought.getOrderStatus();
            case 12:
                d((String) obj);
                return Unit.f23355a;
            case 13:
                ah AndroidViewBinding = (ah) obj;
                Intrinsics.checkNotNullParameter(AndroidViewBinding, "$this$AndroidViewBinding");
                AndroidViewBinding.f4201s.getNext().setOnClickListener(new ha.h(4, AndroidViewBinding, (Function1) obj2, (Context) obj3));
                AndroidViewBinding.f4201s.setNumberClick(new qg.a(AndroidViewBinding, 6));
                return Unit.f23355a;
            case 14:
                ReportReason reportReason = (ReportReason) obj;
                Intrinsics.checkNotNullParameter(reportReason, "reportReason");
                ((g1) ((z) obj2).f20560a).setValue(reportReason);
                ((g1) obj3).setValue(Boolean.TRUE);
                return Unit.f23355a;
            case 15:
                d((String) obj);
                return Unit.f23355a;
            case 16:
                e((kh.m) obj);
                return Unit.f23355a;
            case 17:
                e((kh.m) obj);
                return Unit.f23355a;
            case 18:
                d((String) obj);
                return Unit.f23355a;
            case 19:
                Intrinsics.checkNotNullParameter((Long) obj, "<anonymous parameter 0>");
                if (((UserRepository) obj2).isUserLoggedIn()) {
                    ((SplashViewModel) obj3).f10161p.postValue(new kj.j(new Bundle()));
                } else {
                    ((SplashViewModel) obj3).f10162q.postValue(new kj.j(p0.d()));
                }
                return Unit.f23355a;
            case 20:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 21:
                e.a result = (e.a) obj;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.f14610a == -1) {
                    ((w) obj2).p().j(nl.i.Login.a(), result.f14610a, result.f14611b);
                } else {
                    ((j0) obj3).finish();
                }
                return Unit.f23355a;
            case 22:
                switch (i10) {
                    case 22:
                        ((ru.d) obj2).f34003c.removeCallbacks((Runnable) obj3);
                        break;
                    default:
                        ((yu.d) obj2).a(obj3);
                        break;
                }
                return Unit.f23355a;
            case 23:
                switch (i10) {
                    case 22:
                        ((ru.d) obj2).f34003c.removeCallbacks((Runnable) obj3);
                        break;
                    default:
                        ((yu.d) obj2).a(obj3);
                        break;
                }
                return Unit.f23355a;
            default:
                fv.a aVar = (fv.a) obj;
                if (Intrinsics.a(aVar.f16269a, (String) obj3) && ((num = (Integer) obj2) == null || num.intValue() == aVar.f16270b)) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }
}
