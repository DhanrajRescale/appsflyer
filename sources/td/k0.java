package td;

import com.assetgro.stockgro.data.enums.GroupImageType;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.remote.response.AssetUploadResponse;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoViewModel f35902b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(GroupInfoViewModel groupInfoViewModel, int i10) {
        super(1);
        this.f35901a = i10;
        this.f35902b = groupInfoViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j10;
        long j11;
        long j12;
        int i10 = this.f35901a;
        GroupInfoViewModel groupInfoViewModel = this.f35902b;
        switch (i10) {
            case 0:
                Group group = (Group) obj;
                groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
                if (group != null) {
                    groupInfoViewModel.f9250s.postValue(group);
                }
                return Unit.f23355a;
            case 1:
                Throwable th2 = (Throwable) obj;
                switch (i10) {
                    case 1:
                        groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
                        th2.printStackTrace();
                        break;
                    default:
                        groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
                        th2.printStackTrace();
                        break;
                }
                return Unit.f23355a;
            case 2:
                ArenaGame arenaGame = (ArenaGame) obj;
                String frequency = arenaGame.getFrequency();
                long j13 = 0;
                if (Intrinsics.a(frequency, "hourly")) {
                    Long portfolioSubmissionTime = arenaGame.getPortfolioSubmissionTime();
                    if (portfolioSubmissionTime != null) {
                        j12 = portfolioSubmissionTime.longValue();
                    } else {
                        j12 = 0;
                    }
                    Long endDate = arenaGame.getEndDate();
                    if (endDate != null) {
                        j13 = endDate.longValue();
                    }
                    return GroupInfoViewModel.h(groupInfoViewModel, j12, j13);
                }
                if (Intrinsics.a(frequency, "daily")) {
                    Long portfolioSubmissionTime2 = arenaGame.getPortfolioSubmissionTime();
                    if (portfolioSubmissionTime2 != null) {
                        j11 = portfolioSubmissionTime2.longValue();
                    } else {
                        j11 = 0;
                    }
                    Long endDate2 = arenaGame.getEndDate();
                    if (endDate2 != null) {
                        j13 = endDate2.longValue();
                    }
                    return GroupInfoViewModel.h(groupInfoViewModel, j11, j13);
                }
                Long portfolioSubmissionTime3 = arenaGame.getPortfolioSubmissionTime();
                if (portfolioSubmissionTime3 != null) {
                    j10 = portfolioSubmissionTime3.longValue();
                } else {
                    j10 = 0;
                }
                Long endDate3 = arenaGame.getEndDate();
                if (endDate3 != null) {
                    j13 = endDate3.longValue();
                }
                groupInfoViewModel.getClass();
                jv.a b10 = jv.a.b("dd MMM yy | hh:mm a");
                Intrinsics.checkNotNullExpressionValue(b10, "ofPattern(...)");
                hv.e l10 = hv.e.l(0, j10);
                hv.t a10 = a3.a.a(l10, l10);
                hv.e l11 = hv.e.l(0, j13);
                return a3.a.g(b10.a(a10), " to ", b10.a(a3.a.a(l11, l11)));
            case 3:
                groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
                String url = ((AssetUploadResponse) obj).getUrl();
                if (url != null) {
                    GroupImageType groupImageType = groupInfoViewModel.f9244p;
                    GroupImageType groupImageType2 = GroupImageType.Display;
                    androidx.lifecycle.e0 e0Var = groupInfoViewModel.f9084g;
                    if (groupImageType == groupImageType2) {
                        Intrinsics.checkNotNullParameter(url, "url");
                        e0Var.postValue(Boolean.TRUE);
                        yk.g.H(androidx.lifecycle.u0.f(groupInfoViewModel), null, null, new m0(groupInfoViewModel, url, null), 3);
                    } else {
                        Intrinsics.checkNotNullParameter(url, "url");
                        e0Var.postValue(Boolean.TRUE);
                        yk.g.H(androidx.lifecycle.u0.f(groupInfoViewModel), null, null, new l0(groupInfoViewModel, url, null), 3);
                    }
                }
                return Unit.f23355a;
            default:
                Throwable th3 = (Throwable) obj;
                switch (i10) {
                    case 1:
                        groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
                        th3.printStackTrace();
                        break;
                    default:
                        groupInfoViewModel.f9084g.postValue(Boolean.FALSE);
                        th3.printStackTrace();
                        break;
                }
                return Unit.f23355a;
        }
    }
}
