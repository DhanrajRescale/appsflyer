package hh;

import com.assetgro.stockgro.data.model.ReportReason;
import com.assetgro.stockgro.data.model.ReportUserReasonsDto;
import com.assetgro.stockgro.data.model.ReportedEntityConfirmationDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.report.ReportEntityViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReportEntityViewModel f18468b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ReportEntityViewModel reportEntityViewModel, int i10) {
        super(1);
        this.f18467a = i10;
        this.f18468b = reportEntityViewModel;
    }

    public final void a(ReportUserReasonsDto reportUserReasonsDto) {
        ArrayList<ReportReason> reasonsList;
        ArrayList<ReportReason> reasonsList2;
        int i10 = this.f18467a;
        ReportEntityViewModel reportEntityViewModel = this.f18468b;
        switch (i10) {
            case 1:
                reportEntityViewModel.f9084g.postValue(Boolean.FALSE);
                if (reportUserReasonsDto != null && (reasonsList = reportUserReasonsDto.getReasonsList()) != null) {
                    Intrinsics.checkNotNullParameter(reasonsList, "<set-?>");
                    reportEntityViewModel.i(reasonsList);
                    return;
                }
                return;
            default:
                reportEntityViewModel.f9084g.postValue(Boolean.FALSE);
                if (reportUserReasonsDto != null && (reasonsList2 = reportUserReasonsDto.getReasonsList()) != null) {
                    Intrinsics.checkNotNullParameter(reasonsList2, "<set-?>");
                    reportEntityViewModel.i(reasonsList2);
                    return;
                }
                return;
        }
    }

    public final void d(ReportedEntityConfirmationDto reportedEntityConfirmationDto) {
        String confirmationMessage;
        int i10 = this.f18467a;
        ReportEntityViewModel reportEntityViewModel = this.f18468b;
        switch (i10) {
            case 5:
                reportEntityViewModel.f9084g.postValue(Boolean.FALSE);
                reportEntityViewModel.f10012p.postValue(Boolean.TRUE);
                if (reportedEntityConfirmationDto != null && (confirmationMessage = reportedEntityConfirmationDto.getConfirmationMessage()) != null) {
                    reportEntityViewModel.f10018v.postValue(confirmationMessage);
                    return;
                }
                return;
            default:
                reportEntityViewModel.f10012p.postValue(Boolean.TRUE);
                reportEntityViewModel.f9084g.postValue(Boolean.FALSE);
                return;
        }
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f18467a;
        ReportEntityViewModel reportEntityViewModel = this.f18468b;
        switch (i10) {
            case 0:
                reportEntityViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 1:
            case 3:
            case 5:
            default:
                reportEntityViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 2:
                reportEntityViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 4:
                reportEntityViewModel.f9084g.postValue(Boolean.FALSE);
                th2.printStackTrace();
                return;
            case 6:
                reportEntityViewModel.f9084g.postValue(Boolean.FALSE);
                reportEntityViewModel.f9082e.postValue(ni.j.i(Integer.valueOf(R.string.text_error_while_reporting)));
                th2.printStackTrace();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f18467a) {
            case 0:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 1:
                a((ReportUserReasonsDto) obj);
                return Unit.f23355a;
            case 2:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 3:
                a((ReportUserReasonsDto) obj);
                return Unit.f23355a;
            case 4:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 5:
                d((ReportedEntityConfirmationDto) obj);
                return Unit.f23355a;
            case 6:
                invoke((Throwable) obj);
                return Unit.f23355a;
            case 7:
                d((ReportedEntityConfirmationDto) obj);
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }
}
