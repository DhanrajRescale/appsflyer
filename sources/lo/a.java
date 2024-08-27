package lo;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;
import to.h;

/* loaded from: classes2.dex */
public final class a extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f24945a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShapeableImageView f24946b;

    public a(ShapeableImageView shapeableImageView) {
        this.f24946b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.f24946b;
        if (shapeableImageView.f11374l == null) {
            return;
        }
        if (shapeableImageView.f11373k == null) {
            shapeableImageView.f11373k = new h(shapeableImageView.f11374l);
        }
        RectF rectF = shapeableImageView.f11367e;
        Rect rect = this.f24945a;
        rectF.round(rect);
        shapeableImageView.f11373k.setBounds(rect);
        shapeableImageView.f11373k.getOutline(outline);
    }
}
