package w;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.assetgro.stockgro.data.model.Media;
import com.assetgro.stockgro.data.model.ReportReason;
import com.assetgro.stockgro.feature_social.presentation.feed.comments.CommentsViewModel;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.assetgro.stockgro.ui.home.HomeViewModel;
import com.assetgro.stockgro.ui.portfolio.history.PortfolioFnoHistoryViewModel;
import com.assetgro.stockgro.ui.portfolio.history.model.PortfolioHistoryFnoDataItem;
import com.assetgro.stockgro.ui.social.domain.model.CommentMetaData;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.b9;

/* loaded from: classes.dex */
public final class t1 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38683b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38684c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38685d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(int i10, d0.u uVar, Object obj) {
        super(2);
        this.f38682a = 2;
        this.f38684c = uVar;
        this.f38683b = i10;
        this.f38685d = obj;
    }

    public final void a(t0.n nVar, int i10) {
        String str;
        t0.r rVar;
        int i11;
        int i12 = this.f38682a;
        int i13 = this.f38683b;
        Object obj = this.f38685d;
        Object obj2 = this.f38684c;
        switch (i12) {
            case 0:
                ((u1) obj2).a(obj, nVar, t0.t.H0(i13 | 1));
                return;
            case 1:
                androidx.compose.foundation.a.b((g1.o) obj2, (Function1) obj, nVar, t0.t.H0(i13 | 1));
                return;
            case 2:
                if ((i10 & 3) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                ((d0.u) obj2).e(i13, obj, nVar, 0);
                return;
            case 3:
                i0.h.a((j2.e) obj2, (List) obj, nVar, t0.t.H0(i13 | 1));
                return;
            case 4:
                b9.a((j2.g0) obj2, (Function2) obj, nVar, t0.t.H0(i13 | 1));
                return;
            case 5:
                t0.v1[] v1VarArr = (t0.v1[]) obj2;
                dp.b.q((t0.v1[]) Arrays.copyOf(v1VarArr, v1VarArr.length), (Function2) obj, nVar, t0.t.H0(i13 | 1));
                return;
            case 6:
                dp.b.p((t0.v1) obj2, (Function2) obj, nVar, t0.t.H0(i13 | 1));
                return;
            case 7:
                ((b1.c) obj2).e(obj, nVar, t0.t.H0(i13) | 1);
                return;
            case 8:
                AndroidCompositionLocals_androidKt.a((d2.a0) obj2, (Function2) obj, nVar, t0.t.H0(i13 | 1));
                return;
            case 9:
                yk.j.m((CommentMetaData) obj2, (Function1) obj, nVar, t0.t.H0(i13 | 1));
                return;
            case 10:
                yk.o.m((gb.e) obj2, (Function1) obj, nVar, t0.t.H0(i13 | 1));
                return;
            case 11:
                yk.j.C((FeedStreamViewModel) obj2, (CommentsViewModel) obj, nVar, t0.t.H0(i13 | 1));
                return;
            case 12:
                yk.o.r((ut.p) obj2, (Function0) obj, nVar, t0.t.H0(i13 | 1));
                return;
            case 13:
                kp.j.q((SocialChatListViewModel) obj2, (Function0) obj, nVar, t0.t.H0(i13 | 1));
                return;
            case 14:
                kp.j.p((Media) obj2, (Function2) obj, nVar, t0.t.H0(i13 | 1));
                return;
            case 15:
                yk.j.P((Function0) obj2, (Function0) obj, nVar, t0.t.H0(i13 | 1));
                return;
            case 16:
                zq.f.f((PortfolioFnoHistoryViewModel) obj2, (PortfolioHistoryFnoDataItem) obj, nVar, t0.t.H0(i13 | 1));
                return;
            case 17:
                zq.f.j((PortfolioFnoHistoryViewModel) obj2, (Function0) obj, nVar, t0.t.H0(i13 | 1));
                return;
            case 18:
                if ((i10 & 11) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                String str2 = (String) obj2;
                int i14 = kj.f.f23221a;
                Intrinsics.checkNotNullParameter(str2, "<this>");
                List P = kotlin.text.w.P(str2, new String[]{" "}, 0, 6);
                if (!P.isEmpty()) {
                    str = (String) P.get(0);
                } else {
                    str = str2;
                }
                if (((e0.j0) obj).f14718d.f14650b.i() == i13) {
                    rVar = (t0.r) nVar;
                    rVar.b0(-2107417157);
                    i11 = R.color.lightThemeSelectedTabTitleColor;
                } else {
                    rVar = (t0.r) nVar;
                    rVar.b0(-2107415173);
                    i11 = R.color.lightThemeUnSelectedTabTitleColor;
                }
                long e10 = d2.w0.e(i11, rVar);
                rVar.s(false);
                al.d.C(str, null, e10, yk.j.e1(14), null, null, jh.c.f21373b, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 1575936, 0, 130994);
                return;
            case 19:
                zq.f.l((HomeViewModel) obj2, (Function1) obj, nVar, t0.t.H0(i13 | 1));
                return;
            case 20:
                dp.b.b0((MissionsHomeViewModel) obj2, (Function1) obj, nVar, t0.t.H0(i13 | 1));
                return;
            default:
                el.l.f((ReportReason) obj2, (Function1) obj, nVar, t0.t.H0(i13 | 1));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f38682a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 3:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 4:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 5:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 6:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 7:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 8:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 9:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 10:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 11:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 12:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 13:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 14:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 15:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 16:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 17:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 18:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 19:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 20:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(Object obj, Object obj2, int i10, int i11) {
        super(2);
        this.f38682a = i11;
        this.f38684c = obj;
        this.f38685d = obj2;
        this.f38683b = i10;
    }
}
