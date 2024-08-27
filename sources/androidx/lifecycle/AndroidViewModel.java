package androidx.lifecycle;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/AndroidViewModel;", "Landroidx/lifecycle/a1;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class AndroidViewModel extends a1 {

    /* renamed from: b, reason: collision with root package name */
    public final Application f1872b;

    public AndroidViewModel(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f1872b = application;
    }

    public final Application e() {
        Application application = this.f1872b;
        Intrinsics.d(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return application;
    }
}
