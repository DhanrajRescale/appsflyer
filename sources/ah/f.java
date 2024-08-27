package ah;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.t;
import ba.qp;
import com.assetgro.stockgro.data.model.portfolio.WalletBalanceResponseDto;
import com.assetgro.stockgro.data.remote.response.UnlockPortfolioData;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.unlock.list.UnlockPortfolioListFragment;
import com.assetgro.stockgro.ui.portfolio.unlock.list.UnlockPortfolioListViewModel;
import iu.k;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q6.l;

/* loaded from: classes.dex */
public final class f extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f435a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnlockPortfolioListFragment f436b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(UnlockPortfolioListFragment unlockPortfolioListFragment, int i10) {
        super(1);
        this.f435a = i10;
        this.f436b = unlockPortfolioListFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f435a;
        UnlockPortfolioListFragment unlockPortfolioListFragment = this.f436b;
        switch (i10) {
            case 0:
                List list = (List) obj;
                a aVar = unlockPortfolioListFragment.f9969g;
                if (aVar != null) {
                    aVar.u(list);
                    return Unit.f23355a;
                }
                Intrinsics.k("unlockPortfolioAdapter");
                throw null;
            case 1:
                Boolean bool = (Boolean) obj;
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((qp) unlockPortfolioListFragment.q()).f5886t.setVisibility(0);
                    ((qp) unlockPortfolioListFragment.q()).f5885s.setVisibility(8);
                } else if (Intrinsics.a(bool, Boolean.FALSE)) {
                    ((qp) unlockPortfolioListFragment.q()).f5886t.setVisibility(8);
                    ((qp) unlockPortfolioListFragment.q()).f5885s.setVisibility(0);
                }
                return Unit.f23355a;
            default:
                UnlockPortfolioData it = (UnlockPortfolioData) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                t h10 = l.h(unlockPortfolioListFragment);
                Object value = ((UnlockPortfolioListViewModel) unlockPortfolioListFragment.r()).f9972p.getValue();
                Intrinsics.c(value);
                WalletBalanceResponseDto walletBalanceResponseDto = (WalletBalanceResponseDto) value;
                new yg.d(it, walletBalanceResponseDto);
                Bundle bundle = new Bundle();
                if (Parcelable.class.isAssignableFrom(UnlockPortfolioData.class)) {
                    bundle.putParcelable("unlock_portfolio", it);
                } else if (Serializable.class.isAssignableFrom(UnlockPortfolioData.class)) {
                    bundle.putSerializable("unlock_portfolio", (Serializable) it);
                } else {
                    throw new UnsupportedOperationException(UnlockPortfolioData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                if (Parcelable.class.isAssignableFrom(WalletBalanceResponseDto.class)) {
                    bundle.putParcelable("wallet", walletBalanceResponseDto);
                } else if (Serializable.class.isAssignableFrom(WalletBalanceResponseDto.class)) {
                    bundle.putSerializable("wallet", (Serializable) walletBalanceResponseDto);
                } else {
                    throw new UnsupportedOperationException(WalletBalanceResponseDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                h10.l(R.id.action_fragment_unlock_portfolio_list_to_fragment_unlock_portfolio_details, bundle, null);
                return Unit.f23355a;
        }
    }
}
