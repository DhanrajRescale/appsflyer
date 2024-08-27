package dg;

import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.ui.payments.transactions.list.WalletTransactionListFragment;
import com.assetgro.stockgro.ui.payments.transactions.list.WalletTransactionListViewModel;
import g7.c0;
import g7.w0;
import g7.x0;
import g7.y0;
import g7.z0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WalletTransactionListFragment f14363a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(WalletTransactionListFragment walletTransactionListFragment) {
        super(1);
        this.f14363a = walletTransactionListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c0 loadState = (c0) obj;
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        z0 z0Var = loadState.f16682a;
        boolean z10 = z0Var instanceof x0;
        WalletTransactionListFragment walletTransactionListFragment = this.f14363a;
        if (z10) {
            ((WalletTransactionListViewModel) walletTransactionListFragment.r()).f9729o.postValue(new eg.b(Boolean.FALSE, eg.a.f15420a));
        } else {
            if ((z0Var instanceof y0) && loadState.f16684c.f17152a) {
                p pVar = walletTransactionListFragment.f9727g;
                if (pVar != null) {
                    if (pVar.a() < 1) {
                        ((WalletTransactionListViewModel) walletTransactionListFragment.r()).f9729o.postValue(new eg.b(Boolean.TRUE, eg.a.f15420a));
                    }
                } else {
                    Intrinsics.k("transactionsAdapter");
                    throw null;
                }
            }
            if (loadState.f16682a instanceof w0) {
                if (!WifiService.INSTANCE.getInstance().isOnline()) {
                    ((WalletTransactionListViewModel) walletTransactionListFragment.r()).f9729o.postValue(new eg.b(Boolean.TRUE, eg.a.f15422c));
                } else {
                    ((WalletTransactionListViewModel) walletTransactionListFragment.r()).f9729o.postValue(new eg.b(Boolean.TRUE, eg.a.f15421b));
                }
            }
        }
        return Unit.f23355a;
    }
}
