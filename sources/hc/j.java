package hc;

import android.os.Bundle;
import androidx.navigation.d0;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18278a;

    public j(String taskId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        this.f18278a = taskId;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("taskId", this.f18278a);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.action_missionsHomeFragment_to_missionTaskDetailFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.a(this.f18278a, ((j) obj).f18278a);
    }

    public final int hashCode() {
        return this.f18278a.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("ActionMissionsHomeFragmentToMissionTaskDetailFragment(taskId="), this.f18278a, ")");
    }
}
