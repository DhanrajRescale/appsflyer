package xf;

import android.content.Intent;
import com.assetgro.stockgro.data.model.KycSupportTicketResponseDto;
import com.assetgro.stockgro.ui.helpcenter.StockGroHelpCenterActivity;
import com.assetgro.stockgro.ui.payments.kyc.KycFAQFragment;
import com.google.android.gms.search.SearchAuth;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KycFAQFragment f40203b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(KycFAQFragment kycFAQFragment, int i10) {
        super(1);
        this.f40202a = i10;
        this.f40203b = kycFAQFragment;
    }

    public final void a(kj.j jVar) {
        int i10 = this.f40202a;
        KycFAQFragment kycFAQFragment = this.f40203b;
        switch (i10) {
            case 1:
                List list = (List) jVar.a();
                if (list != null) {
                    b bVar = kycFAQFragment.f9664g;
                    if (bVar != null) {
                        bVar.u(list);
                        return;
                    } else {
                        Intrinsics.k("kycFAQAdapter");
                        throw null;
                    }
                }
                return;
            case 2:
                if (((Unit) jVar.a()) != null) {
                    kycFAQFragment.startActivityForResult(new Intent(kycFAQFragment.requireContext(), (Class<?>) StockGroHelpCenterActivity.class), SearchAuth.StatusCodes.AUTH_THROTTLED);
                    return;
                }
                return;
            default:
                KycSupportTicketResponseDto ticketData = (KycSupportTicketResponseDto) jVar.a();
                if (ticketData != null) {
                    androidx.navigation.t h10 = q6.l.h(kycFAQFragment);
                    Intrinsics.checkNotNullParameter(ticketData, "ticketData");
                    h10.o(new d(ticketData));
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.kaopiz.kprogresshud.f fVar;
        switch (this.f40202a) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean a10 = Intrinsics.a(bool, Boolean.TRUE);
                KycFAQFragment kycFAQFragment = this.f40203b;
                if (a10) {
                    com.kaopiz.kprogresshud.f fVar2 = kycFAQFragment.f17283a;
                    if (fVar2 != null) {
                        fVar2.d();
                    }
                } else if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = kycFAQFragment.f17283a) != null) {
                    fVar.b();
                }
                return Unit.f23355a;
            case 1:
                a((kj.j) obj);
                return Unit.f23355a;
            case 2:
                a((kj.j) obj);
                return Unit.f23355a;
            default:
                a((kj.j) obj);
                return Unit.f23355a;
        }
    }
}
