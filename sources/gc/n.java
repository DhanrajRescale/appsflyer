package gc;

import android.os.Bundle;
import androidx.navigation.d0;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17246a;

    public n(String taskId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        this.f17246a = taskId;
    }

    @Override // androidx.navigation.d0
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("taskId", this.f17246a);
        return bundle;
    }

    @Override // androidx.navigation.d0
    public final int b() {
        return R.id.action_missionStatusDetailFragment_to_missionTaskDetailFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.a(this.f17246a, ((n) obj).f17246a);
    }

    public final int hashCode() {
        return this.f17246a.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("ActionMissionStatusDetailFragmentToMissionTaskDetailFragment(taskId="), this.f17246a, ")");
    }
}
