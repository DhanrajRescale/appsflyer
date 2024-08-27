package nj;

import android.app.Activity;
import com.assetgro.stockgro.ui.main.MainActivity;
import kotlin.jvm.internal.Intrinsics;
import of.d;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f28766a;

    public a(MainActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f28766a = activity;
    }

    public final void a() {
        MainActivity mainActivity;
        Activity activity = this.f28766a;
        if (activity instanceof MainActivity) {
            mainActivity = (MainActivity) activity;
        } else {
            mainActivity = null;
        }
        if (mainActivity != null) {
            mainActivity.T(false);
        }
    }

    public final void b() {
        MainActivity mainActivity;
        Activity activity = this.f28766a;
        if (activity instanceof MainActivity) {
            mainActivity = (MainActivity) activity;
        } else {
            mainActivity = null;
        }
        if (mainActivity != null) {
            mainActivity.T(true);
        }
    }
}
