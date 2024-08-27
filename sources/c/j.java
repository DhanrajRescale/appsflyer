package c;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f7429a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(androidx.activity.m mVar, b1.c content) {
        ComposeView composeView;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        View childAt = ((ViewGroup) mVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        if (childAt instanceof ComposeView) {
            composeView = (ComposeView) childAt;
        } else {
            composeView = null;
        }
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(content);
            return;
        }
        ComposeView composeView2 = new ComposeView(mVar, null, 6);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(content);
        View decorView = mVar.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (yk.j.W0(decorView) == null) {
            yk.j.r1(decorView, mVar);
        }
        if (i0.r(decorView) == null) {
            i0.H(decorView, mVar);
        }
        if (yk.g.w(decorView) == null) {
            yk.g.Z(decorView, mVar);
        }
        mVar.setContentView(composeView2, f7429a);
    }
}
