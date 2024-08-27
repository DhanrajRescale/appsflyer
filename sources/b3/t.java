package b3;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.d1;
import androidx.fragment.app.f2;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.u0;
import androidx.work.i0;
import androidx.work.j0;
import androidx.work.k0;
import androidx.work.w;
import androidx.work.x;
import b5.m1;
import b5.n0;
import b5.p1;
import b5.q0;
import b5.y0;
import ba.i1;
import ba.mh;
import ba.of;
import ba.qf;
import ba.vj;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.ContactsUploadForegroundWorker;
import com.assetgro.stockgro.data.ContactsWorker;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailFragment;
import com.assetgro.stockgro.feature_market.presentation.fno.details.OptionDetailViewModel;
import com.assetgro.stockgro.feature_market.presentation.fno.option.MarketOptionsListViewModel;
import com.assetgro.stockgro.feature_market.presentation.fno.search.MarketOptionSearchViewModel;
import com.assetgro.stockgro.feature_market.presentation.market.asset.MarketAssetHostViewModel;
import com.assetgro.stockgro.feature_market.presentation.market.asset.insights.detail.MarketInsightsDetailViewModel;
import com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.asset.MarketAssetInsightsViewModel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.asset.v2.myleagues.viewmodel.ArenaMyLeaguesViewModel;
import com.assetgro.stockgro.ui.arena.completed.CompletedLeagueDetailActivity;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListActivity;
import com.assetgro.stockgro.ui.chat.discover.info.GroupDetailActivity;
import com.assetgro.stockgro.ui.chat.helper.search.SearchContactViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.assetgro.stockgro.ui.chat.message_invites.MessageInvitesActivity;
import com.assetgro.stockgro.ui.helpcenter.StockGroHelpCenterActivity;
import com.assetgro.stockgro.ui.helpcenter.StockGroHelpViewModel;
import com.assetgro.stockgro.ui.home.HomeViewModel;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.assetgro.stockgro.ui.main.MainViewModel;
import com.assetgro.stockgro.ui.payments.kyc.KycWebViewActivity;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailActivity;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import com.assetgro.stockgro.ui.profile.followers.FollowerFollowingActivity;
import com.assetgro.stockgro.ui.profile.followers.FollowerFollowingViewModel;
import com.assetgro.stockgro.ui.profile.group.GroupMyProfileViewModel;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileViewModel;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.data.model.PendingIntentRequiredException;
import com.firebase.ui.auth.data.remote.SignInKickstarter;
import com.firebase.ui.auth.viewmodel.smartlock.SmartLockHandler;
import com.google.android.gms.auth.api.credentials.CredentialRequestResponse;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.messaging.e0;
import com.google.firebase.messaging.f0;
import d4.n1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kh.y;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.a4;
import okhttp3.HttpUrl;
import vt.g0;
import vt.p0;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements y3.f, e5.j, e5.d, o5.t, z5.f, fo.g, yo.k, r7.j, zn.d, bq.d, e.b, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3152b;

    public /* synthetic */ t(Object obj, int i10) {
        this.f3151a = i10;
        this.f3152b = obj;
    }

    @Override // y3.f
    public void a() {
        f2 this$0 = (f2) this.f3152b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a();
    }

    @Override // e5.d
    public void b(Object obj) {
        ((n5.l) obj).e((Exception) this.f3152b);
    }

    @Override // no.i
    public boolean c(MenuItem it) {
        na.d this$0 = (na.d) this.f3152b;
        int i10 = na.d.f28560i;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        int itemId = it.getItemId();
        if (itemId != R.id.fno_fragment) {
            if (itemId != R.id.stocks_fragment) {
                return false;
            }
            MarketAssetHostViewModel marketAssetHostViewModel = (MarketAssetHostViewModel) this$0.r();
            qf.b bVar = qf.b.f31939n;
            qf.a aVar = marketAssetHostViewModel.f8653n;
            if (!aVar.b(bVar) && !aVar.b(qf.b.f31938m)) {
                this$0.J();
            } else {
                this$0.I();
            }
        } else {
            MarketAssetHostViewModel marketAssetHostViewModel2 = (MarketAssetHostViewModel) this$0.r();
            qf.b bVar2 = qf.b.f31940o;
            qf.a aVar2 = marketAssetHostViewModel2.f8653n;
            if (!aVar2.b(bVar2) && !aVar2.b(qf.b.f31938m)) {
                if (!(this$0.f28561g instanceof ia.b)) {
                    this$0.s().screenNavigated("market-fno");
                    d1 parentFragmentManager = this$0.getParentFragmentManager();
                    parentFragmentManager.getClass();
                    androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(parentFragmentManager);
                    Intrinsics.checkNotNullExpressionValue(aVar3, "beginTransaction(...)");
                    ia.b bVar3 = (ia.b) this$0.getParentFragmentManager().C("MarketOptionHostFragment");
                    if (bVar3 == null) {
                        Bundle bundle = new Bundle();
                        ia.b bVar4 = new ia.b();
                        bVar4.setArguments(bundle);
                        aVar3.e(R.id.market_asset_container, bVar4, "MarketOptionHostFragment", 1);
                        bVar3 = bVar4;
                    } else {
                        aVar3.o(bVar3);
                    }
                    gd.m mVar = this$0.f28561g;
                    if (mVar != null) {
                        aVar3.k(mVar);
                    }
                    aVar3.h(false);
                    this$0.f28561g = bVar3;
                }
            } else {
                this$0.I();
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [qj.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [qj.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [ge.p] */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.work.e, java.lang.Object] */
    @Override // e.b
    public void d(Object obj) {
        Cursor query;
        Bundle extras;
        String str;
        String str2;
        Object obj2;
        Boolean bool;
        int i10 = this.f3151a;
        final int i11 = 1;
        boolean z10 = false;
        String str3 = null;
        Object obj3 = this.f3152b;
        switch (i10) {
            case 0:
                GroupMemberListActivity this$0 = (GroupMemberListActivity) obj3;
                int i12 = GroupMemberListActivity.f9283m;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (((e.a) obj).f14610a == -1) {
                    ?? obj4 = new Object();
                    String string = this$0.getString(R.string.profile_reported_body);
                    String string2 = this$0.getString(R.string.report_sent_text);
                    String string3 = this$0.getString(R.string.ok);
                    androidx.work.u uVar = new androidx.work.u(i11);
                    Intrinsics.c(string);
                    Intrinsics.c(string3);
                    Intrinsics.c(string2);
                    qj.b.b(obj4, this$0, string, string3, null, string2, null, false, 0, 0, uVar, 65496);
                    return;
                }
                return;
            case 1:
                GroupDetailActivity this$02 = (GroupDetailActivity) obj3;
                e.a aVar = (e.a) obj;
                int i13 = GroupDetailActivity.f9324n;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (aVar.f14610a == -1) {
                    Intent intent = aVar.f14611b;
                    if (intent != null) {
                        str3 = intent.getStringExtra("GROUP_CHAT_ID");
                    }
                    if (intent != null) {
                        z10 = intent.getBooleanExtra("IS_FOLLOWING", false);
                    }
                    Intent intent2 = new Intent();
                    intent2.putExtra("GROUP_CHAT_ID", str3);
                    intent2.putExtra("IS_FOLLOWING", z10);
                    this$02.setResult(-1, intent2);
                    this$02.finish();
                    return;
                }
                return;
            case 2:
                ge.o this$03 = (ge.o) obj3;
                Boolean bool2 = (Boolean) obj;
                int i14 = ge.o.f17326l;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.c(bool2);
                if (bool2.booleanValue()) {
                    final SearchContactViewModel searchContactViewModel = (SearchContactViewModel) this$03.r();
                    searchContactViewModel.E.postValue(Unit.f23355a);
                    k0 a10 = new w(ContactsUploadForegroundWorker.class).a();
                    Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
                    x xVar = (x) a10;
                    i0 i0Var = searchContactViewModel.f9353p;
                    i0Var.a(xVar);
                    final d0 b10 = i0Var.b(xVar.f2623a);
                    Intrinsics.checkNotNullExpressionValue(b10, "getWorkInfoByIdLiveData(...)");
                    b10.observeForever(searchContactViewModel.G);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    at.l lVar = st.e.f34774b;
                    if (timeUnit != null) {
                        if (lVar != null) {
                            kt.p pVar = new kt.p(timeUnit, lVar);
                            at.l lVar2 = bt.c.f7311a;
                            if (lVar2 != null) {
                                kt.g gVar = new kt.g(pVar, lVar2, 0);
                                final boolean z11 = false ? 1 : 0;
                                et.a aVar2 = new et.a() { // from class: ge.p
                                    @Override // et.a
                                    public final void run() {
                                        int i15 = z11;
                                        SearchContactViewModel this$04 = searchContactViewModel;
                                        LiveData workInfoLiveData = b10;
                                        switch (i15) {
                                            case 0:
                                                Intrinsics.checkNotNullParameter(workInfoLiveData, "$workInfoLiveData");
                                                Intrinsics.checkNotNullParameter(this$04, "this$0");
                                                workInfoLiveData.removeObserver(this$04.G);
                                                return;
                                            default:
                                                Intrinsics.checkNotNullParameter(workInfoLiveData, "$workInfoLiveData");
                                                Intrinsics.checkNotNullParameter(this$04, "this$0");
                                                workInfoLiveData.removeObserver(this$04.G);
                                                this$04.F.postValue(new kj.j(r.f17341e));
                                                this$04.f9082e.postValue(new kj.h(kj.k.f23231c, Integer.valueOf(R.string.lot_of_contacts_message)));
                                                return;
                                        }
                                    }
                                };
                                ll.f fVar = gt.e.f17571c;
                                kt.i iVar = new kt.i(gVar, fVar, fVar, gt.e.f17570b, aVar2);
                                jt.c cVar = new jt.c(new et.a() { // from class: ge.p
                                    @Override // et.a
                                    public final void run() {
                                        int i15 = i11;
                                        SearchContactViewModel this$04 = searchContactViewModel;
                                        LiveData workInfoLiveData = b10;
                                        switch (i15) {
                                            case 0:
                                                Intrinsics.checkNotNullParameter(workInfoLiveData, "$workInfoLiveData");
                                                Intrinsics.checkNotNullParameter(this$04, "this$0");
                                                workInfoLiveData.removeObserver(this$04.G);
                                                return;
                                            default:
                                                Intrinsics.checkNotNullParameter(workInfoLiveData, "$workInfoLiveData");
                                                Intrinsics.checkNotNullParameter(this$04, "this$0");
                                                workInfoLiveData.removeObserver(this$04.G);
                                                this$04.F.postValue(new kj.j(r.f17341e));
                                                this$04.f9082e.postValue(new kj.h(kj.k.f23231c, Integer.valueOf(R.string.lot_of_contacts_message)));
                                                return;
                                        }
                                    }
                                });
                                iVar.a(cVar);
                                searchContactViewModel.f9080c.c(cVar);
                                androidx.work.v vVar = androidx.work.v.f2638a;
                                androidx.work.g gVar2 = new androidx.work.g();
                                androidx.work.v vVar2 = androidx.work.v.f2639b;
                                ?? obj5 = new Object();
                                obj5.f2552a = vVar;
                                obj5.f2557f = -1L;
                                obj5.f2558g = -1L;
                                new HashSet();
                                obj5.f2553b = false;
                                obj5.f2554c = false;
                                obj5.f2552a = vVar2;
                                obj5.f2555d = false;
                                obj5.f2556e = false;
                                obj5.f2559h = gVar2;
                                obj5.f2557f = -1L;
                                obj5.f2558g = -1L;
                                Intrinsics.checkNotNullExpressionValue(obj5, "build(...)");
                                TimeUnit timeUnit2 = TimeUnit.DAYS;
                                j0 j0Var = new j0(ContactsWorker.class);
                                j8.k kVar = j0Var.f2618b;
                                long millis = timeUnit2.toMillis(1L);
                                kVar.getClass();
                                long j10 = 900000;
                                String str4 = j8.k.f21073s;
                                if (millis < 900000) {
                                    androidx.work.u.w().D(str4, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
                                    millis = 900000;
                                }
                                if (millis < 900000) {
                                    androidx.work.u.w().D(str4, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
                                } else {
                                    j10 = millis;
                                }
                                if (millis < 300000) {
                                    androidx.work.u.w().D(str4, String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L), new Throwable[0]);
                                    millis = 300000;
                                }
                                if (millis > j10) {
                                    androidx.work.u.w().D(str4, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(j10)), new Throwable[0]);
                                    millis = j10;
                                }
                                kVar.f21081h = j10;
                                kVar.f21082i = millis;
                                j0Var.f2618b.f21083j = obj5;
                                k0 a11 = j0Var.a();
                                Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
                                i0Var.a((androidx.work.d0) a11);
                                return;
                            }
                            throw new NullPointerException("scheduler == null");
                        }
                        throw new NullPointerException("scheduler is null");
                    }
                    throw new NullPointerException("unit is null");
                }
                return;
            case 3:
                GroupDetailHostActivity this$04 = (GroupDetailHostActivity) obj3;
                e.a aVar3 = (e.a) obj;
                int i15 = GroupDetailHostActivity.f9382p;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                if (aVar3.f14610a == -1) {
                    this$04.K().H.postValue(aVar3);
                    return;
                }
                return;
            case 4:
                MessageInvitesActivity this$05 = (MessageInvitesActivity) obj3;
                int i16 = MessageInvitesActivity.f9420l;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                if (((e.a) obj).f14610a == -1) {
                    ((SocialChatListViewModel) this$05.x()).j();
                    return;
                }
                return;
            case 5:
                StockGroHelpCenterActivity this$06 = (StockGroHelpCenterActivity) obj3;
                Uri uri = (Uri) obj;
                int i17 = StockGroHelpCenterActivity.f9532l;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                if (uri != null && (query = this$06.getContentResolver().query(uri, null, null, null, null)) != null) {
                    try {
                        int columnIndex = query.getColumnIndex("_size");
                        query.moveToFirst();
                        int parseInt = Integer.parseInt(query.getString(columnIndex).toString());
                        if (((StockGroHelpViewModel) this$06.x()).f9537q + parseInt < 15728640) {
                            ((StockGroHelpViewModel) this$06.x()).h(vl.b.x(this$06, uri), uri, dp.b.W0(this$06, uri).getPath(), parseInt);
                        } else {
                            String string4 = this$06.getString(R.string.max_file_size_toast);
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            String format = String.format(string4, Arrays.copyOf(new Object[]{15}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            Toast.makeText(this$06, format, 0).show();
                        }
                        Unit unit = Unit.f23355a;
                        yk.g.k(query, null);
                        return;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            yk.g.k(query, th2);
                            throw th3;
                        }
                    }
                }
                return;
            case 6:
                gf.e this$07 = (gf.e) obj3;
                int i18 = gf.e.f17361m;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                if (((e.a) obj).f14610a == -1 && (this$07.getActivity() instanceof MainActivity)) {
                    HomeViewModel homeViewModel = (HomeViewModel) this$07.r();
                    if (((uh.i) homeViewModel.f9555x.getValue()).f37206d) {
                        homeViewModel.i();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                PortfolioDetailActivity this$08 = (PortfolioDetailActivity) obj3;
                int i19 = PortfolioDetailActivity.f9774m;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                ((PortfolioDetailViewModel) this$08.x()).i();
                return;
            case 8:
                FollowerFollowingActivity this$09 = (FollowerFollowingActivity) obj3;
                int i20 = FollowerFollowingActivity.f9977n;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                if (((e.a) obj).f14610a == -1) {
                    FollowerFollowingViewModel followerFollowingViewModel = (FollowerFollowingViewModel) this$09.x();
                    yk.g.H(u0.f(followerFollowingViewModel), null, null, new eh.g(followerFollowingViewModel, null), 3);
                    this$09.setResult(-1);
                    return;
                }
                return;
            case 9:
                fh.b this$010 = (fh.b) obj3;
                e.a aVar4 = (e.a) obj;
                int i21 = fh.b.f16100j;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                int i22 = aVar4.f14610a;
                if (i22 != -1) {
                    if (i22 == 0 && (str2 = this$010.f16102h) != null) {
                        ((GroupMyProfileViewModel) this$010.r()).h(str2);
                        return;
                    }
                    return;
                }
                Intent intent3 = aVar4.f14611b;
                if (intent3 != null && (extras = intent3.getExtras()) != null && extras.getString("GROUP_CHAT_ID") != null && (str = this$010.f16102h) != null) {
                    ((GroupMyProfileViewModel) this$010.r()).h(str);
                    return;
                }
                return;
            case 10:
                y this$011 = (y) obj3;
                e.a aVar5 = (e.a) obj;
                int i23 = y.f23187n;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                if (aVar5.f14610a == -1) {
                    ((UserStatisticsViewModel) this$011.r()).k();
                    Intent intent4 = aVar5.f14611b;
                    if (intent4 != null) {
                        Bundle extras2 = intent4.getExtras();
                        if (extras2 != null) {
                            obj2 = extras2.get("UPDATED_USER_NAME");
                        } else {
                            obj2 = null;
                        }
                        if (obj2 instanceof String) {
                            str3 = (String) obj2;
                        }
                        if (str3 != null && str3.length() != 0) {
                            ((UserStatisticsViewModel) this$011.r()).C.setValue(str3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                UserProfileActivity this$012 = (UserProfileActivity) obj3;
                e.a aVar6 = (e.a) obj;
                int i24 = UserProfileActivity.f10064p;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                if (aVar6.f14610a == -1) {
                    Intent intent5 = aVar6.f14611b;
                    if (intent5 != null) {
                        Bundle extras3 = intent5.getExtras();
                        if (extras3 != null) {
                            bool = Boolean.valueOf(extras3.getBoolean("BLOCKED", false));
                        } else {
                            bool = null;
                        }
                        Boolean bool3 = Boolean.TRUE;
                        if (Intrinsics.a(bool, bool3)) {
                            UserProfileViewModel userProfileViewModel = (UserProfileViewModel) this$012.x();
                            String userId = this$012.f10065k;
                            Intrinsics.checkNotNullParameter(userId, "userId");
                            userProfileViewModel.f9084g.postValue(bool3);
                            try {
                                yk.g.H(u0.f(userProfileViewModel), null, null, new nh.n(userProfileViewModel, userId, null), 3);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    ?? obj6 = new Object();
                    String string5 = this$012.getString(R.string.profile_reported_body);
                    String string6 = this$012.getString(R.string.report_sent_text);
                    String string7 = this$012.getString(R.string.ok);
                    eb.f fVar2 = new eb.f(this$012, i11);
                    Intrinsics.c(string5);
                    Intrinsics.c(string7);
                    Intrinsics.c(string6);
                    qj.b.b(obj6, this$012, string5, string7, null, string6, null, false, 0, 0, fVar2, 65496);
                    return;
                }
                return;
            default:
                Function1 tmp0 = (Function1) obj3;
                int i25 = wl.w.f39292f;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke((e.a) obj);
                return;
        }
    }

    @Override // z5.f
    public long e(long j10) {
        return e5.x.j((j10 * r0.f42123e) / 1000000, 0L, ((z5.u) this.f3152b).f42128j - 1);
    }

    @Override // fo.g
    public void f(ChipGroup chipGroup, ArrayList checkedIds) {
        OptionDetailFragment this$0 = (OptionDetailFragment) this.f3152b;
        int i10 = OptionDetailFragment.f8591h;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(chipGroup, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(checkedIds, "checkedIds");
        String str = "1W";
        if (checkedIds.isEmpty()) {
            if (((OptionDetailViewModel) this$0.r()).K) {
                l7.g gVar = ((mh) this$0.q()).H.f11258h;
                mo.g gVar2 = (mo.g) ((Map) gVar.f24117c).get(Integer.valueOf(R.id.one_week));
                if (gVar2 != null && gVar.a(gVar2)) {
                    gVar.e();
                }
            } else {
                l7.g gVar3 = ((mh) this$0.q()).H.f11258h;
                mo.g gVar4 = (mo.g) ((Map) gVar3.f24117c).get(Integer.valueOf(R.id.one_day));
                if (gVar4 != null && gVar3.a(gVar4)) {
                    gVar3.e();
                }
                str = "1D";
            }
        } else {
            Integer num = (Integer) g0.u(checkedIds);
            if (num != null && num.intValue() == R.id.one_day) {
                ((OptionDetailViewModel) this$0.r()).k(true);
            } else if (num != null && num.intValue() == R.id.one_week) {
                ((OptionDetailViewModel) this$0.r()).k(false);
            }
            str = "1D";
        }
        AnalyticEvent analyticEvent = new AnalyticEvent("app_market_opt_chart_tframe", p0.f(new Pair("selected_time", str)));
        this$0.z(analyticEvent);
        this$0.B(analyticEvent);
    }

    @Override // o5.t
    public int g(Object obj) {
        boolean z10;
        b5.v vVar = (b5.v) this.f3152b;
        o5.m mVar = (o5.m) obj;
        Pattern pattern = o5.u.f29679a;
        mVar.getClass();
        String str = vVar.f3652l;
        String str2 = mVar.f29631b;
        if (!str2.equals(str) && !str2.equals(o5.u.b(vVar))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && mVar.c(vVar, false)) {
            return 1;
        }
        return 0;
    }

    @Override // bq.d
    public Object h(a4 a4Var) {
        int i10 = this.f3151a;
        Object obj = this.f3152b;
        switch (i10) {
            case 0:
            case 1:
                return obj;
            default:
                return CrashlyticsRegistrar.a((CrashlyticsRegistrar) obj, a4Var);
        }
    }

    @Override // r7.j
    public void i() {
        int i10 = this.f3151a;
        Object obj = this.f3152b;
        switch (i10) {
            case 19:
                ja.i this$0 = (ja.i) obj;
                int i11 = ja.i.f21269i;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((MarketOptionsListViewModel) this$0.r()).i(ja.n.f21283a);
                return;
            case 20:
                la.d this$02 = (la.d) obj;
                int i12 = la.d.f24382h;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                MarketOptionSearchViewModel marketOptionSearchViewModel = (MarketOptionSearchViewModel) this$02.r();
                Intrinsics.checkNotNullParameter(HttpUrl.FRAGMENT_ENCODE_SET, "<set-?>");
                marketOptionSearchViewModel.f8649o = HttpUrl.FRAGMENT_ENCODE_SET;
                MarketOptionSearchViewModel.h((MarketOptionSearchViewModel) this$02.r());
                return;
            case 21:
            case 23:
            case 25:
            case 26:
            default:
                sc.i this$03 = (sc.i) obj;
                boolean z10 = sc.i.f34563j;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                this$03.J();
                return;
            case 22:
                pa.c this$04 = (pa.c) obj;
                int i13 = pa.c.f30804j;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                ((MarketInsightsDetailViewModel) this$04.r()).h();
                return;
            case 24:
                sa.l this$05 = (sa.l) obj;
                int i14 = sa.l.f34421j;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                ((MarketAssetInsightsViewModel) this$05.r()).i(ra.e.f33558e);
                return;
            case 27:
                pc.f this$06 = (pc.f) obj;
                int i15 = pc.f.f30841j;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                ((ArenaMyLeaguesViewModel) this$06.r()).h();
                return;
        }
    }

    @Override // e5.j
    public void invoke(Object obj) {
        int i10 = this.f3151a;
        Object obj2 = this.f3152b;
        switch (i10) {
            case 4:
                int i11 = i5.g0.f19446j0;
                ((y0) obj).N((n0) obj2);
                return;
            case 5:
                int i12 = i5.g0.f19446j0;
                ((y0) obj).O((m1) obj2);
                return;
            case 6:
                ((y0) obj).N(((i5.d0) obj2).f19384a.N);
                return;
            case 7:
                ((y0) obj).C((q0) obj2);
                return;
            case 8:
                ((y0) obj).x((d5.c) obj2);
                return;
            case 9:
                ((y0) obj).E((b5.p) obj2);
                return;
            default:
                ((y0) obj).z((p1) obj2);
                return;
        }
    }

    @Override // yo.k
    public void j(yo.g tab, int i10) {
        int i11 = this.f3151a;
        Object obj = this.f3152b;
        switch (i11) {
            case 18:
                ia.b this$0 = (ia.b) obj;
                int i12 = ia.b.f19748h;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(tab, "tab");
                View childAt = ((vj) this$0.q()).f6444t.getChildAt(0);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                if (childAt instanceof LinearLayout) {
                    LinearLayout linearLayout = (LinearLayout) childAt;
                    linearLayout.setShowDividers(2);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(r3.k.getColor(this$0.requireContext(), R.color.themeSelectedTabBackgroundColor));
                    gradientDrawable.setSize(1, 1);
                    linearLayout.setDividerPadding(35);
                    linearLayout.setDividerDrawable(gradientDrawable);
                }
                if (i10 != 0) {
                    if (i10 == 1) {
                        tab.b(this$0.getString(R.string.text_index_options));
                        return;
                    }
                    return;
                }
                tab.b(this$0.getString(R.string.text_stock_options));
                return;
            case 23:
                qa.b this$02 = (qa.b) obj;
                int i13 = qa.b.f31879i;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(tab, "tab");
                if (i10 != 0) {
                    if (i10 == 1) {
                        tab.b(this$02.getString(R.string.text_insights));
                        return;
                    }
                    return;
                }
                tab.b(this$02.getString(R.string.stocks));
                return;
            case 25:
                nc.d this$03 = (nc.d) obj;
                int i14 = nc.d.f28615i;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(tab, "tab");
                View childAt2 = ((of) this$03.q()).f5663v.getChildAt(0);
                Intrinsics.checkNotNullExpressionValue(childAt2, "getChildAt(...)");
                if (childAt2 instanceof LinearLayout) {
                    LinearLayout linearLayout2 = (LinearLayout) childAt2;
                    linearLayout2.setShowDividers(2);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setColor(r3.k.getColor(linearLayout2.getContext(), R.color.tabSeparatorColor));
                    gradientDrawable2.setSize(3, 1);
                    linearLayout2.setDividerPadding(35);
                    linearLayout2.setDividerDrawable(gradientDrawable2);
                }
                if (i10 != 0) {
                    if (i10 == 1) {
                        tab.b(this$03.getString(R.string.my_leagues));
                        return;
                    }
                    return;
                }
                tab.b(this$03.getString(R.string.upcoming));
                return;
            case 26:
                oc.j this$04 = (oc.j) obj;
                boolean z10 = oc.j.f29952h;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(tab, "tab");
                Context requireContext = this$04.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                TabLayout tabLayout = ((qf) this$04.q()).f5857u;
                Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
                tab.f41756e = el.l.f0(requireContext, tabLayout, i10);
                tab.c();
                TextView textView = null;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            View view = tab.f41756e;
                            if (view != null) {
                                textView = (TextView) view.findViewById(R.id.tv_tabtext);
                            }
                            if (textView != null) {
                                textView.setText(this$04.getString(R.string.text_fno));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    View view2 = tab.f41756e;
                    if (view2 != null) {
                        textView = (TextView) view2.findViewById(R.id.tv_tabtext);
                    }
                    if (textView != null) {
                        textView.setText(this$04.getString(R.string.stocks));
                        return;
                    }
                    return;
                }
                View view3 = tab.f41756e;
                if (view3 != null) {
                    textView = (TextView) view3.findViewById(R.id.tv_tabtext);
                }
                if (textView != null) {
                    textView.setText(this$04.getString(R.string.text_all));
                    return;
                }
                return;
            default:
                CompletedLeagueDetailActivity this$05 = (CompletedLeagueDetailActivity) obj;
                int i15 = CompletedLeagueDetailActivity.f8967k;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(tab, "tab");
                View childAt3 = ((i1) this$05.w()).f5003t.getChildAt(0);
                Intrinsics.checkNotNullExpressionValue(childAt3, "getChildAt(...)");
                if (childAt3 instanceof LinearLayout) {
                    LinearLayout linearLayout3 = (LinearLayout) childAt3;
                    linearLayout3.setShowDividers(2);
                    GradientDrawable gradientDrawable3 = new GradientDrawable();
                    gradientDrawable3.setColor(r3.k.getColor(this$05, R.color.tabSeparatorColor));
                    gradientDrawable3.setSize(3, 1);
                    linearLayout3.setDividerPadding(35);
                    linearLayout3.setDividerDrawable(gradientDrawable3);
                }
                if (i10 != 0) {
                    if (i10 == 1) {
                        tab.b(this$05.getString(R.string.ranks));
                        return;
                    }
                    return;
                }
                tab.b(this$05.getString(R.string.portfolio));
                return;
        }
    }

    public boolean k(t9.c cVar, int i10, Bundle bundle) {
        View view = (View) this.f3152b;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                ((g4.g) cVar.f35633b).d();
                Parcelable parcelable = (Parcelable) ((g4.g) cVar.f35633b).h();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        ClipDescription f10 = ((g4.g) cVar.f35633b).f();
        g4.g gVar = (g4.g) cVar.f35633b;
        e.l lVar = new e.l(new ClipData(f10, new ClipData.Item(gVar.a())), 2);
        ((d4.e) lVar.f14641b).c(gVar.e());
        ((d4.e) lVar.f14641b).setExtras(bundle);
        if (n1.j(view, ((d4.e) lVar.f14641b).b()) != null) {
            return false;
        }
        return true;
    }

    public void l(Display display) {
        x5.s sVar = (x5.s) this.f3152b;
        sVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            sVar.f40051k = refreshRate;
            sVar.f40052l = (refreshRate * 80) / 100;
        } else {
            e5.m.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            sVar.f40051k = -9223372036854775807L;
            sVar.f40052l = -9223372036854775807L;
        }
    }

    public float m(float f10) {
        return ((u) this.f3152b).f3153l.b() * f10;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i10 = this.f3151a;
        String fid = null;
        Object obj = this.f3152b;
        switch (i10) {
            case 0:
                LoginActivity this$0 = (LoginActivity) obj;
                int i11 = LoginActivity.f8700l;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(task, "task");
                if (!task.isSuccessful()) {
                    String str = "getInstanceId failed: " + task.getException();
                    Object[] objArr = new Object[0];
                    Intrinsics.checkNotNullParameter("LoginActivity", "tag");
                    com.google.android.gms.internal.p002firebaseauthapi.a.g(str, "s", objArr, "params", "LoginActivity").getClass();
                    ek.u.k(objArr);
                    return;
                }
                nq.a aVar = (nq.a) task.getResult();
                if (aVar != null) {
                    fid = aVar.f29073a;
                }
                if (fid != null) {
                    LoginViewModel loginViewModel = (LoginViewModel) this$0.x();
                    Intrinsics.checkNotNullParameter(fid, "fid");
                    loginViewModel.f9081d.setFid(fid);
                    String concat = "firebase installation token: ".concat(fid);
                    Object[] objArr2 = new Object[0];
                    Intrinsics.checkNotNullParameter("LoginActivity", "tag");
                    com.google.android.gms.internal.p002firebaseauthapi.a.g(concat, "s", objArr2, "params", "LoginActivity").getClass();
                    ek.u.k(objArr2);
                    return;
                }
                Object[] objArr3 = new Object[0];
                Intrinsics.checkNotNullParameter("LoginActivity", "tag");
                com.google.android.gms.internal.p002firebaseauthapi.a.g("firebase installation token was null", "s", objArr3, "params", "LoginActivity").getClass();
                ek.u.k(objArr3);
                return;
            case 1:
                MainActivity mainActivity = (MainActivity) obj;
                if (!task.isSuccessful()) {
                    int i12 = LoginActivity.f8700l;
                    String str2 = "getInstanceId failed: " + task.getException();
                    Object[] objArr4 = new Object[0];
                    Intrinsics.checkNotNullParameter("LoginActivity", "tag");
                    com.google.android.gms.internal.p002firebaseauthapi.a.g(str2, "s", objArr4, "params", "LoginActivity").getClass();
                    ek.u.k(objArr4);
                    return;
                }
                nq.a aVar2 = (nq.a) task.getResult();
                if (aVar2 != null) {
                    fid = aVar2.f29073a;
                }
                String tag = "MainActivity";
                if (fid != null) {
                    MainViewModel mainViewModel = (MainViewModel) mainActivity.x();
                    Intrinsics.checkNotNullParameter(fid, "fid");
                    mainViewModel.f9081d.setFid(fid);
                    switch (MainActivity.f9574r.f14317a) {
                        case 14:
                            break;
                        default:
                            de.d dVar = KycWebViewActivity.f9704k;
                            tag = "KycActivity";
                            break;
                    }
                    String concat2 = "firebase installation token: ".concat(fid);
                    Object[] objArr5 = new Object[0];
                    Intrinsics.checkNotNullParameter(tag, "tag");
                    com.google.android.gms.internal.p002firebaseauthapi.a.g(concat2, "s", objArr5, "params", tag).getClass();
                    ek.u.k(objArr5);
                    return;
                }
                switch (MainActivity.f9574r.f14317a) {
                    case 14:
                        break;
                    default:
                        de.d dVar2 = KycWebViewActivity.f9704k;
                        tag = "KycActivity";
                        break;
                }
                Object[] objArr6 = new Object[0];
                Intrinsics.checkNotNullParameter(tag, "tag");
                com.google.android.gms.internal.p002firebaseauthapi.a.g("firebase installation token was null", "s", objArr6, "params", tag).getClass();
                ek.u.k(objArr6);
                return;
            case 2:
                mj.b this$02 = (mj.b) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(task, "it");
                this$02.getClass();
                return;
            case 3:
                SignInKickstarter signInKickstarter = (SignInKickstarter) obj;
                signInKickstarter.getClass();
                try {
                    signInKickstarter.k(((CredentialRequestResponse) task.getResult(ApiException.class)).getCredential());
                    return;
                } catch (ResolvableApiException e10) {
                    if (e10.getStatusCode() == 6) {
                        signInKickstarter.h(am.d.a(new PendingIntentRequiredException(101, e10.getResolution())));
                        return;
                    } else {
                        signInKickstarter.m();
                        return;
                    }
                } catch (ApiException unused) {
                    signInKickstarter.m();
                    return;
                }
            case 4:
                SmartLockHandler smartLockHandler = (SmartLockHandler) obj;
                smartLockHandler.getClass();
                if (task.isSuccessful()) {
                    smartLockHandler.h(am.d.c(smartLockHandler.f10965h));
                    return;
                }
                if (task.getException() instanceof ResolvableApiException) {
                    smartLockHandler.h(am.d.a(new PendingIntentRequiredException(100, ((ResolvableApiException) task.getException()).getResolution())));
                    return;
                }
                Log.w("SmartLockViewModel", "Non-resolvable exception: " + task.getException());
                smartLockHandler.h(am.d.a(new FirebaseUiException(0, "Error when saving credential.", task.getException())));
                return;
            case 5:
                com.google.firebase.messaging.d0.a((Intent) obj);
                return;
            case 6:
                int i13 = e0.f11741b;
                ((f0) obj).f11745b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) obj).cancel(false);
                return;
        }
    }
}
