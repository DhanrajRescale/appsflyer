package rf;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.NotificationCategoryDto;
import com.assetgro.stockgro.data.model.NotificationDto;
import com.assetgro.stockgro.data.remote.response.AppVersionResponseDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.notifications.NotificationsViewModel;
import hv.q;
import hv.t;
import iu.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationsViewModel f33711b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(NotificationsViewModel notificationsViewModel, int i10) {
        super(1);
        this.f33710a = i10;
        this.f33711b = notificationsViewModel;
    }

    public final void invoke(BaseResponseDto baseResponseDto) {
        int i10 = this.f33710a;
        NotificationsViewModel notificationsViewModel = this.f33711b;
        switch (i10) {
            case 0:
                AppVersionResponseDto appVersionResponseDto = (AppVersionResponseDto) baseResponseDto.getData();
                if (appVersionResponseDto != null) {
                    if (appVersionResponseDto.getVersionCode() > 220) {
                        if (((AppVersionResponseDto) baseResponseDto.getData()).getUpdateFromPlaystore()) {
                            notificationsViewModel.f9627q.postValue(Integer.valueOf(((AppVersionResponseDto) baseResponseDto.getData()).isBlocker() ? 1 : 0));
                            return;
                        }
                        return;
                    }
                    notificationsViewModel.f9082e.postValue(ni.j.r(Integer.valueOf(R.string.app_upto_date)));
                    return;
                }
                return;
            default:
                notificationsViewModel.f9084g.postValue(Boolean.FALSE);
                List<NotificationDto> list = (List) baseResponseDto.getData();
                if (list != null) {
                    e0 e0Var = notificationsViewModel.f9626p;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    long j10 = 0;
                    for (NotificationDto notificationDto : list) {
                        long createdAt = notificationDto.getCreatedAt();
                        if (j10 == 0) {
                            j10 = createdAt;
                        }
                        jv.a b10 = jv.a.b("dd-MM-yyyy");
                        Intrinsics.checkNotNullExpressionValue(b10, "ofPattern(...)");
                        hv.e l10 = hv.e.l(0, createdAt);
                        q p10 = q.p();
                        l10.getClass();
                        String a10 = b10.a(t.p(l10, p10));
                        hv.e l11 = hv.e.l(0, j10);
                        q p11 = q.p();
                        l11.getClass();
                        if (!Intrinsics.a(a10, b10.a(t.p(l11, p11)))) {
                            arrayList.add(new NotificationCategoryDto(j10, arrayList2));
                            arrayList2 = new ArrayList();
                            j10 = createdAt;
                        }
                        arrayList2.add(notificationDto);
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList.add(new NotificationCategoryDto(j10, arrayList2));
                    }
                    e0Var.postValue(arrayList);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f33710a) {
            case 0:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 1:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            default:
                this.f33711b.f9084g.postValue(Boolean.FALSE);
                ((Throwable) obj).printStackTrace();
                return Unit.f23355a;
        }
    }
}
