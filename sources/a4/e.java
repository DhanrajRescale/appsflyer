package a4;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public a f165c;

    /* renamed from: d, reason: collision with root package name */
    public final d f166d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Activity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f166d = new d(this, activity);
    }

    @Override // a4.f
    public final void a() {
        Activity activity = this.f167a;
        Resources.Theme theme = activity.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "activity.theme");
        c(theme, new TypedValue());
        ((ViewGroup) activity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f166d);
    }

    @Override // a4.f
    public final void b(j5.d keepOnScreenCondition) {
        Intrinsics.checkNotNullParameter(keepOnScreenCondition, "keepOnScreenCondition");
        Intrinsics.checkNotNullParameter(keepOnScreenCondition, "<set-?>");
        this.f168b = keepOnScreenCondition;
        View findViewById = this.f167a.findViewById(R.id.content);
        ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
        if (this.f165c != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f165c);
        }
        a aVar = new a(this, findViewById, 1);
        this.f165c = aVar;
        viewTreeObserver.addOnPreDrawListener(aVar);
    }
}
