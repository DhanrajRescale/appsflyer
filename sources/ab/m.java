package ab;

import android.os.Bundle;
import androidx.navigation.d0;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f304a;

    public m(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f304a = phoneNumber;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("phoneNumber", this.f304a);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.action_mobile_login_fragment_to_pin_login_pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.a(this.f304a, ((m) obj).f304a);
    }

    public final int hashCode() {
        return this.f304a.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("ActionMobileLoginFragmentToPinLoginPin(phoneNumber="), this.f304a, ")");
    }
}
