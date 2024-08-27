package bl;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f7095a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7096b;

    public f(View view, String viewMapKey) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewMapKey, "viewMapKey");
        this.f7095a = new WeakReference(view);
        this.f7096b = viewMapKey;
    }

    public final View a() {
        WeakReference weakReference = this.f7095a;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }
}
