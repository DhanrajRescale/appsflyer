package xf;

import android.content.Intent;
import com.assetgro.stockgro.data.model.KycResponseDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.kyc.KycVerificationRejectedFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KycVerificationRejectedFragment f40241b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(KycVerificationRejectedFragment kycVerificationRejectedFragment, int i10) {
        super(1);
        this.f40240a = i10;
        this.f40241b = kycVerificationRejectedFragment;
    }

    public final void a(KycResponseDto kycResponseDto) {
        int i10 = this.f40240a;
        KycVerificationRejectedFragment kycVerificationRejectedFragment = this.f40241b;
        switch (i10) {
            case 1:
                androidx.navigation.t h10 = q6.l.h(kycVerificationRejectedFragment);
                Intrinsics.c(kycResponseDto);
                h10.l(R.id.moveToKycSteps, new r(kycResponseDto).a(), null);
                return;
            default:
                androidx.navigation.t h11 = q6.l.h(kycVerificationRejectedFragment);
                Intrinsics.c(kycResponseDto);
                h11.l(R.id.moveToKycMaintenance, new r(kycResponseDto).a(), null);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.kaopiz.kprogresshud.f fVar;
        int i10 = this.f40240a;
        KycVerificationRejectedFragment kycVerificationRejectedFragment = this.f40241b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    com.kaopiz.kprogresshud.f fVar2 = kycVerificationRejectedFragment.f17283a;
                    if (fVar2 != null) {
                        fVar2.d();
                    }
                } else if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = kycVerificationRejectedFragment.f17283a) != null) {
                    fVar.b();
                }
                return Unit.f23355a;
            case 1:
                a((KycResponseDto) obj);
                return Unit.f23355a;
            case 2:
                a((KycResponseDto) obj);
                return Unit.f23355a;
            default:
                Pair pair = (Pair) obj;
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("plain/text");
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"support@stockgro.com"});
                intent.putExtra("android.intent.extra.SUBJECT", "Regarding failed KYC application for " + pair.f23354b);
                intent.putExtra("android.intent.extra.TEXT", "Hi StockGro Team, \n\n This mail is regarding failed KYC application \n\n\n\n Thanks\n " + pair.f23353a + "\n" + pair.f23354b);
                kycVerificationRejectedFragment.startActivity(Intent.createChooser(intent, "Send mail..."));
                return Unit.f23355a;
        }
    }
}
