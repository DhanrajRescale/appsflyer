package dg;

import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.RecyclerView;
import ba.cq;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.transactions.list.WalletTransactionListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletTransactionListFragment f14361b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(WalletTransactionListFragment walletTransactionListFragment, int i10) {
        super(1);
        this.f14360a = i10;
        this.f14361b = walletTransactionListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        int i11 = this.f14360a;
        WalletTransactionListFragment walletTransactionListFragment = this.f14361b;
        switch (i11) {
            case 0:
                t viewLifecycleOwner = walletTransactionListFragment.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                yk.g.H(yk.j.X0(viewLifecycleOwner), null, null, new h((tu.f) obj, walletTransactionListFragment, null), 3);
                return Unit.f23355a;
            default:
                eg.b bVar = (eg.b) obj;
                if (Intrinsics.a(bVar.f15424a, Boolean.TRUE)) {
                    Group errorTransactionGroup = ((cq) walletTransactionListFragment.q()).f4406u;
                    Intrinsics.checkNotNullExpressionValue(errorTransactionGroup, "errorTransactionGroup");
                    zq.f.m0(errorTransactionGroup);
                    RecyclerView walletTransactionRecyclerView = ((cq) walletTransactionListFragment.q()).f4411z;
                    Intrinsics.checkNotNullExpressionValue(walletTransactionRecyclerView, "walletTransactionRecyclerView");
                    zq.f.M(walletTransactionRecyclerView);
                    eg.a aVar = bVar.f15425b;
                    if (aVar == null) {
                        i10 = -1;
                    } else {
                        i10 = j.f14362a[aVar.ordinal()];
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                ((cq) walletTransactionListFragment.q()).f4405t.setImageResource(R.drawable.ic_no_internet_wallet);
                                cq cqVar = (cq) walletTransactionListFragment.q();
                                cqVar.f4409x.setText(walletTransactionListFragment.getString(R.string.oops_bad_connection));
                                cq cqVar2 = (cq) walletTransactionListFragment.q();
                                cqVar2.f4410y.setText(walletTransactionListFragment.getString(R.string.switch_to_better_internet_connection));
                            }
                        } else {
                            ((cq) walletTransactionListFragment.q()).f4405t.setImageResource(R.drawable.ic_empty_image_history);
                            cq cqVar3 = (cq) walletTransactionListFragment.q();
                            cqVar3.f4409x.setText(walletTransactionListFragment.getString(R.string.oops_something_went_wrong));
                            cq cqVar4 = (cq) walletTransactionListFragment.q();
                            cqVar4.f4410y.setText(walletTransactionListFragment.getString(R.string.there_is_some_loading_issue_please_try_again));
                        }
                    } else {
                        ((cq) walletTransactionListFragment.q()).f4405t.setImageResource(R.drawable.ic_no_transaction_wallet);
                        cq cqVar5 = (cq) walletTransactionListFragment.q();
                        cqVar5.f4409x.setText(walletTransactionListFragment.getString(R.string.no_transactions_text));
                        cq cqVar6 = (cq) walletTransactionListFragment.q();
                        cqVar6.f4410y.setText(walletTransactionListFragment.getString(R.string.no_transactions_message));
                    }
                } else {
                    Group errorTransactionGroup2 = ((cq) walletTransactionListFragment.q()).f4406u;
                    Intrinsics.checkNotNullExpressionValue(errorTransactionGroup2, "errorTransactionGroup");
                    zq.f.M(errorTransactionGroup2);
                    RecyclerView walletTransactionRecyclerView2 = ((cq) walletTransactionListFragment.q()).f4411z;
                    Intrinsics.checkNotNullExpressionValue(walletTransactionRecyclerView2, "walletTransactionRecyclerView");
                    zq.f.m0(walletTransactionRecyclerView2);
                }
                return Unit.f23355a;
        }
    }
}
