package a4;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.assetgro.stockgro.prod.R;
import i5.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f167a;

    /* renamed from: b, reason: collision with root package name */
    public g f168b;

    public f(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f167a = activity;
        this.f168b = new w(9);
    }

    public void a() {
        TypedValue typedValue = new TypedValue();
        Resources.Theme currentTheme = this.f167a.getTheme();
        currentTheme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (currentTheme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            currentTheme.getDrawable(typedValue.resourceId);
        }
        currentTheme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        Intrinsics.checkNotNullExpressionValue(currentTheme, "currentTheme");
        c(currentTheme, typedValue);
    }

    public void b(j5.d keepOnScreenCondition) {
        Intrinsics.checkNotNullParameter(keepOnScreenCondition, "keepOnScreenCondition");
        this.f168b = keepOnScreenCondition;
        View findViewById = this.f167a.findViewById(android.R.id.content);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new a(this, findViewById, 0));
    }

    public final void c(Resources.Theme currentTheme, TypedValue typedValue) {
        int i10;
        Intrinsics.checkNotNullParameter(currentTheme, "currentTheme");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        if (currentTheme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i10 = typedValue.resourceId) != 0) {
            this.f167a.setTheme(i10);
        }
    }
}
