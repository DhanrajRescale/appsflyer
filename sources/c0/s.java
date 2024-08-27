package c0;

import android.webkit.WebSettings;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.lifecycle.u0;
import c2.q0;
import c2.v0;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.CreateGroupUser;
import com.assetgro.stockgro.data.model.PrivateChatGroup;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.feature_market.data.remote.FnoOrderInfoResponseDto;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolio;
import com.assetgro.stockgro.feature_market.domain.model.OptionOverview;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.create.GroupCreateViewModel;
import com.assetgro.stockgro.ui.home.homepage.data.HomeBannerDto;
import com.assetgro.stockgro.ui.home.homepage.data.MarketStocks;
import com.assetgro.stockgro.ui.home.homepage.data.PortfolioListItem;
import com.assetgro.stockgro.ui.home.homepage.data.SocialExpertGroup;
import com.assetgro.stockgro.ui.home.homepage.data.UserInfoItem;
import com.assetgro.stockgro.ui.portfolio.history.PortfolioFnoHistoryViewModel;
import com.assetgro.stockgro.ui.portfolio.orders.PortfolioFnoOrdersViewModel;
import com.assetgro.stockgro.ui.profile.report.ReportEntityActivity;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileViewModel;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import d0.r0;
import d2.g3;
import d2.h3;
import d2.k1;
import i0.w2;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import m0.w4;
import m0.x4;
import okhttp3.HttpUrl;
import r0.a3;
import r0.q1;
import r0.z2;
import t0.g1;
import t0.l3;

