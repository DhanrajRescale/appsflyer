package hc;

import android.os.Bundle;
import androidx.navigation.d0;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18276a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18277b;

    public i(String str, String str2) {
        this.f18276a = str;
        this.f18277b = str2;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("earningsTitle", this.f18276a);
        bundle.putString("earningsAmount", this.f18277b);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.action_missionsHomeFragment_to_missionHistoryFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.a(this.f18276a, iVar.f18276a) && Intrinsics.a(this.f18277b, iVar.f18277b);
    }

    public final int hashCode() {
        String str = this.f18276a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18277b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionMissionsHomeFragmentToMissionHistoryFragment(earningsTitle=");
        sb2.append(this.f18276a);
        sb2.append(", earningsAmount=");
        return nn.d.o(sb2, this.f18277b, ")");
    }
}
