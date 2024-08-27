package gc;

import android.os.Bundle;
import androidx.navigation.d0;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17224a;

    public d(String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f17224a = status;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("status", this.f17224a);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.action_missionsHistoryFragment_to_missionStatusDetailFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.a(this.f17224a, ((d) obj).f17224a);
    }

    public final int hashCode() {
        return this.f17224a.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("ActionMissionsHistoryFragmentToMissionStatusDetailFragment(status="), this.f17224a, ")");
    }
}
