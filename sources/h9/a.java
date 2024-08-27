package h9;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f18060a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18061b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18062c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.e(context, "context");
        Paint paint = new Paint();
        this.f18060a = paint;
        Context context2 = getContext();
        Intrinsics.b(context2, "context");
        this.f18061b = context2.getResources().getDimensionPixelSize(R.dimen.md_divider_height);
        setWillNotDraw(false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimension(R.dimen.md_divider_height));
        paint.setAntiAlias(true);
    }

    private final int getDividerColor() {
        Intrinsics.k("dialog");
        throw null;
    }

    public final Paint a() {
        Paint paint = this.f18060a;
        paint.setColor(getDividerColor());
        return paint;
    }

    @NotNull
    public final e9.b getDialog() {
        Intrinsics.k("dialog");
        throw null;
    }

    public final int getDividerHeight() {
        return this.f18061b;
    }

    public final boolean getDrawDivider() {
        return this.f18062c;
    }

    public final void setDialog(@NotNull e9.b bVar) {
        Intrinsics.e(bVar, "<set-?>");
    }

    public final void setDrawDivider(boolean z10) {
        this.f18062c = z10;
        invalidate();
    }
}
