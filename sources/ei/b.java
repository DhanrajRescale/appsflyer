package ei;

import a8.i;
import ba.y0;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.social.presentation.slider.ImageSliderActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageSliderActivity f15442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15443b;

    public b(ImageSliderActivity imageSliderActivity, int i10) {
        this.f15442a = imageSliderActivity;
        this.f15443b = i10;
    }

    @Override // a8.i
    public final void c(int i10) {
        ImageSliderActivity imageSliderActivity = this.f15442a;
        y0 y0Var = (y0) imageSliderActivity.w();
        String string = imageSliderActivity.getString(R.string.image_slider_index);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        y0Var.f6702t.setText(a3.a.m(new Object[]{Integer.valueOf(i10 + 1), Integer.valueOf(this.f15443b)}, 2, string, "format(...)"));
    }
}
