package kh;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.j0;
import ba.gj;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.RecentPerformance;
import com.assetgro.stockgro.data.remote.response.UserStatsAndResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.self.MyProfileActivity;
import com.assetgro.stockgro.ui.profile.statistics.UserStatisticsViewModel;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import java.util.List;
import k7.y0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkh/g;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/profile/statistics/UserStatisticsViewModel;", "Lba/gj;", "<init>", "()V", "yk/o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class g extends gd.m<UserStatisticsViewModel, gj> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f23134i = 0;

    /* renamed from: g, reason: collision with root package name */
    public k f23135g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23136h = true;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_league_statistics;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((UserStatisticsViewModel) r()).f10055r.observe(this, new ch.c(11, new f(this, 0)));
        ((UserStatisticsViewModel) r()).L.observe(this, new ch.c(11, new f(this, 1)));
        ((UserStatisticsViewModel) r()).F.observe(this, new ch.c(11, new f(this, 2)));
        ((UserStatisticsViewModel) r()).H.observe(this, new ch.c(11, new f(this, 3)));
        ((UserStatisticsViewModel) r()).f10056s.observe(this, new ch.c(11, new f(this, 4)));
        ((UserStatisticsViewModel) r()).I.observe(this, new ch.c(11, new f(this, 5)));
        ((UserStatisticsViewModel) r()).E.observe(this, new ch.c(11, new f(this, 6)));
    }

    @Override // gd.m
    public final void E(View view) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        j0 activity = getActivity();
        final int i10 = 0;
        final int i11 = 1;
        if (activity instanceof UserProfileActivity) {
            this.f23136h = true;
            j0 activity2 = getActivity();
            Intrinsics.d(activity2, "null cannot be cast to non-null type com.assetgro.stockgro.ui.profile.user.UserProfileActivity");
        } else if (activity instanceof MyProfileActivity) {
            this.f23136h = false;
            j0 activity3 = getActivity();
            Intrinsics.d(activity3, "null cannot be cast to non-null type com.assetgro.stockgro.ui.profile.self.MyProfileActivity");
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("USER_IDENTIFIER");
        } else {
            str = null;
        }
        if (str != null) {
            UserStatisticsViewModel userStatisticsViewModel = (UserStatisticsViewModel) r();
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            userStatisticsViewModel.f10054q = str;
            ((UserStatisticsViewModel) r()).j();
            this.f23136h = ((UserStatisticsViewModel) r()).i(str);
        }
        ((gj) q()).G.setOnClickListener(new View.OnClickListener(this) { // from class: kh.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f23127b;

            {
                this.f23127b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UserStatsAndResponseDto userStatsAndResponseDto;
                List<RecentPerformance> performance;
                String str2;
                Pair pair;
                Integer num = 1;
                int i12 = i10;
                Integer num2 = null;
                g this$0 = this.f23127b;
                switch (i12) {
                    case 0:
                        int i13 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UserStatisticsViewModel userStatisticsViewModel2 = (UserStatisticsViewModel) this$0.r();
                        androidx.lifecycle.e0 e0Var = userStatisticsViewModel2.J;
                        Integer num3 = (Integer) e0Var.getValue();
                        if (num3 != null) {
                            num = num3;
                        }
                        int intValue = num.intValue() - 1;
                        if (intValue >= 1) {
                            e0Var.setValue(Integer.valueOf(intValue));
                            userStatisticsViewModel2.l();
                            return;
                        }
                        return;
                    case 1:
                        int i14 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UserStatisticsViewModel userStatisticsViewModel3 = (UserStatisticsViewModel) this$0.r();
                        Integer num4 = (Integer) userStatisticsViewModel3.K.getValue();
                        if (num4 == null) {
                            num4 = num;
                        }
                        int intValue2 = num4.intValue();
                        androidx.lifecycle.e0 e0Var2 = userStatisticsViewModel3.J;
                        Integer num5 = (Integer) e0Var2.getValue();
                        if (num5 == null) {
                            num5 = num;
                        }
                        if (num5.intValue() <= intValue2) {
                            Integer num6 = (Integer) e0Var2.getValue();
                            if (num6 != null) {
                                num2 = Integer.valueOf(num6.intValue() + 1);
                            }
                            e0Var2.setValue(num2);
                        }
                        Integer num7 = (Integer) e0Var2.getValue();
                        if (num7 != null) {
                            num = num7;
                        }
                        int intValue3 = num.intValue();
                        if (1 <= intValue3 && intValue3 <= intValue2) {
                            userStatisticsViewModel3.l();
                            return;
                        }
                        return;
                    case 2:
                        int i15 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((UserStatisticsViewModel) this$0.r()).F.getValue() == m.f23155h && (userStatsAndResponseDto = (UserStatsAndResponseDto) ((UserStatisticsViewModel) this$0.r()).L.getValue()) != null && (performance = userStatsAndResponseDto.getPerformance()) != null && performance.isEmpty() && this$0.f23136h) {
                            kj.f.k(this$0, "app.stockgro://stockgro.com/arena/league/xx");
                            return;
                        } else {
                            this$0.H();
                            return;
                        }
                    case 3:
                        int i16 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.H();
                        return;
                    default:
                        int i17 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.y(new AnalyticEvent("app_user_profile_earnings", null, 2, null));
                        int i18 = ej.p.f15521j;
                        kj.j jVar = (kj.j) ((UserStatisticsViewModel) this$0.r()).f10055r.getValue();
                        if (jVar == null || (pair = (Pair) jVar.f23227a) == null || (str2 = (String) pair.f23354b) == null) {
                            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        ni.g.d(str2, new AnalyticEvent("app_user_profile_earnings_sub_upgrade", null, 2, null)).show(this$0.getChildFragmentManager(), "SubscribeToAccessBottomSheetDialogFragment");
                        return;
                }
            }
        });
        ((gj) q()).D.setOnClickListener(new View.OnClickListener(this) { // from class: kh.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f23127b;

            {
                this.f23127b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UserStatsAndResponseDto userStatsAndResponseDto;
                List<RecentPerformance> performance;
                String str2;
                Pair pair;
                Integer num = 1;
                int i12 = i11;
                Integer num2 = null;
                g this$0 = this.f23127b;
                switch (i12) {
                    case 0:
                        int i13 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UserStatisticsViewModel userStatisticsViewModel2 = (UserStatisticsViewModel) this$0.r();
                        androidx.lifecycle.e0 e0Var = userStatisticsViewModel2.J;
                        Integer num3 = (Integer) e0Var.getValue();
                        if (num3 != null) {
                            num = num3;
                        }
                        int intValue = num.intValue() - 1;
                        if (intValue >= 1) {
                            e0Var.setValue(Integer.valueOf(intValue));
                            userStatisticsViewModel2.l();
                            return;
                        }
                        return;
                    case 1:
                        int i14 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UserStatisticsViewModel userStatisticsViewModel3 = (UserStatisticsViewModel) this$0.r();
                        Integer num4 = (Integer) userStatisticsViewModel3.K.getValue();
                        if (num4 == null) {
                            num4 = num;
                        }
                        int intValue2 = num4.intValue();
                        androidx.lifecycle.e0 e0Var2 = userStatisticsViewModel3.J;
                        Integer num5 = (Integer) e0Var2.getValue();
                        if (num5 == null) {
                            num5 = num;
                        }
                        if (num5.intValue() <= intValue2) {
                            Integer num6 = (Integer) e0Var2.getValue();
                            if (num6 != null) {
                                num2 = Integer.valueOf(num6.intValue() + 1);
                            }
                            e0Var2.setValue(num2);
                        }
                        Integer num7 = (Integer) e0Var2.getValue();
                        if (num7 != null) {
                            num = num7;
                        }
                        int intValue3 = num.intValue();
                        if (1 <= intValue3 && intValue3 <= intValue2) {
                            userStatisticsViewModel3.l();
                            return;
                        }
                        return;
                    case 2:
                        int i15 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((UserStatisticsViewModel) this$0.r()).F.getValue() == m.f23155h && (userStatsAndResponseDto = (UserStatsAndResponseDto) ((UserStatisticsViewModel) this$0.r()).L.getValue()) != null && (performance = userStatsAndResponseDto.getPerformance()) != null && performance.isEmpty() && this$0.f23136h) {
                            kj.f.k(this$0, "app.stockgro://stockgro.com/arena/league/xx");
                            return;
                        } else {
                            this$0.H();
                            return;
                        }
                    case 3:
                        int i16 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.H();
                        return;
                    default:
                        int i17 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.y(new AnalyticEvent("app_user_profile_earnings", null, 2, null));
                        int i18 = ej.p.f15521j;
                        kj.j jVar = (kj.j) ((UserStatisticsViewModel) this$0.r()).f10055r.getValue();
                        if (jVar == null || (pair = (Pair) jVar.f23227a) == null || (str2 = (String) pair.f23354b) == null) {
                            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        ni.g.d(str2, new AnalyticEvent("app_user_profile_earnings_sub_upgrade", null, 2, null)).show(this$0.getChildFragmentManager(), "SubscribeToAccessBottomSheetDialogFragment");
                        return;
                }
            }
        });
        final int i12 = 2;
        ((gj) q()).f4821u.setOnClickListener(new View.OnClickListener(this) { // from class: kh.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f23127b;

            {
                this.f23127b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UserStatsAndResponseDto userStatsAndResponseDto;
                List<RecentPerformance> performance;
                String str2;
                Pair pair;
                Integer num = 1;
                int i122 = i12;
                Integer num2 = null;
                g this$0 = this.f23127b;
                switch (i122) {
                    case 0:
                        int i13 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UserStatisticsViewModel userStatisticsViewModel2 = (UserStatisticsViewModel) this$0.r();
                        androidx.lifecycle.e0 e0Var = userStatisticsViewModel2.J;
                        Integer num3 = (Integer) e0Var.getValue();
                        if (num3 != null) {
                            num = num3;
                        }
                        int intValue = num.intValue() - 1;
                        if (intValue >= 1) {
                            e0Var.setValue(Integer.valueOf(intValue));
                            userStatisticsViewModel2.l();
                            return;
                        }
                        return;
                    case 1:
                        int i14 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UserStatisticsViewModel userStatisticsViewModel3 = (UserStatisticsViewModel) this$0.r();
                        Integer num4 = (Integer) userStatisticsViewModel3.K.getValue();
                        if (num4 == null) {
                            num4 = num;
                        }
                        int intValue2 = num4.intValue();
                        androidx.lifecycle.e0 e0Var2 = userStatisticsViewModel3.J;
                        Integer num5 = (Integer) e0Var2.getValue();
                        if (num5 == null) {
                            num5 = num;
                        }
                        if (num5.intValue() <= intValue2) {
                            Integer num6 = (Integer) e0Var2.getValue();
                            if (num6 != null) {
                                num2 = Integer.valueOf(num6.intValue() + 1);
                            }
                            e0Var2.setValue(num2);
                        }
                        Integer num7 = (Integer) e0Var2.getValue();
                        if (num7 != null) {
                            num = num7;
                        }
                        int intValue3 = num.intValue();
                        if (1 <= intValue3 && intValue3 <= intValue2) {
                            userStatisticsViewModel3.l();
                            return;
                        }
                        return;
                    case 2:
                        int i15 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((UserStatisticsViewModel) this$0.r()).F.getValue() == m.f23155h && (userStatsAndResponseDto = (UserStatsAndResponseDto) ((UserStatisticsViewModel) this$0.r()).L.getValue()) != null && (performance = userStatsAndResponseDto.getPerformance()) != null && performance.isEmpty() && this$0.f23136h) {
                            kj.f.k(this$0, "app.stockgro://stockgro.com/arena/league/xx");
                            return;
                        } else {
                            this$0.H();
                            return;
                        }
                    case 3:
                        int i16 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.H();
                        return;
                    default:
                        int i17 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.y(new AnalyticEvent("app_user_profile_earnings", null, 2, null));
                        int i18 = ej.p.f15521j;
                        kj.j jVar = (kj.j) ((UserStatisticsViewModel) this$0.r()).f10055r.getValue();
                        if (jVar == null || (pair = (Pair) jVar.f23227a) == null || (str2 = (String) pair.f23354b) == null) {
                            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        ni.g.d(str2, new AnalyticEvent("app_user_profile_earnings_sub_upgrade", null, 2, null)).show(this$0.getChildFragmentManager(), "SubscribeToAccessBottomSheetDialogFragment");
                        return;
                }
            }
        });
        final int i13 = 3;
        ((gj) q()).f4823w.setOnClickListener(new View.OnClickListener(this) { // from class: kh.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f23127b;

            {
                this.f23127b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UserStatsAndResponseDto userStatsAndResponseDto;
                List<RecentPerformance> performance;
                String str2;
                Pair pair;
                Integer num = 1;
                int i122 = i13;
                Integer num2 = null;
                g this$0 = this.f23127b;
                switch (i122) {
                    case 0:
                        int i132 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UserStatisticsViewModel userStatisticsViewModel2 = (UserStatisticsViewModel) this$0.r();
                        androidx.lifecycle.e0 e0Var = userStatisticsViewModel2.J;
                        Integer num3 = (Integer) e0Var.getValue();
                        if (num3 != null) {
                            num = num3;
                        }
                        int intValue = num.intValue() - 1;
                        if (intValue >= 1) {
                            e0Var.setValue(Integer.valueOf(intValue));
                            userStatisticsViewModel2.l();
                            return;
                        }
                        return;
                    case 1:
                        int i14 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        UserStatisticsViewModel userStatisticsViewModel3 = (UserStatisticsViewModel) this$0.r();
                        Integer num4 = (Integer) userStatisticsViewModel3.K.getValue();
                        if (num4 == null) {
                            num4 = num;
                        }
                        int intValue2 = num4.intValue();
                        androidx.lifecycle.e0 e0Var2 = userStatisticsViewModel3.J;
                        Integer num5 = (Integer) e0Var2.getValue();
                        if (num5 == null) {
                            num5 = num;
                        }
                        if (num5.intValue() <= intValue2) {
                            Integer num6 = (Integer) e0Var2.getValue();
                            if (num6 != null) {
                                num2 = Integer.valueOf(num6.intValue() + 1);
                            }
                            e0Var2.setValue(num2);
                        }
                        Integer num7 = (Integer) e0Var2.getValue();
                        if (num7 != null) {
                            num = num7;
                        }
                        int intValue3 = num.intValue();
                        if (1 <= intValue3 && intValue3 <= intValue2) {
                            userStatisticsViewModel3.l();
                            return;
                        }
                        return;
                    case 2:
                        int i15 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((UserStatisticsViewModel) this$0.r()).F.getValue() == m.f23155h && (userStatsAndResponseDto = (UserStatsAndResponseDto) ((UserStatisticsViewModel) this$0.r()).L.getValue()) != null && (performance = userStatsAndResponseDto.getPerformance()) != null && performance.isEmpty() && this$0.f23136h) {
                            kj.f.k(this$0, "app.stockgro://stockgro.com/arena/league/xx");
                            return;
                        } else {
                            this$0.H();
                            return;
                        }
                    case 3:
                        int i16 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.H();
                        return;
                    default:
                        int i17 = g.f23134i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.y(new AnalyticEvent("app_user_profile_earnings", null, 2, null));
                        int i18 = ej.p.f15521j;
                        kj.j jVar = (kj.j) ((UserStatisticsViewModel) this$0.r()).f10055r.getValue();
                        if (jVar == null || (pair = (Pair) jVar.f23227a) == null || (str2 = (String) pair.f23354b) == null) {
                            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        ni.g.d(str2, new AnalyticEvent("app_user_profile_earnings_sub_upgrade", null, 2, null)).show(this$0.getChildFragmentManager(), "SubscribeToAccessBottomSheetDialogFragment");
                        return;
                }
            }
        });
        k kVar = new k(new be.b(this, 15), new v.g(this, 16));
        this.f23135g = kVar;
        kVar.f22653c = y0.f22625b;
        kVar.f22651a.g();
        gj gjVar = (gj) q();
        k kVar2 = this.f23135g;
        if (kVar2 != null) {
            gjVar.K.setAdapter(kVar2);
            final int i14 = 4;
            ((gj) q()).L.setOnClickListener(new View.OnClickListener(this) { // from class: kh.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g f23127b;

                {
                    this.f23127b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    UserStatsAndResponseDto userStatsAndResponseDto;
                    List<RecentPerformance> performance;
                    String str2;
                    Pair pair;
                    Integer num = 1;
                    int i122 = i14;
                    Integer num2 = null;
                    g this$0 = this.f23127b;
                    switch (i122) {
                        case 0:
                            int i132 = g.f23134i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            UserStatisticsViewModel userStatisticsViewModel2 = (UserStatisticsViewModel) this$0.r();
                            androidx.lifecycle.e0 e0Var = userStatisticsViewModel2.J;
                            Integer num3 = (Integer) e0Var.getValue();
                            if (num3 != null) {
                                num = num3;
                            }
                            int intValue = num.intValue() - 1;
                            if (intValue >= 1) {
                                e0Var.setValue(Integer.valueOf(intValue));
                                userStatisticsViewModel2.l();
                                return;
                            }
                            return;
                        case 1:
                            int i142 = g.f23134i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            UserStatisticsViewModel userStatisticsViewModel3 = (UserStatisticsViewModel) this$0.r();
                            Integer num4 = (Integer) userStatisticsViewModel3.K.getValue();
                            if (num4 == null) {
                                num4 = num;
                            }
                            int intValue2 = num4.intValue();
                            androidx.lifecycle.e0 e0Var2 = userStatisticsViewModel3.J;
                            Integer num5 = (Integer) e0Var2.getValue();
                            if (num5 == null) {
                                num5 = num;
                            }
                            if (num5.intValue() <= intValue2) {
                                Integer num6 = (Integer) e0Var2.getValue();
                                if (num6 != null) {
                                    num2 = Integer.valueOf(num6.intValue() + 1);
                                }
                                e0Var2.setValue(num2);
                            }
                            Integer num7 = (Integer) e0Var2.getValue();
                            if (num7 != null) {
                                num = num7;
                            }
                            int intValue3 = num.intValue();
                            if (1 <= intValue3 && intValue3 <= intValue2) {
                                userStatisticsViewModel3.l();
                                return;
                            }
                            return;
                        case 2:
                            int i15 = g.f23134i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((UserStatisticsViewModel) this$0.r()).F.getValue() == m.f23155h && (userStatsAndResponseDto = (UserStatsAndResponseDto) ((UserStatisticsViewModel) this$0.r()).L.getValue()) != null && (performance = userStatsAndResponseDto.getPerformance()) != null && performance.isEmpty() && this$0.f23136h) {
                                kj.f.k(this$0, "app.stockgro://stockgro.com/arena/league/xx");
                                return;
                            } else {
                                this$0.H();
                                return;
                            }
                        case 3:
                            int i16 = g.f23134i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.H();
                            return;
                        default:
                            int i17 = g.f23134i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.y(new AnalyticEvent("app_user_profile_earnings", null, 2, null));
                            int i18 = ej.p.f15521j;
                            kj.j jVar = (kj.j) ((UserStatisticsViewModel) this$0.r()).f10055r.getValue();
                            if (jVar == null || (pair = (Pair) jVar.f23227a) == null || (str2 = (String) pair.f23354b) == null) {
                                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            ni.g.d(str2, new AnalyticEvent("app_user_profile_earnings_sub_upgrade", null, 2, null)).show(this$0.getChildFragmentManager(), "SubscribeToAccessBottomSheetDialogFragment");
                            return;
                    }
                }
            });
            return;
        }
        Intrinsics.k("recentPerformanceAdapter");
        throw null;
    }

    public final void H() {
        String selectedFilter;
        m mVar = (m) ((UserStatisticsViewModel) r()).F.getValue();
        if (mVar == null || (selectedFilter = mVar.f23157a) == null) {
            selectedFilter = "LIFETIME";
        }
        Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
        d dVar = new d();
        dVar.setArguments(hl.f.y(new Pair("RECENT_PERFORMANCE_FILTER", selectedFilter)));
        dVar.show(getChildFragmentManager(), "FilterRecentPerformanceBottomSheet");
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        this.f17284b = fragmentComponent.n();
        da.b bVar = fragmentComponent.f14279b;
        FirebaseAnalytics d10 = bVar.d();
        yk.g.i(d10);
        this.f17285c = d10;
        Analytics o10 = bVar.o();
        yk.g.i(o10);
        this.f17286d = o10;
        n0 h10 = bVar.h();
        yk.g.i(h10);
        this.f17287e = h10;
    }
}
