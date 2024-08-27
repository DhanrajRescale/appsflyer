package dg;

import android.os.Bundle;
import androidx.navigation.d0;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14364a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14365b;

    public l(String transactionId, String transactionStatus) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(transactionStatus, "transactionStatus");
        this.f14364a = transactionId;
        this.f14365b = transactionStatus;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("transactionId", this.f14364a);
        bundle.putString("transactionStatus", this.f14365b);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.action_walletTransactionListFragment_to_walletTransactionDetailFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.a(this.f14364a, lVar.f14364a) && Intrinsics.a(this.f14365b, lVar.f14365b);
    }

    public final int hashCode() {
        return this.f14365b.hashCode() + (this.f14364a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionWalletTransactionListFragmentToWalletTransactionDetailFragment(transactionId=");
        sb2.append(this.f14364a);
        sb2.append(", transactionStatus=");
        return nn.d.o(sb2, this.f14365b, ")");
    }
}