/* loaded from: classes.dex */
public final class s extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7569b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7570c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7571d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i10, Object obj, Object obj2, Object obj3) {
        super(0);
        this.f7568a = i10;
        this.f7569b = obj;
        this.f7570c = obj2;
        this.f7571d = obj3;
    }

    public final Double a() {
        int i10;
        double d10 = 0.0d;
        int i11 = this.f7568a;
        Object obj = this.f7571d;
        Object obj2 = this.f7570c;
        Object obj3 = this.f7569b;
        switch (i11) {
            case 8:
                int intValue = ((Number) ((l3) ((iu.z) obj2).f20560a).getValue()).intValue();
                FnoOrderInfoResponseDto fnoOrderInfoResponseDto = (FnoOrderInfoResponseDto) ((l3) obj3).getValue();
                if (fnoOrderInfoResponseDto != null) {
                    i10 = fnoOrderInfoResponseDto.getLotSize();
                } else {
                    i10 = 0;
                }
                double z02 = yk.j.z0((l3) obj) * intValue * i10;
                if (z02 >= 0.0d) {
                    d10 = z02;
                }
                return Double.valueOf(d10);
            default:
                double doubleValue = ((Number) ((g1) obj).getValue()).doubleValue() * ((OptionOverview) obj2).getLotSize() * ((Number) ((l3) obj3).getValue()).intValue();
                if (doubleValue >= 0.0d) {
                    d10 = doubleValue;
                }
                return Double.valueOf(d10);
        }
    }

    public final void d() {
        b3.j jVar;
        f3.g gVar;
        int i10 = this.f7568a;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        int i11 = 0;
        int i12 = 1;
        boolean z10 = true;
        Object obj = this.f7570c;
        Object obj2 = this.f7571d;
        Object obj3 = this.f7569b;
        switch (i10) {
            case 3:
                j2.k kVar = (j2.k) ((j2.d) obj).f20685a;
                g3 g3Var = (g3) obj2;
                ((w2) obj3).getClass();
                if (kVar instanceof j2.j) {
                    try {
                        ((k1) g3Var).a(((j2.j) kVar).f20728a);
                        return;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                boolean z11 = kVar instanceof j2.i;
                return;
            case 4:
            case 8:
            case 9:
            default:
                us.f webViewYouTubePlayer$core_release = ((us.d) obj3).getWebViewYouTubePlayer$core_release();
                qg.a initListener = new qg.a((rs.a) obj2, 26);
                ss.b bVar = (ss.b) obj;
                webViewYouTubePlayer$core_release.getClass();
                Intrinsics.checkNotNullParameter(initListener, "initListener");
                webViewYouTubePlayer$core_release.f37376c = initListener;
                if (bVar == null) {
                    bVar = ss.b.f34767b;
                }
                WebSettings settings = webViewYouTubePlayer$core_release.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setMediaPlaybackRequiresUserGesture(false);
                settings.setCacheMode(-1);
                webViewYouTubePlayer$core_release.addJavascriptInterface(new qs.i(webViewYouTubePlayer$core_release), "YouTubePlayerBridge");
                InputStream inputStream = webViewYouTubePlayer$core_release.getResources().openRawResource(R.raw.ayp_youtube_player);
                Intrinsics.checkNotNullExpressionValue(inputStream, "resources.openRawResourc…R.raw.ayp_youtube_player)");
                Intrinsics.checkNotNullParameter(inputStream, "inputStream");
                try {
                    try {
                        String B = vt.g0.B(fu.n.a(new BufferedReader(new InputStreamReader(inputStream, "utf-8"))), "\n", null, null, null, 62);
                        yk.g.k(inputStream, null);
                        String n10 = kotlin.text.s.n(B, "<<injectedPlayerVars>>", bVar.toString(), false);
                        String string = bVar.f34768a.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
                        Intrinsics.checkNotNullExpressionValue(string, "playerOptions.getString(Builder.ORIGIN)");
                        webViewYouTubePlayer$core_release.loadDataWithBaseURL(string, n10, "text/html", "utf-8", null);
                        webViewYouTubePlayer$core_release.setWebChromeClient(new xf.c0(webViewYouTubePlayer$core_release, i12));
                        return;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            yk.g.k(inputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Exception unused2) {
                    throw new RuntimeException("Can't parse HTML file.");
                }
            case 5:
                c2.m0 m0Var = (c2.m0) obj3;
                q0 q0Var = m0Var.f7776x;
                q0Var.f7822j = 0;
                v0.h u10 = q0Var.f7813a.u();
                int i13 = u10.f37655c;
                if (i13 > 0) {
                    Object[] objArr = u10.f37653a;
                    int i14 = 0;
                    do {
                        c2.m0 m0Var2 = ((androidx.compose.ui.node.a) objArr[i14]).f1423x.f7828p;
                        Intrinsics.c(m0Var2);
                        m0Var2.f7759g = m0Var2.f7760h;
                        m0Var2.f7760h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        if (m0Var2.f7761i == 2) {
                            m0Var2.f7761i = 3;
                        }
                        i14++;
                    } while (i14 < i13);
                }
                m0Var.L(c2.f.f7674c);
                v0 v0Var = m0Var.j().J;
                if (v0Var != null) {
                    boolean z12 = v0Var.f7852g;
                    List m10 = ((q0) obj2).f7813a.m();
                    int size = m10.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        v0 U0 = ((androidx.compose.ui.node.a) m10.get(i15)).f1422w.f7656c.U0();
                        if (U0 != null) {
                            U0.f7852g = z12;
                        }
                    }
                }
                ((v0) obj).F0().d();
                if (m0Var.j().J != null) {
                    List m11 = ((q0) obj2).f7813a.m();
                    int size2 = m11.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        v0 U02 = ((androidx.compose.ui.node.a) m11.get(i16)).f1422w.f7656c.U0();
                        if (U02 != null) {
                            U02.f7852g = false;
                        }
                    }
                }
                v0.h u11 = m0Var.f7776x.f7813a.u();
                int i17 = u11.f37655c;
                if (i17 > 0) {
                    Object[] objArr2 = u11.f37653a;
                    do {
                        c2.m0 m0Var3 = ((androidx.compose.ui.node.a) objArr2[i11]).f1423x.f7828p;
                        Intrinsics.c(m0Var3);
                        int i18 = m0Var3.f7759g;
                        int i19 = m0Var3.f7760h;
                        if (i18 != i19 && i19 == Integer.MAX_VALUE) {
                            m0Var3.w0();
                        }
                        i11++;
                    } while (i11 < i17);
                }
                m0Var.L(c2.f.f7675d);
                return;
            case 6:
                d2.a aVar = (d2.a) obj3;
                aVar.removeOnAttachStateChangeListener((l.f) obj);
                h3 listener = (h3) obj2;
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                Intrinsics.checkNotNullParameter(listener, "listener");
                j4.a n0 = hl.f.n0(aVar);
                Intrinsics.checkNotNullParameter(listener, "listener");
                n0.f20936a.remove(listener);
                return;
            case 7:
                List list = (List) obj3;
                b3.n nVar = (b3.n) obj;
                int size3 = list.size();
                for (int i20 = 0; i20 < size3; i20++) {
                    Object a10 = ((a2.l0) list.get(i20)).a();
                    if (a10 instanceof b3.j) {
                        jVar = (b3.j) a10;
                    } else {
                        jVar = null;
                    }
                    if (jVar != null) {
                        b3.l lVar = nVar.f3134a;
                        lVar.getClass();
                        b3.e eVar = jVar.f3124a;
                        String obj4 = eVar.f3112b.toString();
                        f3.g gVar2 = lVar.f3123a;
                        f3.c w10 = gVar2.w(obj4);
                        if (w10 instanceof f3.g) {
                            gVar = (f3.g) w10;
                        } else {
                            gVar = null;
                        }
                        if (gVar == null) {
                            gVar2.E(obj4, new f3.b(new char[0]));
                        }
                        f3.c p10 = gVar2.p(obj4);
                        if (p10 instanceof f3.g) {
                            jVar.f3125b.invoke(new b3.d(eVar.f3112b, (f3.g) p10));
                        } else {
                            StringBuilder s7 = da.e.s("no object found for key <", obj4, ">, found [");
                            s7.append(p10.i());
                            s7.append("] : ");
                            s7.append(p10);
                            throw new CLParsingException(s7.toString(), gVar2);
                        }
                    }
                    nVar.f3139f.add(jVar);
                }
                nVar.f3134a.a((b3.u) obj2);
                return;
            case 10:
                ((Function1) obj3).invoke((FnoPortfolio) obj);
                ((g1) obj2).setValue(Boolean.FALSE);
                return;
            case 11:
                ((Function2) obj).invoke((String) obj2, Integer.valueOf(((kb.b) ((l3) obj3).getValue()).f23025b));
                return;
            case 12:
                g1 g1Var = (g1) obj2;
                if (kotlin.text.w.X((String) g1Var.getValue()).toString().length() != 0) {
                    ((androidx.compose.ui.focus.b) ((l1.f) obj3)).a(false, true, true);
                    ((Function1) obj).invoke((String) g1Var.getValue());
                    g1Var.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                }
                return;
            case 13:
                ((Function1) obj3).invoke((yd.f) obj);
                ((g1) obj2).setValue(Boolean.FALSE);
                return;
            case 14:
                GroupCreateViewModel groupCreateViewModel = (GroupCreateViewModel) obj3;
                String obj5 = kotlin.text.w.X((String) ((g1) obj2).getValue()).toString();
                e1.s sVar = (e1.s) obj;
                ArrayList arrayList = new ArrayList(vt.z.k(sVar));
                ListIterator listIterator = sVar.listIterator();
                while (true) {
                    e1.x xVar = (e1.x) listIterator;
                    if (xVar.hasNext()) {
                        arrayList.add(((CreateGroupUser) xVar.next()).getUserId());
                    } else {
                        ArrayList memberIds = vt.g0.S(arrayList);
                        groupCreateViewModel.B = UUID.randomUUID().toString();
                        groupCreateViewModel.C = obj5;
                        groupCreateViewModel.D = HttpUrl.FRAGMENT_ENCODE_SET;
                        Intrinsics.checkNotNullParameter(memberIds, "memberIds");
                        groupCreateViewModel.f9084g.postValue(Boolean.TRUE);
                        String str2 = groupCreateViewModel.B;
                        String str3 = groupCreateViewModel.C;
                        String str4 = groupCreateViewModel.f9124w;
                        String str5 = groupCreateViewModel.f9125x;
                        long currentTimeMillis = System.currentTimeMillis() * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                        ChatRepository chatRepository = groupCreateViewModel.f9116o;
                        nt.h c10 = chatRepository.createPrivateChatGroup(new PrivateChatGroup(str2, str3, str4, str5, currentTimeMillis, chatRepository.getUserId(), memberIds, groupCreateViewModel.D)).c(((kq.e) groupCreateViewModel.f9079b).J());
                        jt.d dVar = new jt.d(new id.h(9, new md.a(groupCreateViewModel, 0)), new id.h(10, new md.a(groupCreateViewModel, 1)));
                        c10.a(dVar);
                        groupCreateViewModel.f9080c.c(dVar);
                        return;
                    }
                }
            case 15:
                Function2 function2 = (Function2) obj3;
                String str6 = (String) obj;
                if (str6 != null) {
                    str = str6;
                }
                function2.invoke(str, (AnalyticEvent) obj2);
                return;
            case 16:
                ((Function2) obj3).invoke(((MarketStocks) obj).getRedirectionUrl(), (AnalyticEvent) obj2);
                return;
            case 17:
                Function2 function22 = (Function2) obj3;
                String redirectionUrl = ((HomeBannerDto) obj).getRedirectionUrl();
                if (redirectionUrl != null) {
                    str = redirectionUrl;
                }
                function22.invoke(str, (AnalyticEvent) obj2);
                return;
            case 18:
                ((Function2) obj3).invoke(((PortfolioListItem) obj).getRedirectionUrl(), (AnalyticEvent) obj2);
                return;
            case 19:
                ((Function2) obj3).invoke(((SocialExpertGroup) obj).getRedirectionUrl(), (AnalyticEvent) obj2);
                return;
            case 20:
                ((Function2) obj3).invoke(((UserInfoItem) obj).getRedirectionUrl(), (AnalyticEvent) obj2);
                return;
            case 21:
                String lowerCase = ((String) ((List) obj).get(((Number) ((g1) obj2).getValue()).intValue())).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                ((PortfolioFnoHistoryViewModel) obj3).h(lowerCase, null, null, null);
                return;
            case 22:
                String lowerCase2 = ((String) ((List) obj).get(((Number) ((g1) obj2).getValue()).intValue())).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                ((PortfolioFnoOrdersViewModel) obj3).i(lowerCase2);
                return;
            case 23:
                w4 w4Var = (w4) obj3;
                if (w4Var.c() != x4.f27081a) {
                    yk.g.H((qu.f0) obj, null, null, new hh.d(w4Var, null), 3);
                    return;
                } else {
                    ((ReportEntityActivity) obj2).finish();
                    return;
                }
            case 24:
                kh.y yVar = (kh.y) obj3;
                UserStatisticsViewModel userStatisticsViewModel = (UserStatisticsViewModel) yVar.r();
                String str7 = yVar.f23190i;
                if (!WifiService.INSTANCE.getInstance().isOnline()) {
                    userStatisticsViewModel.f9083f.setValue(ni.j.i("Not connected to internet"));
                } else {
                    userStatisticsViewModel.f9084g.postValue(Boolean.TRUE);
                    yk.g.H(u0.f(userStatisticsViewModel), null, null, new kh.c0(userStatisticsViewModel, str7, null, false), 3);
                }
                yk.g.H((qu.f0) obj, null, null, new kh.t((w4) obj2, null), 3);
                return;
            case 25:
                UserProfileActivity userProfileActivity = (UserProfileActivity) obj3;
                UserProfileViewModel userProfileViewModel = (UserProfileViewModel) userProfileActivity.x();
                String str8 = ((UserProfileViewModel) userProfileActivity.x()).f10079w;
                userProfileViewModel.f9084g.postValue(Boolean.TRUE);
                nt.h c11 = userProfileViewModel.f10071o.blockUserOnPrivateChat(true, str8).c(((kq.e) userProfileViewModel.f9079b).J());
                jt.d dVar2 = new jt.d(new nh.k(1, new ja.g(userProfileViewModel, z10 ? 1 : 0, 6)), new nh.k(2, new nh.m(userProfileViewModel, i11)));
                c11.a(dVar2);
                userProfileViewModel.f9080c.c(dVar2);
                yk.g.H((qu.f0) obj, null, null, new nh.d((w4) obj2, null), 3);
                return;
            case 26:
                if (((uh.i) ((l3) obj3).getValue()).f37205c) {
                    ((MissionsHomeViewModel) obj).j(new uh.g(false));
                    return;
                } else {
                    ((Function0) obj2).mo2invoke();
                    return;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f7568a;
        Object obj = this.f7571d;
        Object obj2 = this.f7570c;
        Object obj3 = this.f7569b;
        switch (i10) {
            case 0:
                j jVar = (j) ((l3) obj3).getValue();
                m0 m0Var = (m0) obj2;
                return new p(m0Var, jVar, (d) obj, new r0((IntRange) m0Var.f7533d.f7492e.getValue(), jVar));
            case 1:
                return new e0.u((hu.d) ((l3) obj3).getValue(), (Function1) ((l3) obj2).getValue(), ((Number) ((Function0) obj).mo2invoke()).intValue());
            case 2:
                f0.m mVar = (f0.m) obj3;
                m1.d R0 = f0.m.R0(mVar, (a2.u) obj2, (Function0) obj);
                if (R0 == null) {
                    return null;
                }
                y.s sVar = (y.s) mVar.f15901p;
                if (!w2.j.a(sVar.f40931w, 0L)) {
                    return R0.g(m1.c.k(sVar.U0(sVar.f40931w, R0)));
                }
                throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
            case 3:
                d();
                return Unit.f23355a;
            case 4:
                if (((Boolean) ((z2) obj3).f32833c.f32718c.invoke(a3.f32325b)).booleanValue()) {
                    yk.g.H((qu.f0) obj2, null, null, new q1((z2) obj, null), 3);
                }
                return Boolean.TRUE;
            case 5:
                d();
                return Unit.f23355a;
            case 6:
                d();
                return Unit.f23355a;
            case 7:
                d();
                return Unit.f23355a;
            case 8:
                return a();
            case 9:
                return a();
            case 10:
                d();
                return Unit.f23355a;
            case 11:
                d();
                return Unit.f23355a;
            case 12:
                d();
                return Unit.f23355a;
            case 13:
                d();
                return Unit.f23355a;
            case 14:
                d();
                return Unit.f23355a;
            case 15:
                d();
                return Unit.f23355a;
            case 16:
                d();
                return Unit.f23355a;
            case 17:
                d();
                return Unit.f23355a;
            case 18:
                d();
                return Unit.f23355a;
            case 19:
                d();
                return Unit.f23355a;
            case 20:
                d();
                return Unit.f23355a;
            case 21:
                d();
                return Unit.f23355a;
            case 22:
                d();
                return Unit.f23355a;
            case 23:
                d();
                return Unit.f23355a;
            case 24:
                d();
                return Unit.f23355a;
            case 25:
                d();
                return Unit.f23355a;
            case 26:
                d();
                return Unit.f23355a;
            default:
                d();
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(iu.z zVar, g1 g1Var, g1 g1Var2) {
        super(0);
        this.f7568a = 8;
        this.f7570c = zVar;
        this.f7569b = g1Var;
        this.f7571d = g1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, Object obj2, g1 g1Var, int i10) {
        super(0);
        this.f7568a = i10;
        this.f7570c = obj;
        this.f7571d = obj2;
        this.f7569b = g1Var;
    }
}
