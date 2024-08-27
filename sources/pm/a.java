package pm;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class a extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f31166b;

    public /* synthetic */ a(View view, int i10) {
        this.f31165a = i10;
        this.f31166b = view;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f31165a) {
            case 0:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            case 1:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            default:
                fo.d dVar = ((Chip) this.f31166b).f11236e;
                if (dVar != null) {
                    dVar.getOutline(outline);
                    return;
                } else {
                    outline.setAlpha(s0.g.f34069a);
                    return;
                }
        }
    }
}
