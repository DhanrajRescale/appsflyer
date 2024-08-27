package yg;

import android.content.Intent;
import android.os.Bundle;
import ba.op;
import com.assetgro.stockgro.data.remote.response.ExpiryOption;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletActivity;
import com.assetgro.stockgro.ui.portfolio.unlock.detail.UnlockPortfolioDetailFragment;
import com.assetgro.stockgro.ui.portfolio.unlock.detail.UnlockPortfolioDetailViewModel;
import com.google.android.material.button.MaterialButton;
import com.kaopiz.kprogresshud.f;
import el.l;
import iu.k;
import java.util.List;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnlockPortfolioDetailFragment f41626b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(UnlockPortfolioDetailFragment unlockPortfolioDetailFragment, int i10) {
        super(1);
        this.f41625a = i10;
        this.f41626b = unlockPortfolioDetailFragment;
    }

    public final void a(Boolean bool) {
        f fVar;
        int i10 = this.f41625a;
        UnlockPortfolioDetailFragment unlockPortfolioDetailFragment = this.f41626b;
        switch (i10) {
            case 0:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    f fVar2 = unlockPortfolioDetailFragment.f17283a;
                    if (fVar2 != null) {
                        fVar2.d();
                        return;
                    }
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = unlockPortfolioDetailFragment.f17283a) != null) {
                    fVar.b();
                    return;
                }
                return;
            case 1:
            default:
                op opVar = (op) unlockPortfolioDetailFragment.q();
                Intrinsics.c(bool);
                opVar.f5678u.setVisibility(l.u(bool.booleanValue()));
                return;
            case 2:
                op opVar2 = (op) unlockPortfolioDetailFragment.q();
                boolean a10 = Intrinsics.a(bool, Boolean.TRUE);
                MaterialButton materialButton = opVar2.f5676s;
                if (a10) {
                    materialButton.setEnabled(true);
                    materialButton.setAlpha(1.0f);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        materialButton.setEnabled(false);
                        materialButton.setAlpha(0.5f);
                        return;
                    }
                    return;
                }
        }
    }

    public final void d(j jVar) {
        int i10 = this.f41625a;
        UnlockPortfolioDetailFragment unlockPortfolioDetailFragment = this.f41626b;
        switch (i10) {
            case 6:
                Bundle bundle = (Bundle) jVar.a();
                if (bundle != null) {
                    Intent intent = new Intent(unlockPortfolioDetailFragment.requireContext(), (Class<?>) RechargeWalletActivity.class);
                    intent.putExtras(bundle);
                    unlockPortfolioDetailFragment.startActivityForResult(intent, 10021);
                    return;
                }
                return;
            default:
                if (((Unit) jVar.a()) != null) {
                    unlockPortfolioDetailFragment.requireActivity().finish();
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f41625a;
        UnlockPortfolioDetailFragment unlockPortfolioDetailFragment = this.f41626b;
        switch (i10) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            case 1:
                List list = (List) obj;
                zg.a aVar = unlockPortfolioDetailFragment.f9943h;
                if (aVar != null) {
                    aVar.u(list);
                    return Unit.f23355a;
                }
                Intrinsics.k("unlockPortfolioExpiryOptionAdapter");
                throw null;
            case 2:
                a((Boolean) obj);
                return Unit.f23355a;
            case 3:
                ((op) unlockPortfolioDetailFragment.q()).f5681x.setText((String) obj);
                return Unit.f23355a;
            case 4:
                a((Boolean) obj);
                return Unit.f23355a;
            case 5:
                Integer num = (Integer) obj;
                op opVar = (op) unlockPortfolioDetailFragment.q();
                Intrinsics.c(num);
                opVar.f5676s.setText(unlockPortfolioDetailFragment.getString(num.intValue()));
                return Unit.f23355a;
            case 6:
                d((j) obj);
                return Unit.f23355a;
            case 7:
                d((j) obj);
                return Unit.f23355a;
            default:
                ExpiryOption it = (ExpiryOption) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((UnlockPortfolioDetailViewModel) unlockPortfolioDetailFragment.r()).i(it, null);
                return Unit.f23355a;
        }
    }
}
