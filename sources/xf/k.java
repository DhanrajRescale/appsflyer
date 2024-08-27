package xf;

import android.content.Intent;
import androidx.navigation.f0;
import com.assetgro.stockgro.data.model.KycResponseDto;
import com.assetgro.stockgro.data.model.KycSupportTicketResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.helpcenter.StockGroHelpCenterActivity;
import com.assetgro.stockgro.ui.payments.kyc.KycHostActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KycHostActivity f40221b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(KycHostActivity kycHostActivity, int i10) {
        super(1);
        this.f40220a = i10;
        this.f40221b = kycHostActivity;
    }

    public final void a(KycResponseDto kycResponseDto) {
        int i10 = this.f40220a;
        KycHostActivity kycHostActivity = this.f40221b;
        switch (i10) {
            case 0:
                f0 f0Var = kycHostActivity.f9675l;
                if (f0Var != null) {
                    f0Var.q(R.id.kycCompletedFragment);
                    androidx.navigation.t K = kycHostActivity.K();
                    f0 f0Var2 = kycHostActivity.f9675l;
                    if (f0Var2 != null) {
                        Intrinsics.c(kycResponseDto);
                        K.x(f0Var2, new a(kycResponseDto).a());
                        return;
                    } else {
                        Intrinsics.k("navGraph");
                        throw null;
                    }
                }
                Intrinsics.k("navGraph");
                throw null;
            case 1:
                f0 f0Var3 = kycHostActivity.f9675l;
                if (f0Var3 != null) {
                    f0Var3.q(R.id.kycStepFragment);
                    androidx.navigation.t K2 = kycHostActivity.K();
                    f0 f0Var4 = kycHostActivity.f9675l;
                    if (f0Var4 != null) {
                        Intrinsics.c(kycResponseDto);
                        K2.x(f0Var4, new r(kycResponseDto).a());
                        return;
                    } else {
                        Intrinsics.k("navGraph");
                        throw null;
                    }
                }
                Intrinsics.k("navGraph");
                throw null;
            case 2:
                f0 f0Var5 = kycHostActivity.f9675l;
                if (f0Var5 != null) {
                    f0Var5.q(R.id.kycVerificationPendingFragment);
                    androidx.navigation.t K3 = kycHostActivity.K();
                    f0 f0Var6 = kycHostActivity.f9675l;
                    if (f0Var6 != null) {
                        Intrinsics.c(kycResponseDto);
                        K3.x(f0Var6, new t(kycResponseDto).a());
                        return;
                    } else {
                        Intrinsics.k("navGraph");
                        throw null;
                    }
                }
                Intrinsics.k("navGraph");
                throw null;
            case 3:
                f0 f0Var7 = kycHostActivity.f9675l;
                if (f0Var7 != null) {
                    f0Var7.q(R.id.kycVerificationRejectedFragment);
                    androidx.navigation.t K4 = kycHostActivity.K();
                    f0 f0Var8 = kycHostActivity.f9675l;
                    if (f0Var8 != null) {
                        Intrinsics.c(kycResponseDto);
                        K4.x(f0Var8, new y(kycResponseDto).a());
                        return;
                    } else {
                        Intrinsics.k("navGraph");
                        throw null;
                    }
                }
                Intrinsics.k("navGraph");
                throw null;
            default:
                f0 f0Var9 = kycHostActivity.f9675l;
                if (f0Var9 != null) {
                    f0Var9.q(R.id.kycMaintenanceFragment);
                    androidx.navigation.t K5 = kycHostActivity.K();
                    f0 f0Var10 = kycHostActivity.f9675l;
                    if (f0Var10 != null) {
                        Intrinsics.c(kycResponseDto);
                        K5.x(f0Var10, new y(kycResponseDto).a());
                        return;
                    } else {
                        Intrinsics.k("navGraph");
                        throw null;
                    }
                }
                Intrinsics.k("navGraph");
                throw null;
        }
    }

    public final void d(kj.j jVar) {
        int i10 = this.f40220a;
        KycHostActivity kycHostActivity = this.f40221b;
        switch (i10) {
            case 5:
                kycHostActivity.startActivityForResult(new Intent(kycHostActivity, (Class<?>) StockGroHelpCenterActivity.class), 9865);
                return;
            default:
                KycSupportTicketResponseDto kycSupportTicketResponseDto = (KycSupportTicketResponseDto) jVar.a();
                if (kycSupportTicketResponseDto != null) {
                    f0 f0Var = kycHostActivity.f9675l;
                    if (f0Var != null) {
                        f0Var.q(R.id.kycQuerySubmittedFragment);
                        androidx.navigation.t K = kycHostActivity.K();
                        f0 f0Var2 = kycHostActivity.f9675l;
                        if (f0Var2 != null) {
                            K.x(f0Var2, new o(kycSupportTicketResponseDto).a());
                            return;
                        } else {
                            Intrinsics.k("navGraph");
                            throw null;
                        }
                    }
                    Intrinsics.k("navGraph");
                    throw null;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f40220a) {
            case 0:
                a((KycResponseDto) obj);
                return Unit.f23355a;
            case 1:
                a((KycResponseDto) obj);
                return Unit.f23355a;
            case 2:
                a((KycResponseDto) obj);
                return Unit.f23355a;
            case 3:
                a((KycResponseDto) obj);
                return Unit.f23355a;
            case 4:
                a((KycResponseDto) obj);
                return Unit.f23355a;
            case 5:
                d((kj.j) obj);
                return Unit.f23355a;
            default:
                d((kj.j) obj);
                return Unit.f23355a;
        }
    }
}
