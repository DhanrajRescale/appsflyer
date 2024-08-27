package hh;

import com.assetgro.stockgro.data.model.ReportReason;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ReportEntityReasonsDto;
import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.report.ReportEntityViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18469a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReportEntityViewModel f18470b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ReportEntityViewModel reportEntityViewModel, yt.a aVar) {
        super(2, aVar);
        this.f18470b = reportEntityViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f18470b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        ReportEntityReasonsDto reportEntityReasonsDto;
        List<ReportReason> reasons;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18469a;
        ReportEntityViewModel reportEntityViewModel = this.f18470b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                FeedRepository feedRepository = reportEntityViewModel.f10011o;
                this.f18469a = 1;
                obj = feedRepository.getReasonsToReportComment(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                reportEntityViewModel.f9084g.postValue(Boolean.FALSE);
                BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
                if (baseResponseDto != null && (reportEntityReasonsDto = (ReportEntityReasonsDto) baseResponseDto.getData()) != null && (reasons = reportEntityReasonsDto.getReasons()) != null) {
                    Intrinsics.checkNotNullParameter(reasons, "<set-?>");
                    reportEntityViewModel.f10019w = reasons;
                    reportEntityViewModel.i(reasons);
                }
            } else {
                reportEntityViewModel.f9084g.postValue(Boolean.FALSE);
            }
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, reportEntityViewModel.f9082e);
        }
        return Unit.f23355a;
    }
}
