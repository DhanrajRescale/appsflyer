package ab;

import android.os.Bundle;
import androidx.navigation.d0;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f305a;

    public n(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f305a = phoneNumber;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("phoneNumber", this.f305a);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.showBlockedUserScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.a(this.f305a, ((n) obj).f305a);
    }

    public final int hashCode() {
        return this.f305a.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("ShowBlockedUserScreen(phoneNumber="), this.f305a, ")");
    }
}
