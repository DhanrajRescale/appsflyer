package o0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import d2.l3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29354a;

    public /* synthetic */ j(int i10) {
        this.f29354a = i10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f29354a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(s0.g.f34069a);
                return;
            case 1:
                Intrinsics.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                Outline b10 = ((l3) view).f13508e.b();
                Intrinsics.c(b10);
                outline.set(b10);
                return;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(s0.g.f34069a);
                return;
            default:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(s0.g.f34069a);
                return;
        }
    }
}
