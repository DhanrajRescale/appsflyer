package nf;

import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.model.ChatNotificationDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.SocialRoleResponseDto;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainSharedViewModel f28649b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(MainSharedViewModel mainSharedViewModel, int i10) {
        super(1);
        this.f28648a = i10;
        this.f28649b = mainSharedViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f28648a;
        MainSharedViewModel mainSharedViewModel = this.f28649b;
        switch (i10) {
            case 0:
                kj.j jVar = (kj.j) obj;
                if (jVar != null && ((Unit) jVar.a()) != null) {
                    mainSharedViewModel.h(true);
                }
                return Unit.f23355a;
            case 1:
                e0 e0Var = mainSharedViewModel.L;
                Boolean bool = Boolean.TRUE;
                e0Var.postValue(bool);
                mainSharedViewModel.f9587r.postValue(bool);
                mainSharedViewModel.f9585p.t0(HttpUrl.FRAGMENT_ENCODE_SET);
                return Unit.f23355a;
            case 2:
                Throwable th2 = (Throwable) obj;
                switch (i10) {
                    case 2:
                        mainSharedViewModel.L.postValue(Boolean.FALSE);
                        break;
                    default:
                        mainSharedViewModel.f9084g.postValue(Boolean.FALSE);
                        th2.printStackTrace();
                        break;
                }
                return Unit.f23355a;
            case 3:
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                it.printStackTrace();
                at.a logoutOfflineOnly = mainSharedViewModel.f9081d.logoutOfflineOnly();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                logoutOfflineOnly.getClass();
                at.l lVar = st.e.f34774b;
                if (timeUnit == null) {
                    throw new NullPointerException("unit is null");
                }
                if (lVar != null) {
                    return new kt.n(logoutOfflineOnly, 1L, timeUnit, lVar);
                }
                throw new NullPointerException("scheduler is null");
            case 4:
                Integer totalUnreadMessages = ((ChatNotificationDto) obj).getTotalUnreadMessages();
                if (totalUnreadMessages != null) {
                    mainSharedViewModel.D.postValue(Integer.valueOf(totalUnreadMessages.intValue()));
                }
                return Unit.f23355a;
            case 5:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
            case 6:
                Throwable th3 = (Throwable) obj;
                switch (i10) {
                    case 2:
                        mainSharedViewModel.L.postValue(Boolean.FALSE);
                        break;
                    default:
                        mainSharedViewModel.f9084g.postValue(Boolean.FALSE);
                        th3.printStackTrace();
                        break;
                }
                return Unit.f23355a;
            default:
                invoke((BaseResponseDto) obj);
                return Unit.f23355a;
        }
    }

    public final void invoke(BaseResponseDto baseResponseDto) {
        int i10 = this.f28648a;
        MainSharedViewModel mainSharedViewModel = this.f28649b;
        switch (i10) {
            case 5:
                mainSharedViewModel.f9084g.postValue(Boolean.FALSE);
                ArrayList arrayList = (ArrayList) baseResponseDto.getData();
                if (arrayList == null || arrayList.size() <= 0 || ((SocialRoleResponseDto) arrayList.get(0)).getChatRole().equals("Rogue")) {
                    return;
                }
                nt.h c10 = mainSharedViewModel.f9583n.getChatTotalUnreadCount().c(((kq.e) mainSharedViewModel.f9079b).J());
                jt.d dVar = new jt.d(new jf.g(8, new k(mainSharedViewModel, 4)), new jf.g(9, m.f28653c));
                c10.a(dVar);
                mainSharedViewModel.f9080c.c(dVar);
                return;
            default:
                Integer num = (Integer) baseResponseDto.getData();
                if (num != null) {
                    mainSharedViewModel.O.postValue(Integer.valueOf(num.intValue()));
                    return;
                }
                return;
        }
    }
}
